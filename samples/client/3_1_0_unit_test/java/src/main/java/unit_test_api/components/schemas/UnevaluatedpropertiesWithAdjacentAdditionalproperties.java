package unit_test_api.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.InvalidAdditionalPropertyException;
import unit_test_api.exceptions.UnsetPropertyException;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.AnyTypeJsonSchema;
import unit_test_api.schemas.GenericBuilder;
import unit_test_api.schemas.NotAnyTypeJsonSchema;
import unit_test_api.schemas.StringJsonSchema;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.schemas.validation.JsonSchema;
import unit_test_api.schemas.validation.JsonSchemaInfo;
import unit_test_api.schemas.validation.MapSchemaValidator;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.PathToSchemasMap;
import unit_test_api.schemas.validation.PropertyEntry;
import unit_test_api.schemas.validation.ValidationMetadata;

public class UnevaluatedpropertiesWithAdjacentAdditionalproperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends AnyTypeJsonSchema.AnyTypeJsonSchema1 {
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class Foo extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Foo instance = null;
        public static Foo getInstance() {
            if (instance == null) {
                instance = new Foo();
            }
            return instance;
        }
    }
    
    
    public static class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap extends FrozenMap<@Nullable Object> {
        protected UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "foo"
        );
        public static UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance().validate(arg, configuration);
        }
        
        public String foo() throws UnsetPropertyException {
            String key = "foo";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for foo");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            return getOrThrow(name);
        }
    }
    
    public interface SetterForFoo <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoo(Map<String, @Nullable Object> instance);
        
        default T foo(String value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
    }
    
    public interface SetterForAdditionalProperties<T> {
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
    
    public static class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFoo<UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder>, SetterForAdditionalProperties<UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "foo"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder getBuilderAfterFoo(Map<String, @Nullable Object> instance) {
            return this;
        }
        public UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static class UnevaluatedProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable UnevaluatedProperties instance = null;
        public static UnevaluatedProperties getInstance() {
            if (instance == null) {
                instance = new UnevaluatedProperties();
            }
            return instance;
        }
    }
    
    
    public sealed interface UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed permits UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap(UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap data) implements UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class UnevaluatedpropertiesWithAdjacentAdditionalproperties1 extends JsonSchema<UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed> implements MapSchemaValidator<UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap, UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable UnevaluatedpropertiesWithAdjacentAdditionalproperties1 instance = null;
    
        protected UnevaluatedpropertiesWithAdjacentAdditionalproperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("foo", Foo.class)
                ))
                .additionalProperties(AdditionalProperties.class)
                .unevaluatedProperties(UnevaluatedProperties.class)
            );
        }
    
        public static UnevaluatedpropertiesWithAdjacentAdditionalproperties1 getInstance() {
            if (instance == null) {
                instance = new UnevaluatedpropertiesWithAdjacentAdditionalproperties1();
            }
            return instance;
        }
        
        public UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap(castProperties);
        }
        
        public UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
