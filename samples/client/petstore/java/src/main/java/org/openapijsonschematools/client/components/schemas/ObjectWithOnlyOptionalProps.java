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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithOnlyOptionalProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class A extends StringJsonSchema {
        private static @Nullable A instance = null;
        public static A getInstance() {
            if (instance == null) {
                instance = new A();
            }
            return instance;
        }
    }
    
    
    public static class B extends NumberJsonSchema {
        private static @Nullable B instance = null;
        public static B getInstance() {
            if (instance == null) {
                instance = new B();
            }
            return instance;
        }
    }
    
    
    public static class ObjectWithOnlyOptionalPropsMap extends FrozenMap<Object> {
        protected ObjectWithOnlyOptionalPropsMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "a",
            "b"
        );
        public static ObjectWithOnlyOptionalPropsMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithOnlyOptionalProps1.getInstance().validate(arg, configuration);
        }
        
        public String a() throws UnsetPropertyException {
            String key = "a";
            throwIfKeyNotPresent(key);
            Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for a");
            }
            return (String) value;
        }
        
        public Number b() throws UnsetPropertyException {
            String key = "b";
            throwIfKeyNotPresent(key);
            Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for b");
            }
            return (Number) value;
        }
    }
    
    public interface SetterForA <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterA(Map<String, Object> instance);
        
        default T a(String value) {
            var instance = getInstance();
            instance.put("a", value);
            return getBuilderAfterA(instance);
        }
    }
    
    public interface SetterForB <T> {
        Map<String, Object> getInstance();
        T getBuilderAfterB(Map<String, Object> instance);
        
        default T b(int value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
        
        default T b(float value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
        
        default T b(long value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
        
        default T b(double value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
    }
    
    public static class ObjectWithOnlyOptionalPropsMapBuilder implements GenericBuilder<Map<String, Object>>, SetterForA<ObjectWithOnlyOptionalPropsMapBuilder>, SetterForB<ObjectWithOnlyOptionalPropsMapBuilder> {
        private final Map<String, Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "a",
            "b"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Object> build() {
            return instance;
        }
        public Map<String, Object> getInstance() {
            return instance;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder getBuilderAfterA(Map<String, Object> instance) {
            return this;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder getBuilderAfterB(Map<String, Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class ObjectWithOnlyOptionalProps1Boxed permits ObjectWithOnlyOptionalProps1BoxedMap {}
    public static final class ObjectWithOnlyOptionalProps1BoxedMap extends ObjectWithOnlyOptionalProps1Boxed {
        public final ObjectWithOnlyOptionalPropsMap data;
        private ObjectWithOnlyOptionalProps1BoxedMap(ObjectWithOnlyOptionalPropsMap data) {
            this.data = data;
        }
    }
    
    
    public static class ObjectWithOnlyOptionalProps1 extends JsonSchema implements MapSchemaValidator<ObjectWithOnlyOptionalPropsMap, ObjectWithOnlyOptionalProps1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjectWithOnlyOptionalProps1 instance = null;
    
        protected ObjectWithOnlyOptionalProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("a", A.class),
                    new PropertyEntry("b", B.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static ObjectWithOnlyOptionalProps1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithOnlyOptionalProps1();
            }
            return instance;
        }
        
        public ObjectWithOnlyOptionalPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Object)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Object) propertyInstance);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new ObjectWithOnlyOptionalPropsMap(castProperties);
        }
        
        public ObjectWithOnlyOptionalPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ObjectWithOnlyOptionalProps1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjectWithOnlyOptionalProps1BoxedMap(validate(arg, configuration));
        }
    }

}
