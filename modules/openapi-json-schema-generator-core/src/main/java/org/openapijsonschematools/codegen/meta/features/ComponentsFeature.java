/*
 * Copyright 2023 OpenAPI-Json-Schema-Generator Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapijsonschematools.codegen.meta.features;

import org.openapijsonschematools.codegen.meta.features.annotations.OAS3;

public enum ComponentsFeature {
    @OAS3
    schemas,

    @OAS3
    responses,

    @OAS3
    parameters,

    @OAS3
    examples,

    @OAS3
    requestBodies,

    @OAS3
    headers,

    @OAS3
    securitySchemes,

    @OAS3
    links,

    @OAS3
    callbacks,

    @OAS3
    pathItems
}
