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
import org.openo.sdno.lcm.restclient.catalog.model.CapReqMapping;


/**
 * SubstitutionMapping
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-18T13:47:52.904Z")
public class SubstitutionMapping   {
  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("requirements")
  private List<CapReqMapping> requirements = new ArrayList<CapReqMapping>();

  @JsonProperty("capabilities")
  private List<CapReqMapping> capabilities = new ArrayList<CapReqMapping>();

  public SubstitutionMapping nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public SubstitutionMapping requirements(List<CapReqMapping> requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CapReqMapping> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<CapReqMapping> requirements) {
    this.requirements = requirements;
  }

  public SubstitutionMapping capabilities(List<CapReqMapping> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CapReqMapping> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<CapReqMapping> capabilities) {
    this.capabilities = capabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstitutionMapping substitutionMapping = (SubstitutionMapping) o;
    return Objects.equals(this.nodeType, substitutionMapping.nodeType) &&
        Objects.equals(this.requirements, substitutionMapping.requirements) &&
        Objects.equals(this.capabilities, substitutionMapping.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, requirements, capabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstitutionMapping {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

