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
 *
 * Copyright 2016-2017 ZTE Corporation.
 * Modifications Copyright 2017 Huawei Technologies Co., Ltd.
 */


package org.openo.sdno.lcm.restclient.catalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openo.sdno.lcm.restclient.catalog.model.RelationShip;


/**
 * NodeTemplate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-18T13:47:52.904Z")
public class NodeTemplate   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("properties")
  private Map<String, Object> properties = new HashMap<String, Object>();

  @JsonProperty("relationShips")
  private List<RelationShip> relationShips = new ArrayList<RelationShip>();

  public NodeTemplate id(String id) {
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

  public NodeTemplate name(String name) {
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

  public NodeTemplate type(String type) {
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

  public NodeTemplate properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public NodeTemplate relationShips(List<RelationShip> relationShips) {
    this.relationShips = relationShips;
    return this;
  }

   /**
   * Get relationShips
   * @return relationShips
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RelationShip> getRelationShips() {
    return relationShips;
  }

  public void setRelationShips(List<RelationShip> relationShips) {
    this.relationShips = relationShips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeTemplate nodeTemplate = (NodeTemplate) o;
    return Objects.equals(this.id, nodeTemplate.id) &&
        Objects.equals(this.name, nodeTemplate.name) &&
        Objects.equals(this.type, nodeTemplate.type) &&
        Objects.equals(this.properties, nodeTemplate.properties) &&
        Objects.equals(this.relationShips, nodeTemplate.relationShips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, properties, relationShips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    relationShips: ").append(toIndentedString(relationShips)).append("\n");
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

