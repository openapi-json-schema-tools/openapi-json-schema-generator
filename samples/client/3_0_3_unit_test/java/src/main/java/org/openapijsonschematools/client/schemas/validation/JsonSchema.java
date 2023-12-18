package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

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
    public final Set<Class<?>> type;
    public final String format;
    public final Class<? extends JsonSchema> items;
    public final Map<String, Class<? extends JsonSchema>> properties;
    public final Set<String> required;
    public final Number exclusiveMaximum;
    public final Number exclusiveMinimum;
    public final Integer maxItems;
    public final Integer minItems;
    public final Integer maxLength;
    public final Integer minLength;
    public final Integer maxProperties;
    public final Integer minProperties;
    public final Number maximum;
    public final Number minimum;
    public final BigDecimal multipleOf;
    public final Class<? extends JsonSchema> additionalProperties;
    public final List<Class<? extends JsonSchema>> allOf;
    public final List<Class<? extends JsonSchema>> anyOf;
    public final List<Class<? extends JsonSchema>> oneOf;
    public final Class<? extends JsonSchema> not;
    public final Boolean uniqueItems;
    public final Set<Object> enumValues;
    public final Pattern pattern;
    private final LinkedHashMap<String, KeywordValidator> keywordToValidator;

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

    public abstract Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas);

    public static PathToSchemasMap validate(
            JsonSchema jsonSchema,
            Object arg,
            ValidationMetadata validationMetadata
    ) throws ValidationException {
        LinkedHashSet<String> disabledKeywords = validationMetadata.configuration().disabledKeywordFlags().getKeywords();
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        LinkedHashMap<String, KeywordValidator> thisKeywordToValidator = jsonSchema.keywordToValidator;
        if (thisKeywordToValidator != null) {
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
        }
        List<Object> pathToItem = validationMetadata.pathToItem();
        if (!pathToSchemas.containsKey(pathToItem)) {
            pathToSchemas.put(validationMetadata.pathToItem(), new LinkedHashMap<>());
        }
        pathToSchemas.get(pathToItem).put(jsonSchema, null);

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

    protected FrozenList<?> castToAllowedTypes(List<?> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
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
        return new FrozenList<>(argFixed);
    }

    protected FrozenMap<?> castToAllowedTypes(Map<?, ?> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry:  arg.entrySet()) {
            String key = (String) entry.getKey();
            Object val = entry.getValue();
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(key);
            Object fixedVal = castToAllowedObjectTypes(val, newPathToItem, pathSet);
            argFixed.put(key, fixedVal);
        }
        return new FrozenMap<>(argFixed);
    }

    protected Object castToAllowedObjectTypes(Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
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

    protected static PathToSchemasMap getPathToSchemas(JsonSchema jsonSchema,  Object arg, ValidationMetadata validationMetadata, Set<List<Object>> pathSet) {
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

   /*
   protected <MapValueCastType, MapValueOutType> FrozenMap<String, MapValueOutType> getProperties(Map<String, MapValueCastType> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
      LinkedHashMap<String, MapValueOutType> properties = new LinkedHashMap<>();
      for(Map.Entry<String, MapValueCastType> entry: arg.entrySet()) {
         String propertyName = entry.getKey();
         List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
         propertyPathToItem.add(propertyName);
         MapValueCastType value = entry.getValue();
         JsonSchema<?, MapValueCastType, MapValueOutType> propertySchema = (JsonSchema<?, MapValueCastType, MapValueOutType>) pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
         MapValueOutType castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
         properties.put(propertyName, castValue);
      }
      return new FrozenMap<>(properties);
   }

   private <ListItemCastType, ListItemOutType> FrozenList<ListItemOutType> getItems(List<ListItemCastType> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
      ArrayList<ListItemOutType> items = new ArrayList<>();
      int i = 0;
      for (ListItemCastType item: arg) {
         List<Object> itemPathToItem = new ArrayList<>(pathToItem);
         itemPathToItem.add(i);
         JsonSchema<?, ListItemCastType, ListItemOutType> itemSchema = (JsonSchema<?, ListItemCastType, ListItemOutType>) pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
         ListItemOutType castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
         items.add(castItem);
         i += 1;
      }
      return new FrozenList<>(items);
   }
   */

   // todo add bytes and FileIO
}