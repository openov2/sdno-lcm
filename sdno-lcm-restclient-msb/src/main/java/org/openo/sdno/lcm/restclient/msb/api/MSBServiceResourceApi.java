package org.openo.sdno.lcm.restclient.msb.api;

import org.openo.sdno.lcm.restclient.msb.ApiException;
import org.openo.sdno.lcm.restclient.msb.ApiClient;
import org.openo.sdno.lcm.restclient.msb.Configuration;
import org.openo.sdno.lcm.restclient.msb.Pair;

import javax.ws.rs.core.GenericType;

import org.openo.sdno.lcm.restclient.msb.model.MicroServiceFullInfo;
import org.openo.sdno.lcm.restclient.msb.model.MicroServiceInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-20T12:04:17.236Z")
public class MSBServiceResourceApi {
  private ApiClient apiClient;

  public MSBServiceResourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MSBServiceResourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * add one microservice 
   * 
   * @param body MicroServiceInfo Instance Info (required)
   * @param createOrUpdate createOrUpdate (optional, default to true)
   * @param port port (optional)
   * @return MicroServiceFullInfo
   * @throws ApiException if fails to make API call
   */
  public MicroServiceFullInfo addMicroService(MicroServiceInfo body, Boolean createOrUpdate, String port) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addMicroService");
    }
    
    // create path and map variables
    String localVarPath = "/services".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createOrUpdate", createOrUpdate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "port", port));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MicroServiceFullInfo> localVarReturnType = new GenericType<MicroServiceFullInfo>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * delete one full microservice by serviceName and version
   * 
   * @param serviceName microservice serviceName (required)
   * @param version microservice version,if the version is empty, please enter \&quot;null\&quot; (required)
   * @param port port (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteMicroService(String serviceName, String version, String port) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling deleteMicroService");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling deleteMicroService");
    }
    
    // create path and map variables
    String localVarPath = "/services/{serviceName}/version/{version}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceName" + "\\}", apiClient.escapeString(serviceName.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "port", port));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * get all microservices 
   * 
   * @return List<MicroServiceFullInfo>
   * @throws ApiException if fails to make API call
   */
  public List<MicroServiceFullInfo> getAllMicroService() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/services".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MicroServiceFullInfo>> localVarReturnType = new GenericType<List<MicroServiceFullInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * get one microservice 
   * 
   * @param serviceName microservice serviceName (required)
   * @param version microservice version,if the version is empty, please enter \&quot;null\&quot; (required)
   * @param port port (optional)
   * @return MicroServiceFullInfo
   * @throws ApiException if fails to make API call
   */
  public MicroServiceFullInfo getMicroService(String serviceName, String version, String port) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling getMicroService");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getMicroService");
    }
    
    // create path and map variables
    String localVarPath = "/services/{serviceName}/version/{version}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceName" + "\\}", apiClient.escapeString(serviceName.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "port", port));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MicroServiceFullInfo> localVarReturnType = new GenericType<MicroServiceFullInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * update one microservice by serviceName and version
   * 
   * @param serviceName microservice serviceName (required)
   * @param version microservice version,if the version is empty, please enter \&quot;null\&quot; (required)
   * @param body microservice Instance Info (required)
   * @return MicroServiceFullInfo
   * @throws ApiException if fails to make API call
   */
  public MicroServiceFullInfo updateMicroService(String serviceName, String version, MicroServiceInfo body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling updateMicroService");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateMicroService");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateMicroService");
    }
    
    // create path and map variables
    String localVarPath = "/services/{serviceName}/version/{version}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceName" + "\\}", apiClient.escapeString(serviceName.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MicroServiceFullInfo> localVarReturnType = new GenericType<MicroServiceFullInfo>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * update  microservice status by serviceName and version
   * 
   * @param serviceName microservice serviceName (required)
   * @param version microservice version,if the version is empty, please enter \&quot;null\&quot; (required)
   * @param status status,1ï¼šabled  0ï¼šdisabled (required)
   * @return MicroServiceFullInfo
   * @throws ApiException if fails to make API call
   */
  public MicroServiceFullInfo updateServiceStatus(String serviceName, String version, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling updateServiceStatus");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateServiceStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updateServiceStatus");
    }
    
    // create path and map variables
    String localVarPath = "/services/{serviceName}/version/{version}/status/{status}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "serviceName" + "\\}", apiClient.escapeString(serviceName.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MicroServiceFullInfo> localVarReturnType = new GenericType<MicroServiceFullInfo>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}