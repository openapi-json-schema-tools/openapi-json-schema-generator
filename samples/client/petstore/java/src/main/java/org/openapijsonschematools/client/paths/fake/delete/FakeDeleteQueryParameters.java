package org.openapijsonschematools.client.paths.fake.delete;
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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter2.Schema2;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter3.Schema3;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter5.Schema5;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class FakeDeleteQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakeDeleteadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakeDeleteadditionalProperties instance = null;
        public static FakeDeleteadditionalProperties getInstance() {
            if (instance == null) {
                instance = new FakeDeleteadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class FakeDeleteQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected FakeDeleteQueryParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "required_int64_group",
            "required_string_group"
        );
        public static final Set<String> optionalKeys = Set.of(
            "int64_group",
            "string_group"
        );
        public static FakeDeleteQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakeDeleteQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Number required_int64_group() {
                        @Nullable Object value = get("required_int64_group");
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for required_int64_group");
            }
            return (Number) value;
        }
        
        public String required_string_group() {
                        @Nullable Object value = get("required_string_group");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for required_string_group");
            }
            return (String) value;
        }
        
        public Number int64_group() throws UnsetPropertyException {
            String key = "int64_group";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for int64_group");
            }
            return (Number) value;
        }
        
        public String string_group() throws UnsetPropertyException {
            String key = "string_group";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for string_group");
            }
            return (String) value;
        }
    }
    
    public interface SetterForFakeDeleterequiredInt64Group <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeDeleterequiredInt64Group(Map<String, @Nullable Object> instance);
        
        default T required_int64_group(int value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterFakeDeleterequiredInt64Group(instance);
        }
        
        default T required_int64_group(float value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterFakeDeleterequiredInt64Group(instance);
        }
        
        default T required_int64_group(long value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterFakeDeleterequiredInt64Group(instance);
        }
        
        default T required_int64_group(double value) {
            var instance = getInstance();
            instance.put("required_int64_group", value);
            return getBuilderAfterFakeDeleterequiredInt64Group(instance);
        }
    }
    
    public interface SetterForFakeDeleterequiredStringGroup <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeDeleterequiredStringGroup(Map<String, @Nullable Object> instance);
        
        default T required_string_group(String value) {
            var instance = getInstance();
            instance.put("required_string_group", value);
            return getBuilderAfterFakeDeleterequiredStringGroup(instance);
        }
    }
    
    public interface SetterForFakeDeleteint64Group <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeDeleteint64Group(Map<String, @Nullable Object> instance);
        
        default T int64_group(int value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterFakeDeleteint64Group(instance);
        }
        
        default T int64_group(float value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterFakeDeleteint64Group(instance);
        }
        
        default T int64_group(long value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterFakeDeleteint64Group(instance);
        }
        
        default T int64_group(double value) {
            var instance = getInstance();
            instance.put("int64_group", value);
            return getBuilderAfterFakeDeleteint64Group(instance);
        }
    }
    
    public interface SetterForFakeDeletestringGroup <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeDeletestringGroup(Map<String, @Nullable Object> instance);
        
        default T string_group(String value) {
            var instance = getInstance();
            instance.put("string_group", value);
            return getBuilderAfterFakeDeletestringGroup(instance);
        }
    }
    
    public static class FakeDeleteQueryParametersMap00Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFakeDeleteint64Group<FakeDeleteQueryParametersMap00Builder>, SetterForFakeDeletestringGroup<FakeDeleteQueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "required_int64_group",
            "required_string_group",
            "int64_group",
            "string_group"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakeDeleteQueryParametersMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakeDeleteQueryParametersMap00Builder getBuilderAfterFakeDeleteint64Group(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FakeDeleteQueryParametersMap00Builder getBuilderAfterFakeDeletestringGroup(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class FakeDeleteQueryParametersMap01Builder implements SetterForFakeDeleterequiredStringGroup<FakeDeleteQueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakeDeleteQueryParametersMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakeDeleteQueryParametersMap00Builder getBuilderAfterFakeDeleterequiredStringGroup(Map<String, @Nullable Object> instance) {
            return new FakeDeleteQueryParametersMap00Builder(instance);
        }
    }
    
    public static class FakeDeleteQueryParametersMap10Builder implements SetterForFakeDeleterequiredInt64Group<FakeDeleteQueryParametersMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakeDeleteQueryParametersMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakeDeleteQueryParametersMap00Builder getBuilderAfterFakeDeleterequiredInt64Group(Map<String, @Nullable Object> instance) {
            return new FakeDeleteQueryParametersMap00Builder(instance);
        }
    }
    
    public static class FakeDeleteQueryParametersMapBuilder implements SetterForFakeDeleterequiredInt64Group<FakeDeleteQueryParametersMap01Builder>, SetterForFakeDeleterequiredStringGroup<FakeDeleteQueryParametersMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public FakeDeleteQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakeDeleteQueryParametersMap01Builder getBuilderAfterFakeDeleterequiredInt64Group(Map<String, @Nullable Object> instance) {
            return new FakeDeleteQueryParametersMap01Builder(instance);
        }
        public FakeDeleteQueryParametersMap10Builder getBuilderAfterFakeDeleterequiredStringGroup(Map<String, @Nullable Object> instance) {
            return new FakeDeleteQueryParametersMap10Builder(instance);
        }
    }
    
    
    public sealed interface FakeDeleteQueryParameters1Boxed permits FakeDeleteQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakeDeleteQueryParameters1BoxedMap(FakeDeleteQueryParametersMap data) implements FakeDeleteQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakeDeleteQueryParameters1 extends JsonSchema<FakeDeleteQueryParameters1Boxed> implements MapSchemaValidator<FakeDeleteQueryParametersMap, FakeDeleteQueryParameters1BoxedMap> {
        private static @Nullable FakeDeleteQueryParameters1 instance = null;
    
        protected FakeDeleteQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("required_string_group", Schema0.Schema01.class),
                    new PropertyEntry("int64_group", Schema5.Schema51.class),
                    new PropertyEntry("string_group", Schema3.Schema31.class),
                    new PropertyEntry("required_int64_group", Schema2.Schema21.class)
                ))
                .required(Set.of(
                    "required_int64_group",
                    "required_string_group"
                ))
                .additionalProperties(FakeDeleteadditionalProperties.class)
            );
        }
    
        public static FakeDeleteQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FakeDeleteQueryParameters1();
            }
            return instance;
        }
        
        public FakeDeleteQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FakeDeleteQueryParametersMap(castProperties);
        }
        
        public FakeDeleteQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakeDeleteQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakeDeleteQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakeDeleteQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
