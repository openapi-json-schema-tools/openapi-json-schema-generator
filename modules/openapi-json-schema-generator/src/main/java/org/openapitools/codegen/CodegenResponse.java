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

import java.util.*;

public class CodegenResponse implements OpenapiComponent {
    private Map<String, CodegenHeader> headers;
    public String message;
    public List<Map<String, Object>> examples;
    public boolean hasHeaders;
    public String jsonSchema;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    private LinkedHashMap<String, CodegenMediaType> content;
    private String ref;
    public Set<String> imports = new TreeSet<>();
    private String refModule;
    private String modulePath;

    @Override
    public int hashCode() {
        return Objects.hash(message, examples, hasHeaders,
                jsonSchema, vendorExtensions,
                headers, content,
                ref, imports, refModule, modulePath);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenResponse)) return false;
        CodegenResponse that = (CodegenResponse) o;
        return hasHeaders == that.hasHeaders &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(headers, that.getHeaders()) &&
                Objects.equals(message, that.message) &&
                Objects.equals(examples, that.examples) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(refModule, that.getRefModule()) &&
                Objects.equals(modulePath, that.modulePath);
    }

    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }

    public LinkedHashMap<String, CodegenMediaType> getContent() {
        return content;
    }

    public void setContent(LinkedHashMap<String, CodegenMediaType> content) {
        this.content = content;
    }

    public Map<String, CodegenHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, CodegenHeader> headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenResponse{");
        sb.append(", message='").append(message).append('\'');
        sb.append(", examples=").append(examples);
        sb.append(", hasHeaders=").append(hasHeaders);
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", headers=").append(headers);
        sb.append(", content=").append(content);
        sb.append(", ref=").append(ref);
        sb.append(", refModule=").append(refModule);
        sb.append(", imports=").append(imports);
        sb.append(", modulePath=").append(modulePath);
        sb.append('}');
        return sb.toString();
    }

    public String getRef() { return ref; }

    public void setRef(String ref) { this.ref=ref; }

    public String getRefModule() { return refModule; }

    public void setRefModule(String refModule) { this.refModule=refModule; }

}
