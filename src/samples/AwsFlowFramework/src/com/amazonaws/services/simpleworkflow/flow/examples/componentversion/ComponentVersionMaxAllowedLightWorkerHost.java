/**
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.componentversion;

import java.io.IOException;

import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;

public class ComponentVersionMaxAllowedLightWorkerHost extends ComponentVersionWorkerHostBase {

    public ComponentVersionMaxAllowedLightWorkerHost() throws IllegalArgumentException, IOException {
        super();
    }

    public static void main(String[] args) throws Exception {
        ComponentVersionMaxAllowedLightWorkerHost host = new ComponentVersionMaxAllowedLightWorkerHost();
        ActivityWorker activityWorker = host.startActivityWorker();
        WorkflowWorker workflowWorker = host.startWorkflowWorker(ComponentVersionWorkflowMaxAllowedLightImpl.class);
        host.addShutDownHook(activityWorker, workflowWorker);
    }
}
