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
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends StringJsonSchema {
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class MapPropertyMap extends FrozenMap<String> {
        protected MapPropertyMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapPropertyMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapProperty.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    public static class MapPropertyMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapProperty extends JsonSchema implements MapSchemaValidator<MapPropertyMap> {
        private static @Nullable MapProperty instance = null;
    
        protected MapProperty() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static MapProperty getInstance() {
            if (instance == null) {
                instance = new MapProperty();
            }
            return instance;
        }
        
        public MapPropertyMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new MapPropertyMap(castProperties);
        }
        
        public MapPropertyMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class AdditionalProperties2 extends StringJsonSchema {
        private static @Nullable AdditionalProperties2 instance = null;
        public static AdditionalProperties2 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties2();
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
            return AdditionalProperties1.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    public static class AdditionalPropertiesMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class AdditionalProperties1 extends JsonSchema implements MapSchemaValidator<AdditionalPropertiesMap> {
        private static @Nullable AdditionalProperties1 instance = null;
    
        protected AdditionalProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties2.class)
            );
        }
    
        public static AdditionalProperties1 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties1();
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
    
    
    public static class MapOfMapPropertyMap extends FrozenMap<AdditionalPropertiesMap> {
        protected MapOfMapPropertyMap(FrozenMap<AdditionalPropertiesMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapOfMapPropertyMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapOfMapProperty.getInstance().validate(arg, configuration);
        }
        
        public AdditionalPropertiesMap getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    public static class MapOfMapPropertyMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapOfMapProperty extends JsonSchema implements MapSchemaValidator<MapOfMapPropertyMap> {
        private static @Nullable MapOfMapProperty instance = null;
    
        protected MapOfMapProperty() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties1.class)
            );
        }
    
        public static MapOfMapProperty getInstance() {
            if (instance == null) {
                instance = new MapOfMapProperty();
            }
            return instance;
        }
        
        public MapOfMapPropertyMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new MapOfMapPropertyMap(castProperties);
        }
        
        public MapOfMapPropertyMap validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class Anytype1 extends AnyTypeJsonSchema {
        private static @Nullable Anytype1 instance = null;
        public static Anytype1 getInstance() {
            if (instance == null) {
                instance = new Anytype1();
            }
            return instance;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype1 extends MapJsonSchema {
        private static @Nullable MapWithUndeclaredPropertiesAnytype1 instance = null;
        public static MapWithUndeclaredPropertiesAnytype1 getInstance() {
            if (instance == null) {
                instance = new MapWithUndeclaredPropertiesAnytype1();
            }
            return instance;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype2 extends MapJsonSchema {
        private static @Nullable MapWithUndeclaredPropertiesAnytype2 instance = null;
        public static MapWithUndeclaredPropertiesAnytype2 getInstance() {
            if (instance == null) {
                instance = new MapWithUndeclaredPropertiesAnytype2();
            }
            return instance;
        }
    }
    
    
    public static class AdditionalProperties3 extends AnyTypeJsonSchema {
        private static @Nullable AdditionalProperties3 instance = null;
        public static AdditionalProperties3 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties3();
            }
            return instance;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype3Map extends FrozenMap<@Nullable Object> {
        protected MapWithUndeclaredPropertiesAnytype3Map(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapWithUndeclaredPropertiesAnytype3Map of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapWithUndeclaredPropertiesAnytype3.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    public static class MapWithUndeclaredPropertiesAnytype3MapInput {
        // Map<String, Object> because additionalProperties == true
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype3 extends JsonSchema implements MapSchemaValidator<MapWithUndeclaredPropertiesAnytype3Map> {
        private static @Nullable MapWithUndeclaredPropertiesAnytype3 instance = null;
    
        protected MapWithUndeclaredPropertiesAnytype3() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties3.class)
            );
        }
    
        public static MapWithUndeclaredPropertiesAnytype3 getInstance() {
            if (instance == null) {
                instance = new MapWithUndeclaredPropertiesAnytype3();
            }
            return instance;
        }
        
        public MapWithUndeclaredPropertiesAnytype3Map getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new MapWithUndeclaredPropertiesAnytype3Map(castProperties);
        }
        
        public MapWithUndeclaredPropertiesAnytype3Map validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class AdditionalProperties4 extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties4 instance = null;
        public static AdditionalProperties4 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties4();
            }
            return instance;
        }
    }
    
    
    public static class EmptyMapMap extends FrozenMap<Object> {
        protected EmptyMapMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        // map with no key value pairs
        public static EmptyMapMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return EmptyMap.getInstance().validate(arg, configuration);
        }
    }
    public static class EmptyMapMapInput {
        // empty mapping
    }
    
    
    public static class EmptyMap extends JsonSchema implements MapSchemaValidator<EmptyMapMap> {
        private static @Nullable EmptyMap instance = null;
    
        protected EmptyMap() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties4.class)
            );
        }
    
        public static EmptyMap getInstance() {
            if (instance == null) {
                instance = new EmptyMap();
            }
            return instance;
        }
        
        public EmptyMapMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new EmptyMapMap(castProperties);
        }
        
        public EmptyMapMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class AdditionalProperties5 extends StringJsonSchema {
        private static @Nullable AdditionalProperties5 instance = null;
        public static AdditionalProperties5 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties5();
            }
            return instance;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesStringMap extends FrozenMap<String> {
        protected MapWithUndeclaredPropertiesStringMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapWithUndeclaredPropertiesStringMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapWithUndeclaredPropertiesString.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    public static class MapWithUndeclaredPropertiesStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapWithUndeclaredPropertiesString extends JsonSchema implements MapSchemaValidator<MapWithUndeclaredPropertiesStringMap> {
        private static @Nullable MapWithUndeclaredPropertiesString instance = null;
    
        protected MapWithUndeclaredPropertiesString() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(AdditionalProperties5.class)
            );
        }
    
        public static MapWithUndeclaredPropertiesString getInstance() {
            if (instance == null) {
                instance = new MapWithUndeclaredPropertiesString();
            }
            return instance;
        }
        
        public MapWithUndeclaredPropertiesStringMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new MapWithUndeclaredPropertiesStringMap(castProperties);
        }
        
        public MapWithUndeclaredPropertiesStringMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    
    
    public static class AdditionalPropertiesClassMap extends FrozenMap<@Nullable Object> {
        protected AdditionalPropertiesClassMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "map_property",
            "map_of_map_property",
            "anytype_1",
            "map_with_undeclared_properties_anytype_1",
            "map_with_undeclared_properties_anytype_2",
            "map_with_undeclared_properties_anytype_3",
            "empty_map",
            "map_with_undeclared_properties_string"
        );
        public static AdditionalPropertiesClassMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalPropertiesClass1.getInstance().validate(arg, configuration);
        }
        
        public MapPropertyMap map_property() throws UnsetPropertyException {
            String key = "map_property";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapPropertyMap)) {
                throw new InvalidTypeException("Invalid value stored for map_property");
            }
            return (MapPropertyMap) value;
        }
        
        public MapOfMapPropertyMap map_of_map_property() throws UnsetPropertyException {
            String key = "map_of_map_property";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapOfMapPropertyMap)) {
                throw new InvalidTypeException("Invalid value stored for map_of_map_property");
            }
            return (MapOfMapPropertyMap) value;
        }
        
        public @Nullable Object anytype_1() throws UnsetPropertyException {
            return getOrThrow("anytype_1");
        }
        
        public FrozenMap<?> map_with_undeclared_properties_anytype_1() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_anytype_1";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FrozenMap<?>)) {
                throw new InvalidTypeException("Invalid value stored for map_with_undeclared_properties_anytype_1");
            }
            return (FrozenMap<?>) value;
        }
        
        public FrozenMap<?> map_with_undeclared_properties_anytype_2() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_anytype_2";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FrozenMap<?>)) {
                throw new InvalidTypeException("Invalid value stored for map_with_undeclared_properties_anytype_2");
            }
            return (FrozenMap<?>) value;
        }
        
        public MapWithUndeclaredPropertiesAnytype3Map map_with_undeclared_properties_anytype_3() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_anytype_3";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapWithUndeclaredPropertiesAnytype3Map)) {
                throw new InvalidTypeException("Invalid value stored for map_with_undeclared_properties_anytype_3");
            }
            return (MapWithUndeclaredPropertiesAnytype3Map) value;
        }
        
        public EmptyMapMap empty_map() throws UnsetPropertyException {
            String key = "empty_map";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof EmptyMapMap)) {
                throw new InvalidTypeException("Invalid value stored for empty_map");
            }
            return (EmptyMapMap) value;
        }
        
        public MapWithUndeclaredPropertiesStringMap map_with_undeclared_properties_string() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapWithUndeclaredPropertiesStringMap)) {
                throw new InvalidTypeException("Invalid value stored for map_with_undeclared_properties_string");
            }
            return (MapWithUndeclaredPropertiesStringMap) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class AdditionalPropertiesClassMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class AdditionalPropertiesClass1 extends JsonSchema implements MapSchemaValidator<AdditionalPropertiesClassMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable AdditionalPropertiesClass1 instance = null;
    
        protected AdditionalPropertiesClass1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("map_property", MapProperty.class),
                    new PropertyEntry("map_of_map_property", MapOfMapProperty.class),
                    new PropertyEntry("anytype_1", Anytype1.class),
                    new PropertyEntry("map_with_undeclared_properties_anytype_1", MapWithUndeclaredPropertiesAnytype1.class),
                    new PropertyEntry("map_with_undeclared_properties_anytype_2", MapWithUndeclaredPropertiesAnytype2.class),
                    new PropertyEntry("map_with_undeclared_properties_anytype_3", MapWithUndeclaredPropertiesAnytype3.class),
                    new PropertyEntry("empty_map", EmptyMap.class),
                    new PropertyEntry("map_with_undeclared_properties_string", MapWithUndeclaredPropertiesString.class)
                ))
            );
        }
    
        public static AdditionalPropertiesClass1 getInstance() {
            if (instance == null) {
                instance = new AdditionalPropertiesClass1();
            }
            return instance;
        }
        
        public AdditionalPropertiesClassMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new AdditionalPropertiesClassMap(castProperties);
        }
        
        public AdditionalPropertiesClassMap validate(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
