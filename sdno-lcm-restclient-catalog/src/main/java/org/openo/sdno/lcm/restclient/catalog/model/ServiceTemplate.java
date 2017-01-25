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
import org.openo.sdno.lcm.restclient.catalog.model.OutputParameter;
import org.openo.sdno.lcm.restclient.catalog.model.ServiceTemplateOperation;
import org.openo.sdno.lcm.restclient.catalog.model.SubstitutionMapping;


/**
 * ServiceTemplate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-18T13:47:52.904Z")
public class ServiceTemplate   {
  @JsonProperty("serviceTemplateId")
  private String serviceTemplateId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("templateName")
  private String templateName = null;

  @JsonProperty("vendor")
  private String vendor = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("csarId")
  private String csarId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("downloadUri")
  private String downloadUri = null;

  @JsonProperty("inputs")
  private List<InputParameter> inputs = new ArrayList<InputParameter>();

  @JsonProperty("outputs")
  private List<OutputParameter> outputs = new ArrayList<OutputParameter>();

  @JsonProperty("operations")
  private List<ServiceTemplateOperation> operations = new ArrayList<ServiceTemplateOperation>();

  @JsonProperty("substitution")
  private SubstitutionMapping substitution = null;

  public ServiceTemplate serviceTemplateId(String serviceTemplateId) {
    this.serviceTemplateId = serviceTemplateId;
    return this;
  }

   /**
   * Get serviceTemplateId
   * @return serviceTemplateId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceTemplateId() {
    return serviceTemplateId;
  }

  public void setServiceTemplateId(String serviceTemplateId) {
    this.serviceTemplateId = serviceTemplateId;
  }

  public ServiceTemplate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceTemplate templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public ServiceTemplate vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public ServiceTemplate version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServiceTemplate csarId(String csarId) {
    this.csarId = csarId;
    return this;
  }

   /**
   * Get csarId
   * @return csarId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCsarId() {
    return csarId;
  }

  public void setCsarId(String csarId) {
    this.csarId = csarId;
  }

  public ServiceTemplate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServiceTemplate downloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }

   /**
   * Get downloadUri
   * @return downloadUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDownloadUri() {
    return downloadUri;
  }

  public void setDownloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
  }

  public ServiceTemplate inputs(List<InputParameter> inputs) {
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

  public ServiceTemplate outputs(List<OutputParameter> outputs) {
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OutputParameter> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<OutputParameter> outputs) {
    this.outputs = outputs;
  }

  public ServiceTemplate operations(List<ServiceTemplateOperation> operations) {
    this.operations = operations;
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceTemplateOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<ServiceTemplateOperation> operations) {
    this.operations = operations;
  }

  public ServiceTemplate substitution(SubstitutionMapping substitution) {
    this.substitution = substitution;
    return this;
  }

   /**
   * Get substitution
   * @return substitution
  **/
  @ApiModelProperty(example = "null", value = "")
  public SubstitutionMapping getSubstitution() {
    return substitution;
  }

  public void setSubstitution(SubstitutionMapping substitution) {
    this.substitution = substitution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTemplate serviceTemplate = (ServiceTemplate) o;
    return Objects.equals(this.serviceTemplateId, serviceTemplate.serviceTemplateId) &&
        Objects.equals(this.id, serviceTemplate.id) &&
        Objects.equals(this.templateName, serviceTemplate.templateName) &&
        Objects.equals(this.vendor, serviceTemplate.vendor) &&
        Objects.equals(this.version, serviceTemplate.version) &&
        Objects.equals(this.csarId, serviceTemplate.csarId) &&
        Objects.equals(this.type, serviceTemplate.type) &&
        Objects.equals(this.downloadUri, serviceTemplate.downloadUri) &&
        Objects.equals(this.inputs, serviceTemplate.inputs) &&
        Objects.equals(this.outputs, serviceTemplate.outputs) &&
        Objects.equals(this.operations, serviceTemplate.operations) &&
        Objects.equals(this.substitution, serviceTemplate.substitution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceTemplateId, id, templateName, vendor, version, csarId, type, downloadUri, inputs, outputs, operations, substitution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTemplate {\n");
    
    sb.append("    serviceTemplateId: ").append(toIndentedString(serviceTemplateId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    csarId: ").append(toIndentedString(csarId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    substitution: ").append(toIndentedString(substitution)).append("\n");
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

