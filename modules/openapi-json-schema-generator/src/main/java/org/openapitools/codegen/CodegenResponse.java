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

public class CodegenResponse {
    public final List<CodegenProperty> headers = new ArrayList<CodegenProperty>();
    private List<CodegenParameter> responseHeaders = new ArrayList<CodegenParameter>();
    public String code;
    public boolean is1xx;
    public boolean is2xx;
    public boolean is3xx;
    public boolean is4xx;
    public boolean is5xx;
    public boolean isDefault;
    public String message;
    public List<Map<String, Object>> examples;
    public boolean hasHeaders;
    public String jsonSchema;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    private LinkedHashMap<String, CodegenMediaType> content;
    private String ref;
    public Set<String> imports = new TreeSet<>();

    @Override
    public int hashCode() {
        return Objects.hash(headers, code, message, examples, hasHeaders,
                jsonSchema, vendorExtensions,
                is1xx, is2xx, is3xx, is4xx, is5xx, isDefault,
                responseHeaders, content,
                ref, imports);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenResponse)) return false;
        CodegenResponse that = (CodegenResponse) o;
        return hasHeaders == that.hasHeaders &&
                is1xx == that.is1xx &&
                is2xx == that.is2xx &&
                is3xx == that.is3xx &&
                is4xx == that.is4xx &&
                is5xx == that.is5xx &&
                isDefault == that.isDefault &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(responseHeaders, that.getResponseHeaders()) &&
                Objects.equals(headers, that.headers) &&
                Objects.equals(code, that.code) &&
                Objects.equals(message, that.message) &&
                Objects.equals(examples, that.examples) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions);

    }

    public LinkedHashMap<String, CodegenMediaType> getContent() {
        return content;
    }

    public void setContent(LinkedHashMap<String, CodegenMediaType> content) {
        this.content = content;
    }

    public List<CodegenParameter> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(List<CodegenParameter> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenResponse{");
        sb.append("headers=").append(headers);
        sb.append(", code='").append(code).append('\'');
        sb.append(", is1xx='").append(is1xx).append('\'');
        sb.append(", is2xx='").append(is2xx).append('\'');
        sb.append(", is3xx='").append(is3xx).append('\'');
        sb.append(", is4xx='").append(is4xx).append('\'');
        sb.append(", is5xx='").append(is5xx).append('\'');
        sb.append(", isDefault='").append(isDefault).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", examples=").append(examples);
        sb.append(", hasHeaders=").append(hasHeaders);
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", responseHeaders=").append(responseHeaders);
        sb.append(", content=").append(content);
        sb.append(", ref=").append(ref);
        sb.append(", imports=").append(imports);
        sb.append('}');
        return sb.toString();
    }

    // this is used in templates. Do not remove it.
    @SuppressWarnings("unused")
    public boolean isWildcard() {
        return "0".equals(code) || "default".equals(code);
    }

    /*
     * Boolean value indicating whether the status code is a range
     *
     * @return True if the status code is a range (e.g. 2XX)
     */
    public boolean isRange() {
        if (code != null && code.length() == 3 && "XX".equalsIgnoreCase(code.substring(1)))
            return true;
        return false;
    }

    public String getRef() { return ref; }

    public void setRef(String ref) { this.ref=ref; }
}
