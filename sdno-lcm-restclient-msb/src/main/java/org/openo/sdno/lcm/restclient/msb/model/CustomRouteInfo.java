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


package org.openo.sdno.lcm.restclient.msb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openo.sdno.lcm.restclient.msb.model.RouteServer;


/**
 * CustomRouteInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-20T12:04:17.236Z")
public class CustomRouteInfo   {
  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("url")
  private String url = null;

  /**
   * [control Range] 0ï¼šdefault   1ï¼šreadonly  2ï¼šhidden 
   */
  public enum ControlEnum {
    _0("0"),
    
    _1("1"),
    
    _2("2");

    private String value;

    ControlEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("control")
  private ControlEnum control = null;

  /**
   * [status] 1ï¼šabled    0ï¼šdisabled 
   */
  public enum StatusEnum {
    _0("0"),
    
    _1("1");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * [visual Range]interSystem:0,inSystem:1
   */
  public enum VisualRangeEnum {
    _0("0"),
    
    _1("1");

    private String value;

    VisualRangeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("visualRange")
  private VisualRangeEnum visualRange = null;

  /**
   * [LB Policy]non_ip_hash:0,ip_hash:1
   */
  public enum UseOwnUpstreamEnum {
    _0("0"),
    
    _1("1");

    private String value;

    UseOwnUpstreamEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("useOwnUpstream")
  private UseOwnUpstreamEnum useOwnUpstream = null;

  @JsonProperty("servers")
  private List<RouteServer> servers = new ArrayList<RouteServer>();

  public CustomRouteInfo serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public CustomRouteInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Target Service URL,start with /
   * @return url
  **/
  @ApiModelProperty(example = "/test", required = true, value = "Target Service URL,start with /")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CustomRouteInfo control(ControlEnum control) {
    this.control = control;
    return this;
  }

   /**
   * [control Range] 0ï¼šdefault   1ï¼šreadonly  2ï¼šhidden 
   * @return control
  **/
  @ApiModelProperty(example = "0", value = "[control Range] 0ï¼šdefault   1ï¼šreadonly  2ï¼šhidden ")
  public ControlEnum getControl() {
    return control;
  }

  public void setControl(ControlEnum control) {
    this.control = control;
  }

  public CustomRouteInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * [status] 1ï¼šabled    0ï¼šdisabled 
   * @return status
  **/
  @ApiModelProperty(example = "1", value = "[status] 1ï¼šabled    0ï¼šdisabled ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CustomRouteInfo visualRange(VisualRangeEnum visualRange) {
    this.visualRange = visualRange;
    return this;
  }

   /**
   * [visual Range]interSystem:0,inSystem:1
   * @return visualRange
  **/
  @ApiModelProperty(example = "1", value = "[visual Range]interSystem:0,inSystem:1")
  public VisualRangeEnum getVisualRange() {
    return visualRange;
  }

  public void setVisualRange(VisualRangeEnum visualRange) {
    this.visualRange = visualRange;
  }

  public CustomRouteInfo useOwnUpstream(UseOwnUpstreamEnum useOwnUpstream) {
    this.useOwnUpstream = useOwnUpstream;
    return this;
  }

   /**
   * [LB Policy]non_ip_hash:0,ip_hash:1
   * @return useOwnUpstream
  **/
  @ApiModelProperty(example = "0", value = "[LB Policy]non_ip_hash:0,ip_hash:1")
  public UseOwnUpstreamEnum getUseOwnUpstream() {
    return useOwnUpstream;
  }

  public void setUseOwnUpstream(UseOwnUpstreamEnum useOwnUpstream) {
    this.useOwnUpstream = useOwnUpstream;
  }

  public CustomRouteInfo servers(List<RouteServer> servers) {
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<RouteServer> getServers() {
    return servers;
  }

  public void setServers(List<RouteServer> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRouteInfo customRouteInfo = (CustomRouteInfo) o;
    return Objects.equals(this.serviceName, customRouteInfo.serviceName) &&
        Objects.equals(this.url, customRouteInfo.url) &&
        Objects.equals(this.control, customRouteInfo.control) &&
        Objects.equals(this.status, customRouteInfo.status) &&
        Objects.equals(this.visualRange, customRouteInfo.visualRange) &&
        Objects.equals(this.useOwnUpstream, customRouteInfo.useOwnUpstream) &&
        Objects.equals(this.servers, customRouteInfo.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, url, control, status, visualRange, useOwnUpstream, servers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRouteInfo {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    visualRange: ").append(toIndentedString(visualRange)).append("\n");
    sb.append("    useOwnUpstream: ").append(toIndentedString(useOwnUpstream)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

