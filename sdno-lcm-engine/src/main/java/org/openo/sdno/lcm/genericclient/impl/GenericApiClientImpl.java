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

package org.openo.sdno.lcm.genericclient.impl;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.entity.StringEntity;

import org.openo.sdno.lcm.model.workplan.WorkItem;
import org.openo.sdno.lcm.model.workplan.WorkPlan;
import org.openo.sdno.lcm.model.workplan.WorkPlanExecutionResult;
import org.openo.sdno.lcm.model.workplan.WorkPlanExecutionStrategy;

import io.swagger.models.HttpMethod;
import io.swagger.models.parameters.HeaderParameter;
import io.swagger.models.parameters.PathParameter;
import io.swagger.models.parameters.QueryParameter;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.openo.sdno.lcm.exception.LcmInternalException;
import org.openo.sdno.lcm.exception.ExternalComponentException;
import org.openo.sdno.lcm.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.PropertySource;

import org.openo.sdno.lcm.genericclient.GenericApiClient;

@Component
@PropertySource("classpath:config.properties")
public class GenericApiClientImpl implements GenericApiClient {
    private final Logger log = Logger.getLogger("GenericApiClientImpl");

    @Autowired
    private Environment env; //environment variables

    /**
     * calling one service API and return the response
     * Notes:
     * Instead of using some client generated by swagger, Apache Http related libraries are used here
     * to provide a simpler and more generic implementation.
     *
     * @param apiUrl the original api url
     * @param method HTTP method to be used
     * @param contentTypeValue the value of ContentType header
     * @param properties node properties
     * @param pathParameters Path Parameters
     * @param queryParameters Query Parameters
     * @param headers header parameters in swagger
     * @param body the request body (in JSON format)
     * @return HttpResponse from the service to be called.
     *         Note that ExternalComponentException will be thrown if exceptions happen during service call;
     */
    @Override
    public HttpResponse execute(final String apiUrl, final HttpMethod method,
                                final String contentTypeValue, final JsonNode properties,
                                final List<PathParameter> pathParameters, List<QueryParameter> queryParameters,
                                final List<HeaderParameter> headers, final JsonNode body) {
        HttpUriRequest request = null;
        StringEntity bodyEntity = null;

        //create http client
        HttpClient client = HttpClientBuilder.create().build();

        /**
         * Generate the final url with path parameters and query parameters
         * Note that query parameters are not supported currently.
         * In the future, we need pass inputs (query parameters) from customers to Dispatcher.
         */
        String finalApiUrl = generateFinalApiUrl(apiUrl, properties, pathParameters, queryParameters);

        //create body entity if body exist
        if(null!=body) {
            try {
                bodyEntity = new StringEntity(body.toString());
            } catch (UnsupportedEncodingException e) {
                log.severe(
                    String.format("Json for body cannot be converted to StringEntity. Body: %s", body.toString()));
                throw new LcmInternalException(
                    String.format("Json for body cannot be converted to StringEntity. Body: %s", body.toString()));
            }
        }

        //create HttpRequest and set body if needed.
        switch(method) {
            case GET:
                request = new HttpGet(apiUrl);
                break;
            case POST:
                HttpPost postRequest = new HttpPost(apiUrl);
                if(null!=bodyEntity) postRequest.setEntity(bodyEntity);
                request = postRequest;
                break;
            case PUT:
                HttpPut putRequest = new HttpPut(apiUrl);
                if(null!=bodyEntity) putRequest.setEntity(bodyEntity);
                request = putRequest;
                break;
            case DELETE:
                request = new HttpDelete(apiUrl);
                break;
            default:
                log.severe(
                    String.format("GenericApiClient still doesn't support http method: %s", method.toString()));
                throw new LcmInternalException(
                    String.format("GenericApiClient still doesn't support http method: %s", method.toString()));
        };

        //add http headers
        addHeaders(request, contentTypeValue, headers);

        //make the call
        try {
            HttpResponse response = client.execute(request);
            return response;
        } catch(IOException e) {
            log.severe(String.format("Exception occurs during service call. Exception: ", e.toString()));
            throw new ExternalComponentException("Exception occurs during service call.", e);
        }
    }

    /**
     * generate the final URL based on path parameters.
     * Note:
     * Currently, the support of path parameter is very limited.
     * We only support to put the node's uuid into the path.
     * In the future, we should consider to support multiple path parameters
     * whose value is provided in the input.
     *
     * @param apiUrl original API url specified in TOSCA template
     * @param properties node properties.
     * @param pathParameters path parameters
     * @return the final url to be used by Http Client
     */
    protected String generateFinalApiUrl(final String apiUrl, JsonNode properties,
                                       final List<PathParameter> pathParameters,
                                       List<QueryParameter> queryParameters) {
        if(null!=queryParameters && queryParameters.size()>0) {
            log.severe(
                    String.format("GenericApiClient receives unsupported query parameters. parameters: %s",
                                  queryParameters.toString()));
            throw new LcmInternalException("GenericApiClient currently doesn't support query parameters.");
        }

        if(null==pathParameters || pathParameters.size()==0) return apiUrl;
        if(pathParameters.size()>1) {
            log.severe(
                    String.format("GenericApiClient cannot support multiple path parameters. parameters: %s",
                                  pathParameters.toString()));
            throw new LcmInternalException("GenericApiClient currently doesn't support multiple path parameters.");
        }

        //replace path parameter with node uuid
        String pName = pathParameters.get(0).getName();
        String placeHolder = "{"+pName+"}";
        String replaced = apiUrl.replace(placeHolder, properties.get("id").asText());
        return getMsbBaseUrl() + replaced;
    }

    /**
     * add headers to HttpRequest.
     * Note:
     * Currently, the support of header parameter is very limited.
     * We only support header parameters with default value.
     * In the future, we should support to pass values from customer input.
     *
     * @param request http request where to add these headers
     * @param contentTypeValue value of content-type header
     * @param headers header parameters
     */
    private void addHeaders(HttpUriRequest request, final String contentTypeValue,
                                final List<HeaderParameter> headers) {
        request.addHeader(HttpHeaders.CONTENT_TYPE, contentTypeValue);
        for(int i=0; i<headers.size(); i++) {
            HeaderParameter p = headers.get(i);
            String name = p.getName();
            Object defaultValue = p.getDefaultValue();
            if(defaultValue == null) {
                log.severe(
                    String.format("GenericApiClient encountered header parameters w/o default value. parameter: %s",
                                  p.toString()));
                throw new LcmInternalException(
                    "GenericApiClient currently doesn't support header parameter w/o default value.");
            }
            request.addHeader(name, defaultValue.toString());
        }
    }

    /**
     * get MSB baseUrl from property file
     */
    private String getMsbBaseUrl() {
        //MSB base url: protocol+ip+port
        String msbBaseUrl= env.getRequiredProperty(Constants.COMMON_SERVICES_MSB_BASE_URL);
        return msbBaseUrl;
    }

    public void setEnv(Environment env) {
        this.env = env;
    }
}