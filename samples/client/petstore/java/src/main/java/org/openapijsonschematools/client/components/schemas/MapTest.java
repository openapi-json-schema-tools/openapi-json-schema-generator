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
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.StringValueMethod;
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
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties1<T> {
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
    
    public static class AdditionalPropertiesMapBuilder1 implements GenericBuilder<Map<String, String>>, SetterForAdditionalProperties1<AdditionalPropertiesMapBuilder1> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public AdditionalPropertiesMapBuilder1() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public AdditionalPropertiesMapBuilder1 getBuilderAfterAdditionalProperty(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class AdditionalPropertiesBoxed permits AdditionalPropertiesBoxedMap {}
    public static final class AdditionalPropertiesBoxedMap extends AdditionalPropertiesBoxed {
        public final AdditionalPropertiesMap data;
        private AdditionalPropertiesBoxedMap(AdditionalPropertiesMap data) {
            this.data = data;
        }
    }
    
    
    public static class AdditionalProperties extends JsonSchema implements MapSchemaValidator<AdditionalPropertiesMap, AdditionalPropertiesBoxedMap> {
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
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalPropertiesBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AdditionalPropertiesBoxedMap(validate(arg, configuration));
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
            return getOrThrow(name);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
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
    
    public static class MapMapOfStringMapBuilder implements GenericBuilder<Map<String, Map<String, String>>>, SetterForAdditionalProperties<MapMapOfStringMapBuilder> {
        private final Map<String, Map<String, String>> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapMapOfStringMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Map<String, String>> build() {
            return instance;
        }
        public Map<String, Map<String, String>> getInstance() {
            return instance;
        }
        public MapMapOfStringMapBuilder getBuilderAfterAdditionalProperty(Map<String, Map<String, String>> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class MapMapOfStringBoxed permits MapMapOfStringBoxedMap {}
    public static final class MapMapOfStringBoxedMap extends MapMapOfStringBoxed {
        public final MapMapOfStringMap data;
        private MapMapOfStringBoxedMap(MapMapOfStringMap data) {
            this.data = data;
        }
    }
    
    
    public static class MapMapOfString extends JsonSchema implements MapSchemaValidator<MapMapOfStringMap, MapMapOfStringBoxedMap> {
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
        
        public MapMapOfStringMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public MapMapOfStringBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapMapOfStringBoxedMap(validate(arg, configuration));
        }
    }
    
    public enum StringAdditionalPropertiesEnums implements StringValueMethod {
        UPPER("UPPER"),
        LOWER("lower");
        private final String value;
    
        StringAdditionalPropertiesEnums(String value) {
            this.value = value;
        }
        public String value() {
            return this.value;
        }
    }
    
    
    public static abstract sealed class AdditionalProperties2Boxed permits AdditionalProperties2BoxedString {}
    public static final class AdditionalProperties2BoxedString extends AdditionalProperties2Boxed {
        public final String data;
        private AdditionalProperties2BoxedString(String data) {
            this.data = data;
        }
    }
    
    
    public static class AdditionalProperties2 extends JsonSchema implements StringSchemaValidator<AdditionalProperties2BoxedString>, StringEnumValidator<StringAdditionalPropertiesEnums> {
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
        public String validate(StringAdditionalPropertiesEnums arg,SchemaConfiguration configuration) throws ValidationException {
            return validate(arg.value(), configuration);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof String) {
                return validate((String) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public AdditionalProperties2BoxedString validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new AdditionalProperties2BoxedString(validate(arg, configuration));
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
        
        default T additionalProperty(String key, StringAdditionalPropertiesEnums value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value.value());
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class MapOfEnumStringMapBuilder implements GenericBuilder<Map<String, String>>, SetterForAdditionalProperties2<MapOfEnumStringMapBuilder> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapOfEnumStringMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public MapOfEnumStringMapBuilder getBuilderAfterAdditionalProperty(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class MapOfEnumStringBoxed permits MapOfEnumStringBoxedMap {}
    public static final class MapOfEnumStringBoxedMap extends MapOfEnumStringBoxed {
        public final MapOfEnumStringMap data;
        private MapOfEnumStringBoxedMap(MapOfEnumStringMap data) {
            this.data = data;
        }
    }
    
    
    public static class MapOfEnumString extends JsonSchema implements MapSchemaValidator<MapOfEnumStringMap, MapOfEnumStringBoxedMap> {
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
        
        public MapOfEnumStringMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public MapOfEnumStringBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapOfEnumStringBoxedMap(validate(arg, configuration));
        }
    }
    
    
    public static class AdditionalProperties3 extends BooleanJsonSchema.BooleanJsonSchema1 {
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
    
    public interface SetterForAdditionalProperties3<T> {
        Set<String> getKnownKeys();
        Map<String, Boolean> getInstance();
        T getBuilderAfterAdditionalProperty(Map<String, Boolean> instance);
        
        default T additionalProperty(String key, boolean value) throws InvalidAdditionalPropertyException {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true);
            var instance = getInstance();
            instance.put(key, value);
            return getBuilderAfterAdditionalProperty(instance);
        }
    }
    
    public static class DirectMapMapBuilder implements GenericBuilder<Map<String, Boolean>>, SetterForAdditionalProperties3<DirectMapMapBuilder> {
        private final Map<String, Boolean> instance;
        private static final Set<String> knownKeys = Set.of();
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public DirectMapMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Boolean> build() {
            return instance;
        }
        public Map<String, Boolean> getInstance() {
            return instance;
        }
        public DirectMapMapBuilder getBuilderAfterAdditionalProperty(Map<String, Boolean> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class DirectMapBoxed permits DirectMapBoxedMap {}
    public static final class DirectMapBoxedMap extends DirectMapBoxed {
        public final DirectMapMap data;
        private DirectMapBoxedMap(DirectMapMap data) {
            this.data = data;
        }
    }
    
    
    public static class DirectMap extends JsonSchema implements MapSchemaValidator<DirectMapMap, DirectMapBoxedMap> {
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
        
        public DirectMapMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public DirectMapBoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new DirectMapBoxedMap(validate(arg, configuration));
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
    
    public interface SetterForMapMapOfString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapMapOfString(Map<String, @Nullable Object> instance);
        
        default T map_map_of_string(Map<String, Map<String, String>> value) {
            var instance = getInstance();
            instance.put("map_map_of_string", value);
            return getBuilderAfterMapMapOfString(instance);
        }
    }
    
    public interface SetterForMapOfEnumString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMapOfEnumString(Map<String, @Nullable Object> instance);
        
        default T map_of_enum_string(Map<String, String> value) {
            var instance = getInstance();
            instance.put("map_of_enum_string", value);
            return getBuilderAfterMapOfEnumString(instance);
        }
    }
    
    public interface SetterForDirectMap <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterDirectMap(Map<String, @Nullable Object> instance);
        
        default T direct_map(Map<String, Boolean> value) {
            var instance = getInstance();
            instance.put("direct_map", value);
            return getBuilderAfterDirectMap(instance);
        }
    }
    
    public interface SetterForIndirectMap <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterIndirectMap(Map<String, @Nullable Object> instance);
        
        default T indirect_map(Map<String, Boolean> value) {
            var instance = getInstance();
            instance.put("indirect_map", value);
            return getBuilderAfterIndirectMap(instance);
        }
    }
    
    public static class MapTestMapBuilder extends UnsetAddPropsSetter<MapTestMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForMapMapOfString<MapTestMapBuilder>, SetterForMapOfEnumString<MapTestMapBuilder>, SetterForDirectMap<MapTestMapBuilder>, SetterForIndirectMap<MapTestMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "map_map_of_string",
            "map_of_enum_string",
            "direct_map",
            "indirect_map"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public MapTestMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public MapTestMapBuilder getBuilderAfterMapMapOfString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MapTestMapBuilder getBuilderAfterMapOfEnumString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MapTestMapBuilder getBuilderAfterDirectMap(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MapTestMapBuilder getBuilderAfterIndirectMap(Map<String, @Nullable Object> instance) {
            return this;
        }
        public MapTestMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class MapTest1Boxed permits MapTest1BoxedMap {}
    public static final class MapTest1BoxedMap extends MapTest1Boxed {
        public final MapTestMap data;
        private MapTest1BoxedMap(MapTestMap data) {
            this.data = data;
        }
    }
    
    
    public static class MapTest1 extends JsonSchema implements MapSchemaValidator<MapTestMap, MapTest1BoxedMap> {
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
        
        public MapTestMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public MapTest1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new MapTest1BoxedMap(validate(arg, configuration));
        }
    }

}
