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

public class CodegenProperty implements Cloneable, JsonSchema {
    /**
     * The value of the 'type' attribute in the OpenAPI schema.
     * The per-language codegen logic may change to a language-specific type.
     */
    public String openApiType;
    public String baseName;
    public String refClass;
    /**
     * The value of the 'description' attribute in the OpenAPI schema.
     */
    public String description;
    /**
     * The name of this property in the OpenAPI schema.
     */
    public String name;
    public String defaultValue;
    public String baseType;
    /**
     * The value of the 'title' attribute in the OpenAPI schema.
     */
    public String title;

    /**
     * The 'description' string without escape characters needed by some programming languages/targets
     */
    public String unescapedDescription;

    /**
     * maxLength validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.1
     */
    public Integer maxLength;
    /**
     * minLength validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.2
     */
    public Integer minLength;
    /**
     * pattern validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.3
     */
    public String pattern;
    /**
     * A free-form property to include an example of an instance for this schema.
     */
    public String example;

    /**
     * The value of the 'minimum' attribute in the OpenAPI schema.
     * The value of "minimum" MUST be a number, representing an inclusive lower limit for a numeric instance.
     */
    public String minimum;
    /**
     * The value of the 'maximum' attribute in the OpenAPI schema.
     * The value of "maximum" MUST be a number, representing an inclusive upper limit for a numeric instance.
     */
    public String maximum;
    /**
     * The value of the 'multipleOf' attribute in the OpenAPI schema.
     * The value of "multipleOf" MUST be a number, strictly greater than 0.
     */
    public Number multipleOf;
    /**
     * The value of the 'exclusiveMinimum' attribute in the OpenAPI schema.
     * The value of "exclusiveMinimum" MUST be number, representing an exclusive lower limit for a numeric instance.
     */
    public boolean exclusiveMinimum;
    /**
     * The value of the 'exclusiveMaximum' attribute in the OpenAPI schema.
     * The value of "exclusiveMaximum" MUST be number, representing an exclusive upper limit for a numeric instance.
     */
    public boolean exclusiveMaximum;
    public boolean required;
    public boolean deprecated;
    public boolean isString;
    public boolean isNumeric;
    public boolean isInteger;
    public boolean isShort;
    public boolean isLong;
    public boolean isUnboundedInteger;
    public boolean isNumber;
    public boolean isFloat;
    public boolean isDouble;
    public boolean isDecimal;
    public boolean isByteArray;
    public boolean isBinary;
    public boolean isFile;
    public boolean isBoolean;
    public boolean isDate; // full-date notation as defined by RFC 3339, section 5.6, for example, 2017-07-21
    public boolean isDateTime; // the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
    public boolean isUuid;
    public boolean isUri;
    public boolean isEmail;
    public boolean isNull;
    /**
     * The 'type' in the OAS schema is unspecified (i.e. not set). The value can be number, integer, string, object or array.
     * If the nullable attribute is set to true, the 'null' value is valid.
     */
    public boolean isAnyType;
    public boolean isArray;
    public boolean isMap;
    public boolean isEnum;
    public boolean isReadOnly;
    public boolean isWriteOnly;
    public boolean isNullable;
    public boolean isSelfReference;
    public boolean isCircularReference;
    public boolean isDiscriminator;
    public List<String> _enum;
    public Map<String, Object> allowableValues;
    // If 'additionalProperties' is not set, items is null.
    // If 'additionalProperties' is set to a type or refers to a type, 'items' provides the type information for
    // the undeclared properties.
    public CodegenProperty items;
    public CodegenProperty additionalProperties;
    public List<CodegenProperty> vars = new ArrayList<CodegenProperty>(); // all properties (without parent's properties)
    public List<CodegenProperty> requiredVars = new ArrayList<>();
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    public boolean hasValidation; // true if pattern, maximum, etc are set (only used in the mustache template)
    public String discriminatorValue;
    public String nameInLowerCase; // property name in lower case
    public String nameInCamelCase; // property name in camel case
    public String nameInSnakeCase; // property name in upper snake case
    public Integer maxItems;
    public Integer minItems;

    private Integer maxProperties;
    private Integer minProperties;
    private Boolean uniqueItems;

    // XML
    public boolean isXmlAttribute = false;
    public String xmlPrefix;
    public String xmlName;
    public String xmlNamespace;
    public boolean isXmlWrapped = false;
    private boolean hasDiscriminatorWithNonEmptyMapping;
    private List<CodegenProperty> allOf = null;
    private List<CodegenProperty> anyOf = null;
    private List<CodegenProperty> oneOf = null;
    private CodegenProperty not = null;
    private boolean hasMultipleTypes = false;
    private LinkedHashMap<String, CodegenProperty> requiredProperties;
    private LinkedHashMap<String, CodegenProperty> properties;
    private LinkedHashMap<String, CodegenProperty> optionalProperties;
    private String ref;
    private String refModule;
    private boolean schemaIsFromAdditionalProperties;
    private boolean isBooleanSchemaTrue;
    private boolean isBooleanSchemaFalse;
    private String format;
    private LinkedHashMap<String, List<String>> dependentRequired;
    private CodegenProperty contains;

    @Override
    public CodegenProperty getContains() {
        return contains;
    }

    @Override
    public void setContains(CodegenProperty contains) {
        this.contains = contains;
    }

    @Override
    public LinkedHashMap<String, List<String>> getDependentRequired() {
        return dependentRequired;
    }

    @Override
    public void setDependentRequired(LinkedHashMap<String, List<String>> dependentRequired) {
        this.dependentRequired = dependentRequired;
    }

    @Override
    public void setFormat(String format) { this.format = format; }

    @Override
    public String getFormat() { return format; }

    @Override
    public boolean getIsBooleanSchemaTrue() {
        return isBooleanSchemaTrue;
    }

    @Override
    public void setIsBooleanSchemaTrue(boolean isBooleanSchemaTrue) {
        this.isBooleanSchemaTrue = true;
    }

    @Override
    public boolean getIsBooleanSchemaFalse() {
        return isBooleanSchemaFalse;
    }

    @Override
    public void setIsBooleanSchemaFalse(boolean isBooleanSchemaFalse) {
        this.isBooleanSchemaFalse = isBooleanSchemaFalse;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getRefClass() {
        return refClass;
    }

    public void setRefClass(String refClass) {
        this.refClass = refClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnescapedDescription() {
        return unescapedDescription;
    }

    public void setUnescapedDescription(String unescapedDescription) {
        this.unescapedDescription = unescapedDescription;
    }

    @Override
    public boolean getSchemaIsFromAdditionalProperties() {
        return schemaIsFromAdditionalProperties;
    }

    @Override
    public void setSchemaIsFromAdditionalProperties(boolean schemaIsFromAdditionalProperties) {
        this.schemaIsFromAdditionalProperties = schemaIsFromAdditionalProperties;
    }

    @Override
    public Integer getMaxLength() {
        return maxLength;
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Integer getMinLength() {
        return minLength;
    }

    @Override
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String getMinimum() {
        return minimum;
    }

    @Override
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @Override
    public boolean getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    @Override
    public String getMaximum() {
        return maximum;
    }

    @Override
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    @Override
    public boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    @Override
    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public boolean getIExclusiveMaximum() {
        return exclusiveMaximum;
    }

    @Override
    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public boolean getRequired() {
        return required;
    }

    public boolean compulsory(){
        return getRequired() && !isNullable;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public List<String> get_enum() {
        return _enum;
    }

    public void set_enum(List<String> _enum) {
        this._enum = _enum;
    }

    public Map<String, Object> getAllowableValues() {
        return allowableValues;
    }

    public void setAllowableValues(Map<String, Object> allowableValues) {
        this.allowableValues = allowableValues;
    }

    @Override
    public CodegenProperty getItems() {
        return items;
    }

    @Override
    public void setItems(CodegenProperty items) {
        this.items = items;
    }

    @Override
    public CodegenProperty getAdditionalProperties() {
        return additionalProperties;
    }

    @Override
    public void setAdditionalProperties(CodegenProperty additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public boolean getIsDate() {
        return isDate;
    }

    @Override
    public void setIsDate(boolean isDate) {
        this.isDate = isDate;
    }

    @Override
    public boolean getIsDateTime() {
        return isDateTime;
    }

    @Override
    public void setIsDateTime(boolean isDateTime) {
        this.isDateTime = isDateTime;
    }

    @Override
    public boolean getIsMap() {
        return isMap;
    }

    @Override
    public void setIsMap(boolean isMap) {
        this.isMap = isMap;
    }

    @Override
    public boolean getIsArray() {
        return isArray;
    }

    @Override
    public void setIsArray(boolean isArray) {
        this.isArray = isArray;
    }

    @Override
    public boolean getIsShort() {
        return isShort;
    }

    @Override
    public void setIsShort(boolean isShort) {
        this.isShort = isShort;
    }

    @Override
    public boolean getIsBoolean() {
        return isBoolean;
    }

    @Override
    public void setIsBoolean(boolean isBoolean) {
        this.isBoolean = isBoolean;
    }

    @Override
    public boolean getIsUnboundedInteger() {
        return isUnboundedInteger;
    }

    @Override
    public void setIsUnboundedInteger(boolean isUnboundedInteger) {
        this.isUnboundedInteger = isUnboundedInteger;
    }

    public Map<String, Object> getVendorExtensions() {
        return vendorExtensions;
    }

    public void setVendorExtensions(Map<String, Object> vendorExtensions) {
        this.vendorExtensions = vendorExtensions;
    }

    public String getNameInLowerCase() {
        return nameInLowerCase;
    }

    public void setNameInLowerCase(String nameInLowerCase) {
        this.nameInLowerCase = nameInLowerCase;
    }

    public String getNameInCamelCase() {
        return nameInCamelCase;
    }

    public void setNameInCamelCase(String nameInCamelCase) {
        this.nameInCamelCase = nameInCamelCase;
    }

    public String getNameInSnakeCase() {
        return nameInSnakeCase;
    }

    @Override
    public Integer getMaxItems() {
        return maxItems;
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    @Override
    public Integer getMinItems() {
        return minItems;
    }

    @Override
    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    public String getXmlPrefix() {
        return xmlPrefix;
    }

    public void setXmlPrefix(String xmlPrefix) {
        this.xmlPrefix = xmlPrefix;
    }

    public String getXmlName() {
        return xmlName;
    }

    public void setXmlName(String xmlName) {
        this.xmlName = xmlName;
    }

    public String getXmlNamespace() {
        return xmlNamespace;
    }

    public void setXmlNamespace(String xmlNamespace) {
        this.xmlNamespace = xmlNamespace;
    }

    @Override
    public void setAllOf(List<CodegenProperty> allOf) {
        this.allOf = allOf;
    }

    @Override
    public List<CodegenProperty> getAllOf() {
        return allOf;
    }

    @Override
    public void setAnyOf(List<CodegenProperty> anyOf) {
        this.anyOf = anyOf;
    }

    @Override
    public List<CodegenProperty> getAnyOf() {
        return anyOf;
    }

    @Override
    public void setOneOf(List<CodegenProperty> oneOf) {
        this.oneOf = oneOf;
    }

    @Override
    public List<CodegenProperty> getOneOf() {
        return oneOf;
    }

    @Override
    public void setNot(CodegenProperty not) {
        this.not = not;
    }

    @Override
    public CodegenProperty getNot() {
        return not;
    }

    @Override
    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public CodegenProperty clone() {
        try {
            CodegenProperty cp = (CodegenProperty) super.clone();
            if (this._enum != null) {
                cp._enum = new ArrayList<String>(this._enum);
            }
            if (this.allowableValues != null) {
                cp.allowableValues = new HashMap<String, Object>(this.allowableValues);
            }
            if (this.items != null) {
                cp.items = this.items;
            }
            if (this.additionalProperties != null) {
                cp.additionalProperties = this.additionalProperties;
            }
            if (this.vars != null) {
                cp.vars = this.vars;
            }
            if (this.requiredVars != null) {
                cp.requiredVars = this.requiredVars;
            }
            if (this.vendorExtensions != null) {
                cp.vendorExtensions = new HashMap<String, Object>(this.vendorExtensions);
            }
            if (this.requiredProperties != null) {
                cp.setRequiredProperties(this.requiredProperties);
            }
            if (this.optionalProperties != null) {
                cp.setOptionalProperties(this.optionalProperties);
            }
            if (this.properties != null) {
                cp.setProperties(this.properties);
            }
            if (this.ref != null) {
                cp.setRef(this.ref);
            }
            if (this.format != null) {
                cp.setFormat(this.format);
            }
            if (this.dependentRequired != null) {
                cp.setDependentRequired(this.dependentRequired);
            }
            if (this.contains != null) {
                cp.setContains(this.contains);
            }
            if (this.getRefModule() != null) {
                cp.setRefClass(this.refModule);
            }
            if (this.getAllOf() != null) {
                cp.setAllOf(this.getAllOf());
            }
            if (this.getAnyOf() != null) {
                cp.setAnyOf(this.getAnyOf());
            }
            if (this.getOneOf() != null) {
                cp.setOneOf(this.getOneOf());
            }
            if (this.getNot() != null) {
                cp.setNot(this.getNot());
            }

            return cp;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public Boolean getUniqueItems() {
        return uniqueItems;
    }

    @Override
    public void setUniqueItems(Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @Override
    public Integer getMinProperties() {
        return minProperties;
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public Integer getMaxProperties() {
        return maxProperties;
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        this.maxProperties = maxProperties;
    }

    @Override
    public Number getMultipleOf() {
        return multipleOf;
    }

    @Override
    public void setMultipleOf(Number multipleOf) {
        this.multipleOf = multipleOf;
    }

    @Override
    public List<CodegenProperty> getVars() {
        return vars;
    }

    @Override
    public void setVars(List<CodegenProperty> vars) {
        this.vars = vars;
    }

    @Override
    public List<CodegenProperty> getRequiredVars() {
        return requiredVars;
    }

    @Override
    public void setRequiredVars(List<CodegenProperty> requiredVars) {
        this.requiredVars = requiredVars;
    }

    @Override
    public boolean getIsNull() {
        return isNull;
    }

    @Override
    public void setIsNull(boolean isNull) {
        this.isNull = isNull;
    }

    @Override
    public boolean getHasValidation() {
        return hasValidation;
    }

    @Override
    public void setHasValidation(boolean hasValidation) {
        this.hasValidation = hasValidation;
    }

    @Override
    public boolean getHasDiscriminatorWithNonEmptyMapping() {
        return hasDiscriminatorWithNonEmptyMapping;
    }

    ;

    @Override
    public void setHasDiscriminatorWithNonEmptyMapping(boolean hasDiscriminatorWithNonEmptyMapping) {
        this.hasDiscriminatorWithNonEmptyMapping = hasDiscriminatorWithNonEmptyMapping;
    }

    public boolean getHasItems() {
        return this.items != null;
    }

    @Override
    public boolean getIsString() {
        return isString;
    }

    @Override
    public void setIsString(boolean isString) {
        this.isString = isString;
    }

    @Override
    public boolean getIsNumber() {
        return isNumber;
    }

    @Override
    public void setIsNumber(boolean isNumber) {
        this.isNumber = isNumber;
    }

    @Override
    public boolean getIsAnyType() {
        return isAnyType;
    }

    @Override
    public void setIsAnyType(boolean isAnyType) {
        this.isAnyType = isAnyType;
    }

    @Override
    public boolean getHasMultipleTypes() {
        return hasMultipleTypes;
    }

    @Override
    public void setHasMultipleTypes(boolean hasMultipleTypes) {
        this.hasMultipleTypes = hasMultipleTypes;
    }

    public boolean getIsUuid() { return isUuid; }

    public void setIsUuid(boolean isUuid) { this.isUuid = isUuid; }

    @Override
    public LinkedHashMap<String, CodegenProperty> getRequiredProperties() { return requiredProperties; }

    @Override
    public void setRequiredProperties(LinkedHashMap<String, CodegenProperty> requiredProperties) { this.requiredProperties = requiredProperties; }

    @Override
    public LinkedHashMap<String, CodegenProperty> getProperties() { return properties; }

    @Override
    public void setProperties(LinkedHashMap<String, CodegenProperty> properties) { this.properties = properties; }

    @Override
    public LinkedHashMap<String, CodegenProperty> getOptionalProperties() { return optionalProperties; }

    @Override
    public void setOptionalProperties(LinkedHashMap<String, CodegenProperty> optionalProperties) { this.optionalProperties = optionalProperties; }

    public String getRefModule() { return refModule; }

    public void setRefModule(String refModule) { this.refModule=refModule; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenProperty{");
        sb.append("openApiType='").append(openApiType).append('\'');
        sb.append(", baseName='").append(baseName).append('\'');
        sb.append(", refClass='").append(refClass).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", baseType='").append(baseType).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
        sb.append(", maxLength=").append(maxLength);
        sb.append(", minLength=").append(minLength);
        sb.append(", pattern='").append(pattern).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", minimum='").append(minimum).append('\'');
        sb.append(", maximum='").append(maximum).append('\'');
        sb.append(", exclusiveMinimum=").append(exclusiveMinimum);
        sb.append(", exclusiveMaximum=").append(exclusiveMaximum);
        sb.append(", required=").append(required);
        sb.append(", deprecated=").append(deprecated);
        sb.append(", isString=").append(isString);
        sb.append(", isNumeric=").append(isNumeric);
        sb.append(", isInteger=").append(isInteger);
        sb.append(", isShort=").append(isShort);
        sb.append(", isLong=").append(isLong);
        sb.append(", isUnboundedInteger=").append(isUnboundedInteger);
        sb.append(", isNumber=").append(isNumber);
        sb.append(", isFloat=").append(isFloat);
        sb.append(", isDouble=").append(isDouble);
        sb.append(", isDecimal=").append(isDecimal);
        sb.append(", isByteArray=").append(isByteArray);
        sb.append(", isBinary=").append(isBinary);
        sb.append(", isFile=").append(isFile);
        sb.append(", isBoolean=").append(isBoolean);
        sb.append(", isDate=").append(isDate);
        sb.append(", isDateTime=").append(isDateTime);
        sb.append(", isUuid=").append(isUuid);
        sb.append(", isUri=").append(isUri);
        sb.append(", isEmail=").append(isEmail);
        sb.append(", isArray=").append(isArray);
        sb.append(", isMap=").append(isMap);
        sb.append(", isEnum=").append(isEnum);
        sb.append(", isAnyType=").append(isAnyType);
        sb.append(", isReadOnly=").append(isReadOnly);
        sb.append(", isWriteOnly=").append(isWriteOnly);
        sb.append(", isNullable=").append(isNullable);
        sb.append(", isSelfReference=").append(isSelfReference);
        sb.append(", isCircularReference=").append(isCircularReference);
        sb.append(", isDiscriminator=").append(isDiscriminator);
        sb.append(", _enum=").append(_enum);
        sb.append(", allowableValues=").append(allowableValues);
        sb.append(", items=").append(items);
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append(", vars=").append(vars);
        sb.append(", requiredVars=").append(requiredVars);
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", hasValidation=").append(hasValidation);
        sb.append(", discriminatorValue='").append(discriminatorValue).append('\'');
        sb.append(", nameInCamelCase='").append(nameInCamelCase).append('\'');
        sb.append(", nameInSnakeCase='").append(nameInSnakeCase).append('\'');
        sb.append(", maxItems=").append(maxItems);
        sb.append(", minItems=").append(minItems);
        sb.append(", maxProperties=").append(maxProperties);
        sb.append(", minProperties=").append(minProperties);
        sb.append(", uniqueItems=").append(uniqueItems);
        sb.append(", multipleOf=").append(multipleOf);
        sb.append(", isXmlAttribute=").append(isXmlAttribute);
        sb.append(", xmlPrefix='").append(xmlPrefix).append('\'');
        sb.append(", xmlName='").append(xmlName).append('\'');
        sb.append(", xmlNamespace='").append(xmlNamespace).append('\'');
        sb.append(", isXmlWrapped=").append(isXmlWrapped);
        sb.append(", isNull=").append(isNull);
        sb.append(", getHasDiscriminatorWithNonEmptyMapping=").append(hasDiscriminatorWithNonEmptyMapping);
        sb.append(", hasMultipleTypes=").append(hasMultipleTypes);
        sb.append(", requiredProperties=").append(requiredProperties);
        sb.append(", optionalProperties=").append(optionalProperties);
        sb.append(", properties=").append(properties);
        sb.append(", ref=").append(ref);
        sb.append(", refModule=").append(refModule);
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
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenProperty that = (CodegenProperty) o;
        return exclusiveMinimum == that.exclusiveMinimum &&
                exclusiveMaximum == that.exclusiveMaximum &&
                required == that.required &&
                deprecated == that.deprecated &&
                isString == that.isString &&
                isNumeric == that.isNumeric &&
                isInteger == that.isInteger &&
                isShort == that.isShort &&
                isLong == that.isLong &&
                isUnboundedInteger == that.isUnboundedInteger &&
                isNumber == that.isNumber &&
                isFloat == that.isFloat &&
                isDouble == that.isDouble &&
                isDecimal == that.isDecimal &&
                isByteArray == that.isByteArray &&
                isBinary == that.isBinary &&
                isFile == that.isFile &&
                isBoolean == that.isBoolean &&
                isDate == that.isDate &&
                isDateTime == that.isDateTime &&
                isUuid == that.isUuid &&
                isUri == that.isUri &&
                isEmail == that.isEmail &&
                isArray == that.isArray &&
                isMap == that.isMap &&
                isEnum == that.isEnum &&
                isAnyType == that.isAnyType &&
                isReadOnly == that.isReadOnly &&
                isWriteOnly == that.isWriteOnly &&
                isNullable == that.isNullable &&
                isSelfReference == that.isSelfReference &&
                isCircularReference == that.isCircularReference &&
                isDiscriminator == that.isDiscriminator &&
                hasValidation == that.hasValidation &&
                isXmlAttribute == that.isXmlAttribute &&
                isXmlWrapped == that.isXmlWrapped &&
                isNull == that.isNull &&
                hasMultipleTypes == that.getHasMultipleTypes() &&
                hasDiscriminatorWithNonEmptyMapping == that.hasDiscriminatorWithNonEmptyMapping &&
                isBooleanSchemaTrue == that.getIsBooleanSchemaTrue() &&
                isBooleanSchemaFalse == that.getIsBooleanSchemaFalse() &&
                getSchemaIsFromAdditionalProperties() == that.getSchemaIsFromAdditionalProperties() &&
                Objects.equals(allOf, that.getAllOf()) &&
                Objects.equals(anyOf, that.getAnyOf()) &&
                Objects.equals(oneOf, that.getOneOf()) &&
                Objects.equals(not, that.getNot()) &&
                Objects.equals(contains, that.getContains()) &&
                Objects.equals(dependentRequired, that.getDependentRequired()) &&
                Objects.equals(format, that.getFormat()) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(refModule, that.getRefModule()) &&
                Objects.equals(requiredProperties, that.getRequiredProperties()) &&
                Objects.equals(optionalProperties, that.getOptionalProperties()) &&
                Objects.equals(properties, that.getProperties()) &&
                Objects.equals(openApiType, that.openApiType) &&
                Objects.equals(baseName, that.baseName) &&
                Objects.equals(refClass, that.refClass) &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(baseType, that.baseType) &&
                Objects.equals(title, that.title) &&
                Objects.equals(unescapedDescription, that.unescapedDescription) &&
                Objects.equals(maxLength, that.maxLength) &&
                Objects.equals(minLength, that.minLength) &&
                Objects.equals(pattern, that.pattern) &&
                Objects.equals(example, that.example) &&
                Objects.equals(minimum, that.minimum) &&
                Objects.equals(maximum, that.maximum) &&
                Objects.equals(_enum, that._enum) &&
                Objects.equals(allowableValues, that.allowableValues) &&
                Objects.equals(items, that.items) &&
                Objects.equals(additionalProperties, that.additionalProperties) &&
                Objects.equals(vars, that.vars) &&
                Objects.equals(requiredVars, that.requiredVars) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(discriminatorValue, that.discriminatorValue) &&
                Objects.equals(nameInCamelCase, that.nameInCamelCase) &&
                Objects.equals(nameInSnakeCase, that.nameInSnakeCase) &&
                Objects.equals(maxItems, that.maxItems) &&
                Objects.equals(minItems, that.minItems) &&
                Objects.equals(xmlPrefix, that.xmlPrefix) &&
                Objects.equals(xmlName, that.xmlName) &&
                Objects.equals(xmlNamespace, that.xmlNamespace) &&
                Objects.equals(multipleOf, that.multipleOf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(openApiType, baseName, refClass, description,
                name, defaultValue,
                baseType, title, unescapedDescription,
                maxLength, minLength, pattern, example, minimum, maximum,
                exclusiveMinimum, exclusiveMaximum, required, deprecated,
                isString, isNumeric,
                isInteger, isLong, isNumber, isFloat, isDouble, isDecimal, isByteArray, isBinary, isFile,
                isBoolean, isDate, isDateTime, isUuid, isUri, isEmail,
                isArray, isMap, isEnum, isAnyType, isReadOnly, isWriteOnly, isNullable, isShort,
                isUnboundedInteger, isSelfReference, isCircularReference, isDiscriminator, _enum,
                allowableValues, items, additionalProperties, vars, requiredVars,
                vendorExtensions, hasValidation, discriminatorValue, nameInCamelCase,
                nameInSnakeCase, maxItems, minItems, isXmlAttribute, xmlPrefix, xmlName,
                xmlNamespace, isXmlWrapped, isNull,
                hasDiscriminatorWithNonEmptyMapping, hasMultipleTypes, requiredProperties,
                ref, schemaIsFromAdditionalProperties, isBooleanSchemaTrue, isBooleanSchemaFalse,
                format, dependentRequired, contains, refModule, allOf, anyOf, oneOf, not,
                optionalProperties, properties);
    }
}
