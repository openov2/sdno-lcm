/**
 * MicroService Bus rest API
 *
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright 2016-2017 ZTE Corporation.
 * Modifications Copyright 2017 Huawei Technologies Co., Ltd.
 */


package org.openo.sdno.lcm.restclient.msb.api;

import org.openo.sdno.lcm.restclient.msb.ApiException;
import org.openo.sdno.lcm.restclient.msb.model.MicroServiceFullInfo;
import org.openo.sdno.lcm.restclient.msb.model.MicroServiceInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MSBServiceResourceApi
 */
public class MSBServiceResourceApiTest {

    private final MSBServiceResourceApi api = new MSBServiceResourceApi();

    
    /**
     * add one microservice 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMicroServiceTest() throws ApiException {
        MicroServiceInfo body = null;
        Boolean createOrUpdate = null;
        String port = null;
        // MicroServiceFullInfo response = api.addMicroService(body, createOrUpdate, port);

        // TODO: test validations
    }
    
    /**
     * delete one full microservice by serviceName and version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMicroServiceTest() throws ApiException {
        String serviceName = null;
        String version = null;
        String port = null;
        // api.deleteMicroService(serviceName, version, port);

        // TODO: test validations
    }
    
    /**
     * get all microservices 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMicroServiceTest() throws ApiException {
        // List<MicroServiceFullInfo> response = api.getAllMicroService();

        // TODO: test validations
    }
    
    /**
     * get one microservice 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMicroServiceTest() throws ApiException {
        String serviceName = null;
        String version = null;
        String port = null;
        // MicroServiceFullInfo response = api.getMicroService(serviceName, version, port);

        // TODO: test validations
    }
    
    /**
     * update one microservice by serviceName and version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMicroServiceTest() throws ApiException {
        String serviceName = null;
        String version = null;
        MicroServiceInfo body = null;
        // MicroServiceFullInfo response = api.updateMicroService(serviceName, version, body);

        // TODO: test validations
    }
    
    /**
     * update  microservice status by serviceName and version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateServiceStatusTest() throws ApiException {
        String serviceName = null;
        String version = null;
        String status = null;
        // MicroServiceFullInfo response = api.updateServiceStatus(serviceName, version, status);

        // TODO: test validations
    }
    
}
