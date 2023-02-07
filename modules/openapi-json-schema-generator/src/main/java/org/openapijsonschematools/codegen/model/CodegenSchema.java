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

import io.swagger.v3.oas.models.ExternalDocumentation;

import java.util.*;

public class CodegenSchema {
    // 3.0.0
    public String title;
    public Number multipleOf;
    public String maximum;
    public Boolean exclusiveMaximum;
    public String minimum;
    public Boolean exclusiveMinimum;
    public Integer maxLength;
    public Integer minLength;
    public CodegenPatternInfo patternInfo;
    public Integer maxItems;
    public Integer minItems;
    public Boolean uniqueItems;
    public Integer maxProperties;
    public Integer minProperties;
    public LinkedHashMap<CodegenKey, CodegenSchema> requiredProperties; // used to store required info
    public LinkedHashMap<String, EnumValue> enumNameToValue; // enum info
    public String type;
    public List<CodegenSchema> allOf = null;
    public List<CodegenSchema> anyOf = null;
    public List<CodegenSchema> oneOf = null;
    public CodegenSchema not = null;
    public CodegenSchema items;
    public LinkedHashMap<CodegenKey, CodegenSchema> properties;
    public CodegenSchema additionalProperties;
    public String description;
    public String format;
    public String defaultValue;
    public CodegenRefInfo<CodegenSchema> refInfo;  // $ref

    // openapi 3.0.0
    // note: null is added to types when nullable is true
    public Boolean nullable;
    public CodegenDiscriminator discriminator;
    public Boolean readOnly;
    public Boolean writeOnly;
    public CodegenXml xml;
    public ExternalDocumentation externalDocumentation;
    public String example;
    public Boolean deprecated;
    // openapi Specification Extensions
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();

    // 3.1.0
    public LinkedHashSet<String> types;
    public CodegenSchema contains;
    public LinkedHashMap<String, List<String>> dependentRequired;
    public boolean isBooleanSchemaTrue;  // supports boolean schemas
    public boolean isBooleanSchemaFalse;  // supports boolean schemas

    // Extra needed fields
    public String componentModule;
    public TreeSet<String> imports;
    public CodegenKey jsonPathPiece;
    public String unescapedDescription;
    public LinkedHashMap<CodegenKey, CodegenSchema> optionalProperties;
    public boolean schemaIsFromAdditionalProperties;
    public HashMap<String, SchemaTestCase> testCases = new HashMap<>();

    public boolean hasValidation() {
        if (maxItems != null || minItems != null || minProperties != null || maxProperties != null || minLength != null || maxLength != null || multipleOf != null || patternInfo != null || minimum != null || maximum != null || exclusiveMinimum != null || exclusiveMaximum != null || uniqueItems != null) {
            return true;
        }
        return false;
    }

    public boolean hasMultipleTypes() {
        return (types != null && types.size() > 1);
    }

    public boolean hasDiscriminatorWithNonEmptyMapping() {
        if (discriminator == null) {
            return false;
        }
        if (discriminator.mappedModels == null) {
            return false;
        } else if (discriminator.mappedModels.isEmpty()) {
            return false;
        }
        return true;
    }

    public CodegenSchema getDeepestRef() {
        if (refInfo == null) {
            return null;
        }
        CodegenSchema refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }

    public CodegenSchema getSelfOrDeepestRef() {
        if (refInfo == null) {
            return this;
        }
        CodegenSchema refObject = refInfo.ref;
        while (refObject.refInfo != null) {
            refObject = refObject.refInfo.ref;
        }
        return refObject;
    }

    public boolean isComplicated() {
        // used by templates

        if (allOf != null || anyOf != null || oneOf != null || not != null) {
            return true;
        }
        if (types != null && (types.contains("array") || types.contains("object"))) {
            return true;
        }
        return false;
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append(", description='").append(description).append('\'');
        sb.append(", name='").append(jsonPathPiece).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", maxLength=").append(maxLength);
        sb.append(", minLength=").append(minLength);
        sb.append(", patternInfo='").append(patternInfo).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", minimum='").append(minimum).append('\'');
        sb.append(", maximum='").append(maximum).append('\'');
        sb.append(", exclusiveMinimum=").append(exclusiveMinimum);
        sb.append(", exclusiveMaximum=").append(exclusiveMaximum);
        sb.append(", deprecated=").append(deprecated);
        sb.append(", types=").append(types);
        sb.append(", hasMultipleTypes=").append(hasMultipleTypes());
        sb.append(", readOnly=").append(readOnly);
        sb.append(", writeOnly=").append(writeOnly);
        sb.append(", nullable=").append(nullable);
        sb.append(", allowableValues=").append(enumNameToValue);
        sb.append(", items=").append(items);
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", hasValidation=").append(hasValidation());
        sb.append(", maxItems=").append(maxItems);
        sb.append(", minItems=").append(minItems);
        sb.append(", maxProperties=").append(maxProperties);
        sb.append(", minProperties=").append(minProperties);
        sb.append(", uniqueItems=").append(uniqueItems);
        sb.append(", multipleOf=").append(multipleOf);
        sb.append(", xml=").append(xml);
        sb.append(", requiredProperties=").append(requiredProperties);
        sb.append(", optionalProperties=").append(optionalProperties);
        sb.append(", properties=").append(properties);
        sb.append(", refInfo=").append(refInfo);
        sb.append(", schemaIsFromAdditionalProperties=").append(schemaIsFromAdditionalProperties);
        sb.append(", isBooleanSchemaTrue=").append(isBooleanSchemaTrue);
        sb.append(", isBooleanSchemaFalse=").append(isBooleanSchemaFalse);
        sb.append(", format=").append(format);
        sb.append(", dependentRequired=").append(dependentRequired);
        sb.append(", contains=").append(contains);
        sb.append(", allOf=").append(allOf);
        sb.append(", anyOf=").append(anyOf);
        sb.append(", oneOf=").append(oneOf);
        sb.append(", not=").append(not);
        sb.append(", externalDocumentation=").append(externalDocumentation);
        sb.append(", discriminator=").append(discriminator);
        sb.append(", imports=").append(imports);
        sb.append(", componentModule=").append(componentModule);
        sb.append(", testCases=").append(testCases);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenSchema{");
        addInstanceInfo(sb);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenSchema that = (CodegenSchema) o;
        return exclusiveMinimum == that.exclusiveMinimum &&
                exclusiveMaximum == that.exclusiveMaximum &&
                deprecated == that.deprecated &&
                readOnly == that.readOnly &&
                writeOnly == that.writeOnly &&
                nullable == that.nullable &&
                isBooleanSchemaTrue == that.isBooleanSchemaTrue &&
                isBooleanSchemaFalse == that.isBooleanSchemaFalse &&
                schemaIsFromAdditionalProperties == that.schemaIsFromAdditionalProperties &&
                Objects.equals(xml, that.xml) &&
                Objects.equals(types, that.types) &&
                Objects.equals(testCases, that.testCases) &&
                Objects.equals(componentModule, that.componentModule) &&
                Objects.equals(imports, that.imports) &&
                Objects.equals(discriminator, that.discriminator) &&
                Objects.equals(externalDocumentation, that.externalDocumentation) &&
                Objects.equals(allOf, that.allOf) &&
                Objects.equals(anyOf, that.anyOf) &&
                Objects.equals(oneOf, that.oneOf) &&
                Objects.equals(not, that.not) &&
                Objects.equals(contains, that.contains) &&
                Objects.equals(dependentRequired, that.dependentRequired) &&
                Objects.equals(format, that.format) &&
                Objects.equals(refInfo, that.refInfo) &&
                Objects.equals(requiredProperties, that.requiredProperties) &&
                Objects.equals(optionalProperties, that.optionalProperties) &&
                Objects.equals(properties, that.properties) &&
                Objects.equals(description, that.description) &&
                Objects.equals(jsonPathPiece, that.jsonPathPiece) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(title, that.title) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(maxLength, that.maxLength) &&
                Objects.equals(minLength, that.minLength) &&
                Objects.equals(patternInfo, that.patternInfo) &&
                Objects.equals(example, that.example) &&
                Objects.equals(minimum, that.minimum) &&
                Objects.equals(maximum, that.maximum) &&
                Objects.equals(enumNameToValue, that.enumNameToValue) &&
                Objects.equals(items, that.items) &&
                Objects.equals(additionalProperties, that.additionalProperties) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(maxItems, that.maxItems) &&
                Objects.equals(minItems, that.minItems) &&
                Objects.equals(multipleOf, that.multipleOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
                jsonPathPiece, defaultValue,
                title, unescapedDescription,
                maxLength, minLength, patternInfo, example, minimum, maximum,
                exclusiveMinimum, exclusiveMaximum, deprecated, types,
                readOnly, writeOnly, nullable,
                enumNameToValue, items, additionalProperties,
                vendorExtensions, maxItems, minItems, xml,
                schemaIsFromAdditionalProperties, isBooleanSchemaTrue, isBooleanSchemaFalse,
                format, dependentRequired, contains, allOf, anyOf, oneOf, not,
                properties, optionalProperties, requiredProperties, externalDocumentation,
                discriminator, imports, componentModule, testCases, refInfo);
    }
}
