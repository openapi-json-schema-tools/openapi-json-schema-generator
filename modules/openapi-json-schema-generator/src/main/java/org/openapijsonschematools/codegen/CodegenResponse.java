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

package org.openapijsonschematools.codegen;

import org.openapijsonschematools.codegen.model.CodegenKey;
import org.openapijsonschematools.codegen.model.CodegenMediaType;

import java.util.*;

public class CodegenResponse implements OpenApiLocation<CodegenResponse> {
    private CodegenKey name;
    private Map<String, CodegenHeader> headers;
    public String message;
    public List<Map<String, Object>> examples;
    public String jsonSchema;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    private LinkedHashMap<CodegenKey, CodegenMediaType> content;
    private CodegenRefInfo<CodegenResponse> refInfo;
    public Set<String> imports = new TreeSet<>();
    private String componentModule;

    @Override
    public int hashCode() {
        return Objects.hash(name, message, examples,
                jsonSchema, vendorExtensions,
                headers, content,
                refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenResponse)) return false;
        CodegenResponse that = (CodegenResponse) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(refInfo, that.refInfo) &&
                Objects.equals(content, that.content) &&
                Objects.equals(headers, that.getHeaders()) &&
                Objects.equals(message, that.message) &&
                Objects.equals(examples, that.examples) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(componentModule, that.componentModule);
    }

    public String componentModule() {
        return componentModule;
    }

    public void setComponentModule(String componentModule) {
        this.componentModule = componentModule;
    }

    public LinkedHashMap<CodegenKey, CodegenMediaType> content() {
        return content;
    }

    public void setContent(LinkedHashMap<CodegenKey, CodegenMediaType> content) {
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
        sb.append(", name='").append(name).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", examples=").append(examples);
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", headers=").append(headers);
        sb.append(", content=").append(content);
        sb.append(", refInfo=").append(refInfo);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
        sb.append('}');
        return sb.toString();
    }

    public CodegenRefInfo<CodegenResponse> refInfo() { return refInfo; }

    public CodegenResponse getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenResponse refObject = refInfo.getRef();
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.getRef();
        }
        return refObject;
    }

    public void setRefInfo(CodegenRefInfo refInfo) { this.refInfo = refInfo; }

    public CodegenKey name() { return name; }

    public void setName(CodegenKey name) { this.name=name; }
}
