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

import java.util.Objects;

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenHeader extends CodegenHeaderBase implements OpenApiLocation<CodegenHeader> {
    protected CodegenRefInfo<CodegenHeader> refInfo;
    @Override
    public int hashCode() {
        return Objects.hash(name, isExplode, description, unescapedDescription, style, example, jsonSchema, vendorExtensions, isDeprecated, required, schema, content, refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenHeader)) return false;
        if (! super.equals(o)) return false;
        CodegenHeader that = (CodegenHeader) o;
        return Objects.equals(refInfo, that.refInfo);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        super.addInstanceInfo(sb);
        sb.append(", refInfo=").append(refInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenHeader{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public CodegenRefInfo<CodegenHeader> getRefInfo() { return refInfo; }

    public CodegenHeader getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenHeader refObject = refInfo.getRef();
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.getRef();
        }
        return refObject;
    }

    public void setRefInfo(CodegenRefInfo<CodegenHeader> refInfo) { this.refInfo = refInfo; }
}

