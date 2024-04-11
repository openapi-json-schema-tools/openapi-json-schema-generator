package org.openapijsonschematools.client.paths.fakeinlinecomposition.post;
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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1;
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

public class FakeinlinecompositionPostQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakeinlinecompositionPostadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakeinlinecompositionPostadditionalProperties instance = null;
        public static FakeinlinecompositionPostadditionalProperties getInstance() {
            if (instance == null) {
                instance = new FakeinlinecompositionPostadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class FakeinlinecompositionPostQueryParametersMap extends FrozenMap<@Nullable Object> {
        protected FakeinlinecompositionPostQueryParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "compositionAtRoot",
            "compositionInProperty"
        );
        public static FakeinlinecompositionPostQueryParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakeinlinecompositionPostQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public @Nullable Object compositionAtRoot() throws UnsetPropertyException {
            String key = "compositionAtRoot";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Object)) {
                throw new RuntimeException("Invalid value stored for compositionAtRoot");
            }
            return (@Nullable Object) value;
        }
        
        public Schema1.SchemaMap1 compositionInProperty() throws UnsetPropertyException {
            String key = "compositionInProperty";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Schema1.SchemaMap1)) {
                throw new RuntimeException("Invalid value stored for compositionInProperty");
            }
            return (Schema1.SchemaMap1) value;
        }
    }
    
    public interface SetterForFakeinlinecompositionPostcompositionAtRoot <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(Map<String, @Nullable Object> instance);
        
        default T compositionAtRoot(Void value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", null);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(boolean value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(String value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(int value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(float value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(long value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(double value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(List<?> value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
        
        default T compositionAtRoot(Map<String, ?> value) {
            var instance = getInstance();
            instance.put("compositionAtRoot", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(instance);
        }
    }
    
    public interface SetterForFakeinlinecompositionPostcompositionInProperty <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFakeinlinecompositionPostcompositionInProperty(Map<String, @Nullable Object> instance);
        
        default T compositionInProperty(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("compositionInProperty", value);
            return getBuilderAfterFakeinlinecompositionPostcompositionInProperty(instance);
        }
    }
    
    public static class FakeinlinecompositionPostQueryParametersMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForFakeinlinecompositionPostcompositionAtRoot<FakeinlinecompositionPostQueryParametersMapBuilder>, SetterForFakeinlinecompositionPostcompositionInProperty<FakeinlinecompositionPostQueryParametersMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "compositionAtRoot",
            "compositionInProperty"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakeinlinecompositionPostQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public FakeinlinecompositionPostQueryParametersMapBuilder getBuilderAfterFakeinlinecompositionPostcompositionAtRoot(Map<String, @Nullable Object> instance) {
            return this;
        }
        public FakeinlinecompositionPostQueryParametersMapBuilder getBuilderAfterFakeinlinecompositionPostcompositionInProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface FakeinlinecompositionPostQueryParameters1Boxed permits FakeinlinecompositionPostQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakeinlinecompositionPostQueryParameters1BoxedMap(FakeinlinecompositionPostQueryParametersMap data) implements FakeinlinecompositionPostQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakeinlinecompositionPostQueryParameters1 extends JsonSchema<FakeinlinecompositionPostQueryParameters1Boxed> implements MapSchemaValidator<FakeinlinecompositionPostQueryParametersMap, FakeinlinecompositionPostQueryParameters1BoxedMap> {
        private static @Nullable FakeinlinecompositionPostQueryParameters1 instance = null;
    
        protected FakeinlinecompositionPostQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("compositionAtRoot", Schema0.Schema01.class),
                    new PropertyEntry("compositionInProperty", Schema1.Schema11.class)
                ))
                .additionalProperties(FakeinlinecompositionPostadditionalProperties.class)
            );
        }
    
        public static FakeinlinecompositionPostQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FakeinlinecompositionPostQueryParameters1();
            }
            return instance;
        }
        
        public FakeinlinecompositionPostQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FakeinlinecompositionPostQueryParametersMap(castProperties);
        }
        
        public FakeinlinecompositionPostQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakeinlinecompositionPostQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakeinlinecompositionPostQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakeinlinecompositionPostQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
