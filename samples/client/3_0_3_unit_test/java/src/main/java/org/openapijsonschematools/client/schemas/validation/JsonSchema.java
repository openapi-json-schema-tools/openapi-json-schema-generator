package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public abstract class JsonSchema <T extends FrozenMap, U extends FrozenList> {
    public LinkedHashMap<String, KeywordValidator> keywordToValidator;

    protected PathToSchemasMap validate(
            Object arg,
            ValidationMetadata validationMetadata
    ) throws ValidationException {
        LinkedHashSet<String> disabledKeywords = validationMetadata.configuration().disabledKeywordFlags().getKeywords();
        Object extra = null;
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for (Map.Entry<String, KeywordValidator> entry: keywordToValidator.entrySet()) {
            String jsonKeyword = entry.getKey();
            if (disabledKeywords.contains(jsonKeyword)) {
               continue;
            }
            if (jsonKeyword.equals("additionalProperties") && keywordToValidator.containsKey("properties")) {
                extra = keywordToValidator.get("properties").getConstraint();
            }
            KeywordValidator validator = entry.getValue();
            PathToSchemasMap otherPathToSchemas = validator.validate(
                    this.getClass(),
                    arg,
                    validationMetadata,
                    extra
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
        pathToSchemas.get(pathToItem).put(this, null);

        return pathToSchemas;
    }

   private static Object castToAllowedTypes(Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
      if (arg == null) {
         pathSet.add(pathToItem);
         return null;
      } else if (arg instanceof String) {
         pathSet.add(pathToItem);
         return arg;
      } else if (arg instanceof Map) {
         pathSet.add(pathToItem);
         LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
         for (Map.Entry<?, ?> entry: ((Map<?, ?>) arg).entrySet()) {
            String key = (String) entry.getKey();
            Object val = entry.getValue();
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(key);
            Object fixedVal = castToAllowedTypes(val, newPathToItem, pathSet);
            argFixed.put(key, fixedVal);
         }
         return new FrozenMap<>(argFixed);
      } else if (arg instanceof Boolean) {
         pathSet.add(pathToItem);
         return arg;
      } else if (arg instanceof Integer) {
         pathSet.add(pathToItem);
         return arg;
      } else if (arg instanceof Long) {
         pathSet.add(pathToItem);
         return arg;
      } else if (arg instanceof Float) {
         pathSet.add(pathToItem);
         return arg;
      } else if (arg instanceof Double) {
         pathSet.add(pathToItem);
         return arg;
      } else if (arg instanceof List) {
         pathSet.add(pathToItem);
         List<Object> argFixed = new ArrayList<>();
         int i =0;
         for (Object item: ((List<?>) arg).toArray()) {
            List<Object> newPathToItem = new ArrayList<>(pathToItem);
            newPathToItem.add(i);
            Object fixedVal = castToAllowedTypes(item, newPathToItem, pathSet);
            argFixed.add(fixedVal);
            i += 1;
         }
         return new FrozenList<>(argFixed);
      } else if (arg instanceof ZonedDateTime) {
         pathSet.add(pathToItem);
         return arg.toString();
      } else if (arg instanceof LocalDate) {
         pathSet.add(pathToItem);
         return arg.toString();
      } else if (arg instanceof UUID) {
         pathSet.add(pathToItem);
         return arg.toString();
      } else {
         Class<?> argClass = arg.getClass();
         throw new InvalidTypeException("Invalid type passed in for input="+arg+" type="+argClass);
      }
   }

   private PathToSchemasMap getPathToSchemas(Object arg, ValidationMetadata validationMetadata, Set<List<Object>> pathSet) {
      PathToSchemasMap pathToSchemasMap = new PathToSchemasMap();
      if (validationMetadata.validationRanEarlier(this)) {
         // todo add deeper validated schemas
      } else {
         PathToSchemasMap otherPathToSchemas = validate(arg, validationMetadata);
         pathToSchemasMap.update(otherPathToSchemas);
         for (LinkedHashMap<JsonSchema, Void> schemas: pathToSchemasMap.values()) {
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
      }
      return pathToSchemasMap;
   }

   private static FrozenMap<String, Object> getProperties(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
      LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
      for(Map.Entry<?, ?> entry: arg.entrySet()) {
         String propertyName = (String) entry.getKey();
         List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
         propertyPathToItem.add(propertyName);
         JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
         Object value = entry.getValue();
         Object castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
         properties.put(propertyName, castValue);
      }
      return new FrozenMap<>(properties);
   }

   private static FrozenList<Object> getItems(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
      ArrayList<Object> items = new ArrayList<>();
      int i = 0;
      for (Object item: arg) {
         List<Object> itemPathToItem = new ArrayList<>(pathToItem);
         itemPathToItem.add(i);
         JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
         Object castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
         items.add(castItem);
         i += 1;
      }
      return new FrozenList<>(items);
   }

   protected T getMapOutputInstance(FrozenMap<?, ?> arg) {
      return null;
   }

   protected U getListOutputInstance(FrozenList<?> arg) {
      return null;
   }

   private Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
      if (arg instanceof Map) {
         FrozenMap<String, Object> usedArg = getProperties((Map<?,?>) arg, pathToItem, pathToSchemas);
         return getMapOutputInstance(usedArg);
      } else if (arg instanceof List) {
         FrozenList<Object> usedArg = getItems((List<?>) arg, pathToItem, pathToSchemas);
         return getListOutputInstance(usedArg);
      }
      // str, int, float, boolean, null, FileIO, bytes
      return arg;
   }

   protected Void validateVoid(Void arg, SchemaConfiguration configuration) throws ValidationException {
      return (Void) validate(arg, configuration);
   }

   protected boolean validateBoolean(boolean arg, SchemaConfiguration configuration) throws ValidationException {
      return (boolean) validate(arg, configuration);
   }

   protected int validateInt(int arg, SchemaConfiguration configuration) throws ValidationException {
      return (int) validate(arg, configuration);
   }

   protected long validateLong(long arg, SchemaConfiguration configuration) throws ValidationException {
      return (long) validate(arg, configuration);
   }

   protected float validateFloat(float arg, SchemaConfiguration configuration) throws ValidationException {
      return (float) validate(arg, configuration);
   }

   protected double validateDouble(double arg, SchemaConfiguration configuration) throws ValidationException {
      return (double) validate(arg, configuration);
   }

   protected String validateString(String arg, SchemaConfiguration configuration) throws ValidationException {
      return (String) validate(arg, configuration);
   }

   protected String validateZonedDateTime(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
      return (String) validate(arg, configuration);
   }

   protected String validateLocalDate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
      return (String) validate(arg, configuration);
   }

   protected String validateUUID(UUID arg, SchemaConfiguration configuration) throws ValidationException {
      return (String) validate(arg, configuration);
   }

   protected <T extends FrozenMap> T validateMap(Map<String, ?> arg, SchemaConfiguration configuration) throws ValidationException {
      return (T) validate(arg, configuration);
   }

   protected <U extends FrozenList> U validateList(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
      return (U) validate(arg, configuration);
   }

   // todo add bytes and FileIO

   public Object validate(Object arg, SchemaConfiguration configuration) throws ValidationException {
      if (arg instanceof Map || arg instanceof List) {
         // todo don't run validation if the instance is one of the class generic types
      }
      Set<List<Object>> pathSet = new HashSet<>();
      List<Object> pathToItem = new ArrayList<>();
      pathToItem.add("args[0]");
      Object castArg = castToAllowedTypes(arg, pathToItem, pathSet);
      SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
      PathToSchemasMap validatedPathToSchemas = new PathToSchemasMap();
      ValidationMetadata validationMetadata = new ValidationMetadata(
              pathToItem,
              usedConfiguration,
              validatedPathToSchemas,
              new LinkedHashSet<>()
      );
      PathToSchemasMap pathToSchemasMap = getPathToSchemas(castArg, validationMetadata, pathSet);
      return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
   }

}