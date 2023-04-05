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
 * Defines common data types supported by a generator.
 * Some of these features are defined in specs, and some are specific to the tool.
 *
 * Where data types are listed as tool-specific, this either indicates that the data type is common enough that it is an officially
 * supported custom data type by the toolset, or that the consideration of a special type isn't
 * explicitly mentioned by the specification(s) but differs enough across languages that it warrants a special callout.
 */
public enum DataTypeFeature {
    /**
     * Supports a generator-specific support usually via type=string's format property (e.g. email, uuid, etc), should be documented in generator README.
     *
     * <p>Loosely described in OpenAPI Specification(s). Generally means a custom "format" option applied to a string-typed property.</p>
     */
    @OAS2 @OAS3
    Custom,

    /**
     * Supports integer/int32
     */
    @OAS2 @OAS3
    Int32,

    /**
     * Supports integer/int64
     */
    @OAS2 @OAS3
    Int64,

    /**
     * Supports integer without format
     */
    @OAS2 @OAS3
    Integer,

    /**
     * Supports type: number, format:float
     */
    @OAS2 @OAS3
    Float,

    /**
     * Supports type: number, format: double
     */
    @OAS2 @OAS3
    Double,

    /**
     * Supports type: number, no format
     *
     */
    @OAS2 @OAS3
    Number,

    /**
     * Supports string
     */
    @OAS2 @OAS3
    String,

    /**
     * Supports type:string format:byte, base64 encoded
     */
    @OAS2 @OAS3
    Byte,

    /**
     * Supports type:string format:binary: any collection of octets
     */
    @OAS2 @OAS3
    Binary,

    /**
     * Supports boolean
     */
    @OAS2 @OAS3
    Boolean,

    /**
     * Supports string/date: full-date RFC3339
     *
     * @see <a href="https://tools.ietf.org/html/rfc3339">RFC3339</a>
     */
    @OAS2 @OAS3
    Date,

    /**
     * Supports string/date-time: date-time RFC3339
     *
     * @see <a href="https://tools.ietf.org/html/rfc3339">RFC3339</a>
     */
    @OAS2 @OAS3
    DateTime,

    /**
     * Supports string/password: A hint to UIs to obscure input.
     *
     *
     * <p>
     *     This should be used as an indicator for password best practices, such as assigning a variable to
     *     a character array rather than string, avoiding logging the variable in clear text, and masking the value
     *     in any user inputs. See OWASP for best practices.
     * </p>
     */
    @OAS2 @OAS3
    Password,

    /**
     * Supports file inputs (e.g. multipart support).
     *
     * <p>OAS 3.x defines files differently.</p>
     * <p>
     * OAS 3.x does not have an explicit "file" type and instead relies on ContentType or response types.
     * That's not to say a generator doesn't support files, only that there's no direct
     * "file" type defined in the spec document.
     * </p>
     * <p>
     * NOTE: The default workflow may provide an "isFile" helper or synthesize the assumptions around files in the case of OAS 3.x.
     * </p>
     */
    @OAS2
    File,

    /**
     * String uuid data
     */
    @OAS2 @OAS3
    Uuid,

    /**
     * Supports arrays of data
     */
    @OAS2 @OAS3
    Array,

    /**
     * A JSON "null" value added in openapi v3.1.0
     */
    @OAS3
    Null,

    /**
     * When no type is defined, any data type is accepted
     */
    @OAS2 @OAS3
    AnyType,

    /**
     * An unordered set of properties mapping a string to an instance
     */
    @OAS2 @OAS3
    Object,

    /**
     * Supports enum properties
     */
    @OAS2 @OAS3
    Enum
}
