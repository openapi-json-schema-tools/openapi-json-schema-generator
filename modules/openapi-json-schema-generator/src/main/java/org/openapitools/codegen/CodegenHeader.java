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
public class CodegenHeader implements OpenapiComponent {
    public boolean isExplode;
    public String paramName,
            description, unescapedDescription, style;

    public String nameInLowerCase; // property name in lower case
    public String example; // example value (x-example)
    public String jsonSchema;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    public boolean isDeprecated;
    protected CodegenSchema schema;
    /**
     * Determines whether this parameter is mandatory. If the parameter is in "path",
     * this property is required and its value MUST be true. Otherwise, the property
     * MAY be included and its default value is false.
     */
    public boolean required;
    protected boolean hasMultipleTypes = false;
    protected LinkedHashMap<String, CodegenMediaType> content;
    protected String ref;
    protected String refModule;

    public Set<String> imports = new HashSet<String>();

    protected String componentModule;

    public CodegenHeader copy() {
        CodegenHeader output = new CodegenHeader();
        output.paramName = this.paramName;
        output.description = this.description;
        output.unescapedDescription = this.unescapedDescription;
        output.required = this.required;
        output.jsonSchema = this.jsonSchema;
        output.example = this.example;

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
    public String getComponentModule() {
        return componentModule;
    }

    public void setComponentModule(String componentModule) {
        this.componentModule = componentModule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExplode, paramName, description, unescapedDescription, style, example, jsonSchema, vendorExtensions, isDeprecated, required, hasMultipleTypes, schema, content, ref, refModule, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenHeader)) return false;
        CodegenHeader that = (CodegenHeader) o;
        return isExplode == that.isExplode &&
                isDeprecated == that.isDeprecated &&
                required == that.required &&
                Objects.equals(componentModule, that.componentModule) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(refModule, that.getRefModule()) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(schema, that.getSchema()) &&
                Objects.equals(paramName, that.paramName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(style, that.style) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append(", isExplode=").append(isExplode);
        sb.append(", paramName='").append(paramName).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", style='").append(style).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append(", required=").append(required);
        sb.append(", hasMultipleTypes=").append(hasMultipleTypes);
        sb.append(", schema=").append(schema);
        sb.append(", content=").append(content);
        sb.append(", ref=").append(ref);
        sb.append(", refModule=").append(refModule);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
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

    public LinkedHashMap<String, CodegenMediaType> getContent() {
        return content;
    }

    public void setContent(LinkedHashMap<String, CodegenMediaType> content) {
        this.content = content;
    }


    public String getRef() { return ref; }

    public void setRef(String ref) { this.ref=ref; }

    public String getRefModule() { return refModule; }

    public void setRefModule(String refModule) { this.refModule=refModule; }
}

