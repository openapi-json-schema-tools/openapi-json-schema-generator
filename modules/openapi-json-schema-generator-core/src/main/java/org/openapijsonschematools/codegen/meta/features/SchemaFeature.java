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
public enum SchemaFeature {
    @OAS2 @OAS3
    AdditionalProperties,

    /**
     * The json schema Composition allOf keyword
     * If a composed schema uses the allOf keyword, then payloads must be valid against all the given allOf schemas
     */
    @OAS2 @OAS3
    AllOf,

    /**
     * The json schema Composition anyOf keyword
     * If a composed schema uses the anyOf keyword, then payloads must be valid against any of the given anyOf schemas
     */
    @OAS3
    AnyOf,

    @OAS2 @OAS3
    Discriminator,

    @OAS2 @OAS3
    Enum,

    @OAS2 @OAS3
    ExclusiveMinimum,

    @OAS2 @OAS3
    ExclusiveMaximum,

    @OAS2 @OAS3
    Format,

    @OAS2 @OAS3
    Items,

    @OAS2 @OAS3
    MaxItems,

    @OAS2 @OAS3
    MaxLength,

    @OAS2 @OAS3
    MaxProperties,

    @OAS2 @OAS3
    Maximum,

    @OAS2 @OAS3
    MinItems,

    @OAS2 @OAS3
    MinLength,

    @OAS2 @OAS3
    MinProperties,

    @OAS2 @OAS3
    Minimum,

    @OAS2 @OAS3
    MultipleOf,

    @OAS3
    Not,

    @OAS3
    Nullable,

    @OAS3
    OneOf,

    @OAS2 @OAS3
    Pattern,

    @OAS2 @OAS3
    Properties,

    @OAS2 @OAS3
    Required,

    @OAS2 @OAS3
    Type,

    @OAS2 @OAS3
    UniqueItems,

    @OAS2 @OAS3
    Xml
}
