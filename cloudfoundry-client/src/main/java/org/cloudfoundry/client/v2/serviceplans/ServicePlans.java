/*
 * Copyright 2013-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.serviceplans;


import reactor.core.publisher.Mono;

public interface ServicePlans {

    /**
     * Makes the <a href="http://apidocs.cloudfoundry.org/214/service_plans/list_all_service_instances_for_the_service_plan.html">List all Service Instances for the Service Plan</a> request
     *
     * @param request the List Service Instances request
     * @return the response from the List Service Instances request
     */
    Mono<ListServicePlanServiceInstancesResponse> listServiceInstances(ListServicePlanServiceInstancesRequest request);

}