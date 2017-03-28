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
import org.openo.sdno.lcm.restclient.msb.model.JVMMetrics;


/**
 * Gauges
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-20T12:04:17.236Z")
public class Gauges   {
  @JsonProperty("jvm.attribute.uptime")
  private JVMMetrics jvmAttributeUptime = null;

  @JsonProperty("jvm.memory.pools.Eden-Space.usage")
  private JVMMetrics jvmMemoryPoolsEdenSpaceUsage = null;

  @JsonProperty("jvm.memory.pools.PS-Eden-Space.usage")
  private JVMMetrics jvmMemoryPoolsPSEdenSpaceUsage = null;

  @JsonProperty("jvm.memory.pools.Perm-Gen.usage")
  private JVMMetrics jvmMemoryPoolsPermGenUsage = null;

  @JsonProperty("jvm.memory.pools.PS-Perm-Gen.usage")
  private JVMMetrics jvmMemoryPoolsPSPermGenUsage = null;

  @JsonProperty("jvm.memory.pools.Survivor-Space.usage")
  private JVMMetrics jvmMemoryPoolsSurvivorSpaceUsage = null;

  @JsonProperty("jvm.memory.pools.PS-Survivor-Space.usage")
  private JVMMetrics jvmMemoryPoolsPSSurvivorSpaceUsage = null;

  @JsonProperty("jvm.memory.pools.Tenured-Gen.usage")
  private JVMMetrics jvmMemoryPoolsTenuredGenUsage = null;

  @JsonProperty("jvm.memory.pools.PS-Old-Gen.usage")
  private JVMMetrics jvmMemoryPoolsPSOldGenUsage = null;

  @JsonProperty("jvm.memory.pools.Code-Cache.usage")
  private JVMMetrics jvmMemoryPoolsCodeCacheUsage = null;

  @JsonProperty("jvm.memory.heap.init")
  private JVMMetrics jvmMemoryHeapInit = null;

  @JsonProperty("jvm.memory.non-heap.init")
  private JVMMetrics jvmMemoryNonHeapInit = null;

  @JsonProperty("jvm.memory.heap.used")
  private JVMMetrics jvmMemoryHeapUsed = null;

  @JsonProperty("jvm.memory.non-heap.used")
  private JVMMetrics jvmMemoryNonHeapUsed = null;

  @JsonProperty("jvm.memory.heap.max")
  private JVMMetrics jvmMemoryHeapMax = null;

  @JsonProperty("jvm.threads.runnable.count")
  private JVMMetrics jvmThreadsRunnableCount = null;

  @JsonProperty("jvm.threads.timed_waiting.count")
  private JVMMetrics jvmThreadsTimedWaitingCount = null;

  @JsonProperty("jvm.threads.waiting.count")
  private JVMMetrics jvmThreadsWaitingCount = null;

  @JsonProperty("jvm.threads.blocked.count")
  private JVMMetrics jvmThreadsBlockedCount = null;

  @JsonProperty("jvm.threads.count")
  private JVMMetrics jvmThreadsCount = null;

  public Gauges jvmAttributeUptime(JVMMetrics jvmAttributeUptime) {
    this.jvmAttributeUptime = jvmAttributeUptime;
    return this;
  }

   /**
   * Get jvmAttributeUptime
   * @return jvmAttributeUptime
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmAttributeUptime() {
    return jvmAttributeUptime;
  }

  public void setJvmAttributeUptime(JVMMetrics jvmAttributeUptime) {
    this.jvmAttributeUptime = jvmAttributeUptime;
  }

  public Gauges jvmMemoryPoolsEdenSpaceUsage(JVMMetrics jvmMemoryPoolsEdenSpaceUsage) {
    this.jvmMemoryPoolsEdenSpaceUsage = jvmMemoryPoolsEdenSpaceUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsEdenSpaceUsage
   * @return jvmMemoryPoolsEdenSpaceUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsEdenSpaceUsage() {
    return jvmMemoryPoolsEdenSpaceUsage;
  }

  public void setJvmMemoryPoolsEdenSpaceUsage(JVMMetrics jvmMemoryPoolsEdenSpaceUsage) {
    this.jvmMemoryPoolsEdenSpaceUsage = jvmMemoryPoolsEdenSpaceUsage;
  }

  public Gauges jvmMemoryPoolsPSEdenSpaceUsage(JVMMetrics jvmMemoryPoolsPSEdenSpaceUsage) {
    this.jvmMemoryPoolsPSEdenSpaceUsage = jvmMemoryPoolsPSEdenSpaceUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsPSEdenSpaceUsage
   * @return jvmMemoryPoolsPSEdenSpaceUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsPSEdenSpaceUsage() {
    return jvmMemoryPoolsPSEdenSpaceUsage;
  }

  public void setJvmMemoryPoolsPSEdenSpaceUsage(JVMMetrics jvmMemoryPoolsPSEdenSpaceUsage) {
    this.jvmMemoryPoolsPSEdenSpaceUsage = jvmMemoryPoolsPSEdenSpaceUsage;
  }

  public Gauges jvmMemoryPoolsPermGenUsage(JVMMetrics jvmMemoryPoolsPermGenUsage) {
    this.jvmMemoryPoolsPermGenUsage = jvmMemoryPoolsPermGenUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsPermGenUsage
   * @return jvmMemoryPoolsPermGenUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsPermGenUsage() {
    return jvmMemoryPoolsPermGenUsage;
  }

  public void setJvmMemoryPoolsPermGenUsage(JVMMetrics jvmMemoryPoolsPermGenUsage) {
    this.jvmMemoryPoolsPermGenUsage = jvmMemoryPoolsPermGenUsage;
  }

  public Gauges jvmMemoryPoolsPSPermGenUsage(JVMMetrics jvmMemoryPoolsPSPermGenUsage) {
    this.jvmMemoryPoolsPSPermGenUsage = jvmMemoryPoolsPSPermGenUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsPSPermGenUsage
   * @return jvmMemoryPoolsPSPermGenUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsPSPermGenUsage() {
    return jvmMemoryPoolsPSPermGenUsage;
  }

  public void setJvmMemoryPoolsPSPermGenUsage(JVMMetrics jvmMemoryPoolsPSPermGenUsage) {
    this.jvmMemoryPoolsPSPermGenUsage = jvmMemoryPoolsPSPermGenUsage;
  }

  public Gauges jvmMemoryPoolsSurvivorSpaceUsage(JVMMetrics jvmMemoryPoolsSurvivorSpaceUsage) {
    this.jvmMemoryPoolsSurvivorSpaceUsage = jvmMemoryPoolsSurvivorSpaceUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsSurvivorSpaceUsage
   * @return jvmMemoryPoolsSurvivorSpaceUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsSurvivorSpaceUsage() {
    return jvmMemoryPoolsSurvivorSpaceUsage;
  }

  public void setJvmMemoryPoolsSurvivorSpaceUsage(JVMMetrics jvmMemoryPoolsSurvivorSpaceUsage) {
    this.jvmMemoryPoolsSurvivorSpaceUsage = jvmMemoryPoolsSurvivorSpaceUsage;
  }

  public Gauges jvmMemoryPoolsPSSurvivorSpaceUsage(JVMMetrics jvmMemoryPoolsPSSurvivorSpaceUsage) {
    this.jvmMemoryPoolsPSSurvivorSpaceUsage = jvmMemoryPoolsPSSurvivorSpaceUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsPSSurvivorSpaceUsage
   * @return jvmMemoryPoolsPSSurvivorSpaceUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsPSSurvivorSpaceUsage() {
    return jvmMemoryPoolsPSSurvivorSpaceUsage;
  }

  public void setJvmMemoryPoolsPSSurvivorSpaceUsage(JVMMetrics jvmMemoryPoolsPSSurvivorSpaceUsage) {
    this.jvmMemoryPoolsPSSurvivorSpaceUsage = jvmMemoryPoolsPSSurvivorSpaceUsage;
  }

  public Gauges jvmMemoryPoolsTenuredGenUsage(JVMMetrics jvmMemoryPoolsTenuredGenUsage) {
    this.jvmMemoryPoolsTenuredGenUsage = jvmMemoryPoolsTenuredGenUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsTenuredGenUsage
   * @return jvmMemoryPoolsTenuredGenUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsTenuredGenUsage() {
    return jvmMemoryPoolsTenuredGenUsage;
  }

  public void setJvmMemoryPoolsTenuredGenUsage(JVMMetrics jvmMemoryPoolsTenuredGenUsage) {
    this.jvmMemoryPoolsTenuredGenUsage = jvmMemoryPoolsTenuredGenUsage;
  }

  public Gauges jvmMemoryPoolsPSOldGenUsage(JVMMetrics jvmMemoryPoolsPSOldGenUsage) {
    this.jvmMemoryPoolsPSOldGenUsage = jvmMemoryPoolsPSOldGenUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsPSOldGenUsage
   * @return jvmMemoryPoolsPSOldGenUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsPSOldGenUsage() {
    return jvmMemoryPoolsPSOldGenUsage;
  }

  public void setJvmMemoryPoolsPSOldGenUsage(JVMMetrics jvmMemoryPoolsPSOldGenUsage) {
    this.jvmMemoryPoolsPSOldGenUsage = jvmMemoryPoolsPSOldGenUsage;
  }

  public Gauges jvmMemoryPoolsCodeCacheUsage(JVMMetrics jvmMemoryPoolsCodeCacheUsage) {
    this.jvmMemoryPoolsCodeCacheUsage = jvmMemoryPoolsCodeCacheUsage;
    return this;
  }

   /**
   * Get jvmMemoryPoolsCodeCacheUsage
   * @return jvmMemoryPoolsCodeCacheUsage
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryPoolsCodeCacheUsage() {
    return jvmMemoryPoolsCodeCacheUsage;
  }

  public void setJvmMemoryPoolsCodeCacheUsage(JVMMetrics jvmMemoryPoolsCodeCacheUsage) {
    this.jvmMemoryPoolsCodeCacheUsage = jvmMemoryPoolsCodeCacheUsage;
  }

  public Gauges jvmMemoryHeapInit(JVMMetrics jvmMemoryHeapInit) {
    this.jvmMemoryHeapInit = jvmMemoryHeapInit;
    return this;
  }

   /**
   * Get jvmMemoryHeapInit
   * @return jvmMemoryHeapInit
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryHeapInit() {
    return jvmMemoryHeapInit;
  }

  public void setJvmMemoryHeapInit(JVMMetrics jvmMemoryHeapInit) {
    this.jvmMemoryHeapInit = jvmMemoryHeapInit;
  }

  public Gauges jvmMemoryNonHeapInit(JVMMetrics jvmMemoryNonHeapInit) {
    this.jvmMemoryNonHeapInit = jvmMemoryNonHeapInit;
    return this;
  }

   /**
   * Get jvmMemoryNonHeapInit
   * @return jvmMemoryNonHeapInit
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryNonHeapInit() {
    return jvmMemoryNonHeapInit;
  }

  public void setJvmMemoryNonHeapInit(JVMMetrics jvmMemoryNonHeapInit) {
    this.jvmMemoryNonHeapInit = jvmMemoryNonHeapInit;
  }

  public Gauges jvmMemoryHeapUsed(JVMMetrics jvmMemoryHeapUsed) {
    this.jvmMemoryHeapUsed = jvmMemoryHeapUsed;
    return this;
  }

   /**
   * Get jvmMemoryHeapUsed
   * @return jvmMemoryHeapUsed
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryHeapUsed() {
    return jvmMemoryHeapUsed;
  }

  public void setJvmMemoryHeapUsed(JVMMetrics jvmMemoryHeapUsed) {
    this.jvmMemoryHeapUsed = jvmMemoryHeapUsed;
  }

  public Gauges jvmMemoryNonHeapUsed(JVMMetrics jvmMemoryNonHeapUsed) {
    this.jvmMemoryNonHeapUsed = jvmMemoryNonHeapUsed;
    return this;
  }

   /**
   * Get jvmMemoryNonHeapUsed
   * @return jvmMemoryNonHeapUsed
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryNonHeapUsed() {
    return jvmMemoryNonHeapUsed;
  }

  public void setJvmMemoryNonHeapUsed(JVMMetrics jvmMemoryNonHeapUsed) {
    this.jvmMemoryNonHeapUsed = jvmMemoryNonHeapUsed;
  }

  public Gauges jvmMemoryHeapMax(JVMMetrics jvmMemoryHeapMax) {
    this.jvmMemoryHeapMax = jvmMemoryHeapMax;
    return this;
  }

   /**
   * Get jvmMemoryHeapMax
   * @return jvmMemoryHeapMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmMemoryHeapMax() {
    return jvmMemoryHeapMax;
  }

  public void setJvmMemoryHeapMax(JVMMetrics jvmMemoryHeapMax) {
    this.jvmMemoryHeapMax = jvmMemoryHeapMax;
  }

  public Gauges jvmThreadsRunnableCount(JVMMetrics jvmThreadsRunnableCount) {
    this.jvmThreadsRunnableCount = jvmThreadsRunnableCount;
    return this;
  }

   /**
   * Get jvmThreadsRunnableCount
   * @return jvmThreadsRunnableCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmThreadsRunnableCount() {
    return jvmThreadsRunnableCount;
  }

  public void setJvmThreadsRunnableCount(JVMMetrics jvmThreadsRunnableCount) {
    this.jvmThreadsRunnableCount = jvmThreadsRunnableCount;
  }

  public Gauges jvmThreadsTimedWaitingCount(JVMMetrics jvmThreadsTimedWaitingCount) {
    this.jvmThreadsTimedWaitingCount = jvmThreadsTimedWaitingCount;
    return this;
  }

   /**
   * Get jvmThreadsTimedWaitingCount
   * @return jvmThreadsTimedWaitingCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmThreadsTimedWaitingCount() {
    return jvmThreadsTimedWaitingCount;
  }

  public void setJvmThreadsTimedWaitingCount(JVMMetrics jvmThreadsTimedWaitingCount) {
    this.jvmThreadsTimedWaitingCount = jvmThreadsTimedWaitingCount;
  }

  public Gauges jvmThreadsWaitingCount(JVMMetrics jvmThreadsWaitingCount) {
    this.jvmThreadsWaitingCount = jvmThreadsWaitingCount;
    return this;
  }

   /**
   * Get jvmThreadsWaitingCount
   * @return jvmThreadsWaitingCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmThreadsWaitingCount() {
    return jvmThreadsWaitingCount;
  }

  public void setJvmThreadsWaitingCount(JVMMetrics jvmThreadsWaitingCount) {
    this.jvmThreadsWaitingCount = jvmThreadsWaitingCount;
  }

  public Gauges jvmThreadsBlockedCount(JVMMetrics jvmThreadsBlockedCount) {
    this.jvmThreadsBlockedCount = jvmThreadsBlockedCount;
    return this;
  }

   /**
   * Get jvmThreadsBlockedCount
   * @return jvmThreadsBlockedCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmThreadsBlockedCount() {
    return jvmThreadsBlockedCount;
  }

  public void setJvmThreadsBlockedCount(JVMMetrics jvmThreadsBlockedCount) {
    this.jvmThreadsBlockedCount = jvmThreadsBlockedCount;
  }

  public Gauges jvmThreadsCount(JVMMetrics jvmThreadsCount) {
    this.jvmThreadsCount = jvmThreadsCount;
    return this;
  }

   /**
   * Get jvmThreadsCount
   * @return jvmThreadsCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public JVMMetrics getJvmThreadsCount() {
    return jvmThreadsCount;
  }

  public void setJvmThreadsCount(JVMMetrics jvmThreadsCount) {
    this.jvmThreadsCount = jvmThreadsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gauges gauges = (Gauges) o;
    return Objects.equals(this.jvmAttributeUptime, gauges.jvmAttributeUptime) &&
        Objects.equals(this.jvmMemoryPoolsEdenSpaceUsage, gauges.jvmMemoryPoolsEdenSpaceUsage) &&
        Objects.equals(this.jvmMemoryPoolsPSEdenSpaceUsage, gauges.jvmMemoryPoolsPSEdenSpaceUsage) &&
        Objects.equals(this.jvmMemoryPoolsPermGenUsage, gauges.jvmMemoryPoolsPermGenUsage) &&
        Objects.equals(this.jvmMemoryPoolsPSPermGenUsage, gauges.jvmMemoryPoolsPSPermGenUsage) &&
        Objects.equals(this.jvmMemoryPoolsSurvivorSpaceUsage, gauges.jvmMemoryPoolsSurvivorSpaceUsage) &&
        Objects.equals(this.jvmMemoryPoolsPSSurvivorSpaceUsage, gauges.jvmMemoryPoolsPSSurvivorSpaceUsage) &&
        Objects.equals(this.jvmMemoryPoolsTenuredGenUsage, gauges.jvmMemoryPoolsTenuredGenUsage) &&
        Objects.equals(this.jvmMemoryPoolsPSOldGenUsage, gauges.jvmMemoryPoolsPSOldGenUsage) &&
        Objects.equals(this.jvmMemoryPoolsCodeCacheUsage, gauges.jvmMemoryPoolsCodeCacheUsage) &&
        Objects.equals(this.jvmMemoryHeapInit, gauges.jvmMemoryHeapInit) &&
        Objects.equals(this.jvmMemoryNonHeapInit, gauges.jvmMemoryNonHeapInit) &&
        Objects.equals(this.jvmMemoryHeapUsed, gauges.jvmMemoryHeapUsed) &&
        Objects.equals(this.jvmMemoryNonHeapUsed, gauges.jvmMemoryNonHeapUsed) &&
        Objects.equals(this.jvmMemoryHeapMax, gauges.jvmMemoryHeapMax) &&
        Objects.equals(this.jvmThreadsRunnableCount, gauges.jvmThreadsRunnableCount) &&
        Objects.equals(this.jvmThreadsTimedWaitingCount, gauges.jvmThreadsTimedWaitingCount) &&
        Objects.equals(this.jvmThreadsWaitingCount, gauges.jvmThreadsWaitingCount) &&
        Objects.equals(this.jvmThreadsBlockedCount, gauges.jvmThreadsBlockedCount) &&
        Objects.equals(this.jvmThreadsCount, gauges.jvmThreadsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jvmAttributeUptime, jvmMemoryPoolsEdenSpaceUsage, jvmMemoryPoolsPSEdenSpaceUsage, jvmMemoryPoolsPermGenUsage, jvmMemoryPoolsPSPermGenUsage, jvmMemoryPoolsSurvivorSpaceUsage, jvmMemoryPoolsPSSurvivorSpaceUsage, jvmMemoryPoolsTenuredGenUsage, jvmMemoryPoolsPSOldGenUsage, jvmMemoryPoolsCodeCacheUsage, jvmMemoryHeapInit, jvmMemoryNonHeapInit, jvmMemoryHeapUsed, jvmMemoryNonHeapUsed, jvmMemoryHeapMax, jvmThreadsRunnableCount, jvmThreadsTimedWaitingCount, jvmThreadsWaitingCount, jvmThreadsBlockedCount, jvmThreadsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gauges {\n");
    
    sb.append("    jvmAttributeUptime: ").append(toIndentedString(jvmAttributeUptime)).append("\n");
    sb.append("    jvmMemoryPoolsEdenSpaceUsage: ").append(toIndentedString(jvmMemoryPoolsEdenSpaceUsage)).append("\n");
    sb.append("    jvmMemoryPoolsPSEdenSpaceUsage: ").append(toIndentedString(jvmMemoryPoolsPSEdenSpaceUsage)).append("\n");
    sb.append("    jvmMemoryPoolsPermGenUsage: ").append(toIndentedString(jvmMemoryPoolsPermGenUsage)).append("\n");
    sb.append("    jvmMemoryPoolsPSPermGenUsage: ").append(toIndentedString(jvmMemoryPoolsPSPermGenUsage)).append("\n");
    sb.append("    jvmMemoryPoolsSurvivorSpaceUsage: ").append(toIndentedString(jvmMemoryPoolsSurvivorSpaceUsage)).append("\n");
    sb.append("    jvmMemoryPoolsPSSurvivorSpaceUsage: ").append(toIndentedString(jvmMemoryPoolsPSSurvivorSpaceUsage)).append("\n");
    sb.append("    jvmMemoryPoolsTenuredGenUsage: ").append(toIndentedString(jvmMemoryPoolsTenuredGenUsage)).append("\n");
    sb.append("    jvmMemoryPoolsPSOldGenUsage: ").append(toIndentedString(jvmMemoryPoolsPSOldGenUsage)).append("\n");
    sb.append("    jvmMemoryPoolsCodeCacheUsage: ").append(toIndentedString(jvmMemoryPoolsCodeCacheUsage)).append("\n");
    sb.append("    jvmMemoryHeapInit: ").append(toIndentedString(jvmMemoryHeapInit)).append("\n");
    sb.append("    jvmMemoryNonHeapInit: ").append(toIndentedString(jvmMemoryNonHeapInit)).append("\n");
    sb.append("    jvmMemoryHeapUsed: ").append(toIndentedString(jvmMemoryHeapUsed)).append("\n");
    sb.append("    jvmMemoryNonHeapUsed: ").append(toIndentedString(jvmMemoryNonHeapUsed)).append("\n");
    sb.append("    jvmMemoryHeapMax: ").append(toIndentedString(jvmMemoryHeapMax)).append("\n");
    sb.append("    jvmThreadsRunnableCount: ").append(toIndentedString(jvmThreadsRunnableCount)).append("\n");
    sb.append("    jvmThreadsTimedWaitingCount: ").append(toIndentedString(jvmThreadsTimedWaitingCount)).append("\n");
    sb.append("    jvmThreadsWaitingCount: ").append(toIndentedString(jvmThreadsWaitingCount)).append("\n");
    sb.append("    jvmThreadsBlockedCount: ").append(toIndentedString(jvmThreadsBlockedCount)).append("\n");
    sb.append("    jvmThreadsCount: ").append(toIndentedString(jvmThreadsCount)).append("\n");
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

