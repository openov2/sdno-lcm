/*
 * Copyright 2017 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.lcm.engine.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openo.sdno.lcm.ariaclient.ParserApiClient;
import org.openo.sdno.lcm.catalogclient.ModelResourceApiClient;
import org.openo.sdno.lcm.engine.LcmStateEngine;
import org.openo.sdno.lcm.exception.ExternalComponentException;
import org.openo.sdno.lcm.exception.LcmInternalException;
import org.openo.sdno.lcm.restclient.catalog.model.ServiceTemplate;
import org.openo.sdno.lcm.restclient.serviceinventory.model.GetConnectivityServiceResponseSample;
import org.openo.sdno.lcm.serviceinventoryclient.DefaultMssApiClient;
import org.openo.sdno.lcm.statetablehandler.StateTableHandler;
import org.openo.sdno.lcm.statetablehandler.model.StateTable;
import org.openo.sdno.lcm.templateinstanceparser.TemplateInstanceParser;
import org.openo.sdno.lcm.templatemodel.service.Instance;
import org.openo.sdno.lcm.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LcmStateEngineImpl implements LcmStateEngine {

    private static final Logger log = Logger.getLogger("LcmStateEngineImpl");

    private StateTableHandler stateTableHandler;

    private ModelResourceApiClient modelResourceApiClient;

    private DefaultMssApiClient defaultMssApiClient;

    private TemplateInstanceParser templateInstanceParser;

    private WorkflowRegistry workflowRegistry;

    private ParserApiClient parserApiClient;

    /*
     * (non-Javadoc)
     * 
     * @see org.openo.sdno.lcm.engine.impl.LcmStateEngine#execute(java.util.Map)
     */
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {

        if (params == null) {
            throw new IllegalArgumentException("input params may not be null");
        }
        log.fine("execute params: " + params.toString());

        // if the API operation is not set, exit
        if ((!params.containsKey(Constants.LCM_NBI_API_OPERATION))
                || ((String) params.get(Constants.LCM_NBI_API_OPERATION)).isEmpty()) {

            log.severe(Constants.LCM_NBI_API_OPERATION + " is not found in params");
            throw new LcmInternalException("API operation parameter not present - cannot proceed");
        }
        String apiOperation = (String) params.get(Constants.LCM_NBI_API_OPERATION);
        log.info(Constants.LCM_NBI_API_OPERATION + " is " + apiOperation);
        String currentState = null;
        String templateId = null;

        // check if the nsid is included in params - this means we have such a
        // service in inventory
        // get the CSAR name from the service instance.
        if (params.containsKey(Constants.LCM_NBI_SERVICE_ID)
                && !((String) params.get(Constants.LCM_NBI_SERVICE_ID)).isEmpty()) {

            String nsid = (String) params.get(Constants.LCM_NBI_SERVICE_ID);
            log.info(Constants.LCM_NBI_SERVICE_ID + " (Connectivity Service ID) is " + nsid);

            // get the service from the inventory
            GetConnectivityServiceResponseSample connectivityService = defaultMssApiClient.readConnectivityService(nsid)
                    .getObject();
            log.fine("Connectivity service: " + connectivityService.toString());

            // get state from service instance
            currentState = connectivityService.getLifecycleState();
            // get the csar ID from service instance
            // *** ASSUME CSAR_ID == TEMPLATE_ID ***
            templateId = connectivityService.getTemplateId();
            // some kind of null object can be returned if the connectivity
            // service is not found
            // so check we have the templateId to proceed
            if (null == templateId) {
                String errString = String.format("the template ID was null as connectivity service %s was not found",
                        nsid);
                log.severe(errString);
                throw new ExternalComponentException(errString);
            }
            log.info(String.format("Adding template ID to params as %s=%s", Constants.LCM_NBI_TEMPLATE_ID, templateId));
            params.put(Constants.LCM_NBI_TEMPLATE_ID, templateId);

        } else if (params.containsKey(Constants.LCM_NBI_TEMPLATE_ID)
                && !((String) params.get(Constants.LCM_NBI_TEMPLATE_ID)).isEmpty()) {

            templateId = (String) params.get(Constants.LCM_NBI_TEMPLATE_ID);
            currentState = Constants.LCM_LIFECYCLESTATE_NONE;

        } else {
            log.severe(String.format("Neither %s nor %s found in params - cannot continue",
                    Constants.LCM_NBI_TEMPLATE_ID, Constants.LCM_NBI_SERVICE_ID));
            throw new LcmInternalException("No workflows possible with the parameters given");
        }
        log.info("Connectivity service current state: " + currentState);
        log.info(Constants.LCM_NBI_TEMPLATE_ID + " is " + templateId);

        ServiceTemplate serviceTemplate = modelResourceApiClient.getServiceTemplateById(templateId);
        String csarId = serviceTemplate.getCsarId();
        log.info(String.format("CSAR ID is: %s", csarId));
        params.put(Constants.LCM_NBI_CSAR_ID, csarId);

        String templateDownloadUri = serviceTemplate.getDownloadUri();
        if (null == templateDownloadUri || templateDownloadUri.isEmpty()) {

            throw new LcmInternalException("templateDownloadUri cannot be null or empty");
        }
        log.info(String.format("Service template URI is: %s", templateDownloadUri));

        Map<String, String> inputParams = (Map<String, String>) params.get(Constants.LCM_NBI_ADDITIONAL_PARAMS);
        if (null == inputParams) {
            log.warning("Input parameters are null - this is ok for create but indicates an error for instantiate");
            inputParams = new HashMap<>();
        }
        // get the service template from catalog
        Map<String, Object> serviceInstanceMap = parserApiClient.parseControllerInstanceIndirect(templateDownloadUri,
                inputParams);
        // String serviceInstanceJson
        log.fine("serviceInstanceMap: " + serviceInstanceMap.toString());
        // add the instance to the params
        Instance templateInstance = templateInstanceParser.parse(serviceInstanceMap);
        params.put(Constants.LCM_TEMPLATE_INSTANCE, templateInstance);

        // check the transition and get the workflow ID
        StateTable stateTable = stateTableHandler.marshallStateTable(templateInstance.getStateTableDefinition());
        String transitionWorkflow = stateTableHandler.validateServiceTransition(currentState, apiOperation, stateTable);
        // execute the workflow
        return workflowRegistry.executeWorkflow(transitionWorkflow, params);
    }

    @Autowired
    public void setStateTableHandler(StateTableHandler stateTableHandler) {
        this.stateTableHandler = stateTableHandler;
    }

    @Autowired
    public void setModelResourceApiClient(ModelResourceApiClient modelResourceApiClient) {
        this.modelResourceApiClient = modelResourceApiClient;
    }

    @Autowired
    public void setDefaultMssApiClient(DefaultMssApiClient defaultMssApiClient) {
        this.defaultMssApiClient = defaultMssApiClient;
    }

    @Autowired
    public void setTemplateInstanceParser(TemplateInstanceParser templateInstanceParser) {
        this.templateInstanceParser = templateInstanceParser;
    }

    @Autowired
    public void setWorkflowRegistry(WorkflowRegistry workflowRegistry) {
        this.workflowRegistry = workflowRegistry;
    }

    @Autowired
    public void setParserApiClient(ParserApiClient parserApiClient) {
        this.parserApiClient = parserApiClient;
    }

}
