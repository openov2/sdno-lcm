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

package org.openo.sdno.lcm.templatemodel.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"name", "source_path", "type_name", "operations"})
public class Artifact {

    @JsonProperty("name")
    private String name;

    @JsonProperty("source_path")
    private String source_path;

    @JsonProperty("type_name")
    private String typeName;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("source_path")
    public String getSourcePath() {
        return source_path;
    }

    @JsonProperty("source_path")
    public void setSourcePath(String source_path) {
        this.source_path = source_path;
    }

    @JsonProperty("type_name")
    public String getTypeName() {
        return typeName;
    }

    @JsonProperty("type_name")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
