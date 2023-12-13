package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public abstract class JsonSchema {
    public final LinkedHashMap<String, KeywordValidator> keywordToValidator;

    protected JsonSchema(LinkedHashMap<String, KeywordValidator> keywordToValidator) {
        this.keywordToValidator = keywordToValidator;
    }

    public static PathToSchemasMap validate(
            JsonSchema jsonSchema,
            Object arg,
            ValidationMetadata validationMetadata
    ) throws ValidationException {
        LinkedHashSet<String> disabledKeywords = validationMetadata.configuration().disabledKeywordFlags().getKeywords();
        Object extra = null;
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        LinkedHashMap<String, KeywordValidator> thisKeywordToValidator = jsonSchema.keywordToValidator;
        if (thisKeywordToValidator != null) {
            for (Map.Entry<String, KeywordValidator> entry: thisKeywordToValidator.entrySet()) {
                String jsonKeyword = entry.getKey();
                if (disabledKeywords.contains(jsonKeyword)) {
                   continue;
                }
                if (jsonKeyword.equals("additionalProperties") && thisKeywordToValidator.containsKey("properties")) {
                    extra = thisKeywordToValidator.get("properties").getConstraint();
                }
                KeywordValidator validator = entry.getValue();
                PathToSchemasMap otherPathToSchemas = validator.validate(
                        jsonSchema.getClass(),
                        arg,
                        validationMetadata,
                        extra
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

    protected String castToAllowedStringTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected Boolean castToAllowedBooleanTypes(Boolean arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected Number castToAllowedNumberTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected Void castToAllowedVoidTypes(Void arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        return arg;
    }

    protected FrozenList<Object> castToAllowedListTypes(List<Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        pathSet.add(pathToItem);
        List<Object> argFixed = new ArrayList<>();
        int i =0;
        for (Object item: ((List<?>) arg).toArray()) {
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(i);
            Object fixedVal = castToAllowedObjectTypes(item, newPathToItem, pathSet);
            argFixed.add(fixedVal);
            i += 1;
        }
        return new FrozenList<>(argFixed);
    }

    protected Object castToAllowedObjectTypes(Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        if (arg == null) {
            return castToAllowedVoidTypes((Void) arg, pathToItem, pathSet);
        } else if (arg instanceof String) {
            return castToAllowedStringTypes((String) arg, pathToItem, pathSet);
        } else if (arg instanceof Map) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry: ((Map<?, ?>) arg).entrySet()) {
                String key = (String) entry.getKey();
                Object val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                Object fixedVal = castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        } else if (arg instanceof Boolean) {
            return castToAllowedBooleanTypes((Boolean) arg, pathToItem, pathSet);
        } else if (arg instanceof Integer) {
            return castToAllowedNumberTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof Long) {
            return castToAllowedNumberTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof Float) {
            return castToAllowedNumberTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof Double) {
            return castToAllowedNumberTypes((Number) arg, pathToItem, pathSet);
        } else if (arg instanceof List) {
            pathSet.add(pathToItem);
            List<Object> argFixed = new ArrayList<>();
            int i =0;
            for (Object item: ((List<?>) arg).toArray()) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                Object fixedVal = castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        } else if (arg instanceof ZonedDateTime) {
            return castToAllowedStringTypes(arg.toString(), pathToItem, pathSet);
        } else if (arg instanceof LocalDate) {
            return castToAllowedStringTypes(arg.toString(), pathToItem, pathSet);
        } else if (arg instanceof UUID) {
            return castToAllowedStringTypes(arg.toString(), pathToItem, pathSet);
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
            unsetAnyTypeSchema.put(JsonSchemaFactory.getInstance(UnsetAnyTypeJsonSchema.class), null);
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