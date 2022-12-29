/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
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

package org.openapitools.codegen;

import org.openapitools.codegen.utils.ModelUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenHeader extends CodegenRequestBody {
    public boolean isExplode;
    public String style;

    public boolean isDeprecated;
    protected CodegenSchema schema;

    public CodegenSchema getSetSchema() {
        if (schema != null) {
            return schema;
        }
        if (content != null) {
            for (CodegenMediaType codegenMediaType: content.values()) {
                return codegenMediaType.getSchema();
            }
        }
        return null;
    }

    public String getSetSchemaJsonPath(String jsonPath) {
        if (schema != null) {
            return jsonPath + "/schema";
        }
        if (content != null) {
            for (Map.Entry<String, CodegenMediaType> entry: content.entrySet()) {
                if (entry.getValue().getSchema() != null) {
                    String contentType = entry.getKey();
                    return jsonPath + "/content/" + ModelUtils.encodeSlashes(contentType) + "/schema";
                }
            }
        }
        return null;
    }
    @Override
    public int hashCode() {
        return Objects.hash(refClass, name, isExplode, description, unescapedDescription, style, example, jsonSchema, vendorExtensions, isDeprecated, required, schema, content, ref, refModule, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenHeader)) return false;
        if (! super.equals(o)) return false;
        CodegenHeader that = (CodegenHeader) o;
        return isExplode == that.isExplode &&
                isDeprecated == that.isDeprecated &&
                Objects.equals(schema, that.getSchema()) &&
                Objects.equals(style, that.style);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        super.addInstanceInfo(sb);
        sb.append(", isExplode=").append(isExplode);
        sb.append(", style='").append(style).append('\'');
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append(", schema=").append(schema);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenHeader{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public CodegenSchema getSchema() {
        return schema;
    }

    public void setSchema(CodegenSchema schema) {
        this.schema = schema;
    }
}

