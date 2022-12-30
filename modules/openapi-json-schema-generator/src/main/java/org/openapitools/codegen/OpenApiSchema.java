package org.openapitools.codegen;

import java.util.LinkedHashMap;
import java.util.List;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.utils.ModelUtils;

public interface OpenApiSchema {
    // 3.1.0
    CodegenSchema getContains();

    // 3.1.0
    void setContains(CodegenSchema contains);

    // 3.1.0
    LinkedHashMap<String, List<String>> getDependentRequired();

    // 3.1.0
    void setDependentRequired(LinkedHashMap<String, List<String>> dependentRequired);

    String getPattern();

    void setPattern(String pattern);

    String getMaximum();

    void setMaximum(String maximum);

    String getMinimum();

    void setMinimum(String minimum);

    boolean getExclusiveMaximum();

    void setExclusiveMaximum(boolean exclusiveMaximum);

    boolean getExclusiveMinimum();

    void setExclusiveMinimum(boolean exclusiveMinimum);

    Integer getMinLength();

    void setMinLength(Integer minLength);

    Integer getMaxLength();

    void setMaxLength(Integer maxLength);

    Integer getMinItems();

    void setMinItems(Integer minItems);

    Integer getMaxItems();

    void setMaxItems(Integer maxItems);

    Boolean getUniqueItems();

    void setUniqueItems(Boolean uniqueItems);

    Integer getMinProperties();

    void setMinProperties(Integer minProperties);

    Integer getMaxProperties();

    void setMaxProperties(Integer maxProperties);

    Number getMultipleOf();

    void setMultipleOf(Number multipleOf);

    CodegenSchema getItems();

    void setItems(CodegenSchema items);

    boolean getIsDate();

    void setIsDate(boolean isDate);

    boolean getIsDateTime();

    void setIsDateTime(boolean isDateTime);

    // true when the schema type is object
    boolean getIsMap();

    void setIsMap(boolean isMap);

    boolean getIsArray();

    void setIsArray(boolean isShort);

    boolean getIsShort();

    void setIsShort(boolean isShort);

    boolean getIsBoolean();

    void setIsBoolean(boolean isBoolean);

    boolean getIsUnboundedInteger();

    void setIsUnboundedInteger(boolean isUnboundedInteger);

    CodegenSchema getAdditionalProperties();

    void setAdditionalProperties(CodegenSchema additionalProperties);

    LinkedHashMap<CodegenKey, CodegenSchema> getProperties();

    void setProperties(LinkedHashMap<CodegenKey, CodegenSchema> properties);

    LinkedHashMap<CodegenKey, CodegenSchema> getOptionalProperties();

    void setOptionalProperties(LinkedHashMap<CodegenKey, CodegenSchema> optionalProperties);

    LinkedHashMap<CodegenKey, CodegenSchema> getRequiredProperties();

    // goes from required propertyName to its CodegenSchema
    // Use Cases:
    // 1. required property is defined in properties, value is that CodegenSchema
    // 2. required property is not defined in properties, and additionalProperties is true or unset value is CodegenSchema made from empty schema
    // 3. required property is not defined in properties, and additionalProperties is schema, value is CodegenSchema made from schema
    // 4. required property is not defined in properties, and additionalProperties is false, value is null
    void setRequiredProperties(LinkedHashMap<CodegenKey, CodegenSchema> requiredProperties);


    boolean getIsNull();

    void setIsNull(boolean isNull);

    boolean getHasValidation();

    void setHasValidation(boolean hasValidation);

    // discriminators are only supported in request bodies and response payloads per OpenApi
    boolean getHasDiscriminatorWithNonEmptyMapping();

    // discriminators are only supported in request bodies and response payloads per OpenApi
    void setHasDiscriminatorWithNonEmptyMapping(boolean hasDiscriminatorWithNonEmptyMapping);

    // OpenAPI field, discriminator
    CodegenDiscriminator getDiscriminator();

    void setDiscriminator(CodegenDiscriminator discriminator);

    boolean getIsString();

    void setIsString(boolean isNumber);

    boolean getIsNumber();

    void setIsNumber(boolean isNumber);

    boolean getIsAnyType();

    void setIsAnyType(boolean isAnyType);

    String getRef();

    void setRef(String ref);

    String getRefModule();

    void setRefModule(String ref);

    List<CodegenSchema> getAllOf();

    void setAllOf(List<CodegenSchema> allOf);

    List<CodegenSchema> getAnyOf();

    void setAnyOf(List<CodegenSchema> anyOf);

    List<CodegenSchema> getOneOf();

    void setOneOf(List<CodegenSchema> oneOf);

    CodegenSchema getNot();

    void setNot(CodegenSchema not);

    boolean getHasMultipleTypes();

    void setHasMultipleTypes(boolean hasMultipleTypes);

    // for when the schema is just the boolean true in a spec
    boolean getIsBooleanSchemaTrue();

    void setIsBooleanSchemaTrue(boolean isBooleanSchemaTrue);

    // for when the schema is just the boolean false in a spec
    boolean getIsBooleanSchemaFalse();

    void setIsBooleanSchemaFalse(boolean isBooleanSchemaFalse);

    boolean getSchemaIsFromAdditionalProperties();

    void setSchemaIsFromAdditionalProperties(boolean schemaIsFromAdditionalProperties);

    void setFormat(String format);

    String getFormat();

    /**
     * OpenAPI field, externalDocs
     * @return ExternalDocumentation
     */
    ExternalDocumentation getExternalDocumentation();

    void setExternalDocumentation(ExternalDocumentation externalDocumentation);

    /**
     * Syncs all the schema's type properties into the OpenApiSchema instance
     * for now this only supports types without format information
     * TODO: in the future move the format handling in here too
     * @param p the schema which contains the type info
     */
    default void setTypeProperties(Schema p) {
        if (ModelUtils.isTypeObjectSchema(p)) {
            setIsMap(true);
        } else if (ModelUtils.isArraySchema(p)) {
            setIsArray(true);
        } else if (ModelUtils.isFileSchema(p) && !ModelUtils.isStringSchema(p)) {
            // swagger v2 only, type file
            ;
        } else if (ModelUtils.isStringSchema(p)) {
            setIsString(true);
            if (ModelUtils.isByteArraySchema(p)) {
                ;
            } else if (ModelUtils.isBinarySchema(p)) {
                // openapi v3 way of representing binary + file data
                // for backward compatibility with 2.x file type
                setIsString(false);
            } else if (ModelUtils.isUUIDSchema(p)) {
                // keep isString to true to make it backward compatible
                ;
            } else if (ModelUtils.isURISchema(p)) {
                ;
            } else if (ModelUtils.isEmailSchema(p)) {
                ;
            } else if (ModelUtils.isDateSchema(p)) {
                ;
            } else if (ModelUtils.isDateTimeSchema(p)) {
                ;
            } else if (ModelUtils.isDecimalSchema(p)) { // type: string, format: number
                ;
            }
        } else if (ModelUtils.isNumberSchema(p)) {
            if (ModelUtils.isFloatSchema(p)) { // float
                ;
            } else if (ModelUtils.isDoubleSchema(p)) { // double
                ;
            } else { // type is number and without format
                setIsNumber(true);
            }
        } else if (ModelUtils.isIntegerSchema(p)) { // integer type
            if (ModelUtils.isLongSchema(p)) { // int64/long format
                ;
            } else if (ModelUtils.isShortSchema(p)) { // int32/short format
                ;
            } else { // unbounded integer
                setIsUnboundedInteger(true);
            }
        } else if (ModelUtils.isBooleanSchema(p)) { // boolean type
            setIsBoolean(true);
        } else if (ModelUtils.isNullType(p)) {
            setIsNull(true);
        } else if (ModelUtils.isAnyType(p)) {
            setIsAnyType(true);
        }
    }


   String getRefClass();
}
