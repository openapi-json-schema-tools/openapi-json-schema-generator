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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.models.ExternalDocumentation;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

/**
 * CodegenModel represents a schema object in a OpenAPI document.
 */
@JsonIgnoreProperties({"parentModel", "interfaceModels"})
public class CodegenModel extends CodegenProperty {
    // The parent model name from the schemas. The parent is determined by inspecting the allOf, anyOf and
    // oneOf attributes in the OAS. First codegen inspects 'allOf', then 'anyOf', then 'oneOf'.
    // If there are multiple object references in the attribute ('allOf', 'anyOf', 'oneOf'), and one of the
    // object is a discriminator, that object is set as the parent. If no discriminator is specified,
    // codegen returns the first one in the list, i.e. there is no obvious parent in the OpenAPI specification.
    // When possible, the mustache templates should use 'allParents' to handle multiple parents.
    public String parent, parentSchema;
    public List<String> interfaces;
    // The list of parent model name from the schemas. In order of preference, the parent is obtained
    // from the 'allOf' attribute, then 'anyOf', and finally 'oneOf'.
    public List<String> allParents;

    // References to parent and interface CodegenModels. Only set when code generator supports inheritance.
    public CodegenModel parentModel;
    public List<CodegenModel> interfaceModels;
    public List<CodegenModel> children;

    // The language-specific name of the class that implements this schema.
    // The name of the class is derived from the OpenAPI schema name with formatting rules applied.
    // The classname is derived from the OpenAPI schema name, with sanitization and escaping rules applied.
    public String classname;
    public String classVarName, modelJson, dataType;
    public String classFilename; // store the class file name, mainly used for import
    public CodegenDiscriminator discriminator;
    public String arrayModelType;
    public boolean isAlias; // Is this effectively an alias of another simple type
    public boolean isPrimitiveType;
    public List<CodegenProperty> vars = new ArrayList<>(); // all properties (without parent's properties)
    public List<CodegenProperty> allVars = new ArrayList<>(); // all properties (with parent's properties)
    public List<CodegenProperty> readOnlyVars = new ArrayList<>(); // a list of read-only properties
    public List<CodegenProperty> readWriteVars = new ArrayList<>(); // a list of properties for read, write
    public List<CodegenProperty> parentVars = new ArrayList<>();
    public List<CodegenProperty> nonNullableVars = new ArrayList<>(); // a list of non-nullable properties

    // Sorted sets of required parameters.
    public Set<String> mandatory = new TreeSet<>(); // without parent's required properties
    public Set<String> allMandatory = new TreeSet<>(); // with parent's required properties

    public Set<String> imports = new TreeSet<>();
    public boolean emptyVars, hasMoreModels, hasEnums;
    /**
     * Indicates the type has at least one optional property.
     */
    public boolean hasOptional;
    public boolean hasChildren;
    public boolean hasOnlyReadOnly = true; // true if all properties are read-only
    public ExternalDocumentation externalDocumentation;
    public HashMap<String, SchemaTestCase> testCases = new HashMap<>();
    private String modulePath;

    private boolean hasRequiredVars;

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

    public List<String> getAllParents() {
        return allParents;
    }

    public void setAllParents(List<String> allParents) {
        this.allParents = allParents;
    }

    public List<CodegenProperty> getAllVars() {
        return allVars;
    }

    public void setAllVars(List<CodegenProperty> allVars) {
        this.allVars = allVars;
    }

    public List<CodegenProperty> getNonNullableVars() {
        return nonNullableVars;
    }

    public void setNonNullableVars(List<CodegenProperty> nonNullableVars) {
        this.nonNullableVars = nonNullableVars;
    }

    public String getArrayModelType() {
        return arrayModelType;
    }

    public void setArrayModelType(String arrayModelType) {
        this.arrayModelType = arrayModelType;
    }

    public List<CodegenModel> getChildren() {
        return children;
    }

    public void setChildren(List<CodegenModel> children) {
        this.children = children;
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

    public List<CodegenModel> getInterfaceModels() {
        return interfaceModels;
    }

    public void setInterfaceModels(List<CodegenModel> interfaceModels) {
        this.interfaceModels = interfaceModels;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public CodegenModel getParentModel() {
        return parentModel;
    }

    public void setParentModel(CodegenModel parentModel) {
        this.parentModel = parentModel;
    }

    public String getParentSchema() {
        return parentSchema;
    }

    public void setParentSchema(String parentSchema) {
        this.parentSchema = parentSchema;
    }

    public List<CodegenProperty> getParentVars() {
        return parentVars;
    }

    public void setParentVars(List<CodegenProperty> parentVars) {
        this.parentVars = parentVars;
    }

    public List<CodegenProperty> getReadOnlyVars() {
        return readOnlyVars;
    }

    public void setReadOnlyVars(List<CodegenProperty> readOnlyVars) {
        this.readOnlyVars = readOnlyVars;
    }

    public List<CodegenProperty> getReadWriteVars() {
        return readWriteVars;
    }

    public void setReadWriteVars(List<CodegenProperty> readWriteVars) {
        this.readWriteVars = readWriteVars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenModel)) return false;
        CodegenModel that = (CodegenModel) o;
        return isAlias == that.isAlias &&
                isString == that.isString &&
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
                emptyVars == that.emptyVars &&
                hasMoreModels == that.hasMoreModels &&
                hasEnums == that.hasEnums &&
                isEnum == that.isEnum &&
                isNullable == that.isNullable &&
                hasOptional == that.hasOptional &&
                isArray == that.isArray &&
                hasChildren == that.hasChildren &&
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
                Objects.equals(parent, that.parent) &&
                Objects.equals(parentSchema, that.parentSchema) &&
                Objects.equals(interfaces, that.interfaces) &&
                Objects.equals(allParents, that.allParents) &&
                Objects.equals(parentModel, that.parentModel) &&
                Objects.equals(interfaceModels, that.interfaceModels) &&
                Objects.equals(children, that.children) &&
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
                Objects.equals(vars, that.vars) &&
                Objects.equals(allVars, that.allVars) &&
                Objects.equals(nonNullableVars, that.nonNullableVars) &&
                Objects.equals(readOnlyVars, that.readOnlyVars) &&
                Objects.equals(readWriteVars, that.readWriteVars) &&
                Objects.equals(parentVars, that.parentVars) &&
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
        return Objects.hash(getParent(), getParentSchema(), getInterfaces(), getAllParents(), getParentModel(),
                getInterfaceModels(), getChildren(), getAnyOf(), getOneOf(), getAllOf(), getName(), getClassname(), getTitle(),
                getDescription(), getClassVarName(), getModelJson(), getDataType(), getXmlPrefix(), getXmlNamespace(),
                getXmlName(), getClassFilename(), getUnescapedDescription(), getDiscriminator(), getDefaultValue(),
                getArrayModelType(), isAlias, isString, isInteger, isLong, isNumber, isNumeric, isFloat, isDouble,
                isDate, isDateTime, isNull, hasValidation, isShort, isUnboundedInteger, isBoolean,
                getAllVars(), getNonNullableVars(), getReadOnlyVars(), getReadWriteVars(),
                getParentVars(), getAllowableValues(), getMandatory(), getAllMandatory(), getImports(),
                isEmptyVars(), hasMoreModels, hasEnums, isEnum, isNullable, hasOptional, isArray,
                hasChildren, isMap, deprecated, hasOnlyReadOnly, getExternalDocumentation(), getVendorExtensions(),
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
        sb.append(", parent='").append(parent).append('\'');
        sb.append(", parentSchema='").append(parentSchema).append('\'');
        sb.append(", interfaces=").append(interfaces);
        sb.append(", interfaceModels=").append(interfaceModels !=null ? interfaceModels.size() : "[]");
        sb.append(", allParents=").append(allParents);
        sb.append(", parentModel=").append(parentModel);
        sb.append(", children=").append(children != null ? children.size() : "[]");
        sb.append(", classname='").append(classname).append('\'');
        sb.append(", classVarName='").append(classVarName).append('\'');
        sb.append(", modelJson='").append(modelJson).append('\'');
        sb.append(", dataType='").append(dataType).append('\'');
        sb.append(", classFilename='").append(classFilename).append('\'');
        sb.append(", discriminator=").append(discriminator);
        sb.append(", arrayModelType='").append(arrayModelType).append('\'');
        sb.append(", isAlias=").append(isAlias);
        sb.append(", vars=").append(vars);
        sb.append(", allVars=").append(allVars);
        sb.append(", nonNullableVars=").append(nonNullableVars);
        sb.append(", readOnlyVars=").append(readOnlyVars);
        sb.append(", readWriteVars=").append(readWriteVars);
        sb.append(", parentVars=").append(parentVars);
        sb.append(", mandatory=").append(mandatory);
        sb.append(", allMandatory=").append(allMandatory);
        sb.append(", imports=").append(imports);
        sb.append(", emptyVars=").append(emptyVars);
        sb.append(", hasMoreModels=").append(hasMoreModels);
        sb.append(", hasEnums=").append(hasEnums);
        sb.append(", hasOptional=").append(hasOptional);
        sb.append(", hasChildren=").append(hasChildren);
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

    public boolean isEmptyVars() {
        return emptyVars;
    }

    public void setEmptyVars(boolean emptyVars) {
        this.emptyVars = emptyVars;
    }

    /**
     * Remove duplicated properties in all variable list
     */
    public void removeAllDuplicatedProperty() {
        // remove duplicated properties
        vars = removeDuplicatedProperty(vars);
        parentVars = removeDuplicatedProperty(parentVars);
        allVars = removeDuplicatedProperty(allVars);
        nonNullableVars = removeDuplicatedProperty(nonNullableVars);
        readOnlyVars = removeDuplicatedProperty(readOnlyVars);
        readWriteVars = removeDuplicatedProperty(readWriteVars);
    }

    private List<CodegenProperty> removeDuplicatedProperty(List<CodegenProperty> vars) {
        // clone the list first
        List<CodegenProperty> newList = new ArrayList<>();
        for (CodegenProperty cp : vars) {
            newList.add(cp.clone());
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
        for (CodegenProperty cp : allVars) {
            if (cp == null) {
                // TODO cp shouldn't be null. Show a warning message instead
            } else {
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
