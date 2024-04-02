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
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends StringJsonSchema.StringJsonSchema1 {
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
        public static MapPropertyMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return MapProperty.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
        Set<String> getKnownKeys();
        Map<String, String> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, String> instance);
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class MapPropertyMapBuilder implements GenericBuilder<Map<String, String>>, SetterForAdditionalProperties<MapPropertyMapBuilder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapPropertyMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public MapPropertyMapBuilder getBuilderAfterAdditionalProperty(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface MapPropertyBoxed permits MapPropertyBoxedMap {
        @Nullable Object getData();
    }
    
    public record MapPropertyBoxedMap(MapPropertyMap data) implements MapPropertyBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MapProperty extends JsonSchema<MapPropertyBoxed> implements MapSchemaValidator<MapPropertyMap, MapPropertyBoxedMap> {
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
                if (!(propertyInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new MapPropertyMap(castProperties);
        }
        
        public MapPropertyMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MapPropertyBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapPropertyBoxedMap(validate(arg, configuration));
        }
        @Override
        public MapPropertyBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class AdditionalProperties2 extends StringJsonSchema.StringJsonSchema1 {
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
        public static AdditionalPropertiesMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return AdditionalProperties1.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties2<T> {
        Set<String> getKnownKeys();
        Map<String, String> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, String> instance);
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class AdditionalPropertiesMapBuilder2 implements GenericBuilder<Map<String, String>>, SetterForAdditionalProperties2<AdditionalPropertiesMapBuilder2> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AdditionalPropertiesMapBuilder2() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public AdditionalPropertiesMapBuilder2 getBuilderAfterAdditionalProperty(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface AdditionalProperties1Boxed permits AdditionalProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record AdditionalProperties1BoxedMap(AdditionalPropertiesMap data) implements AdditionalProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AdditionalProperties1 extends JsonSchema<AdditionalProperties1Boxed> implements MapSchemaValidator<AdditionalPropertiesMap, AdditionalProperties1BoxedMap> {
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
                if (!(propertyInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new AdditionalPropertiesMap(castProperties);
        }
        
        public AdditionalPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AdditionalProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public AdditionalProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class MapOfMapPropertyMap extends FrozenMap<AdditionalPropertiesMap> {
        protected MapOfMapPropertyMap(FrozenMap<AdditionalPropertiesMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapOfMapPropertyMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return MapOfMapProperty.getInstance().validate(arg, configuration);
        }
        
        public AdditionalPropertiesMap getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties1<T> {
        Set<String> getKnownKeys();
        Map<String, Map<String, String>> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, Map<String, String>> instance);
        
        default T additionalProperty(String key, Map<String, String> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class MapOfMapPropertyMapBuilder implements GenericBuilder<Map<String, Map<String, String>>>, SetterForAdditionalProperties1<MapOfMapPropertyMapBuilder> {
        private final Map<String, Map<String, String>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapOfMapPropertyMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Map<String, String>> build() {
            return instance;
        }
        public Map<String, Map<String, String>> getInstance() {
            return instance;
        }
        public MapOfMapPropertyMapBuilder getBuilderAfterAdditionalProperty(Map<String, Map<String, String>> instance) {
            return this;
        }
    }
    
    
    public sealed interface MapOfMapPropertyBoxed permits MapOfMapPropertyBoxedMap {
        @Nullable Object getData();
    }
    
    public record MapOfMapPropertyBoxedMap(MapOfMapPropertyMap data) implements MapOfMapPropertyBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MapOfMapProperty extends JsonSchema<MapOfMapPropertyBoxed> implements MapSchemaValidator<MapOfMapPropertyMap, MapOfMapPropertyBoxedMap> {
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
                if (!(propertyInstance instanceof AdditionalPropertiesMap)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (AdditionalPropertiesMap) propertyInstance);
            }
            FrozenMap<AdditionalPropertiesMap> castProperties = new FrozenMap<>(properties);
            return new MapOfMapPropertyMap(castProperties);
        }
        
        public MapOfMapPropertyMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MapOfMapPropertyBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapOfMapPropertyBoxedMap(validate(arg, configuration));
        }
        @Override
        public MapOfMapPropertyBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class Anytype1 extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
        private static @Nullable Anytype1 instance = null;
        public static Anytype1 getInstance() {
            if (instance == null) {
                instance = new Anytype1();
            }
            return instance;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype1 extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable MapWithUndeclaredPropertiesAnytype1 instance = null;
        public static MapWithUndeclaredPropertiesAnytype1 getInstance() {
            if (instance == null) {
                instance = new MapWithUndeclaredPropertiesAnytype1();
            }
            return instance;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype2 extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable MapWithUndeclaredPropertiesAnytype2 instance = null;
        public static MapWithUndeclaredPropertiesAnytype2 getInstance() {
            if (instance == null) {
                instance = new MapWithUndeclaredPropertiesAnytype2();
            }
            return instance;
        }
    }
    
    
    public static class AdditionalProperties3 extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
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
        public static MapWithUndeclaredPropertiesAnytype3Map of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return MapWithUndeclaredPropertiesAnytype3.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties3<T> {
        Set<String> getKnownKeys();
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance);
        
        default T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, null);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, boolean value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, int value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, float value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, long value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, double value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, List<?> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
        
        default T additionalProperty(String key, Map<String, ?> value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class MapWithUndeclaredPropertiesAnytype3MapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForAdditionalProperties3<MapWithUndeclaredPropertiesAnytype3MapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapWithUndeclaredPropertiesAnytype3MapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MapWithUndeclaredPropertiesAnytype3MapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface MapWithUndeclaredPropertiesAnytype3Boxed permits MapWithUndeclaredPropertiesAnytype3BoxedMap {
        @Nullable Object getData();
    }
    
    public record MapWithUndeclaredPropertiesAnytype3BoxedMap(MapWithUndeclaredPropertiesAnytype3Map data) implements MapWithUndeclaredPropertiesAnytype3Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesAnytype3 extends JsonSchema<MapWithUndeclaredPropertiesAnytype3Boxed> implements MapSchemaValidator<MapWithUndeclaredPropertiesAnytype3Map, MapWithUndeclaredPropertiesAnytype3BoxedMap> {
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
            return new MapWithUndeclaredPropertiesAnytype3Map(castProperties);
        }
        
        public MapWithUndeclaredPropertiesAnytype3Map validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MapWithUndeclaredPropertiesAnytype3BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapWithUndeclaredPropertiesAnytype3BoxedMap(validate(arg, configuration));
        }
        @Override
        public MapWithUndeclaredPropertiesAnytype3Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class AdditionalProperties4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties4 instance = null;
        public static AdditionalProperties4 getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties4();
            }
            return instance;
        }
    }
    
    
    public static class EmptyMapMap extends FrozenMap<@Nullable Object> {
        protected EmptyMapMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        // map with no key value pairs
        public static EmptyMapMap of(Map<String, @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return EmptyMap.getInstance().validate(arg, configuration);
        }
    }
    
    public static class EmptyMapMapBuilder implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public EmptyMapMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
    }
    
    
    public sealed interface EmptyMapBoxed permits EmptyMapBoxedMap {
        @Nullable Object getData();
    }
    
    public record EmptyMapBoxedMap(EmptyMapMap data) implements EmptyMapBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class EmptyMap extends JsonSchema<EmptyMapBoxed> implements MapSchemaValidator<EmptyMapMap, EmptyMapBoxedMap> {
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
            return new EmptyMapMap(castProperties);
        }
        
        public EmptyMapMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public EmptyMapBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new EmptyMapBoxedMap(validate(arg, configuration));
        }
        @Override
        public EmptyMapBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }
    
    
    public static class AdditionalProperties5 extends StringJsonSchema.StringJsonSchema1 {
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
        public static MapWithUndeclaredPropertiesStringMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return MapWithUndeclaredPropertiesString.getInstance().validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) throws UnsetPropertyException {
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties5<T> {
        Set<String> getKnownKeys();
        Map<String, String> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, String> instance);
        
        default T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class MapWithUndeclaredPropertiesStringMapBuilder implements GenericBuilder<Map<String, String>>, SetterForAdditionalProperties5<MapWithUndeclaredPropertiesStringMapBuilder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapWithUndeclaredPropertiesStringMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public MapWithUndeclaredPropertiesStringMapBuilder getBuilderAfterAdditionalProperty(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface MapWithUndeclaredPropertiesStringBoxed permits MapWithUndeclaredPropertiesStringBoxedMap {
        @Nullable Object getData();
    }
    
    public record MapWithUndeclaredPropertiesStringBoxedMap(MapWithUndeclaredPropertiesStringMap data) implements MapWithUndeclaredPropertiesStringBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class MapWithUndeclaredPropertiesString extends JsonSchema<MapWithUndeclaredPropertiesStringBoxed> implements MapSchemaValidator<MapWithUndeclaredPropertiesStringMap, MapWithUndeclaredPropertiesStringBoxedMap> {
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
                if (!(propertyInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (String) propertyInstance);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new MapWithUndeclaredPropertiesStringMap(castProperties);
        }
        
        public MapWithUndeclaredPropertiesStringMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public MapWithUndeclaredPropertiesStringBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapWithUndeclaredPropertiesStringBoxedMap(validate(arg, configuration));
        }
        @Override
        public MapWithUndeclaredPropertiesStringBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
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
        public static AdditionalPropertiesClassMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return AdditionalPropertiesClass1.getInstance().validate(arg, configuration);
        }
        
        public MapPropertyMap map_property() throws UnsetPropertyException {
            String key = "map_property";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapPropertyMap)) {
                throw new RuntimeException("Invalid value stored for map_property");
            }
            return (MapPropertyMap) value;
        }
        
        public MapOfMapPropertyMap map_of_map_property() throws UnsetPropertyException {
            String key = "map_of_map_property";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapOfMapPropertyMap)) {
                throw new RuntimeException("Invalid value stored for map_of_map_property");
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
                throw new RuntimeException("Invalid value stored for map_with_undeclared_properties_anytype_1");
            }
            return (FrozenMap<?>) value;
        }
        
        public FrozenMap<?> map_with_undeclared_properties_anytype_2() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_anytype_2";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FrozenMap<?>)) {
                throw new RuntimeException("Invalid value stored for map_with_undeclared_properties_anytype_2");
            }
            return (FrozenMap<?>) value;
        }
        
        public MapWithUndeclaredPropertiesAnytype3Map map_with_undeclared_properties_anytype_3() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_anytype_3";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapWithUndeclaredPropertiesAnytype3Map)) {
                throw new RuntimeException("Invalid value stored for map_with_undeclared_properties_anytype_3");
            }
            return (MapWithUndeclaredPropertiesAnytype3Map) value;
        }
        
        public EmptyMapMap empty_map() throws UnsetPropertyException {
            String key = "empty_map";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof EmptyMapMap)) {
                throw new RuntimeException("Invalid value stored for empty_map");
            }
            return (EmptyMapMap) value;
        }
        
        public MapWithUndeclaredPropertiesStringMap map_with_undeclared_properties_string() throws UnsetPropertyException {
            String key = "map_with_undeclared_properties_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof MapWithUndeclaredPropertiesStringMap)) {
                throw new RuntimeException("Invalid value stored for map_with_undeclared_properties_string");
            }
            return (MapWithUndeclaredPropertiesStringMap) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForMapProperty <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapProperty(Map<String, @Nullable Object> instance);
        
        default T map_property(Map<String, String> value) {
            var instance = getInstance();
            instance.put("map_property", value);
            return getBuilderAfterMapProperty(instance);
        }
    }
    
    public interface SetterForMapOfMapProperty <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapOfMapProperty(Map<String, @Nullable Object> instance);
        
        default T map_of_map_property(Map<String, Map<String, String>> value) {
            var instance = getInstance();
            instance.put("map_of_map_property", value);
            return getBuilderAfterMapOfMapProperty(instance);
        }
    }
    
    public interface SetterForAnytype1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterAnytype1(Map<String, @Nullable Object> instance);
        
        default T anytype_1(Void value) {
            var instance = getInstance();
            instance.put("anytype_1", null);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(boolean value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(String value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(int value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(float value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(long value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(double value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(List<?> value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
        
        default T anytype_1(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("anytype_1", value);
            return getBuilderAfterAnytype1(instance);
        }
    }
    
    public interface SetterForMapWithUndeclaredPropertiesAnytype1 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapWithUndeclaredPropertiesAnytype1(Map<String, @Nullable Object> instance);
        
        default T map_with_undeclared_properties_anytype_1(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("map_with_undeclared_properties_anytype_1", value);
            return getBuilderAfterMapWithUndeclaredPropertiesAnytype1(instance);
        }
    }
    
    public interface SetterForMapWithUndeclaredPropertiesAnytype2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapWithUndeclaredPropertiesAnytype2(Map<String, @Nullable Object> instance);
        
        default T map_with_undeclared_properties_anytype_2(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("map_with_undeclared_properties_anytype_2", value);
            return getBuilderAfterMapWithUndeclaredPropertiesAnytype2(instance);
        }
    }
    
    public interface SetterForMapWithUndeclaredPropertiesAnytype3 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapWithUndeclaredPropertiesAnytype3(Map<String, @Nullable Object> instance);
        
        default T map_with_undeclared_properties_anytype_3(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("map_with_undeclared_properties_anytype_3", value);
            return getBuilderAfterMapWithUndeclaredPropertiesAnytype3(instance);
        }
    }
    
    public interface SetterForEmptyMap <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterEmptyMap(Map<String, @Nullable Object> instance);
        
        default T empty_map(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("empty_map", value);
            return getBuilderAfterEmptyMap(instance);
        }
    }
    
    public interface SetterForMapWithUndeclaredPropertiesString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapWithUndeclaredPropertiesString(Map<String, @Nullable Object> instance);
        
        default T map_with_undeclared_properties_string(Map<String, String> value) {
            var instance = getInstance();
            instance.put("map_with_undeclared_properties_string", value);
            return getBuilderAfterMapWithUndeclaredPropertiesString(instance);
        }
    }
    
    public static class AdditionalPropertiesClassMapBuilder extends UnsetAddPropsSetter<AdditionalPropertiesClassMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForMapProperty<AdditionalPropertiesClassMapBuilder>, SetterForMapOfMapProperty<AdditionalPropertiesClassMapBuilder>, SetterForAnytype1<AdditionalPropertiesClassMapBuilder>, SetterForMapWithUndeclaredPropertiesAnytype1<AdditionalPropertiesClassMapBuilder>, SetterForMapWithUndeclaredPropertiesAnytype2<AdditionalPropertiesClassMapBuilder>, SetterForMapWithUndeclaredPropertiesAnytype3<AdditionalPropertiesClassMapBuilder>, SetterForEmptyMap<AdditionalPropertiesClassMapBuilder>, SetterForMapWithUndeclaredPropertiesString<AdditionalPropertiesClassMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "map_property",
            "map_of_map_property",
            "anytype_1",
            "map_with_undeclared_properties_anytype_1",
            "map_with_undeclared_properties_anytype_2",
            "map_with_undeclared_properties_anytype_3",
            "empty_map",
            "map_with_undeclared_properties_string"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AdditionalPropertiesClassMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterMapProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterMapOfMapProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterAnytype1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterMapWithUndeclaredPropertiesAnytype1(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterMapWithUndeclaredPropertiesAnytype2(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterMapWithUndeclaredPropertiesAnytype3(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterEmptyMap(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterMapWithUndeclaredPropertiesString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public AdditionalPropertiesClassMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface AdditionalPropertiesClass1Boxed permits AdditionalPropertiesClass1BoxedMap {
        @Nullable Object getData();
    }
    
    public record AdditionalPropertiesClass1BoxedMap(AdditionalPropertiesClassMap data) implements AdditionalPropertiesClass1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class AdditionalPropertiesClass1 extends JsonSchema<AdditionalPropertiesClass1Boxed> implements MapSchemaValidator<AdditionalPropertiesClassMap, AdditionalPropertiesClass1BoxedMap> {
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
            return new AdditionalPropertiesClassMap(castProperties);
        }
        
        public AdditionalPropertiesClassMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalPropertiesClass1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AdditionalPropertiesClass1BoxedMap(validate(arg, configuration));
        }
        @Override
        public AdditionalPropertiesClass1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
