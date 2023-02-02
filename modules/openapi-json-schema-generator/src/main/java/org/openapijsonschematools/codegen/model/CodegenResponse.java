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

import java.util.*;

public class CodegenResponse {
    public final CodegenKey name;
    public final Map<String, CodegenHeader> headers;
    public final String message;
    public final String jsonSchema;
    public final Map<String, Object> vendorExtensions;
    public final LinkedHashMap<CodegenKey, CodegenMediaType> content;
    public final CodegenRefInfo<CodegenResponse> refInfo;
    public final TreeSet<String> imports;
    public final String componentModule;

    public CodegenResponse(CodegenKey name, Map<String, CodegenHeader> headers, String message, String jsonSchema, Map<String, Object> vendorExtensions, LinkedHashMap<CodegenKey, CodegenMediaType> content, CodegenRefInfo<CodegenResponse> refInfo, TreeSet<String> imports, String componentModule) {
        this.name = name;
        this.headers = headers;
        this.message = message;
        this.jsonSchema = jsonSchema;
        this.vendorExtensions = vendorExtensions;
        this.content = content;
        this.refInfo = refInfo;
        this.imports = imports;
        this.componentModule = componentModule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message,
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
                Objects.equals(headers, that.headers) &&
                Objects.equals(message, that.message) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(componentModule, that.componentModule);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenResponse{");
        sb.append(", name='").append(name).append('\'');
        sb.append(", message='").append(message).append('\'');
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

    public CodegenResponse getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenResponse refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }
}