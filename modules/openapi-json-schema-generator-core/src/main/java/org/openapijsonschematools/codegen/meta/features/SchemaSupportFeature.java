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
 * Defines special circumstances handled by the generator.
 */
public enum SchemaSupportFeature {
    @OAS2 @OAS3
    additionalProperties,

    /**
     * The json schema Composition allOf keyword
     * If a composed schema uses the allOf keyword, then payloads must be valid against all the given allOf schemas
     */
    @OAS2 @OAS3
    allOf,

    /**
     * The json schema Composition anyOf keyword
     * If a composed schema uses the anyOf keyword, then payloads must be valid against any of the given anyOf schemas
     */
    @OAS3
    anyOf,

    @OAS2 @OAS3
    discriminator,

    @OAS2 @OAS3
    enumKeyword,

    @OAS2 @OAS3
    exclusiveMinimum,

    @OAS2 @OAS3
    exclusiveMaximum,

    @OAS2 @OAS3
    format,

    @OAS2 @OAS3
    items,

    @OAS2 @OAS3
    maxItems,

    @OAS2 @OAS3
    maxLength,

    @OAS2 @OAS3
    maxProperties,

    @OAS2 @OAS3
    maximum,

    @OAS2 @OAS3
    minItems,

    @OAS2 @OAS3
    minLength,

    @OAS2 @OAS3
    minProperties,

    @OAS2 @OAS3
    minimum,

    @OAS2 @OAS3
    multipleOf,

    @OAS3
    not,

    @OAS3
    nullable,

    @OAS3
    oneOf,

    @OAS2 @OAS3
    pattern,

    @OAS2 @OAS3
    properties,

    @OAS2 @OAS3
    required,

    @OAS2 @OAS3
    type,

    @OAS2 @OAS3
    uniqueItems
}
