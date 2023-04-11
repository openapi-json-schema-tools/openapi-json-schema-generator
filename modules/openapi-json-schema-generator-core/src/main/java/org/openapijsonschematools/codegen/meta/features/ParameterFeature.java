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

/**
 * Defines parameters supported by endpoints in the generated code.
 */
public enum ParameterFeature {
    @OAS2 @OAS3
    Name,

    @OAS2 @OAS3
    Required,

    @OAS2 @OAS3
    In_Path,

    @OAS2 @OAS3
    In_Query,

    @OAS2 @OAS3
    In_Header,

    @OAS3
    In_Cookie,

    @OAS3
    Style_Matrix,

    @OAS3
    Style_Label,

    @OAS3
    Style_Form,

    @OAS3
    Style_Simple,

    @OAS3
    Style_SpaceDelimited,

    @OAS3
    Style_PipeDelimited,

    @OAS3
    Style_DeepObject,

    @OAS3
    Explode,

    @OAS3
    Schema,

    @OAS3
    Content,
}
