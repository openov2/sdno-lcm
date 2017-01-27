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
/**
 * Open-o Catalog Service rest API
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
 */


package org.openo.sdno.lcm.restclient.catalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openo.sdno.lcm.restclient.catalog.model.InputParameter;


/**
 * ServiceTemplateOperation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-18T13:47:52.904Z")
public class ServiceTemplateOperation   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("packageName")
  private String packageName = null;

  @JsonProperty("processId")
  private String processId = null;

  @JsonProperty("inputs")
  private List<InputParameter> inputs = new ArrayList<InputParameter>();

  public ServiceTemplateOperation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceTemplateOperation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceTemplateOperation packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

   /**
   * Get packageName
   * @return packageName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public ServiceTemplateOperation processId(String processId) {
    this.processId = processId;
    return this;
  }

   /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }

  public ServiceTemplateOperation inputs(List<InputParameter> inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InputParameter> getInputs() {
    return inputs;
  }

  public void setInputs(List<InputParameter> inputs) {
    this.inputs = inputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTemplateOperation serviceTemplateOperation = (ServiceTemplateOperation) o;
    return Objects.equals(this.name, serviceTemplateOperation.name) &&
        Objects.equals(this.description, serviceTemplateOperation.description) &&
        Objects.equals(this.packageName, serviceTemplateOperation.packageName) &&
        Objects.equals(this.processId, serviceTemplateOperation.processId) &&
        Objects.equals(this.inputs, serviceTemplateOperation.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, packageName, processId, inputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTemplateOperation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

