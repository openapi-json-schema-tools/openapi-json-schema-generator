package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.UuidJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class MixedPropertiesAndAdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UuidSchema extends UuidJsonSchema {
        private static @Nullable UuidSchema instance = null;
        public static UuidSchema getInstance() {
            if (instance == null) {
                instance = new UuidSchema();
            }
            return instance;
        }
    }
    
    
    public static class DateTime extends DateTimeJsonSchema {
        private static @Nullable DateTime instance = null;
        public static DateTime getInstance() {
            if (instance == null) {
                instance = new DateTime();
            }
            return instance;
        }
    }
    
    
    public static class MapMap extends FrozenMap<Animal.AnimalMap> {
        protected MapMap(FrozenMap<Animal.AnimalMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapMap of(Map<String, Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapSchema.getInstance().validate(arg, configuration);
        }
        
        public Animal.AnimalMap getAdditionalProperty(String name) throws UnsetPropertyException {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MapMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapSchema extends JsonSchema implements MapSchemaValidator<MapMap> {
        private static @Nullable MapSchema instance = null;
    
        protected MapSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(Animal.Animal1.class)
            );
        }
    
        public static MapSchema getInstance() {
            if (instance == null) {
                instance = new MapSchema();
            }
            return instance;
        }
        
        public MapMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Animal.AnimalMap> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof Animal.AnimalMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Animal.AnimalMap) propertyInstance);
            }
            FrozenMap<Animal.AnimalMap> castProperties = new FrozenMap<>(properties);
            return new MapMap(castProperties);
        }
        
        public MapMap validate(Map<String, Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }
    
    
    public static class MixedPropertiesAndAdditionalPropertiesClassMap extends FrozenMap<@Nullable Object> {
        protected MixedPropertiesAndAdditionalPropertiesClassMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "uuid",
            "dateTime",
            "map"
        );
        public static MixedPropertiesAndAdditionalPropertiesClassMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MixedPropertiesAndAdditionalPropertiesClass1.getInstance().validate(arg, configuration);
        }
        
        public String dateTime() throws UnsetPropertyException {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for dateTime");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MixedPropertiesAndAdditionalPropertiesClassMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class MixedPropertiesAndAdditionalPropertiesClass1 extends JsonSchema implements MapSchemaValidator<MixedPropertiesAndAdditionalPropertiesClassMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable MixedPropertiesAndAdditionalPropertiesClass1 instance = null;
    
        protected MixedPropertiesAndAdditionalPropertiesClass1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("uuid", UuidSchema.class),
                    new PropertyEntry("dateTime", DateTime.class),
                    new PropertyEntry("map", MapSchema.class)
                ))
            );
        }
    
        public static MixedPropertiesAndAdditionalPropertiesClass1 getInstance() {
            if (instance == null) {
                instance = new MixedPropertiesAndAdditionalPropertiesClass1();
            }
            return instance;
        }
        
        public MixedPropertiesAndAdditionalPropertiesClassMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new MixedPropertiesAndAdditionalPropertiesClassMap(castProperties);
        }
        
        public MixedPropertiesAndAdditionalPropertiesClassMap validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }

}
