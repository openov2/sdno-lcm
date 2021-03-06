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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * FormDataContentDisposition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-18T13:47:52.904Z")
public class FormDataContentDisposition   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("parameters")
  private Map<String, String> parameters = new HashMap<String, String>();

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("modificationDate")
  private OffsetDateTime modificationDate = null;

  @JsonProperty("readDate")
  private OffsetDateTime readDate = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("name")
  private String name = null;

  public FormDataContentDisposition type(String type) {
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

  public FormDataContentDisposition parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public FormDataContentDisposition fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FormDataContentDisposition creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public FormDataContentDisposition modificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public FormDataContentDisposition readDate(OffsetDateTime readDate) {
    this.readDate = readDate;
    return this;
  }

   /**
   * Get readDate
   * @return readDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getReadDate() {
    return readDate;
  }

  public void setReadDate(OffsetDateTime readDate) {
    this.readDate = readDate;
  }

  public FormDataContentDisposition size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FormDataContentDisposition name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDataContentDisposition formDataContentDisposition = (FormDataContentDisposition) o;
    return Objects.equals(this.type, formDataContentDisposition.type) &&
        Objects.equals(this.parameters, formDataContentDisposition.parameters) &&
        Objects.equals(this.fileName, formDataContentDisposition.fileName) &&
        Objects.equals(this.creationDate, formDataContentDisposition.creationDate) &&
        Objects.equals(this.modificationDate, formDataContentDisposition.modificationDate) &&
        Objects.equals(this.readDate, formDataContentDisposition.readDate) &&
        Objects.equals(this.size, formDataContentDisposition.size) &&
        Objects.equals(this.name, formDataContentDisposition.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameters, fileName, creationDate, modificationDate, readDate, size, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataContentDisposition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

