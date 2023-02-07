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

package org.openapijsonschematools.codegen.model;

import org.openapijsonschematools.codegen.utils.ModelUtils;

import java.util.*;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenParameter {
    public final String description;
    public final String unescapedDescription;
    public final String example; // example value (x-example)
    public final String jsonSchema;
    public final Map<String, Object> vendorExtensions;
    public final boolean required;
    public final LinkedHashMap<CodegenKey, CodegenMediaType> content;
    public final Set<String> imports;
    public final String componentModule;
    public final CodegenKey jsonPathPiece;
    public final boolean isExplode;
    public final String style;
    public final boolean isDeprecated;
    public final CodegenSchema schema;
    public final String in;
    public final boolean isAllowEmptyValue, isDeepObject;
    // stores the openapi name property
    public final String name;
    public final CodegenRefInfo<CodegenParameter> refInfo;

    public CodegenParameter(String description, String unescapedDescription, String example, String jsonSchema, Map<String, Object> vendorExtensions, boolean required, LinkedHashMap<CodegenKey, CodegenMediaType> content, Set<String> imports, String componentModule, CodegenKey jsonPathPiece, boolean isExplode, String style, boolean isDeprecated, CodegenSchema schema, String in, boolean isAllowEmptyValue, boolean isDeepObject, String name, CodegenRefInfo<CodegenParameter> refInfo) {
        this.description = description;
        this.unescapedDescription = unescapedDescription;
        this.example = example;
        this.jsonSchema = jsonSchema;
        this.vendorExtensions = vendorExtensions;
        this.required = required;
        this.content = content;
        this.imports = imports;
        this.componentModule = componentModule;
        this.jsonPathPiece = jsonPathPiece;
        this.isExplode = isExplode;
        this.style = style;
        this.isDeprecated = isDeprecated;
        this.schema = schema;
        this.in = in;
        this.isAllowEmptyValue = isAllowEmptyValue;
        this.isDeepObject = isDeepObject;
        this.name = name;
        this.refInfo = refInfo;
    }

    public CodegenParameter getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenParameter refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }

    public CodegenSchema getSetSchema() {
        if (schema != null) {
            return schema;
        }
        if (content != null) {
            for (CodegenMediaType codegenMediaType: content.values()) {
                return codegenMediaType.schema;
            }
        }
        return null;
    }

    public String getSetSchemaJsonPath(String jsonPath) {
        if (schema != null) {
            return jsonPath + "/schema";
        }
        if (content != null) {
            for (Map.Entry<CodegenKey, CodegenMediaType> entry: content.entrySet()) {
                if (entry.getValue().schema != null) {
                    String contentType = entry.getKey().original;
                    return jsonPath + "/content/" + ModelUtils.encodeSlashes(contentType) + "/schema";
                }
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonPathPiece, in, isExplode, name, description, unescapedDescription, style, isDeepObject, isAllowEmptyValue, example, jsonSchema, vendorExtensions, isDeprecated, required, schema, content, refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenParameter)) return false;
        CodegenParameter that = (CodegenParameter) o;
        return required == that.required &&
                Objects.equals(jsonPathPiece, that.jsonPathPiece) &&
                Objects.equals(componentModule, that.componentModule) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(content, that.content) &&
                Objects.equals(description, that.description) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                isExplode == that.isExplode &&
                isDeprecated == that.isDeprecated &&
                Objects.equals(schema, that.schema) &&
                Objects.equals(style, that.style) &&
                Objects.equals(in, that.in) &&
                Objects.equals(refInfo, that.refInfo) &&
                Objects.equals(name, that.name) &&
                Objects.equals(isDeepObject, that.isDeepObject);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenParameter{");
        sb.append(", name='").append(jsonPathPiece).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", required=").append(required);
        sb.append(", content=").append(content);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
        sb.append(", isExplode=").append(isExplode);
        sb.append(", style='").append(style).append('\'');
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append(", schema=").append(schema);
        sb.append(", in=").append(in);
        sb.append(", deepObject='").append(isDeepObject).append('\'');
        sb.append(", allowEmptyValue='").append(isAllowEmptyValue).append('\'');
        sb.append(", baseName='").append(name).append('\'');
        sb.append(", refInfo='").append(refInfo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

