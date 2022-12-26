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
    public String paramName, style;

    public boolean isDeprecated;
    protected CodegenSchema schema;

    public CodegenHeader copy() {
        CodegenHeader output = new CodegenHeader();
        output.paramName = this.paramName;
        output.description = this.description;
        output.unescapedDescription = this.unescapedDescription;
        output.required = this.required;
        output.jsonSchema = this.jsonSchema;
        output.example = this.example;

        if (this.name != null) {
            output.setName(this.name);
        }
        if (this.content != null) {
            output.setContent(this.content);
        }
        if (this.schema != null) {
            output.setSchema(this.schema);
        }
        if (this.vendorExtensions != null) {
            output.vendorExtensions = new HashMap<String, Object>(this.vendorExtensions);
        }
        if (this.ref != null) {
            output.setRef(this.ref);
        }
        if (this.refModule != null) {
            output.setRefModule(this.refModule);
        }
        if (this.imports != null) {
            output.imports = imports;
        }
        if (this.componentModule != null) {
            output.componentModule = componentModule;
        }
        output.isDeprecated = this.isDeprecated;
        output.isExplode = this.isExplode;
        output.style = this.style;

        return output;
    }

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
        return Objects.hash(name, isExplode, paramName, description, unescapedDescription, style, example, jsonSchema, vendorExtensions, isDeprecated, required, schema, content, ref, refModule, imports, componentModule);
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
                Objects.equals(paramName, that.paramName) &&
                Objects.equals(style, that.style);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        super.addInstanceInfo(sb);
        sb.append(", isExplode=").append(isExplode);
        sb.append(", paramName='").append(paramName).append('\'');
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

