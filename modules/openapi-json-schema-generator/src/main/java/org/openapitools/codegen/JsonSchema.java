package org.openapitools.codegen;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import io.swagger.v3.oas.models.media.Schema;
import org.openapitools.codegen.meta.FeatureSet;
import org.openapitools.codegen.meta.features.SchemaSupportFeature;
import org.openapitools.codegen.utils.ModelUtils;

public interface JsonSchema {
    // 3.1.0
    CodegenProperty getContains();

    // 3.1.0
    void setContains(CodegenProperty contains);

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

    // TODO update this value to Boolean in 7.0.0
    boolean getUniqueItems();

    // TODO update this value to Boolean in 7.0.0
    void setUniqueItems(boolean uniqueItems);

    // TODO remove in 7.0.0
    Boolean getUniqueItemsBoolean();

    // TODO remove in 7.0.0
    void setUniqueItemsBoolean(Boolean uniqueItems);

    Integer getMinProperties();

    void setMinProperties(Integer minProperties);

    Integer getMaxProperties();

    void setMaxProperties(Integer maxProperties);

    Number getMultipleOf();

    void setMultipleOf(Number multipleOf);

    CodegenProperty getItems();

    void setItems(CodegenProperty items);

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

    CodegenProperty getAdditionalProperties();

    void setAdditionalProperties(CodegenProperty additionalProperties);

    List<CodegenProperty> getVars();

    void setVars(List<CodegenProperty> vars);

    List<CodegenProperty> getRequiredVars();

    void setRequiredVars(List<CodegenProperty> requiredVars);

    Map<String, CodegenProperty> getRequiredVarsMap();

    // goes from required propertyName to its CodegenProperty
    // Use Cases:
    // 1. required property is defined in properties, value is that CodegenProperty
    // 2. required property is not defined in properties, and additionalProperties is true or unset value is CodegenProperty made from empty schema
    // 3. required property is not defined in properties, and additionalProperties is schema, value is CodegenProperty made from schema
    // 4. required property is not defined in properties, and additionalProperties is false, value is null
    void setRequiredVarsMap(Map<String, CodegenProperty> requiredVarsMap);


    boolean getIsNull();

    void setIsNull(boolean isNull);

    boolean getHasValidation();

    void setHasValidation(boolean hasValidation);

    boolean getHasVars();

    void setHasVars(boolean hasVars);

    boolean getHasRequired();

    void setHasRequired(boolean hasRequired);

    // discriminators are only supported in request bodies and response payloads per OpenApi
    boolean getHasDiscriminatorWithNonEmptyMapping();

    // discriminators are only supported in request bodies and response payloads per OpenApi
    void setHasDiscriminatorWithNonEmptyMapping(boolean hasDiscriminatorWithNonEmptyMapping);

    boolean getIsString();

    void setIsString(boolean isNumber);

    boolean getIsNumber();

    void setIsNumber(boolean isNumber);

    boolean getIsAnyType();

    void setIsAnyType(boolean isAnyType);

    String getRef();

    void setRef(String ref);

    List<CodegenProperty> getAllOf();

    void setAllOf(List<CodegenProperty> allOf);

    List<CodegenProperty> getAnyOf();

    void setAnyOf(List<CodegenProperty> anyOf);

    List<CodegenProperty> getOneOf();

    void setOneOf(List<CodegenProperty> oneOf);

    CodegenProperty getNot();

    void setNot(CodegenProperty not);

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
     * Syncs all the schema's type properties into the JsonSchema instance
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

    /**
     * @return basic type - no generics supported.
     */
    default String getBaseType() {
        return null;
    };

    /**
     * @return complex type that can contain type parameters - like {@code List<Items>} for Java
     */
    default String getRefClass() {
        return getBaseType();
    };

    /**
     * Recursively collect all necessary imports to include so that the type may be resolved.
     *
     * @param importBaseType whether or not to include the base types in the returned imports.
     * @param featureSet the generator feature set, used to determine if composed schemas should be added
     * @return all of the imports
     */
    default Set<String> getImports(boolean importBaseType, FeatureSet featureSet) {
        Set<String> imports = new HashSet<>();
        if (getAllOf() != null || getAnyOf() != null || getOneOf() != null || getNot() != null) {
            List<CodegenProperty> allOfs = Collections.emptyList();
            List<CodegenProperty> oneOfs = Collections.emptyList();
            List<CodegenProperty> anyOfs = Collections.emptyList();
            List<CodegenProperty> nots = Collections.emptyList();
            if (getAllOf() != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.allOf)) {
                allOfs = getAllOf();
            }
            if (getOneOf() != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.oneOf)) {
                oneOfs = getOneOf();
            }
            if (getAnyOf() != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.anyOf)) {
                anyOfs = getAnyOf();
            }
            if (getNot() != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.not)) {
                nots = Arrays.asList(getNot());
            }
            Stream<CodegenProperty> innerTypes = Stream.of(
                            allOfs.stream(), anyOfs.stream(), oneOfs.stream(), nots.stream())
                    .flatMap(i -> i);
            innerTypes.flatMap(cp -> cp.getImports(importBaseType, featureSet).stream()).forEach(s -> imports.add(s));
        }
        // items can exist for AnyType and type array
        if (this.getItems() != null && this.getIsArray()) {
            imports.addAll(this.getItems().getImports(importBaseType, featureSet));
        }
        // additionalProperties can exist for AnyType and type object
        if (this.getAdditionalProperties() != null) {
            imports.addAll(this.getAdditionalProperties().getImports(importBaseType, featureSet));
        }
        // vars can exist for AnyType and type object
        if (this.getVars() != null && !this.getVars().isEmpty()) {
            this.getVars().stream().flatMap(v -> v.getImports(importBaseType, featureSet).stream()).forEach(s -> imports.add(s));
        }
        if (this.getIsArray() || this.getIsMap()) {
            /*
            use-case for this refClass block:
            DefaultCodegenTest.objectQueryParamIdentifyAsObject
            DefaultCodegenTest.mapParamImportInnerObject
            */
            String refClass = this.getRefClass();
            if (refClass != null && refClass.contains(".")) {
                // self reference classes do not contain periods
                imports.add(refClass);
            }
            /*
            use-case:
            Adding List/Map etc, Java uses this
             */
            String baseType = this.getBaseType();
            if (importBaseType && baseType != null) {
                imports.add(baseType);
            }
        } else {
            // referenced or inline schemas
            String refClass = this.getRefClass();
            if (refClass != null && refClass.contains(".")) {
                // self reference classes do not contain periods
                imports.add(refClass);
            }
            String baseType = this.getBaseType();
            if (importBaseType && baseType != null) {
                imports.add(baseType);
            }
            return imports;
        }
        return imports;
    }
}
