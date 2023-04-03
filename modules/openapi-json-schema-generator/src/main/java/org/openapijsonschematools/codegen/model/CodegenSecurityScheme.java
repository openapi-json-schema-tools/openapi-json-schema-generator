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

import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

public class CodegenSecurityScheme {
    public final String type;
    public final String description;
    public final String name;
    public final String in;
    public final String scheme;
    public final String bearerFormat;
    public final CodegenOauthFlows flows;
    public final String openIdConnectUrl;
    public final TreeSet<String> imports;
    public final boolean componentModule;
    public final CodegenKey jsonPathPiece;
    public final CodegenRefInfo<CodegenSecurityScheme> refInfo;
    public final Map<String, Object> vendorExtensions;

    public CodegenSecurityScheme(String type, String description, String name, String in, String scheme, String bearerFormat, CodegenOauthFlows flows, String openIdConnectUrl, TreeSet<String> imports, boolean componentModule, CodegenKey jsonPathPiece, CodegenRefInfo<CodegenSecurityScheme> refInfo, Map<String, Object> vendorExtensions) {
        this.type = type;
        this.description = description;
        this.name = name;
        this.in = in;
        this.scheme = scheme;
        this.bearerFormat = bearerFormat;
        this.flows = flows;
        this.openIdConnectUrl = openIdConnectUrl;
        this.imports = imports;
        this.componentModule = componentModule;
        this.jsonPathPiece = jsonPathPiece;
        this.refInfo = refInfo;
        this.vendorExtensions = vendorExtensions;
    }

    public CodegenSecurityScheme getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenSecurityScheme refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenSecurityScheme that = (CodegenSecurityScheme) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(in, that.in) &&
                Objects.equals(scheme, that.scheme) &&
                Objects.equals(bearerFormat, that.bearerFormat) &&
                Objects.equals(flows, that.flows) &&
                Objects.equals(openIdConnectUrl, that.openIdConnectUrl) &&
                Objects.equals(vendorExtensions, that.vendorExtensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, name, in, scheme, bearerFormat, flows, openIdConnectUrl, vendorExtensions);
    }

    @Override
    public String toString() {
        return "CodegenSecurityScheme{" + "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", in='" + in + '\'' +
                ", scheme='" + scheme + '\'' +
                ", bearerFormat='" + bearerFormat + '\'' +
                ", flows='" + flows + '\'' +
                ", vendorExtensions=" + vendorExtensions +
                '}';
    }
}
