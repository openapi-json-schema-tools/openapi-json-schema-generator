package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.UuidJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class MixedPropertiesAndAdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UuidSchema extends UuidJsonSchema.UuidJsonSchema1 {
        private static @Nullable UuidSchema instance = null;
        public static UuidSchema getInstance() {
            if (instance == null) {
                instance = new UuidSchema();
            }
            return instance;
        }
    }
    
    
    public static class DateTime extends DateTimeJsonSchema.DateTimeJsonSchema1 {
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
        public static MapMap of(Map<String, Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return MapSchema.getInstance().validate(arg, configuration);
        }
        
        public Animal.AnimalMap getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, Map<String, @Nullable Object>> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, Map<String, @Nullable Object>> instance);
        
        default T additionalProperty(String key, Map<String, @Nullable Object> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class MapMapBuilder implements GenericBuilder<Map<String, Map<String, @Nullable Object>>>, SetterForAdditionalProperties<MapMapBuilder> {
        private final Map<String, Map<String, @Nullable Object>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Map<String, @Nullable Object>> build() {
            return instance;
        }
        public Map<String, Map<String, @Nullable Object>> getInstance() {
            return instance;
        }
        public MapMapBuilder getBuilderAfterAdditionalProperty(Map<String, Map<String, @Nullable Object>> instance) {
            return this;
        }
    }
    
    
    public sealed interface MapSchemaBoxed permits MapSchemaBoxedMap {
        @Nullable Object getData();
    }
    
    public record MapSchemaBoxedMap(MapMap data) implements MapSchemaBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MapSchema extends JsonSchema<MapSchemaBoxed> implements MapSchemaValidator<MapMap, MapSchemaBoxedMap> {
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
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                if (!(propertyInstance instanceof Animal.AnimalMap)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Animal.AnimalMap) propertyInstance);
            }
            FrozenMap<Animal.AnimalMap> castProperties = new FrozenMap<>(properties);
            return new MapMap(castProperties);
        }
        
        public MapMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MapSchemaBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapSchemaBoxedMap(validate(arg, configuration));
        }
        @Override
        public MapSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public static MixedPropertiesAndAdditionalPropertiesClassMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return MixedPropertiesAndAdditionalPropertiesClass1.getInstance().validate(arg, configuration);
        }
        
        public String dateTime() throws UnsetPropertyException {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for dateTime");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForUuidSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterUuidSchema(Map<String, @Nullable Object> instance);
        
        default T setUuid(String value) {
            var instance = getInstance();
            instance.put("uuid", value);
            return getBuilderAfterUuidSchema(instance);
        }
    }
    
    public interface SetterForDateTime <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDateTime(Map<String, @Nullable Object> instance);
        
        default T dateTime(String value) {
            var instance = getInstance();
            instance.put("dateTime", value);
            return getBuilderAfterDateTime(instance);
        }
    }
    
    public interface SetterForMapSchema <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapSchema(Map<String, @Nullable Object> instance);
        
        default T setMap(Map<String, Map<String, @Nullable Object>> value) {
            var instance = getInstance();
            instance.put("map", value);
            return getBuilderAfterMapSchema(instance);
        }
    }
    
    public static class MixedPropertiesAndAdditionalPropertiesClassMapBuilder extends UnsetAddPropsSetter<MixedPropertiesAndAdditionalPropertiesClassMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForUuidSchema<MixedPropertiesAndAdditionalPropertiesClassMapBuilder>, SetterForDateTime<MixedPropertiesAndAdditionalPropertiesClassMapBuilder>, SetterForMapSchema<MixedPropertiesAndAdditionalPropertiesClassMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "uuid",
            "dateTime",
            "map"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MixedPropertiesAndAdditionalPropertiesClassMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MixedPropertiesAndAdditionalPropertiesClassMapBuilder getBuilderAfterUuidSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MixedPropertiesAndAdditionalPropertiesClassMapBuilder getBuilderAfterDateTime(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MixedPropertiesAndAdditionalPropertiesClassMapBuilder getBuilderAfterMapSchema(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MixedPropertiesAndAdditionalPropertiesClassMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface MixedPropertiesAndAdditionalPropertiesClass1Boxed permits MixedPropertiesAndAdditionalPropertiesClass1BoxedMap {
        @Nullable Object getData();
    }
    
    public record MixedPropertiesAndAdditionalPropertiesClass1BoxedMap(MixedPropertiesAndAdditionalPropertiesClassMap data) implements MixedPropertiesAndAdditionalPropertiesClass1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MixedPropertiesAndAdditionalPropertiesClass1 extends JsonSchema<MixedPropertiesAndAdditionalPropertiesClass1Boxed> implements MapSchemaValidator<MixedPropertiesAndAdditionalPropertiesClassMap, MixedPropertiesAndAdditionalPropertiesClass1BoxedMap> {
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
                    throw new RuntimeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new MixedPropertiesAndAdditionalPropertiesClassMap(castProperties);
        }
        
        public MixedPropertiesAndAdditionalPropertiesClassMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MixedPropertiesAndAdditionalPropertiesClass1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MixedPropertiesAndAdditionalPropertiesClass1BoxedMap(validate(arg, configuration));
        }
        @Override
        public MixedPropertiesAndAdditionalPropertiesClass1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
