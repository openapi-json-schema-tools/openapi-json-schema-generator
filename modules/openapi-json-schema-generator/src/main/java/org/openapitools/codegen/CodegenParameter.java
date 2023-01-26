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

/**
 * Describes a single operation parameter in the OAS specification.
 * A unique parameter is defined by a combination of a name and location.
 * Parameters may be located in a path, query, header or cookie.
 */
public class CodegenParameter extends CodegenHeaderBase implements OpenApiLocation<CodegenParameter> {
    public boolean isFormParam, isQueryParam, isPathParam, isHeaderParam,
            isCookieParam, isBodyParam, isAllowEmptyValue, isDeepObject;
    // stores the openapi name property
    public String baseName;
    private CodegenRefInfo<CodegenParameter> refInfo;

    public CodegenRefInfo<CodegenParameter> refInfo() { return refInfo; }

    public CodegenParameter getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenParameter refObject = refInfo.getRef();
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.getRef();
        }
        return refObject;
    }

    public void setRefInfo(CodegenRefInfo<CodegenParameter> refInfo) { this.refInfo = refInfo; }

    @Override
    public int hashCode() {
        return Objects.hash(name, isFormParam, isQueryParam, isPathParam, isHeaderParam, isCookieParam, isBodyParam, isExplode, baseName, description, unescapedDescription, style, isDeepObject, isAllowEmptyValue, example, jsonSchema, vendorExtensions, isDeprecated, required, schema, content, refInfo, imports, componentModule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenParameter)) return false;
        if (! super.equals(o)) return false;
        CodegenParameter that = (CodegenParameter) o;
        return isFormParam == that.isFormParam &&
                isQueryParam == that.isQueryParam &&
                isPathParam == that.isPathParam &&
                isHeaderParam == that.isHeaderParam &&
                isCookieParam == that.isCookieParam &&
                isBodyParam == that.isBodyParam &&
                Objects.equals(refInfo, that.refInfo) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(isDeepObject, that.isDeepObject);
    }

    protected void addInstanceInfo(StringBuilder sb) {
        super.addInstanceInfo(sb);
        sb.append(", isFormParam=").append(isFormParam);
        sb.append(", isQueryParam=").append(isQueryParam);
        sb.append(", isPathParam=").append(isPathParam);
        sb.append(", isHeaderParam=").append(isHeaderParam);
        sb.append(", isCookieParam=").append(isCookieParam);
        sb.append(", isBodyParam=").append(isBodyParam);
        sb.append(", deepObject='").append(isDeepObject).append('\'');
        sb.append(", allowEmptyValue='").append(isAllowEmptyValue).append('\'');
        sb.append(", baseName='").append(baseName).append('\'');
        sb.append(", refInfo='").append(refInfo).append('\'');
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenParameter{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }
}

