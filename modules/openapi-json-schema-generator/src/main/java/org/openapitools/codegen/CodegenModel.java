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

import io.swagger.v3.oas.models.ExternalDocumentation;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

/**
 * CodegenModel represents a schema object in a OpenAPI document.
 */
public class CodegenModel extends CodegenProperty {
    // The language-specific name of the class that implements this schema.
    // The name of the class is derived from the OpenAPI schema name with formatting rules applied.
    // The classname is derived from the OpenAPI schema name, with sanitization and escaping rules applied.
    public String classname;
    public String classVarName, modelJson, dataType;
    public String classFilename; // store the class file name, mainly used for import
    public CodegenDiscriminator discriminator;
    public String arrayModelType;
    public boolean isPrimitiveType;
    // Sorted sets of required parameters.
    public Set<String> mandatory = new TreeSet<>(); // without parent's required properties
    public Set<String> allMandatory = new TreeSet<>(); // with parent's required properties

    public Set<String> imports = new TreeSet<>();
    public boolean hasMoreModels, hasEnums;
    /**
     * Indicates the type has at least one optional property.
     */
    public boolean hasOptional;
    public boolean hasOnlyReadOnly = true; // true if all properties are read-only
    public ExternalDocumentation externalDocumentation;
    public HashMap<String, SchemaTestCase> testCases = new HashMap<>();
    private String modulePath;

    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }

    public Set<String> getAllMandatory() {
        return allMandatory;
    }

    public void setAllMandatory(Set<String> allMandatory) {
        this.allMandatory = allMandatory;
    }

    public String getArrayModelType() {
        return arrayModelType;
    }

    public void setArrayModelType(String arrayModelType) {
        this.arrayModelType = arrayModelType;
    }

    public String getClassFilename() {
        return classFilename;
    }

    public void setClassFilename(String classFilename) {
        this.classFilename = classFilename;
    }

    public String getClassVarName() {
        return classVarName;
    }

    public void setClassVarName(String classVarName) {
        this.classVarName = classVarName;
    }

    /**
     * Return true if the classname property is sanitized, false if it is the same as the OpenAPI schema name.
     * The OpenAPI schema name may be any valid JSON schema name, including non-ASCII characters.
     * The name of the class may have to be sanitized with character escaping.
     *
     * @return true if the classname property is sanitized
     */
    public boolean getIsClassnameSanitized() {
        return !StringUtils.equals(classname, name.getName());
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public CodegenDiscriminator getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(CodegenDiscriminator discriminator) {
        this.discriminator = discriminator;
        if (discriminator != null && !discriminator.getMappedModels().isEmpty()) {
            this.setHasDiscriminatorWithNonEmptyMapping(true);
        }
    }

    /**
     * Returns the name of the discriminator property for this schema in the OpenAPI document.
     * In the OpenAPI document, the discriminator may be specified in the local schema or
     * it may be inherited, such as through a 'allOf' schema which references another schema
     * that has a discriminator, recursively.
     *
     * @return the name of the discriminator property.
     */
    public String getDiscriminatorName() {
        return discriminator == null ? null : discriminator.getPropertyName();
    }

    public ExternalDocumentation getExternalDocumentation() {
        return externalDocumentation;
    }

    public void setExternalDocumentation(ExternalDocumentation externalDocumentation) {
        this.externalDocumentation = externalDocumentation;
    }

    public Set<String> getImports() {
        return imports;
    }

    public void setImports(Set<String> imports) {
        this.imports = imports;
    }

    public Set<String> getMandatory() {
        return mandatory;
    }

    public void setMandatory(Set<String> mandatory) {
        this.mandatory = mandatory;
    }

    public String getModelJson() {
        return modelJson;
    }

    public void setModelJson(String modelJson) {
        this.modelJson = modelJson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenModel)) return false;
        CodegenModel that = (CodegenModel) o;
        return isString == that.isString &&
                isInteger == that.isInteger &&
                isShort == that.isShort &&
                isLong == that.isLong &&
                isUnboundedInteger == that.isUnboundedInteger &&
                isBoolean == that.isBoolean &&
                isNumber == that.isNumber &&
                isNumeric == that.isNumeric &&
                isFloat == that.isFloat &&
                isDouble == that.isDouble &&
                isDate == that.isDate &&
                isDateTime == that.isDateTime &&
                hasMoreModels == that.hasMoreModels &&
                hasEnums == that.hasEnums &&
                isEnum == that.isEnum &&
                isNullable == that.isNullable &&
                hasOptional == that.hasOptional &&
                isArray == that.isArray &&
                isMap == that.isMap &&
                deprecated == that.deprecated &&
                hasOnlyReadOnly == that.hasOnlyReadOnly &&
                isNull == that.isNull &&
                hasValidation == that.hasValidation &&
                isDecimal == that.isDecimal &&
                getHasMultipleTypes() == that.getHasMultipleTypes() &&
                getHasDiscriminatorWithNonEmptyMapping() == that.getHasDiscriminatorWithNonEmptyMapping() &&
                isUuid == that.getIsUuid() &&
                getIsBooleanSchemaTrue() == that.getIsBooleanSchemaTrue() &&
                getIsBooleanSchemaFalse() == that.getIsBooleanSchemaFalse() &&
                getSchemaIsFromAdditionalProperties() == that.getSchemaIsFromAdditionalProperties() &&
                getIsAnyType() == that.getIsAnyType() &&
                getUniqueItems() == that.getUniqueItems() &&
                getExclusiveMinimum() == that.getExclusiveMinimum() &&
                getExclusiveMaximum() == that.getExclusiveMaximum() &&
                Objects.equals(modulePath, that.modulePath) &&
                Objects.equals(getContains(), that.getContains()) &&
                Objects.equals(getDependentRequired(), that.getDependentRequired()) &&
                Objects.equals(getFormat(), that.getFormat()) &&
                Objects.equals(getRef(), that.getRef()) &&
                Objects.equals(getRefModule(), that.getRefModule()) &&
                Objects.equals(getRequiredProperties(), that.getRequiredProperties()) &&
                Objects.equals(getOptionalProperties(), that.getOptionalProperties()) &&
                Objects.equals(getProperties(), that.getProperties()) &&
                Objects.equals(getAllOf(), that.getAllOf()) &&
                Objects.equals(getAnyOf(), that.getAnyOf()) &&
                Objects.equals(getOneOf(), that.getOneOf()) &&
                Objects.equals(getNot(), that.getNot()) &&
                Objects.equals(name, that.name) &&
                Objects.equals(classname, that.classname) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(classVarName, that.classVarName) &&
                Objects.equals(modelJson, that.modelJson) &&
                Objects.equals(dataType, that.dataType) &&
                Objects.equals(xmlPrefix, that.xmlPrefix) &&
                Objects.equals(xmlNamespace, that.xmlNamespace) &&
                Objects.equals(xmlName, that.xmlName) &&
                Objects.equals(classFilename, that.classFilename) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(discriminator, that.discriminator) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(arrayModelType, that.arrayModelType) &&
                Objects.equals(allowableValues, that.allowableValues) &&
                Objects.equals(mandatory, that.mandatory) &&
                Objects.equals(allMandatory, that.allMandatory) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(externalDocumentation, that.externalDocumentation) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(getMaxProperties(), that.getMaxProperties()) &&
                Objects.equals(getMinProperties(), that.getMinProperties()) &&
                Objects.equals(getMaxItems(), that.getMaxItems()) &&
                Objects.equals(getMinItems(), that.getMinItems()) &&
                Objects.equals(getMaxLength(), that.getMaxLength()) &&
                Objects.equals(getMinLength(), that.getMinLength()) &&
                Objects.equals(getMinimum(), that.getMinimum()) &&
                Objects.equals(getMaximum(), that.getMaximum()) &&
                Objects.equals(getPattern(), that.getPattern()) &&
                Objects.equals(getItems(), that.getItems()) &&
                Objects.equals(getAdditionalProperties(), that.getAdditionalProperties()) &&
                Objects.equals(getMultipleOf(), that.getMultipleOf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnyOf(), getOneOf(), getAllOf(), getName(), getClassname(), getTitle(),
                getDescription(), getClassVarName(), getModelJson(), getDataType(), getXmlPrefix(), getXmlNamespace(),
                getXmlName(), getClassFilename(), getUnescapedDescription(), getDiscriminator(), getDefaultValue(),
                getArrayModelType(), isString, isInteger, isLong, isNumber, isNumeric, isFloat, isDouble,
                isDate, isDateTime, isNull, hasValidation, isShort, isUnboundedInteger, isBoolean,
                getAllowableValues(), getMandatory(), getAllMandatory(), getImports(),
                hasMoreModels, hasEnums, isEnum, isNullable, hasOptional, isArray,
                isMap, deprecated, hasOnlyReadOnly, getExternalDocumentation(), getVendorExtensions(),
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
        sb.append(", classname='").append(classname).append('\'');
        sb.append(", classVarName='").append(classVarName).append('\'');
        sb.append(", modelJson='").append(modelJson).append('\'');
        sb.append(", dataType='").append(dataType).append('\'');
        sb.append(", classFilename='").append(classFilename).append('\'');
        sb.append(", discriminator=").append(discriminator);
        sb.append(", arrayModelType='").append(arrayModelType).append('\'');
        sb.append(", mandatory=").append(mandatory);
        sb.append(", allMandatory=").append(allMandatory);
        sb.append(", imports=").append(imports);
        sb.append(", hasMoreModels=").append(hasMoreModels);
        sb.append(", hasEnums=").append(hasEnums);
        sb.append(", hasOptional=").append(hasOptional);
        sb.append(", hasOnlyReadOnly=").append(hasOnlyReadOnly);
        sb.append(", externalDocumentation=").append(externalDocumentation);
        sb.append(", getIsAnyType=").append(getIsAnyType());
        sb.append(", modulePath").append(modulePath);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenModel{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    public void addDiscriminatorMappedModelsImports() {
        if (discriminator == null || discriminator.getMappedModels() == null) {
            return;
        }
        for (CodegenDiscriminator.MappedModel mm : discriminator.getMappedModels()) {
            if (!"".equals(mm.getModelName())) {
                String complexType = mm.getModelName();
                imports.add(complexType);
            }
        }
    }

    private List<CodegenProperty> removeDuplicatedProperty(List<CodegenProperty> vars) {
        // clone the list first
        List<CodegenProperty> newList = new ArrayList<>();
        for (CodegenProperty cp : vars) {
            CodegenProperty newCp = new CodegenProperty();
            newCp.copyFrom(cp);
            newList.add(newCp);
        }

        Set<String> propertyNames = new TreeSet<>();
        Set<String> duplicatedNames = new TreeSet<>();

        ListIterator<CodegenProperty> iterator = newList.listIterator();
        while (iterator.hasNext()) {
            CodegenProperty element = iterator.next();

            if (element.name != null) {
                if (propertyNames.contains(element.name.getName())) {
                    duplicatedNames.add(element.name.getName());
                    iterator.remove();
                } else {
                    propertyNames.add(element.name.getName());
                }
            }
        }

        return newList;
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
                if (this.classname.equalsIgnoreCase(cp.refClass) ||
                        ((cp.isMap || cp.isArray) && cp.items != null && this.classname.equalsIgnoreCase(cp.items.refClass))) {
                    this.imports.remove(this.classname); // remove self import
                    cp.isSelfReference = true;
                }
            }
        }
        if (getOptionalProperties() != null) {
            for (CodegenProperty cp : getOptionalProperties().values()) {
                // detect self import
                if (this.classname.equalsIgnoreCase(cp.refClass) ||
                        ((cp.isMap || cp.isArray) && cp.items != null && this.classname.equalsIgnoreCase(cp.items.refClass))) {
                    this.imports.remove(this.classname); // remove self import
                    cp.isSelfReference = true;
                }
            }
        }
    }
}
