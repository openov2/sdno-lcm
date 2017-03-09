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

package org.openo.sdno.lcm.restclient.serviceinventory.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GetConnectivityServiceResponseSample
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T17:11:52.313Z")
public class GetConnectivityServiceResponseSample   {
  @JsonProperty("lifecycleState")
  private String lifecycleState = null;

  @JsonProperty("createtime")
  private String createtime = null;

  @JsonProperty("actionState")
  private String actionState = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ownerID")
  private String ownerID = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("statusReason")
  private String statusReason = null;

  @JsonProperty("adminStatus")
  private String adminStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("operStatus")
  private String operStatus = null;

  @JsonProperty("tenantID")
  private String tenantID = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("updatetime")
  private String updatetime = null;

  public GetConnectivityServiceResponseSample lifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

   /**
   * Get lifecycleState
   * @return lifecycleState
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public GetConnectivityServiceResponseSample createtime(String createtime) {
    this.createtime = createtime;
    return this;
  }

   /**
   * Get createtime
   * @return createtime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public GetConnectivityServiceResponseSample actionState(String actionState) {
    this.actionState = actionState;
    return this;
  }

   /**
   * Get actionState
   * @return actionState
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActionState() {
    return actionState;
  }

  public void setActionState(String actionState) {
    this.actionState = actionState;
  }

  public GetConnectivityServiceResponseSample description(String description) {
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

  public GetConnectivityServiceResponseSample ownerID(String ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(String ownerID) {
    this.ownerID = ownerID;
  }

  public GetConnectivityServiceResponseSample templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public GetConnectivityServiceResponseSample version(String version) {
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

  public GetConnectivityServiceResponseSample statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

   /**
   * Get statusReason
   * @return statusReason
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public GetConnectivityServiceResponseSample adminStatus(String adminStatus) {
    this.adminStatus = adminStatus;
    return this;
  }

   /**
   * Get adminStatus
   * @return adminStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAdminStatus() {
    return adminStatus;
  }

  public void setAdminStatus(String adminStatus) {
    this.adminStatus = adminStatus;
  }

  public GetConnectivityServiceResponseSample name(String name) {
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

  public GetConnectivityServiceResponseSample operStatus(String operStatus) {
    this.operStatus = operStatus;
    return this;
  }

   /**
   * Get operStatus
   * @return operStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOperStatus() {
    return operStatus;
  }

  public void setOperStatus(String operStatus) {
    this.operStatus = operStatus;
  }

  public GetConnectivityServiceResponseSample tenantID(String tenantID) {
    this.tenantID = tenantID;
    return this;
  }

   /**
   * Get tenantID
   * @return tenantID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTenantID() {
    return tenantID;
  }

  public void setTenantID(String tenantID) {
    this.tenantID = tenantID;
  }

  public GetConnectivityServiceResponseSample location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GetConnectivityServiceResponseSample id(String id) {
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

  public GetConnectivityServiceResponseSample updatetime(String updatetime) {
    this.updatetime = updatetime;
    return this;
  }

   /**
   * Get updatetime
   * @return updatetime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConnectivityServiceResponseSample getConnectivityServiceResponseSample = (GetConnectivityServiceResponseSample) o;
    return Objects.equals(this.lifecycleState, getConnectivityServiceResponseSample.lifecycleState) &&
        Objects.equals(this.createtime, getConnectivityServiceResponseSample.createtime) &&
        Objects.equals(this.actionState, getConnectivityServiceResponseSample.actionState) &&
        Objects.equals(this.description, getConnectivityServiceResponseSample.description) &&
        Objects.equals(this.ownerID, getConnectivityServiceResponseSample.ownerID) &&
        Objects.equals(this.templateId, getConnectivityServiceResponseSample.templateId) &&
        Objects.equals(this.version, getConnectivityServiceResponseSample.version) &&
        Objects.equals(this.statusReason, getConnectivityServiceResponseSample.statusReason) &&
        Objects.equals(this.adminStatus, getConnectivityServiceResponseSample.adminStatus) &&
        Objects.equals(this.name, getConnectivityServiceResponseSample.name) &&
        Objects.equals(this.operStatus, getConnectivityServiceResponseSample.operStatus) &&
        Objects.equals(this.tenantID, getConnectivityServiceResponseSample.tenantID) &&
        Objects.equals(this.location, getConnectivityServiceResponseSample.location) &&
        Objects.equals(this.id, getConnectivityServiceResponseSample.id) &&
        Objects.equals(this.updatetime, getConnectivityServiceResponseSample.updatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleState, createtime, actionState, description, ownerID, templateId, version, statusReason, adminStatus, name, operStatus, tenantID, location, id, updatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConnectivityServiceResponseSample {\n");
    
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    createtime: ").append(toIndentedString(createtime)).append("\n");
    sb.append("    actionState: ").append(toIndentedString(actionState)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    adminStatus: ").append(toIndentedString(adminStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatetime: ").append(toIndentedString(updatetime)).append("\n");
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
