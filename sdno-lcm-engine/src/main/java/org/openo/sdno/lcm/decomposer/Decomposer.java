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

package org.openo.sdno.lcm.decomposer;

import org.openo.sdno.lcm.templatemodel.csar.Csar;
import org.openo.sdno.lcm.templatemodel.service.Instance;
import org.openo.sdno.lcm.model.workplan.WorkPlan;


public interface Decomposer {

    /**
     * Decomposes the Instance of service template: determines the correct order to visit the Nodes
     * of the Node.
     * Receives the Instance with all input values already included.
     * We do assume operation is the same for every node
     * We do not address any parallel processing.
     * We do not do any traffic engineering yet.
     * We do not allow to hook custom behaviour into a generic workflow here.
     * 
     * @param serviceTemplateInstance
     * @param operation
     * @param csarId the ID for CSAR  containing the required artifacts (swagger for Node SBIs)
     * @return the Workplan with list of WorkplanItem (Node + artifacts) in the order that they need
     *         to be visited to perform the given operation
     */
    WorkPlan decompose(Instance serviceTemplateInstance, String operation, String csarId);

}
