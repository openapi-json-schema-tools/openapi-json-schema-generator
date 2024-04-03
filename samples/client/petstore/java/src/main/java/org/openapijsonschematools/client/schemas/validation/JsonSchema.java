package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

public abstract class JsonSchema<T> {
    public final @Nullable Set<Class<?>> type;
    public final @Nullable String format;
    public final @Nullable Class<? extends JsonSchema<?>> items;
    public final @Nullable Map<String, Class<? extends JsonSchema<?>>> properties;
    public final @Nullable Set<String> required;
    public final @Nullable Number exclusiveMaximum;
    public final @Nullable Number exclusiveMinimum;
    public final @Nullable Integer maxItems;
    public final @Nullable Integer minItems;
    public final @Nullable Integer maxLength;
    public final @Nullable Integer minLength;
    public final @Nullable Integer maxProperties;
    public final @Nullable Integer minProperties;
    public final @Nullable Number maximum;
    public final @Nullable Number minimum;
    public final @Nullable BigDecimal multipleOf;
    public final @Nullable Class<? extends JsonSchema<?>> additionalProperties;
    public final @Nullable List<Class<? extends JsonSchema<?>>> allOf;
    public final @Nullable List<Class<? extends JsonSchema<?>>> anyOf;
    public final @Nullable List<Class<? extends JsonSchema<?>>> oneOf;
    public final @Nullable Class<? extends JsonSchema<?>> not;
    public final @Nullable Boolean uniqueItems;
    public final @Nullable Set<@Nullable Object> enumValues;
    public final @Nullable Pattern pattern;
    public final @Nullable Object defaultValue;
    public final boolean defaultValueSet;
    public final @Nullable Object constValue;
    public final boolean constValueSet;
    public final @Nullable Class<? extends JsonSchema<?>> contains;
    public final @Nullable Integer maxContains;
    public final @Nullable Integer minContains;
    public final @Nullable Class<? extends JsonSchema<?>> propertyNames;
    public final @Nullable Map<String, Set<String>> dependentRequired;
    public final @Nullable Map<String, Class<? extends JsonSchema<?>>> dependentSchemas;
    public final @Nullable Map<Pattern, Class<? extends JsonSchema<?>>> patternProperties;
    public final @Nullable List<Class<? extends JsonSchema<?>>> prefixItems;
    public final @Nullable Class<? extends JsonSchema<?>> ifSchema;
    public final @Nullable Class<? extends JsonSchema<?>> then;
    public final @Nullable Class<? extends JsonSchema<?>> elseSchema;
    public final @Nullable Class<? extends JsonSchema<?>> unevaluatedItems;
    public final @Nullable Class<? extends JsonSchema<?>> unevaluatedProperties;
    private final LinkedHashMap<String, KeywordValidator> keywordToValidator;

    protected JsonSchema(JsonSchemaInfo jsonSchemaInfo) {
        LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>();
        this.type = jsonSchemaInfo.type;
        if (this.type != null) {
            keywordToValidator.put("type", new TypeValidator());
        }
        this.format = jsonSchemaInfo.format;
        if (this.format != null) {
            keywordToValidator.put("format", new FormatValidator());
        }
        this.items = jsonSchemaInfo.items;
        if (this.items != null) {
            keywordToValidator.put("items", new ItemsValidator());
        }
        this.properties = jsonSchemaInfo.properties;
        if (this.properties != null) {
            keywordToValidator.put("properties", new PropertiesValidator());
        }
        this.required = jsonSchemaInfo.required;
        if (this.required != null) {
            keywordToValidator.put("required", new RequiredValidator());
        }
        this.exclusiveMaximum = jsonSchemaInfo.exclusiveMaximum;
        if (this.exclusiveMaximum != null) {
            keywordToValidator.put("exclusiveMaximum", new ExclusiveMaximumValidator());
        }
        this.exclusiveMinimum = jsonSchemaInfo.exclusiveMinimum;
        if (this.exclusiveMinimum != null) {
            keywordToValidator.put("exclusiveMinimum", new ExclusiveMinimumValidator());
        }
        this.maxItems = jsonSchemaInfo.maxItems;
        if (this.maxItems != null) {
            keywordToValidator.put("maxItems", new MaxItemsValidator());
        }
        this.minItems = jsonSchemaInfo.minItems;
        if (this.minItems != null) {
            keywordToValidator.put("minItems", new MinItemsValidator());
        }
        this.maxLength = jsonSchemaInfo.maxLength;
        if (this.maxLength != null) {
            keywordToValidator.put("maxLength", new MaxLengthValidator());
        }
        this.minLength = jsonSchemaInfo.minLength;
        if (this.minLength != null) {
            keywordToValidator.put("minLength", new MinLengthValidator());
        }
        this.maxProperties = jsonSchemaInfo.maxProperties;
        if (this.maxProperties != null) {
            keywordToValidator.put("maxProperties", new MaxPropertiesValidator());
        }
        this.minProperties = jsonSchemaInfo.minProperties;
        if (this.minProperties != null) {
            keywordToValidator.put("minProperties", new MinPropertiesValidator());
        }
        this.maximum = jsonSchemaInfo.maximum;
        if (this.maximum != null) {
            keywordToValidator.put("maximum", new MaximumValidator());
        }
        this.minimum = jsonSchemaInfo.minimum;
        if (this.minimum != null) {
            keywordToValidator.put("minimum", new MinimumValidator());
        }
        this.multipleOf = jsonSchemaInfo.multipleOf;
        if (this.multipleOf != null) {
            keywordToValidator.put("multipleOf", new MultipleOfValidator());
        }
        this.additionalProperties = jsonSchemaInfo.additionalProperties;
        if (this.additionalProperties != null) {
            keywordToValidator.put("additionalProperties", new AdditionalPropertiesValidator());
        }
        this.allOf = jsonSchemaInfo.allOf;
        if (this.allOf != null) {
            keywordToValidator.put("allOf", new AllOfValidator());
        }
        this.anyOf = jsonSchemaInfo.anyOf;
        if (this.anyOf != null) {
            keywordToValidator.put("anyOf", new AnyOfValidator());
        }
        this.oneOf = jsonSchemaInfo.oneOf;
        if (this.oneOf != null) {
            keywordToValidator.put("oneOf", new OneOfValidator());
        }
        this.not = jsonSchemaInfo.not;
        if (this.not != null) {
            keywordToValidator.put("not", new NotValidator());
        }
        this.uniqueItems = jsonSchemaInfo.uniqueItems;
        if (this.uniqueItems != null) {
            keywordToValidator.put("uniqueItems", new UniqueItemsValidator());
        }
        this.enumValues = jsonSchemaInfo.enumValues;
        if (this.enumValues != null) {
            keywordToValidator.put("enum", new EnumValidator());
        }
        this.pattern = jsonSchemaInfo.pattern;
        if (this.pattern != null) {
            keywordToValidator.put("pattern", new PatternValidator());
        }
        this.defaultValue = jsonSchemaInfo.defaultValue;
        this.defaultValueSet = jsonSchemaInfo.defaultValueSet;
        this.constValue = jsonSchemaInfo.constValue;
        this.constValueSet = jsonSchemaInfo.constValueSet;
        if (this.constValueSet) {
            keywordToValidator.put("const", new ConstValidator());
        }
        this.contains = jsonSchemaInfo.contains;
        if (this.contains != null) {
            keywordToValidator.put("contains", new ContainsValidator());
        }
        this.maxContains = jsonSchemaInfo.maxContains;
        if (this.maxContains != null) {
            keywordToValidator.put("maxContains", new MaxContainsValidator());
        }
        this.minContains = jsonSchemaInfo.minContains;
        if (this.minContains != null) {
            keywordToValidator.put("minContains", new MinContainsValidator());
        }
        this.propertyNames = jsonSchemaInfo.propertyNames;
        if (this.propertyNames != null) {
            keywordToValidator.put("propertyNames", new PropertyNamesValidator());
        }
        this.dependentRequired = jsonSchemaInfo.dependentRequired;
        if (this.dependentRequired != null) {
            keywordToValidator.put("dependentRequired", new DependentRequiredValidator());
        }
        this.dependentSchemas = jsonSchemaInfo.dependentSchemas;
        if (this.dependentSchemas != null) {
            keywordToValidator.put("dependentSchemas", new DependentSchemasValidator());
        }
        this.patternProperties = jsonSchemaInfo.patternProperties;
        if (this.patternProperties != null) {
            keywordToValidator.put("patternProperties", new PatternPropertiesValidator());
        }
        this.prefixItems = jsonSchemaInfo.prefixItems;
        if (this.prefixItems != null) {
            keywordToValidator.put("prefixItems", new PrefixItemsValidator());
        }
        this.ifSchema = jsonSchemaInfo.ifSchema;
        if (this.ifSchema != null) {
            keywordToValidator.put("if", new IfValidator());
        }
        this.then = jsonSchemaInfo.then;
        if (this.then != null) {
            keywordToValidator.put("then", new ThenValidator());
        }
        this.elseSchema = jsonSchemaInfo.elseSchema;
        if (this.elseSchema != null) {
            keywordToValidator.put("else", new ElseValidator());
        }
        this.unevaluatedItems = jsonSchemaInfo.unevaluatedItems;
        if (this.unevaluatedItems != null) {
            keywordToValidator.put("unevaluatedItems", new UnevaluatedItemsValidator());
        }
        this.unevaluatedProperties = jsonSchemaInfo.unevaluatedProperties;
        if (this.unevaluatedProperties != null) {
            keywordToValidator.put("unevaluatedProperties", new UnevaluatedPropertiesValidator());
        }
        this.keywordToValidator = keywordToValidator;
    }

    public abstract @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);
    public abstract @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException;
    public abstract T validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException;

    private List<PathToSchemasMap> getContainsPathToSchemas(
            @Nullable Object arg,
            ValidationMetadata validationMetadata
    ) {
        if (!(arg instanceof List<?> listArg) || contains == null) {
            return new ArrayList<>();
        }
        JsonSchema<?> containsSchema = JsonSchemaFactory.getInstance(contains);
        @Nullable List<PathToSchemasMap> containsPathToSchemas = new ArrayList<>();
        for(int i = 0; i < listArg.size(); i++) {
            PathToSchemasMap thesePathToSchemas = new PathToSchemasMap();
            List<Object> itemPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            itemPathToItem.add(i);
            ValidationMetadata itemValidationMetadata = new ValidationMetadata(
                    itemPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
            if (itemValidationMetadata.validationRanEarlier(containsSchema)) {
                // todo add_deeper_validated_schemas
                containsPathToSchemas.add(thesePathToSchemas);
                continue;
            }

            try {
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(
                        containsSchema, listArg.get(i), itemValidationMetadata);
                containsPathToSchemas.add(otherPathToSchemas);
            } catch (ValidationException ignored) {}
        }
        return containsPathToSchemas;
    }

    private PathToSchemasMap getPatternPropertiesPathToSchemas(
            @Nullable Object arg,
            ValidationMetadata validationMetadata
    ) throws ValidationException {
        if (!(arg instanceof Map<?, ?> mapArg) || patternProperties == null) {
            return new PathToSchemasMap();
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for (Map.Entry<?, ?> entry: mapArg.entrySet()) {
            Object entryKey = entry.getKey();
            if (!(entryKey instanceof String key)) {
                throw new ValidationException("Invalid non-string type for map key");
            }
            List<Object> propPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            propPathToItem.add(key);
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
            for (Map.Entry<Pattern, Class<? extends JsonSchema<?>>> patternPropEntry: patternProperties.entrySet()) {
                if (!patternPropEntry.getKey().matcher(key).find()) {
                    continue;
                }

                Class<? extends JsonSchema<?>> patternPropClass = patternPropEntry.getValue();
                JsonSchema<?> patternPropSchema = JsonSchemaFactory.getInstance(patternPropClass);
                PathToSchemasMap otherPathToSchemas = JsonSchema.validate(patternPropSchema, entry.getValue(), propValidationMetadata);
                pathToSchemas.update(otherPathToSchemas);
            }
        }
        return pathToSchemas;
    }

    private PathToSchemasMap getIfPathToSchemas(
            @Nullable Object arg,
            ValidationMetadata validationMetadata
    ) {
        if (ifSchema == null) {
            return new PathToSchemasMap();
        }
        JsonSchema<?> ifSchemaInstance = JsonSchemaFactory.getInstance(ifSchema);
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        try {
            var otherPathToSchemas = JsonSchema.validate(ifSchemaInstance, arg, validationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        } catch (ValidationException ignored) {}
        return pathToSchemas;
    }

    public static PathToSchemasMap validate(
            JsonSchema<?> jsonSchema,
            @Nullable Object arg,
            ValidationMetadata validationMetadata
    ) throws ValidationException {
        LinkedHashSet<String> disabledKeywords = validationMetadata.configuration().disabledKeywordFlags().getKeywords();
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        LinkedHashMap<String, KeywordValidator> thisKeywordToValidator = jsonSchema.keywordToValidator;
        @Nullable List<PathToSchemasMap> containsPathToSchemas = null;
        if (thisKeywordToValidator.containsKey("contains")) {
            containsPathToSchemas = jsonSchema.getContainsPathToSchemas(arg, validationMetadata);
        }
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas = null;
        if (thisKeywordToValidator.containsKey("patternProperties")) {
            patternPropertiesPathToSchemas = jsonSchema.getPatternPropertiesPathToSchemas(arg, validationMetadata);
        }
        @Nullable PathToSchemasMap ifPathToSchemas = null;
        if (thisKeywordToValidator.containsKey("if")) {
            ifPathToSchemas = jsonSchema.getIfPathToSchemas(arg, validationMetadata);
        }
        @Nullable PathToSchemasMap knownPathToSchemas = null;
        for (Map.Entry<String, KeywordValidator> entry: thisKeywordToValidator.entrySet()) {
            String jsonKeyword = entry.getKey();
            if (disabledKeywords.contains(jsonKeyword)) {
                boolean typeIntegerUseCase = jsonKeyword.equals("format") && "int".equals(jsonSchema.format);
                if (!typeIntegerUseCase) {
                    continue;
                }
            }
            if ("unevaluatedItems".equals(jsonKeyword) || "unevaluatedProperties".equals(jsonKeyword)) {
                knownPathToSchemas = pathToSchemas;
            }
            KeywordValidator validator = entry.getValue();
            ValidationData data = new ValidationData(
                    jsonSchema,
                    arg,
                    validationMetadata,
                    containsPathToSchemas,
                    patternPropertiesPathToSchemas,
                    ifPathToSchemas,
                    knownPathToSchemas
            );
            @Nullable PathToSchemasMap otherPathToSchemas = validator.validate(data);
            if (otherPathToSchemas == null) {
                continue;
            }
            pathToSchemas.update(otherPathToSchemas);
        }
        List<Object> pathToItem = validationMetadata.pathToItem();
        if (!pathToSchemas.containsKey(pathToItem)) {
            pathToSchemas.put(validationMetadata.pathToItem(), new LinkedHashMap<>());
        }
        @Nullable LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(pathToItem);
        if (schemas != null) {
            schemas.put(jsonSchema, null);
        }
        return pathToSchemas;
    }

    protected String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected Boolean castToAllowedTypes(Boolean arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected Void castToAllowedTypes(Void arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected List<?> castToAllowedTypes(List<?> arg, List<Object> pathToItem, Set<List<Object>> pathSet) throws ValidationException {
        pathSet.add(pathToItem);
        List<@Nullable Object> argFixed = new ArrayList<>();
        int i =0;
        for (Object item: arg) {
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(i);
            Object fixedVal = castToAllowedObjectTypes(item, newPathToItem, pathSet);
            argFixed.add(fixedVal);
            i += 1;
        }
        return argFixed;
    }

    protected Map<?, ?> castToAllowedTypes(Map<?, ?> arg, List<Object> pathToItem, Set<List<Object>> pathSet) throws ValidationException {
        pathSet.add(pathToItem);
        LinkedHashMap<String, @Nullable Object> argFixed = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry:  arg.entrySet()) {
            @Nullable Object entryKey = entry.getKey();
            if (!(entryKey instanceof String key)) {
                throw new ValidationException("Invalid non-string key value");
            }
            Object val = entry.getValue();
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(key);
            Object fixedVal = castToAllowedObjectTypes(val, newPathToItem, pathSet);
            argFixed.put(key, fixedVal);
        }
        return argFixed;
    }

    private @Nullable Object castToAllowedObjectTypes(@Nullable Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) throws ValidationException {
        if (arg == null) {
            return castToAllowedTypes((Void) null, pathToItem, pathSet);
        } else if (arg instanceof String) {
            return castToAllowedTypes((String) arg, pathToItem, pathSet);
        } else if (arg instanceof Map) {
            pathSet.add(pathToItem);
            return castToAllowedTypes((Map<?, ?>) arg, pathToItem, pathSet);
        } else if (arg instanceof Boolean) {
            return castToAllowedTypes((Boolean) arg, pathToItem, pathSet);
        } else if (arg instanceof Integer) {
            return castToAllowedTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof Long) {
            return castToAllowedTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof Float) {
            return castToAllowedTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof Double) {
            return castToAllowedTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof List) {
            return castToAllowedTypes((List<?>) arg, pathToItem, pathSet);
        } else if (arg instanceof ZonedDateTime) {
            return castToAllowedTypes(arg.toString(), pathToItem, pathSet);
        } else if (arg instanceof LocalDate) {
            return castToAllowedTypes(arg.toString(), pathToItem, pathSet);
        } else if (arg instanceof UUID) {
            return castToAllowedTypes(arg.toString(), pathToItem, pathSet);
        } else {
            Class<?> argClass = arg.getClass();
            throw new ValidationException("Invalid type passed in for input="+arg+" type="+argClass);
        }
    }

    public Void getNewInstance(Void arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public boolean getNewInstance(boolean arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    protected static PathToSchemasMap getPathToSchemas(JsonSchema<?> jsonSchema, @Nullable Object arg, ValidationMetadata validationMetadata, Set<List<Object>> pathSet) throws ValidationException {
        PathToSchemasMap pathToSchemasMap = new PathToSchemasMap();
        // todo add check of validationMetadata.validationRanEarlier(this)
        PathToSchemasMap otherPathToSchemas = validate(jsonSchema, arg, validationMetadata);
        pathToSchemasMap.update(otherPathToSchemas);
        for (var schemas: pathToSchemasMap.values()) {
            JsonSchema<?> firstSchema = schemas.entrySet().iterator().next().getKey();
            schemas.clear();
            schemas.put(firstSchema, null);
        }
        pathSet.removeAll(pathToSchemasMap.keySet());
        if (!pathSet.isEmpty()) {
            LinkedHashMap<JsonSchema<?>, Void> unsetAnyTypeSchema = new LinkedHashMap<>();
            unsetAnyTypeSchema.put(UnsetAnyTypeJsonSchema.UnsetAnyTypeJsonSchema1.getInstance(), null);
            for (List<Object> pathToItem: pathSet) {
                pathToSchemasMap.put(pathToItem, unsetAnyTypeSchema);
            }
        }
        return pathToSchemasMap;
    }

    public static String getClass(@Nullable Object arg) {
        if (arg == null) {
            return Void.class.getSimpleName();
        } else {
            return arg.getClass().getSimpleName();
        }
    }
    // todo add bytes and FileIO
}