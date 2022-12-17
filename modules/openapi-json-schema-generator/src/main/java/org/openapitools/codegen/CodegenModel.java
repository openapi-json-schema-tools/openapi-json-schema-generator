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
 * CodegenModel represents a schema object in a OpenAPI document.
 */
public class CodegenModel extends CodegenProperty {
    public Set<String> imports = new TreeSet<>();
    public HashMap<String, SchemaTestCase> testCases = new HashMap<>();
    private String modulePath;

    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }

    public Set<String> getImports() {
        return imports;
    }

    public void setImports(Set<String> imports) {
        this.imports = imports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenModel)) return false;
        if (! super.equals(o)) return false;
        CodegenModel that = (CodegenModel) o;
        return Objects.equals(modulePath, that.modulePath) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(testCases, that.testCases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnyOf(), getOneOf(), getAllOf(), getName(), getTitle(),
                getDescription(), getXmlPrefix(), getXmlNamespace(),
                getXmlName(), getUnescapedDescription(), getDiscriminator(), getDefaultValue(),
                isString, isInteger, isLong, isNumber, isNumeric, isFloat, isDouble,
                isDate, isDateTime, isNull, hasValidation, isShort, isUnboundedInteger, isBoolean,
                getAllowableValues(), getImports(),
                isEnum, isNullable, isArray,
                isMap, deprecated, getExternalDocumentation(), getVendorExtensions(),
                getMaxProperties(), getMinProperties(), getUniqueItems(), getMaxItems(),
                getMinItems(), getMaxLength(), getMinLength(), getExclusiveMinimum(), getExclusiveMaximum(), getMinimum(),
                getMaximum(), getPattern(), getMultipleOf(), getItems(), getAdditionalProperties(),
                getHasDiscriminatorWithNonEmptyMapping(),
                isAnyType, getHasMultipleTypes(), isDecimal, isUuid, getRequiredProperties(), getRef(),
                getSchemaIsFromAdditionalProperties(), getIsBooleanSchemaTrue(), getIsBooleanSchemaFalse(),
                getFormat(), getDependentRequired(), getContains(), getRefModule(), modulePath, getAllOf(), getAnyOf(), getOneOf(), getNot(),
                getOptionalProperties(), getProperties());
    }

    protected void addInstanceInfo(StringBuilder sb) {
        super.addInstanceInfo(sb);
        sb.append(", imports=").append(imports);
        sb.append(", modulePath").append(modulePath);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenModel{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Remove self reference import
     */
    public void removeSelfReferenceImport() {
        if (getRequiredProperties() != null) {
            for (CodegenProperty cp : getRequiredProperties().values()) {
                if (cp == null) {
                    continue;
                }
                // detect self import
                if (this.name.getCamelCaseName().equalsIgnoreCase(cp.refClass) ||
                        ((cp.isMap || cp.isArray) && cp.items != null && this.name.getCamelCaseName().equalsIgnoreCase(cp.items.refClass))) {
                    this.imports.remove(this.name.getCamelCaseName()); // remove self import
                    cp.isSelfReference = true;
                }
            }
        }
        if (getOptionalProperties() != null) {
            for (CodegenProperty cp : getOptionalProperties().values()) {
                // detect self import
                if (this.name.getCamelCaseName().equalsIgnoreCase(cp.refClass) ||
                        ((cp.isMap || cp.isArray) && cp.items != null && this.name.getCamelCaseName().equalsIgnoreCase(cp.items.refClass))) {
                    this.imports.remove(this.name.getCamelCaseName()); // remove self import
                    cp.isSelfReference = true;
                }
            }
        }
    }
}
