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
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ApiResponseSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Code extends Int32JsonSchema.Int32JsonSchema1 {
        private static @Nullable Code instance = null;
        public static Code getInstance() {
            if (instance == null) {
                instance = new Code();
            }
            return instance;
        }
    }
    
    
    public static class Type extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Type instance = null;
        public static Type getInstance() {
            if (instance == null) {
                instance = new Type();
            }
            return instance;
        }
    }
    
    
    public static class Message extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Message instance = null;
        public static Message getInstance() {
            if (instance == null) {
                instance = new Message();
            }
            return instance;
        }
    }
    
    
    public static class ApiResponseMap extends FrozenMap<@Nullable Object> {
        protected ApiResponseMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "code",
            "type",
            "message"
        );
        public static ApiResponseMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ApiResponseSchema1.getInstance().validate(arg, configuration);
        }
        
        public Number code() throws UnsetPropertyException {
            String key = "code";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for code");
            }
            return (Number) value;
        }
        
        public String type() throws UnsetPropertyException {
            String key = "type";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for type");
            }
            return (String) value;
        }
        
        public String message() throws UnsetPropertyException {
            String key = "message";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for message");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForCode <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCode(Map<String, @Nullable Object> instance);
        
        default T code(int value) {
            var instance = getInstance();
            instance.put("code", value);
            return getBuilderAfterCode(instance);
        }
        
        default T code(float value) {
            var instance = getInstance();
            instance.put("code", value);
            return getBuilderAfterCode(instance);
        }
    }
    
    public interface SetterForType <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterType(Map<String, @Nullable Object> instance);
        
        default T type(String value) {
            var instance = getInstance();
            instance.put("type", value);
            return getBuilderAfterType(instance);
        }
    }
    
    public interface SetterForMessage <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMessage(Map<String, @Nullable Object> instance);
        
        default T message(String value) {
            var instance = getInstance();
            instance.put("message", value);
            return getBuilderAfterMessage(instance);
        }
    }
    
    public static class ApiResponseMapBuilder extends UnsetAddPropsSetter<ApiResponseMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForCode<ApiResponseMapBuilder>, SetterForType<ApiResponseMapBuilder>, SetterForMessage<ApiResponseMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "code",
            "type",
            "message"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ApiResponseMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ApiResponseMapBuilder getBuilderAfterCode(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApiResponseMapBuilder getBuilderAfterType(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApiResponseMapBuilder getBuilderAfterMessage(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ApiResponseMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ApiResponseSchema1Boxed permits ApiResponseSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ApiResponseSchema1BoxedMap(ApiResponseMap data) implements ApiResponseSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ApiResponseSchema1 extends JsonSchema implements MapSchemaValidator<ApiResponseMap, ApiResponseSchema1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ApiResponseSchema1 instance = null;
    
        protected ApiResponseSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("code", Code.class),
                    new PropertyEntry("type", Type.class),
                    new PropertyEntry("message", Message.class)
                ))
            );
        }
    
        public static ApiResponseSchema1 getInstance() {
            if (instance == null) {
                instance = new ApiResponseSchema1();
            }
            return instance;
        }
        
        public ApiResponseMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ApiResponseMap(castProperties);
        }
        
        public ApiResponseMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ApiResponseSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ApiResponseSchema1BoxedMap(validate(arg, configuration));
        }
    }

}
