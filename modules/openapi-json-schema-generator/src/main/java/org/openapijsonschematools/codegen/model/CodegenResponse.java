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
    public final String description;
    public final Map<String, CodegenHeader> headers;
    public final CodegenSchema headersObjectSchema;
    public final LinkedHashMap<CodegenKey, CodegenMediaType> content;
    public final CodegenRefInfo<CodegenResponse> refInfo;
    // TODO add links in the future
    public final CodegenKey jsonPathPiece;
    public final Map<String, Object> vendorExtensions;
    public final TreeSet<String> imports;
    public final boolean componentModule;

    public CodegenResponse(CodegenKey jsonPathPiece, Map<String, CodegenHeader> headers, CodegenSchema headersObjectSchema, String description, Map<String, Object> vendorExtensions, LinkedHashMap<CodegenKey, CodegenMediaType> content, CodegenRefInfo<CodegenResponse> refInfo, TreeSet<String> imports, boolean componentModule) {
        this.jsonPathPiece = jsonPathPiece;
        this.headers = headers;
        this.headersObjectSchema = headersObjectSchema;
        this.description = description;
        this.vendorExtensions = vendorExtensions;
        this.content = content;
        this.refInfo = refInfo;
        this.imports = imports;
        this.componentModule = componentModule;
    }

    /**
     * Used by templates to only render body details if there is a schema defined for a content type
     * @return true if there is an inline header
     */
    public boolean hasContentSchema() {
        if (content == null) {
            return false;
        }
        for (CodegenMediaType mediaType: content.values()) {
            if (mediaType == null) {
                continue;
            }
            if (mediaType.schema != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Used by templates to only render header details if there is an inline header
     * @return true if there is an inline header
     */
    public boolean hasInlineHeader() {
        if (headers == null) {
            return false;
        }
        for (CodegenHeader header: headers.values()) {
            if (header.refInfo == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsonPathPiece, description,
                vendorExtensions, headers, headersObjectSchema, content,
                refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenResponse)) return false;
        CodegenResponse that = (CodegenResponse) o;
        return Objects.equals(jsonPathPiece, that.jsonPathPiece) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(refInfo, that.refInfo) &&
                Objects.equals(content, that.content) &&
                Objects.equals(headers, that.headers) &&
                Objects.equals(headersObjectSchema, that.headersObjectSchema) &&
                Objects.equals(description, that.description) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(componentModule, that.componentModule);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenResponse{");
        sb.append(", name='").append(jsonPathPiece).append('\'');
        sb.append(", message='").append(description).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", headers=").append(headers);
        sb.append(", headersObjectSchema=").append(headersObjectSchema);
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
