package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

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

public abstract class JsonSchema {
    public final @Nullable Set<Class<?>> type;
    public final @Nullable String format;
    public final @Nullable Class<? extends JsonSchema> items;
    public final @Nullable Map<String, Class<? extends JsonSchema>> properties;
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
    public final @Nullable Class<? extends JsonSchema> additionalProperties;
    public final @Nullable List<Class<? extends JsonSchema>> allOf;
    public final @Nullable List<Class<? extends JsonSchema>> anyOf;
    public final @Nullable List<Class<? extends JsonSchema>> oneOf;
    public final @Nullable Class<? extends JsonSchema> not;
    public final @Nullable Boolean uniqueItems;
    public final @Nullable Set<Object> enumValues;
    public final @Nullable Pattern pattern;
    private final @NonNull LinkedHashMap<String, KeywordValidator> keywordToValidator;

    protected JsonSchema(JsonSchemaInfo jsonSchemaInfo) {
        LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>();
        this.type = jsonSchemaInfo.type;
        if (this.type != null) {
            keywordToValidator.put(
                    "type",
                    new TypeValidator(this.type)
            );
        }
        this.format = jsonSchemaInfo.format;
        if (this.format != null) {
            keywordToValidator.put(
                    "format",
                    new FormatValidator(this.format)
            );
        }
        this.items = jsonSchemaInfo.items;
        if (this.items != null) {
            keywordToValidator.put(
                    "items",
                    new ItemsValidator(this.items)
            );
        }
        this.properties = jsonSchemaInfo.properties;
        if (this.properties != null) {
            keywordToValidator.put(
                    "properties",
                    new PropertiesValidator(this.properties)
            );
        }
        this.required = jsonSchemaInfo.required;
        if (this.required != null) {
            keywordToValidator.put(
                    "required",
                    new RequiredValidator(this.required)
            );
        }
        this.exclusiveMaximum = jsonSchemaInfo.exclusiveMaximum;
        if (this.exclusiveMaximum != null) {
            keywordToValidator.put(
                    "exclusiveMaximum",
                    new ExclusiveMaximumValidator(this.exclusiveMaximum)
            );
        }
        this.exclusiveMinimum = jsonSchemaInfo.exclusiveMinimum;
        if (this.exclusiveMinimum != null) {
            keywordToValidator.put(
                    "exclusiveMinimum",
                    new ExclusiveMinimumValidator(this.exclusiveMinimum)
            );
        }
        this.maxItems = jsonSchemaInfo.maxItems;
        if (this.maxItems != null) {
            keywordToValidator.put(
                    "maxItems",
                    new MaxItemsValidator(this.maxItems)
            );
        }
        this.minItems = jsonSchemaInfo.minItems;
        if (this.minItems != null) {
            keywordToValidator.put(
                    "minItems",
                    new MinItemsValidator(this.minItems)
            );
        }
        this.maxLength = jsonSchemaInfo.maxLength;
        if (this.maxLength != null) {
            keywordToValidator.put(
                    "maxLength",
                    new MaxLengthValidator(this.maxLength)
            );
        }
        this.minLength = jsonSchemaInfo.minLength;
        if (this.minLength != null) {
            keywordToValidator.put(
                    "minLength",
                    new MinLengthValidator(this.minLength)
            );
        }
        this.maxProperties = jsonSchemaInfo.maxProperties;
        if (this.maxProperties != null) {
            keywordToValidator.put(
                    "maxProperties",
                    new MaxPropertiesValidator(this.maxProperties)
            );
        }
        this.minProperties = jsonSchemaInfo.minProperties;
        if (this.minProperties != null) {
            keywordToValidator.put(
                    "minProperties",
                    new MinPropertiesValidator(this.minProperties)
            );
        }
        this.maximum = jsonSchemaInfo.maximum;
        if (this.maximum != null) {
            keywordToValidator.put(
                    "maximum",
                    new MaximumValidator(this.maximum)
            );
        }
        this.minimum = jsonSchemaInfo.minimum;
        if (this.minimum != null) {
            keywordToValidator.put(
                    "minimum",
                    new MinimumValidator(this.minimum)
            );
        }
        this.multipleOf = jsonSchemaInfo.multipleOf;
        if (this.multipleOf != null) {
            keywordToValidator.put(
                    "multipleOf",
                    new MultipleOfValidator(this.multipleOf)
            );
        }
        this.additionalProperties = jsonSchemaInfo.additionalProperties;
        if (this.additionalProperties != null) {
            keywordToValidator.put(
                    "additionalProperties",
                    new AdditionalPropertiesValidator(this.additionalProperties)
            );
        }
        this.allOf = jsonSchemaInfo.allOf;
        if (this.allOf != null) {
            keywordToValidator.put(
                    "allOf",
                    new AllOfValidator(this.allOf)
            );
        }
        this.anyOf = jsonSchemaInfo.anyOf;
        if (this.anyOf != null) {
            keywordToValidator.put(
                    "anyOf",
                    new AnyOfValidator(this.anyOf)
            );
        }
        this.oneOf = jsonSchemaInfo.oneOf;
        if (this.oneOf != null) {
            keywordToValidator.put(
                    "oneOf",
                    new OneOfValidator(this.oneOf)
            );
        }
        this.not = jsonSchemaInfo.not;
        if (this.not != null) {
            keywordToValidator.put(
                    "not",
                    new NotValidator(this.not)
            );
        }
        this.uniqueItems = jsonSchemaInfo.uniqueItems;
        if (this.uniqueItems != null) {
            keywordToValidator.put(
                    "uniqueItems",
                    new UniqueItemsValidator(this.uniqueItems)
            );
        }
        this.enumValues = jsonSchemaInfo.enumValues;
        if (this.enumValues != null) {
            keywordToValidator.put(
                    "enum",
                    new EnumValidator(this.enumValues)
            );
        }
        this.pattern = jsonSchemaInfo.pattern;
        if (this.pattern != null) {
            keywordToValidator.put(
                    "pattern",
                    new PatternValidator(this.pattern)
            );
        }
        this.keywordToValidator = keywordToValidator;
    }

    public abstract Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);

    public static PathToSchemasMap validate(
            JsonSchema jsonSchema,
            Object arg,
            ValidationMetadata validationMetadata
    ) throws ValidationException {
        LinkedHashSet<String> disabledKeywords = validationMetadata.configuration().disabledKeywordFlags().getKeywords();
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        LinkedHashMap<String, KeywordValidator> thisKeywordToValidator = jsonSchema.keywordToValidator;
        for (Map.Entry<String, KeywordValidator> entry: thisKeywordToValidator.entrySet()) {
            String jsonKeyword = entry.getKey();
            if (disabledKeywords.contains(jsonKeyword)) {
               continue;
            }
            KeywordValidator validator = entry.getValue();
            PathToSchemasMap otherPathToSchemas = validator.validate(
                    jsonSchema,
                    arg,
                    validationMetadata
            );
            if (otherPathToSchemas == null) {
                continue;
            }
            pathToSchemas.update(otherPathToSchemas);
        }
        List<Object> pathToItem = validationMetadata.pathToItem();
        if (!pathToSchemas.containsKey(pathToItem)) {
            pathToSchemas.put(validationMetadata.pathToItem(), new LinkedHashMap<>());
        }
        @Nullable LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(pathToItem);
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

    protected List<?> castToAllowedTypes(List<?> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        List<Object> argFixed = new ArrayList<>();
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

    protected Map<?, ?> castToAllowedTypes(Map<?, ?> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry:  arg.entrySet()) {
            String key = (String) entry.getKey();
            Object val = arg.get(entry.getKey());
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(key);
            Object fixedVal = castToAllowedObjectTypes(val, newPathToItem, pathSet);
            argFixed.put(key, fixedVal);
        }
        return argFixed;
    }

    private Object castToAllowedObjectTypes(@Nullable Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
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
            throw new InvalidTypeException("Invalid type passed in for input="+arg+" type="+argClass);
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

    protected static PathToSchemasMap getPathToSchemas(JsonSchema jsonSchema, @Nullable Object arg, ValidationMetadata validationMetadata, Set<List<Object>> pathSet) {
        PathToSchemasMap pathToSchemasMap = new PathToSchemasMap();
        // todo add check of validationMetadata.validationRanEarlier(this)
        PathToSchemasMap otherPathToSchemas = validate(jsonSchema, arg, validationMetadata);
        pathToSchemasMap.update(otherPathToSchemas);
        for (var schemas: pathToSchemasMap.values()) {
            JsonSchema firstSchema = schemas.entrySet().iterator().next().getKey();
            schemas.clear();
            schemas.put(firstSchema, null);
        }
        pathSet.removeAll(pathToSchemasMap.keySet());
        if (!pathSet.isEmpty()) {
            LinkedHashMap<JsonSchema, Void> unsetAnyTypeSchema = new LinkedHashMap<>();
            unsetAnyTypeSchema.put(UnsetAnyTypeJsonSchema.getInstance(), null);
            for (List<Object> pathToItem: pathSet) {
                pathToSchemasMap.put(pathToItem, unsetAnyTypeSchema);
            }
        }
        return pathToSchemasMap;
    }

   // todo add bytes and FileIO
}