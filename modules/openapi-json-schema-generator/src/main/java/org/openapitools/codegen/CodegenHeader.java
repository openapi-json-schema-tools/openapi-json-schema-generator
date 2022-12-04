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
public class CodegenHeader {
    public boolean isDeepObject, isAllowEmptyValue, isExplode;
    public String paramName,
            description, unescapedDescription, style;

    public String nameInLowerCase; // property name in lower case
    public String example; // example value (x-example)
    public String jsonSchema;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    public boolean isDeprecated;
    protected CodegenProperty schema;
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
        output.isDeprecated = this.isDeprecated;
        output.isExplode = this.isExplode;
        output.style = this.style;
        output.isDeepObject = this.isDeepObject;
        output.isAllowEmptyValue = this.isAllowEmptyValue;

        return output;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExplode, paramName, description, unescapedDescription, style, isDeepObject, isAllowEmptyValue, example, jsonSchema, vendorExtensions, isDeprecated, required, hasMultipleTypes, schema, content, ref, refModule, imports);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenHeader)) return false;
        CodegenHeader that = (CodegenHeader) o;
        return isExplode == that.isExplode &&
                isDeprecated == that.isDeprecated &&
                required == that.required &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(refModule, that.getRefModule()) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(schema, that.getSchema()) &&
                Objects.equals(paramName, that.paramName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(style, that.style) &&
                Objects.equals(isDeepObject, that.isDeepObject) &&
                Objects.equals(isAllowEmptyValue, that.isAllowEmptyValue) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenParameter{");
        sb.append(", isExplode=").append(isExplode);
        sb.append(", paramName='").append(paramName).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", style='").append(style).append('\'');
        sb.append(", deepObject='").append(isDeepObject).append('\'');
        sb.append(", allowEmptyValue='").append(isAllowEmptyValue).append('\'');
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
        sb.append('}');
        return sb.toString();
    }

    public CodegenProperty getSchema() {
        return schema;
    }

    public void setSchema(CodegenProperty schema) {
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

