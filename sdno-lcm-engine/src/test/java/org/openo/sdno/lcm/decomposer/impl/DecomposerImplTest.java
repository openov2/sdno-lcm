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

package org.openo.sdno.lcm.decomposer.impl;

import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.openo.sdno.lcm.decomposer.Decomposer;
import org.openo.sdno.lcm.templateinstanceparser.TemplateInstanceParser;
import org.openo.sdno.lcm.templateinstanceparser.impl.TemplateInstanceParserImpl;
import org.openo.sdno.lcm.templatemodel.service.Instance;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = {"sdno-lcm-unit"})
public class DecomposerImplTest {

    Decomposer decomposer;

    Instance instance;

    @BeforeClass
    public void before() throws Exception {

        TemplateInstanceParser templateInstanceParser = new TemplateInstanceParserImpl();
        decomposer = new DecomposerImpl();
        String instanceJson = FileUtils.readFileToString(FileUtils.getFile("src", "test", "resources", "instance.json"),
                Charset.defaultCharset());
        instance = templateInstanceParser.parse(instanceJson);
    }

    @Test
    public void decompose() {
        decomposer.decompose(instance, "deploy", null);
    }
}