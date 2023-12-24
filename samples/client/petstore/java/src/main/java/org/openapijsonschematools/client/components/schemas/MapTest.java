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
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class MapTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties1 extends StringJsonSchema {
        private static @Nullable AdditionalProperties1 instance = null;
        public static AdditionalProperties1 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties1();
            }
            return instance;
        }
    }
    
    
    public static class AdditionalPropertiesMap extends FrozenMap<String> {
        protected AdditionalPropertiesMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AdditionalPropertiesMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalProperties.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class AdditionalPropertiesMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class AdditionalProperties extends JsonSchema implements MapSchemaValidator<AdditionalPropertiesMap> {
        private static @Nullable AdditionalProperties instance = null;
    
        protected AdditionalProperties() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties1.class)
            );
        }
    
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
        
        public AdditionalPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new AdditionalPropertiesMap(castProperties);
        }
        
        public AdditionalPropertiesMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class MapMapOfStringMap extends FrozenMap<AdditionalPropertiesMap> {
        protected MapMapOfStringMap(FrozenMap<AdditionalPropertiesMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapMapOfStringMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapMapOfString.getInstance().validate(arg, configuration);
        }
        
        public AdditionalPropertiesMap getAdditionalProperty(String name) throws UnsetPropertyException {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MapMapOfStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapMapOfString extends JsonSchema implements MapSchemaValidator<MapMapOfStringMap> {
        private static @Nullable MapMapOfString instance = null;
    
        protected MapMapOfString() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static MapMapOfString getInstance() {
            if (instance == null) {
                instance = new MapMapOfString();
            }
            return instance;
        }
        
        public MapMapOfStringMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, AdditionalPropertiesMap> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof AdditionalPropertiesMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (AdditionalPropertiesMap) propertyInstance);
            }
            FrozenMap<AdditionalPropertiesMap> castProperties = new FrozenMap<>(properties);
            return new MapMapOfStringMap(castProperties);
        }
        
        public MapMapOfStringMap validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class AdditionalProperties2 extends JsonSchema implements StringSchemaValidator {
        private static @Nullable AdditionalProperties2 instance = null;
    
        protected AdditionalProperties2() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "UPPER",
                    "lower"
                ))
            );
        }
    
        public static AdditionalProperties2 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties2();
            }
            return instance;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class MapOfEnumStringMap extends FrozenMap<String> {
        protected MapOfEnumStringMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapOfEnumStringMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapOfEnumString.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MapOfEnumStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapOfEnumString extends JsonSchema implements MapSchemaValidator<MapOfEnumStringMap> {
        private static @Nullable MapOfEnumString instance = null;
    
        protected MapOfEnumString() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties2.class)
            );
        }
    
        public static MapOfEnumString getInstance() {
            if (instance == null) {
                instance = new MapOfEnumString();
            }
            return instance;
        }
        
        public MapOfEnumStringMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new MapOfEnumStringMap(castProperties);
        }
        
        public MapOfEnumStringMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class AdditionalProperties3 extends BooleanJsonSchema {
        private static @Nullable AdditionalProperties3 instance = null;
        public static AdditionalProperties3 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties3();
            }
            return instance;
        }
    }
    
    
    public static class DirectMapMap extends FrozenMap<Boolean> {
        protected DirectMapMap(FrozenMap<Boolean> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static DirectMapMap of(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return DirectMap.getInstance().validate(arg, configuration);
        }
        
        public boolean getAdditionalProperty(String name) throws UnsetPropertyException {
            throwIfKeyNotPresent(name);
            Boolean value = get(name);
            if (value == null) {
                throw new InvalidTypeException("Value may not be null");
            }
            return (boolean) value;
        }
    }
    public static class DirectMapMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class DirectMap extends JsonSchema implements MapSchemaValidator<DirectMapMap> {
        private static @Nullable DirectMap instance = null;
    
        protected DirectMap() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties3.class)
            );
        }
    
        public static DirectMap getInstance() {
            if (instance == null) {
                instance = new DirectMap();
            }
            return instance;
        }
        
        public DirectMapMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Boolean> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Boolean)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Boolean) propertyInstance);
            }
            FrozenMap<Boolean> castProperties = new FrozenMap<>(properties);
            return new DirectMapMap(castProperties);
        }
        
        public DirectMapMap validate(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class MapTestMap extends FrozenMap<@Nullable Object> {
        protected MapTestMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "map_map_of_string",
            "map_of_enum_string",
            "direct_map",
            "indirect_map"
        );
        public static MapTestMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapTest1.getInstance().validate(arg, configuration);
        }
        
        public MapMapOfStringMap map_map_of_string() throws UnsetPropertyException {
            String key = "map_map_of_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapMapOfStringMap)) {
                throw new InvalidTypeException("Invalid value stored for map_map_of_string");
            }
            return (MapMapOfStringMap) value;
        }
        
        public MapOfEnumStringMap map_of_enum_string() throws UnsetPropertyException {
            String key = "map_of_enum_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapOfEnumStringMap)) {
                throw new InvalidTypeException("Invalid value stored for map_of_enum_string");
            }
            return (MapOfEnumStringMap) value;
        }
        
        public DirectMapMap direct_map() throws UnsetPropertyException {
            String key = "direct_map";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof DirectMapMap)) {
                throw new InvalidTypeException("Invalid value stored for direct_map");
            }
            return (DirectMapMap) value;
        }
        
        public StringBooleanMap.StringBooleanMapMap indirect_map() throws UnsetPropertyException {
            String key = "indirect_map";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof StringBooleanMap.StringBooleanMapMap)) {
                throw new InvalidTypeException("Invalid value stored for indirect_map");
            }
            return (StringBooleanMap.StringBooleanMapMap) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MapTestMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class MapTest1 extends JsonSchema implements MapSchemaValidator<MapTestMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable MapTest1 instance = null;
    
        protected MapTest1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("map_map_of_string", MapMapOfString.class),
                    new PropertyEntry("map_of_enum_string", MapOfEnumString.class),
                    new PropertyEntry("direct_map", DirectMap.class),
                    new PropertyEntry("indirect_map", StringBooleanMap.StringBooleanMap1.class)
                ))
            );
        }
    
        public static MapTest1 getInstance() {
            if (instance == null) {
                instance = new MapTest1();
            }
            return instance;
        }
        
        public MapTestMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new MapTestMap(castProperties);
        }
        
        public MapTestMap validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
