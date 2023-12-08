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

package org.openapijsonschematools.codegen.generators.openapimodels;

import io.swagger.v3.oas.models.ExternalDocumentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

public class CodegenSchema {
    // 3.0.0
    public String title;
    public Number multipleOf;
    public BigDecimal maximum;
    public BigDecimal exclusiveMaximum;
    public BigDecimal minimum;
    public BigDecimal exclusiveMinimum;
    public Integer maxLength;
    public Integer minLength;
    public CodegenPatternInfo patternInfo;
    public Integer maxItems;
    public Integer minItems;
    public Boolean uniqueItems;
    public Integer maxProperties;
    public Integer minProperties;
    public LinkedHashMapWithContext<CodegenSchema> requiredProperties; // used to store required info
    public EnumInfo enumInfo;
    public String type;
    public ArrayListWithContext<CodegenSchema> allOf = null;
    public ArrayListWithContext<CodegenSchema> anyOf = null;
    public ArrayListWithContext<CodegenSchema> oneOf = null;
    public CodegenSchema not = null;
    public CodegenSchema items;
    public LinkedHashMapWithContext<CodegenSchema> properties;
    public CodegenSchema additionalProperties;
    public CodegenText description;
    public String format;
    public EnumValue defaultValue;
    public CodegenRefInfo<CodegenSchema> refInfo;  // $ref
    public String jsonPath;  // the current schema's jsonPath

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
    public Map<String, Object> vendorExtensions;

    // 3.1.0
    public LinkedHashSet<String> types;
    public CodegenSchema contains;
    public Integer minContains;
    public Integer maxContains;
    public LinkedHashMap<String, ArrayList<String>> dependentRequired;
    public LinkedHashMapWithContext<CodegenSchema> dependentSchemas;
    public boolean isBooleanSchemaTrue;  // supports boolean schemas
    public boolean isBooleanSchemaFalse;  // supports boolean schemas
    public EnumInfo constInfo;
    public CodegenSchema propertyNames;
    public LinkedHashMap<CodegenPatternInfo, CodegenSchema> patternProperties;
    public ArrayList<CodegenSchema> prefixItems;
    public CodegenSchema unevaluatedItems;
    public CodegenSchema unevaluatedProperties;
    public CodegenSchema if_;
    public CodegenSchema then;
    public CodegenSchema else_;

    // Extra needed fields
    // stores the mapping value schema, used to provide a value type for the object output class
    public CodegenSchema mapValueSchema;
    public boolean componentModule;
    public TreeSet<String> imports;
    public CodegenKey jsonPathPiece;
    public LinkedHashMapWithContext<CodegenSchema> optionalProperties;
    public CodegenKey mapInputJsonPathPiece;
    public CodegenKey mapOutputJsonPathPiece;
    public CodegenKey arrayInputJsonPathPiece;
    public CodegenKey arrayOutputJsonPathPiece;
    public boolean schemaIsFromAdditionalProperties;
    public HashMap<String, SchemaTestCase> testCases = new HashMap<>();
    /**
     * schema/allOfType/anyOfType/oneOfType/propertiesType/importsType
     * used in getAllSchemas to write type definitions for allOfType/anyOfType/oneOfType/propertiesType
     */
    public String instanceType;
    // used to store the expanded schemas that define a codegenschema in code file
    private ArrayList<CodegenSchema> allSchemas = null;
    // converts sourceJsonPath into code file moduleLocation for docs
    public String moduleLocation = null;
    // stores the location of the documentation file
    public String pathFromDocRoot = null;
    public boolean isInline = false;
    public String subpackage;  // the current schema's subpackage, needed by java
    public CodegenKey containerJsonPathPiece; // needed by java, outer classs that has inner nested schema classes
    public Map<String, EnumValue> typeToExample = null;

    /*
    Remove this in the 4.0.0 release because it is unused
     */
    @Deprecated
    public boolean hasValidation() {
        return maxItems != null || minItems != null || minProperties != null || maxProperties != null || minLength != null || maxLength != null || multipleOf != null || patternInfo != null || minimum != null || maximum != null || exclusiveMinimum != null || exclusiveMaximum != null || uniqueItems != null;
    }

    public List<String> keywords() {
        List<String> keywords = new ArrayList<>();
        if (type != null) {
            keywords.add("type");
        }
        if (format != null) {
            keywords.add("format");
        }
        if (items != null) {
            keywords.add("items");
        }
        if (properties != null) {
            keywords.add("properties");
        }
        if (requiredProperties != null) {
            keywords.add("required");
        }
        if (exclusiveMaximum != null) {
            keywords.add("exclusiveMaximum");
        }
        if (exclusiveMinimum != null) {
            keywords.add("exclusiveMinimum");
        }
        if (maxItems != null) {
            keywords.add("maxItems");
        }
        if (minItems != null) {
            keywords.add("minItems");
        }
        if (maxLength != null) {
            keywords.add("maxLength");
        }
        if (minLength != null) {
            keywords.add("minLength");
        }
        if (maxProperties != null) {
            keywords.add("maxProperties");
        }
        if (minProperties != null) {
            keywords.add("minProperties");
        }
        if (maximum != null) {
            keywords.add("maximum");
        }
        if (minimum != null) {
            keywords.add("minimum");
        }
        if (multipleOf != null) {
            keywords.add("multipleOf");
        }
        if (additionalProperties != null) {
            keywords.add("additionalProperties");
        }
        if (allOf != null) {
            keywords.add("allOf");
        }
        if (anyOf != null) {
            keywords.add("anyOf");
        }
        if (oneOf != null) {
            keywords.add("oneOf");
        }
        if (not != null) {
            keywords.add("not");
        }
        if (uniqueItems != null) {
            keywords.add("uniqueItems");
        }
        if (enumInfo != null) {
            keywords.add("enum");
        }
        if (patternInfo != null) {
            keywords.add("pattern");
        }
        if (keywords.isEmpty()) {
            return null;
        }
        return keywords;
    }

    public boolean isCustomSchema() {
        // true when schema class is directly extended, false otherwise
        if (isBooleanSchemaTrue || isBooleanSchemaFalse) {
            return false;
        }
        if (types == null) {
            if (isSimpleAnyType()) {
                return false;
            }
            return true;
        }
        if (types.size() == 1) {
            for (String type: types) {
                switch (type) {
                    case "object":
                        if (isSimpleObject()) {
                            return false;
                        }
                        return true;
                    case "array":
                        if (isSimpleArray()) {
                            return false;
                        }
                        return true;
                    case "boolean":
                        if (isSimpleBoolean()) {
                            return false;
                        }
                        return true;
                    case "number":
                    case "integer":
                        if (isSimpleInteger() || isSimpleNumber()) {
                            return false;
                        }
                        return true;
                    case "string":
                        if (isSimpleString()) {
                            return false;
                        }
                        return true;
                    case "null":
                        if (isSimpleNull()) {
                            return false;
                        }
                        return true;
                    default:
                        throw new RuntimeException("invalid type "+type+" was passed in");
                }
            }
        }
        return true;
    }

    public boolean isSimpleBoolean() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("boolean")) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || enumInfo != null || constInfo != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleNull() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("null")) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || enumInfo != null || constInfo != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleInteger() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("integer")) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || enumInfo != null || constInfo != null || maximum != null || minimum != null || exclusiveMaximum != null || exclusiveMinimum != null || multipleOf != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleNumber() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("number")) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || enumInfo != null || constInfo != null || maximum != null || minimum != null || exclusiveMaximum != null || exclusiveMinimum != null || multipleOf != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleString() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("string")) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || enumInfo != null || constInfo != null || defaultValue != null || maxLength != null || minLength != null || patternInfo != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleObject() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("object")) {
            return false;
        }
        if (allOf != null || anyOf != null ||  oneOf != null ||  not != null ||  if_ != null ||  then != null ||  else_ != null || properties != null || requiredProperties != null || hasDiscriminatorWithNonEmptyMapping() != false || additionalProperties != null || dependentRequired != null || dependentSchemas != null || propertyNames != null || maxProperties != null || minProperties != null || patternProperties != null ||  unevaluatedProperties != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleArray() {
        if (types == null) {
            return false;
        }
        if (types.size() != 1) {
            return false;
        }
        if (!types.contains("array")) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || items != null || uniqueItems != null || contains != null || maxContains != null || minContains != null || maxItems != null || minItems != null || prefixItems != null || unevaluatedItems != null) {
            return false;
        }
        return true;
    }

    public boolean isSimpleAnyType() {
        if (types != null) {
            return false;
        }
        if (allOf != null || anyOf != null || oneOf != null || not != null || if_ != null || then != null || else_ != null || enumInfo != null || constInfo != null || properties != null || requiredProperties != null || hasDiscriminatorWithNonEmptyMapping() != false || additionalProperties != null || dependentRequired != null || dependentSchemas != null || propertyNames != null || maxProperties != null || minProperties != null || patternProperties != null || unevaluatedProperties != null || items != null || uniqueItems != null || maxItems != null || minItems != null || contains != null || maxContains != null || minContains != null || prefixItems != null || unevaluatedItems != null || format != null || maxLength != null || minLength != null || maximum != null || minimum != null || exclusiveMaximum != null || exclusiveMinimum != null || multipleOf != null || patternInfo != null) {
            return false;
        }
        return true;
    }

    public CodegenSchema typeSchema() {
        CodegenSchema schema = new CodegenSchema();
        schema.refInfo = refInfo;
        schema.types = types;
        schema.enumInfo = enumInfo;
        schema.arrayOutputJsonPathPiece = arrayOutputJsonPathPiece;
        schema.mapOutputJsonPathPiece = mapOutputJsonPathPiece;
        return schema;
    }

    public boolean hasDiscriminatorWithNonEmptyMapping() {
        if (discriminator == null) {
            return false;
        }
        if (discriminator.mappedModels == null) {
            return false;
        } else return !discriminator.mappedModels.isEmpty();
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

    public CodegenSchema add(CodegenSchema other) {
        /*
        must be most permissive addition so dict.get returns possible type
        stored properties are:
        types
        enumInfo
        refInfo
         */
        CodegenSchema newSchema = new CodegenSchema();
        if (other == null) {
            newSchema.types = types;
            newSchema.refInfo = refInfo;
            newSchema.enumInfo = enumInfo;
            return newSchema;
        }
        if (types == null || other.types == null) {
            newSchema.types = null;
        } else {
            LinkedHashSet<String> sumTypes = new LinkedHashSet<>(types);
            sumTypes.addAll(other.types);
            newSchema.types = sumTypes;
        }
        if (refInfo == null || other.refInfo == null) {
            newSchema.refInfo = null;
        } else {
            if (refInfo == other.refInfo) {
                newSchema.refInfo = refInfo;
            } else {
                newSchema.refInfo = null;
            }
        }
        if (enumInfo == null || other.enumInfo == null) {
            newSchema.enumInfo = null;
        } else {
            if (enumInfo == other.enumInfo) {
                newSchema.enumInfo = enumInfo;
            } else {
                newSchema.enumInfo = null;
            }
        }
        return newSchema;
    }

    public boolean hasAnyRefs() {
        // todo cache this, also pass in sourceJsonPath because one is looking for external refs
        if (refInfo != null) {
            return true;
        }
        if (items != null) {
            boolean schemaHasRef = items.hasAnyRefs();
            if (schemaHasRef) {
                return true;
            }
        }
        if (not != null) {
            boolean schemaHasRef = not.hasAnyRefs();
            if (schemaHasRef) {
                return true;
            }
        }
        if (additionalProperties != null) {
            boolean schemaHasRef = additionalProperties.hasAnyRefs();
            if (schemaHasRef) {
                return true;
            }
        }
        if (properties != null) {
            for (CodegenSchema prop: properties.values()) {
                boolean schemaHasRef = prop.hasAnyRefs();
                if (schemaHasRef) {
                    return true;
                }
            }
        }
        if (allOf != null) {
            for (CodegenSchema prop: allOf) {
                boolean schemaHasRef = prop.hasAnyRefs();
                if (schemaHasRef) {
                    return true;
                }
            }
        }
        if (anyOf != null) {
            for (CodegenSchema prop: anyOf) {
                boolean schemaHasRef = prop.hasAnyRefs();
                if (schemaHasRef) {
                    return true;
                }
            }
        }
        if (oneOf != null) {
            for (CodegenSchema prop: oneOf) {
                boolean schemaHasRef = prop.hasAnyRefs();
                if (schemaHasRef) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns all schemas in post order traversal, used by templates to write schema classes
     * @param schemasBeforeImports the input list that stores this and all required schemas
     */
    private void getAllSchemas(ArrayList<CodegenSchema> schemasBeforeImports, ArrayList<CodegenSchema> schemasAfterImports, int level, boolean propertyInputTypesUnique) {
        /*
        post order traversal using alphabetic json schema keywords as the order
        keywords with schemas:
        additionalProperties
        allOf
        anyOf
        const
        contains
        dependentSchemas
        else
        enums
        if_
        items
        not
        oneOf
        patternProperties
        prefixItems
        properties
        propertyNames
        then
        unevaluatedItems
        unevaluatedProperties
        (self)

        excluded:
        discriminator (not actually applicable because all values would be refs and do not need to be defined)
        $ref (because it is an import)
         */
        boolean schemaAllAreInline = true;
        if (isBooleanSchemaFalse) {
            // return early for isBooleanSchemaFalse so not_ will not be written
            schemasBeforeImports.add(this);
            return;
        }
        if (additionalProperties != null) {
            additionalProperties.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (allOf != null) {
            for (CodegenSchema someSchema: allOf) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            }
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "allOfType";
            extraSchema.allOf = allOf;
            if (allOf.allAreInline()) {
                schemasBeforeImports.add(extraSchema);
            } else {
                schemasAfterImports.add(extraSchema);
                schemaAllAreInline = false;
            }
        }
        if (anyOf != null) {
            for (CodegenSchema someSchema: anyOf) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports,level + 1, propertyInputTypesUnique);
            }
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "anyOfType";
            extraSchema.anyOf = anyOf;
            if (anyOf.allAreInline()) {
                schemasBeforeImports.add(extraSchema);
            } else {
                schemasAfterImports.add(extraSchema);
                schemaAllAreInline = false;
            }
        }
        if (constInfo != null) {
            // write the class as a separate entity so enum values do not collide with
            // json schema keywords
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.jsonPathPiece = jsonPathPiece;
            extraSchema.instanceType = "enumClass";
            extraSchema.enumInfo = constInfo;
            schemasBeforeImports.add(extraSchema);
        }
        if (contains != null) {
            contains.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (dependentSchemas != null) {
            for (CodegenSchema someSchema: dependentSchemas.values()) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            }
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "propertiesType";
            extraSchema.properties = dependentSchemas;
            if (dependentSchemas.allAreInline()) {
                schemasBeforeImports.add(extraSchema);
            } else {
                schemasAfterImports.add(extraSchema);
                schemaAllAreInline = false;
            }
        }
        if (else_ != null) {
            else_.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (enumInfo != null) {
            // write the class as a separate entity so enum values do not collide with
            // json schema keywords
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.jsonPathPiece = jsonPathPiece;
            extraSchema.instanceType = "enumClass";
            extraSchema.enumInfo = enumInfo;
            schemasBeforeImports.add(extraSchema);
        }
        if (if_ != null) {
            if_.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (items != null) {
            items.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "arrayOutputType";
            extraSchema.items = items;
            extraSchema.arrayOutputJsonPathPiece = arrayOutputJsonPathPiece;
            // needed to define input type for new method
            extraSchema.arrayInputJsonPathPiece = arrayInputJsonPathPiece;
            // needed to invoke Schema validation from the output class
            extraSchema.jsonPathPiece = jsonPathPiece;
            extraSchema.jsonPath = jsonPath;
            if (items.hasAnyRefs()) {
                schemaAllAreInline = false;
                schemasAfterImports.add(extraSchema);
            } else {
                schemasBeforeImports.add(extraSchema);
            }
        }
        if (arrayInputJsonPathPiece != null) {
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "arrayInputType";
            extraSchema.items = items;
            extraSchema.arrayInputJsonPathPiece = arrayInputJsonPathPiece;
            extraSchema.jsonPath = jsonPath; // needed to prevent recursion when rendering template data type
            if (items.hasAnyRefs()) {
                schemasAfterImports.add(extraSchema);
            } else {
                schemasBeforeImports.add(extraSchema);
            }
        }
        if (not != null) {
            not.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (oneOf != null) {
            for (CodegenSchema someSchema: oneOf) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            }
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "oneOfType";
            extraSchema.oneOf = oneOf;
            if (oneOf.allAreInline()) {
                schemasBeforeImports.add(extraSchema);
            } else {
                schemasAfterImports.add(extraSchema);
                schemaAllAreInline = false;
            }
        }
        if (patternProperties != null) {
            for (CodegenSchema someSchema: patternProperties.values()) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            }
        }
        if (prefixItems != null) {
            for (CodegenSchema someSchema: prefixItems) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            }
        }
        if (properties != null) {
            for (CodegenSchema someSchema: properties.values()) {
                someSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
            }
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "propertiesType";
            extraSchema.properties = properties;
            if (properties.allAreInline()) {
                schemasBeforeImports.add(extraSchema);
            } else {
                schemasAfterImports.add(extraSchema);
                schemaAllAreInline = false;
            }
        }
        boolean additionalPropertiesIsBooleanSchemaFalse = (additionalProperties != null && additionalProperties.isBooleanSchemaFalse);
        boolean typedDictUseCase = (requiredProperties != null && additionalPropertiesIsBooleanSchemaFalse);
        boolean mappingUseCase = (requiredProperties != null && !additionalPropertiesIsBooleanSchemaFalse && optionalProperties == null);
        boolean generateRequiredInOutTypes;
        if (propertyInputTypesUnique) {
            generateRequiredInOutTypes = requiredProperties != null && optionalProperties == null;
        } else {
            generateRequiredInOutTypes = typedDictUseCase || mappingUseCase;
        }
        if (generateRequiredInOutTypes) {
            CodegenSchema mapIn = new CodegenSchema();
            mapIn.instanceType = "requiredPropertiesInputType";
            mapIn.requiredProperties = requiredProperties;
            mapIn.additionalProperties = additionalProperties;
            mapIn.mapInputJsonPathPiece = mapInputJsonPathPiece;
            mapIn.mapValueSchema = mapValueSchema;
            mapIn.jsonPath = jsonPath;

            CodegenSchema mapOut = new CodegenSchema();
            mapOut.instanceType = "propertiesOutputType";
            mapOut.requiredProperties = requiredProperties;
            mapOut.additionalProperties = additionalProperties;
            mapOut.mapOutputJsonPathPiece = mapOutputJsonPathPiece;
            mapOut.properties = properties;
            mapOut.mapValueSchema = mapValueSchema;
            // inputs needed for Schema validate invocation in new method
            mapOut.mapInputJsonPathPiece = mapInputJsonPathPiece;
            mapOut.jsonPathPiece = jsonPathPiece;
            if (requiredProperties.allAreInline()) {
                if (mapOutputJsonPathPiece != mapInputJsonPathPiece && optionalProperties == null) {
                    schemasBeforeImports.add(mapOut);
                }
                schemasBeforeImports.add(mapIn);
            } else {
                if (mapOutputJsonPathPiece != mapInputJsonPathPiece && optionalProperties == null) {
                    schemasAfterImports.add(mapOut);
                    schemaAllAreInline = false;
                }
                schemasAfterImports.add(mapIn);
            }
        }
        typedDictUseCase = (optionalProperties != null && additionalPropertiesIsBooleanSchemaFalse);
        mappingUseCase = (optionalProperties != null && !additionalPropertiesIsBooleanSchemaFalse && requiredProperties == null);
        boolean generateOptionalInOutTypes;
        if (propertyInputTypesUnique) {
            generateOptionalInOutTypes = optionalProperties != null && requiredProperties == null;
        } else {
            generateOptionalInOutTypes = typedDictUseCase || mappingUseCase;
        }
        if (generateOptionalInOutTypes) {
            CodegenSchema mapIn = new CodegenSchema();
            mapIn.instanceType = "optionalPropertiesInputType";
            mapIn.optionalProperties = optionalProperties;
            mapIn.additionalProperties = additionalProperties;
            mapIn.mapInputJsonPathPiece = mapInputJsonPathPiece;
            mapIn.mapValueSchema = mapValueSchema;
            mapIn.jsonPath = jsonPath;

            CodegenSchema mapOut = new CodegenSchema();
            mapOut.instanceType = "propertiesOutputType";
            mapOut.optionalProperties = optionalProperties;
            mapOut.additionalProperties = additionalProperties;
            mapOut.mapOutputJsonPathPiece = mapOutputJsonPathPiece;
            mapOut.properties = properties;
            mapOut.mapValueSchema = mapValueSchema;
            // inputs needed for Schema validate invocation in new method
            mapOut.mapInputJsonPathPiece = mapInputJsonPathPiece;
            mapOut.jsonPathPiece = jsonPathPiece;
            if (optionalProperties.allAreInline()) {
                if (mapOutputJsonPathPiece != mapInputJsonPathPiece && requiredProperties == null) {
                    schemasBeforeImports.add(mapOut);
                }
                schemasBeforeImports.add(mapIn);
            } else {
                if (mapOutputJsonPathPiece != mapInputJsonPathPiece && requiredProperties == null) {
                    schemasAfterImports.add(mapOut);
                    schemaAllAreInline = false;
                }
                schemasAfterImports.add(mapIn);
            }
        }
        boolean requiredPropsAndOptionalPropsSet = (requiredProperties != null && optionalProperties != null);
        boolean requiredPropsAndOptionalPropsUnset = (requiredProperties == null && optionalProperties == null);
        if ((requiredPropsAndOptionalPropsSet || requiredPropsAndOptionalPropsUnset) && mapInputJsonPathPiece != null) {
            CodegenSchema mapIn = new CodegenSchema();
            mapIn.instanceType = "propertiesInputType";
            mapIn.optionalProperties = optionalProperties;
            mapIn.requiredProperties = requiredProperties;
            mapIn.additionalProperties = additionalProperties;
            mapIn.mapInputJsonPathPiece = mapInputJsonPathPiece;
            mapIn.mapValueSchema = mapValueSchema;
            boolean allAreInline;
            boolean addPropsHasAnyRefs = false;
            if (additionalProperties != null) {
                addPropsHasAnyRefs = additionalProperties.hasAnyRefs();
            }
            if (requiredPropsAndOptionalPropsSet) {
                if (additionalProperties == null) {
                    allAreInline = (requiredProperties.allAreInline() && optionalProperties.allAreInline());
                } else {
                    allAreInline = (requiredProperties.allAreInline() && optionalProperties.allAreInline() && !addPropsHasAnyRefs);
                }
            } else {
                if (additionalProperties == null) {
                    allAreInline = true;
                } else {
                    allAreInline = !addPropsHasAnyRefs;
                }
            }
            CodegenSchema mapOut = new CodegenSchema();
            mapOut.instanceType = "propertiesOutputType";
            mapOut.optionalProperties = optionalProperties;
            mapOut.requiredProperties = requiredProperties;
            mapOut.properties = properties;
            mapOut.additionalProperties = additionalProperties;
            mapOut.mapOutputJsonPathPiece = mapOutputJsonPathPiece;
            mapOut.mapValueSchema = mapValueSchema;
            // inputs needed for Schema validate invocation in new method
            mapOut.mapInputJsonPathPiece = mapInputJsonPathPiece;
            mapOut.jsonPathPiece = jsonPathPiece;
            if (allAreInline) {
                if (mapOutputJsonPathPiece != mapInputJsonPathPiece) {
                    schemasBeforeImports.add(mapOut);
                }
                schemasBeforeImports.add(mapIn);
            } else {
                if (mapOutputJsonPathPiece != mapInputJsonPathPiece) {
                    schemasAfterImports.add(mapOut);
                    schemaAllAreInline = false;
                }
                schemasAfterImports.add(mapIn);
            }
        }
        if (propertyNames != null) {
            propertyNames.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (then != null) {
            then.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (unevaluatedItems != null) {
            unevaluatedItems.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        if (unevaluatedProperties != null) {
            unevaluatedProperties.getAllSchemas(schemasBeforeImports, schemasAfterImports, level + 1, propertyInputTypesUnique);
        }
        // end of keyword section

        if (refInfo != null && level > 0) {
            // do not add ref to schemas
            return;
        }
        if (schemaAllAreInline) {
            schemasBeforeImports.add(this);
        } else {
            schemasAfterImports.add(this);
        }
        if (level == 0 && imports != null && !imports.isEmpty()) {
            CodegenSchema extraSchema = new CodegenSchema();
            extraSchema.instanceType = "importsType";
            extraSchema.imports = imports;
            schemasBeforeImports.add(extraSchema);
        }
    }

    public ArrayList<CodegenSchema> getSchemas() {
        if (allSchemas == null) {
            ArrayList<CodegenSchema> schemasBeforeImports = new ArrayList<>();
            ArrayList<CodegenSchema> schemasAfterImports = new ArrayList<>();
            getAllSchemas(schemasBeforeImports, schemasAfterImports, 0, false);
            schemasBeforeImports.addAll(schemasAfterImports);
            allSchemas = schemasBeforeImports;
        }
        return allSchemas;
    }

    public ArrayList<CodegenSchema> getJavaSchemas() {
        // for Java, requiredProperties, optionalProperties, and propertiesInput must
        // each be returned only once for a schema
        // for python, they can be returned multiple times
        if (allSchemas == null) {
            ArrayList<CodegenSchema> schemasBeforeImports = new ArrayList<>();
            ArrayList<CodegenSchema> schemasAfterImports = new ArrayList<>();
            getAllSchemas(schemasBeforeImports, schemasAfterImports, 0, true);
            schemasBeforeImports.addAll(schemasAfterImports);
            allSchemas = schemasBeforeImports;
        }
        return allSchemas;
    }

    public boolean isComplicated() {
        // used by templates

        if (allOf != null || anyOf != null || oneOf != null || not != null) {
            return true;
        }
        return types != null && (types.contains("array") || types.contains("object"));
    }

    protected void addInstanceInfo(StringBuilder sb) {
        sb.append(", description='").append(description).append('\'');
        sb.append(", jsonPathPiece='").append(jsonPathPiece).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", title='").append(title).append('\'');
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
        sb.append(", readOnly=").append(readOnly);
        sb.append(", writeOnly=").append(writeOnly);
        sb.append(", nullable=").append(nullable);
        sb.append(", allowableValues=").append(enumInfo);
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
        sb.append(", instanceType=").append(instanceType);
        sb.append(", jsonPath=").append(jsonPath);
        sb.append(", arrayOutputJsonPathPiece=").append(arrayOutputJsonPathPiece);
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
                Objects.equals(maxLength, that.maxLength) &&
                Objects.equals(minLength, that.minLength) &&
                Objects.equals(patternInfo, that.patternInfo) &&
                Objects.equals(example, that.example) &&
                Objects.equals(minimum, that.minimum) &&
                Objects.equals(maximum, that.maximum) &&
                Objects.equals(enumInfo, that.enumInfo) &&
                Objects.equals(items, that.items) &&
                Objects.equals(additionalProperties, that.additionalProperties) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(maxItems, that.maxItems) &&
                Objects.equals(minItems, that.minItems) &&
                Objects.equals(multipleOf, that.multipleOf) &&
                Objects.equals(mapOutputJsonPathPiece, that.mapOutputJsonPathPiece) &&
                Objects.equals(arrayOutputJsonPathPiece, that.arrayInputJsonPathPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
                jsonPathPiece, defaultValue,
                title,
                maxLength, minLength, patternInfo, example, minimum, maximum,
                exclusiveMinimum, exclusiveMaximum, deprecated, types,
                readOnly, writeOnly, nullable,
                enumInfo, items, additionalProperties,
                vendorExtensions, maxItems, minItems, xml,
                schemaIsFromAdditionalProperties, isBooleanSchemaTrue, isBooleanSchemaFalse,
                format, dependentRequired, contains, allOf, anyOf, oneOf, not,
                properties, optionalProperties, requiredProperties, externalDocumentation,
                discriminator, imports, componentModule, testCases, refInfo);
    }
}
