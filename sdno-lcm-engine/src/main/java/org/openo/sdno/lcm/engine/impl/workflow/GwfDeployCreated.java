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

package org.openo.sdno.lcm.engine.impl.workflow;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openo.sdno.lcm.engine.GenericWorkflowId;
import org.openo.sdno.lcm.restclient.serviceinventory.model.GetConnectivityServiceResponse;
import org.openo.sdno.lcm.restclient.serviceinventory.model.UpdateConnectivityServiceRequest;
import org.openo.sdno.lcm.restclient.serviceinventory.model.UpdateResponse;
import org.openo.sdno.lcm.templatemodel.service.Instance;
import org.openo.sdno.lcm.util.Constants;
import org.springframework.stereotype.Component;

@Component
public class GwfDeployCreated extends GenericWorkflowImpl {


    private static final Logger log = Logger.getLogger("GwfDeployCreated");

    /*
     * (non-Javadoc)
     * @see org.openo.sdno.lcm.engine.GenericWorkflow#execute(java.util.Map)
     */
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {

        log.fine("Execute GwfDeployCreated workflow");
        // get the required params
        String csarId = (String)super.getParam(Constants.LCM_NBI_CSAR_ID, params);
        String apiOperation = (String)super.getParam(Constants.LCM_NBI_API_OPERATION, params);
        String serviceId = (String)super.getParam(Constants.LCM_NBI_SERVICE_ID, params);
        Instance templateInstance = (Instance)super.getParam(Constants.LCM_TEMPLATE_INSTANCE, params);

        // get the service from inventory to get the created time
        String serviceCreateTime = null;
        GetConnectivityServiceResponse readConnectivityService;
        try {
            readConnectivityService = defaultMssApiClient.readConnectivityService(serviceId);
            serviceCreateTime = readConnectivityService.getObject().getCreatetime();
        } catch(Exception e1) {
            log.warning(String.format("Failed to read the updated connectivity service from inventory due to %s",
                    e1.getMessage()));
        }

        // update the nodes with correct values for this workflow
        templateInstance.replacePropertyValueInAllNodes(Constants.LCM_CREATETIME, serviceCreateTime);
        templateInstance.replacePropertyValueInAllNodes(Constants.LCM_ADMINSTATUS, Constants.LCM_ADMINISTRATIONSTATE_ACTIVE);
        templateInstance.replacePropertyValueInAllNodes(Constants.LCM_ACTIONSTATE, Constants.LCM_ACTIONSTATE_DEPLOYING);

        // execute the workplan
        executeWorkplan(csarId, apiOperation, templateInstance);

        // update the service in inventory
        UpdateConnectivityServiceRequest body = new UpdateConnectivityServiceRequest();
        body.setLifecycleState(Constants.LCM_LIFECYCLESTATE_DEPLOYED);
        UpdateResponse updateConnectivityServiceResponse =
                defaultMssApiClient.updateConnectivityServiceRequest(serviceId, body);

        try {
            readConnectivityService = defaultMssApiClient.readConnectivityService(serviceId);
            log.info(String.format("Updated connectivity service:\n%s", readConnectivityService.toString()));
        } catch(Exception e) {
            log.warning("Failed to read the updated connectivity service from inventory due to " + e.getMessage());
            log.info(String.format("Update connectivity service response:\n%s",
                    updateConnectivityServiceResponse.toString()));
        }

        // fill response map
        HashMap<String, Object> responseMap = new HashMap<String, Object>();
        // we can put the service ID here instead of job ID as the task is synchronous for now
        responseMap.put(Constants.LCM_NBI_JOB_ID, serviceId);
        return responseMap;
    }

    /*
     * (non-Javadoc)
     * @see org.openo.sdno.lcm.engine.RegisterWorkflow#getWorkflowId()
     */
    @Override
    public String getWorkflowId() {

        return GenericWorkflowId.DEPLOYCREATED.toString();
    }

}
