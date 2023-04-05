/*
 * Copyright 2019 OpenAPI-Generator Contributors (https://openapi-generator.tech)
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

import org.openapijsonschematools.codegen.meta.features.annotations.OAS2;
import org.openapijsonschematools.codegen.meta.features.annotations.OAS3;
import org.openapijsonschematools.codegen.meta.features.annotations.ToolingExtension;

/**
 * Defines the documentation type available in generated output.
 */
public enum DocumentationFeature {
    /**
     * Generated output includes a README.
     */
    @ToolingExtension
    Readme,

    @OAS3
    Servers,

    @OAS2 @OAS3
    Security,

    @OAS3
    ComponentSchemas,

    @OAS3
    ComponentResponses,

    @OAS3
    ComponentParameters,

    @OAS3
    ComponentRequestBodies,

    @OAS3
    ComponentHeaders,

    @OAS3
    ComponentSecuritySchemes,

    @OAS3
    ComponentLinks,

    @OAS3
    ComponentCallbacks,

    @OAS3
    ComponentPathItems,

    /**
     * Generated output includes documentation for all generated APIs.
     */
    @ToolingExtension
    Api
}
