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
package org.openo.sdno.lcm.restclient.catalog.api;

import org.openo.sdno.lcm.restclient.catalog.ApiException;
import org.openo.sdno.lcm.restclient.catalog.ApiClient;
import org.openo.sdno.lcm.restclient.catalog.Configuration;
import org.openo.sdno.lcm.restclient.catalog.Pair;

import javax.ws.rs.core.GenericType;

import org.openo.sdno.lcm.restclient.catalog.model.CommonErrorResponse;
import org.openo.sdno.lcm.restclient.catalog.model.ServiceTemplate;
import org.openo.sdno.lcm.restclient.catalog.model.NodeTemplate;
import org.openo.sdno.lcm.restclient.catalog.model.InputParameter;
import org.openo.sdno.lcm.restclient.catalog.model.ServiceTemplateOperation;
import org.openo.sdno.lcm.restclient.catalog.model.Parameters;
import org.openo.sdno.lcm.restclient.catalog.model.QueryRawDataCondition;
import org.openo.sdno.lcm.restclient.catalog.model.ServiceTemplateRawData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-18T13:47:52.904Z")
public class ModelResourceApi {
  private ApiClient apiClient;

  public ModelResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModelResourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Query nesting service template of a node type
   * 
   * @param nodeTypeIds Node type ids splited by &#39;,&#39;. Such as &#39;tosca.nodes.nfv.VDU,tosca.nodes.nfv.VL&#39;. (required)
   * @return List<ServiceTemplate>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceTemplate> getNestingServiceTemplate(String nodeTypeIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'nodeTypeIds' is set
    if (nodeTypeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeTypeIds' when calling getNestingServiceTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/nesting".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodeTypeIds", nodeTypeIds));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ServiceTemplate>> localVarReturnType = new GenericType<List<ServiceTemplate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query node template by node template id
   * 
   * @param serviceTemplateId Service Template Id (required)
   * @param nodeTemplateId Node Template Id (required)
   * @return NodeTemplate
   * @throws ApiException if fails to make API call
   */
  public NodeTemplate getNodeTemplateById(String serviceTemplateId, String nodeTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceTemplateId' is set
    if (serviceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceTemplateId' when calling getNodeTemplateById");
    }
    
    // verify the required parameter 'nodeTemplateId' is set
    if (nodeTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeTemplateId' when calling getNodeTemplateById");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/{serviceTemplateId}/nodetemplates/{nodeTemplateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceTemplateId" + "\\}", apiClient.escapeString(serviceTemplateId.toString()))
      .replaceAll("\\{" + "nodeTemplateId" + "\\}", apiClient.escapeString(nodeTemplateId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<NodeTemplate> localVarReturnType = new GenericType<NodeTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query node template list of a specified service template
   * 
   * @param serviceTemplateId Service Template Id (required)
   * @param types The type of node template (optional)
   * @return List<NodeTemplate>
   * @throws ApiException if fails to make API call
   */
  public List<NodeTemplate> getNodeTemplatesByType(String serviceTemplateId, String types) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceTemplateId' is set
    if (serviceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceTemplateId' when calling getNodeTemplatesByType");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/{serviceTemplateId}/nodetemplates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceTemplateId" + "\\}", apiClient.escapeString(serviceTemplateId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "types", types));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<NodeTemplate>> localVarReturnType = new GenericType<List<NodeTemplate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query input parameters of a specified operation
   * 
   * @param serviceTemplateId Service Template Id (required)
   * @param operationName Operation Name (required)
   * @return List<InputParameter>
   * @throws ApiException if fails to make API call
   */
  public List<InputParameter> getParametersByOperationName(String serviceTemplateId, String operationName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceTemplateId' is set
    if (serviceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceTemplateId' when calling getParametersByOperationName");
    }
    
    // verify the required parameter 'operationName' is set
    if (operationName == null) {
      throw new ApiException(400, "Missing the required parameter 'operationName' when calling getParametersByOperationName");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/{serviceTemplateId}/operations/{operationName}/parameters".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceTemplateId" + "\\}", apiClient.escapeString(serviceTemplateId.toString()))
      .replaceAll("\\{" + "operationName" + "\\}", apiClient.escapeString(operationName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<InputParameter>> localVarReturnType = new GenericType<List<InputParameter>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query service template by service template id
   * 
   * @param servicetemplateid service template id (required)
   * @return ServiceTemplate
   * @throws ApiException if fails to make API call
   */
  public ServiceTemplate getServiceTemplateById(String servicetemplateid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'servicetemplateid' is set
    if (servicetemplateid == null) {
      throw new ApiException(400, "Missing the required parameter 'servicetemplateid' when calling getServiceTemplateById");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/{servicetemplateid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "servicetemplateid" + "\\}", apiClient.escapeString(servicetemplateid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ServiceTemplate> localVarReturnType = new GenericType<ServiceTemplate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query operation list of service template
   * 
   * @param serviceTemplateId Service Template Id (required)
   * @return List<ServiceTemplateOperation>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceTemplateOperation> getServiceTemplateOperations(String serviceTemplateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceTemplateId' is set
    if (serviceTemplateId == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceTemplateId' when calling getServiceTemplateOperations");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/{serviceTemplateId}/operations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceTemplateId" + "\\}", apiClient.escapeString(serviceTemplateId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ServiceTemplateOperation>> localVarReturnType = new GenericType<List<ServiceTemplateOperation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query input parameters of service template
   * 
   * @param servicetemplateid service template id (required)
   * @return Parameters
   * @throws ApiException if fails to make API call
   */
  public Parameters getServiceTemplateParameters(String servicetemplateid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'servicetemplateid' is set
    if (servicetemplateid == null) {
      throw new ApiException(400, "Missing the required parameter 'servicetemplateid' when calling getServiceTemplateParameters");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/{servicetemplateid}/parameters".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "servicetemplateid" + "\\}", apiClient.escapeString(servicetemplateid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Parameters> localVarReturnType = new GenericType<Parameters>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query raw data of a service template by csar id
   * 
   * @param body Query Service Template Raw Data Condition (required)
   * @return ServiceTemplateRawData
   * @throws ApiException if fails to make API call
   */
  public ServiceTemplateRawData getServiceTemplateRawData(QueryRawDataCondition body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getServiceTemplateRawData");
    }
    
    // create path and map variables
    String localVarPath = "/servicetemplates/queryingrawdata".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ServiceTemplateRawData> localVarReturnType = new GenericType<ServiceTemplateRawData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query service template by filter conditions
   * 
   * @param status template status (optional)
   * @param deletionPending delay to delete (optional)
   * @return List<ServiceTemplate>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceTemplate> getServiceTemplates(String status, Boolean deletionPending) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/servicetemplates".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deletionPending", deletionPending));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ServiceTemplate>> localVarReturnType = new GenericType<List<ServiceTemplate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * test
   * 
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> test() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/servicetemplates/test".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
