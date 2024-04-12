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
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter1.Schema1;
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter4.Schema4;
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

public class FakeDeleteHeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable AdditionalProperties instance = null;
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class HeaderParametersMap extends FrozenMap<@Nullable Object> {
        protected HeaderParametersMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "required_boolean_group"
        );
        public static final Set<String> optionalKeys = Set.of(
            "boolean_group"
        );
        public static HeaderParametersMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakeDeleteHeaderParameters1.getInstance().validate(arg, configuration);
        }
        
        public String required_boolean_group() {
                        @Nullable Object value = get("required_boolean_group");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for required_boolean_group");
            }
            return (String) value;
        }
        
        public String boolean_group() throws UnsetPropertyException {
            String key = "boolean_group";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for boolean_group");
            }
            return (String) value;
        }
    }
    
    public interface SetterForRequiredBooleanGroup <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterRequiredBooleanGroup(Map<String, @Nullable Object> instance);
        
        default T required_boolean_group(String value) {
            var instance = getInstance();
            instance.put("required_boolean_group", value);
            return getBuilderAfterRequiredBooleanGroup(instance);
        }
        
        default T required_boolean_group(Schema1.StringSchemaEnums1 value) {
            var instance = getInstance();
            instance.put("required_boolean_group", value.value());
            return getBuilderAfterRequiredBooleanGroup(instance);
        }
    }
    
    public interface SetterForBooleanGroup <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterBooleanGroup(Map<String, @Nullable Object> instance);
        
        default T boolean_group(String value) {
            var instance = getInstance();
            instance.put("boolean_group", value);
            return getBuilderAfterBooleanGroup(instance);
        }
        
        default T boolean_group(Schema4.StringSchemaEnums4 value) {
            var instance = getInstance();
            instance.put("boolean_group", value.value());
            return getBuilderAfterBooleanGroup(instance);
        }
    }
    
    public static class HeaderParametersMap0Builder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForBooleanGroup<HeaderParametersMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "required_boolean_group",
            "boolean_group"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public HeaderParametersMap0Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeaderParametersMap0Builder getBuilderAfterBooleanGroup(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class HeaderParametersMapBuilder implements SetterForRequiredBooleanGroup<HeaderParametersMap0Builder> {
        private final Map<String, @Nullable Object> instance;
        public HeaderParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HeaderParametersMap0Builder getBuilderAfterRequiredBooleanGroup(Map<String, @Nullable Object> instance) {
            return new HeaderParametersMap0Builder(instance);
        }
    }
    
    
    public sealed interface FakeDeleteHeaderParameters1Boxed permits FakeDeleteHeaderParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakeDeleteHeaderParameters1BoxedMap(HeaderParametersMap data) implements FakeDeleteHeaderParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakeDeleteHeaderParameters1 extends JsonSchema<FakeDeleteHeaderParameters1Boxed> implements MapSchemaValidator<HeaderParametersMap, FakeDeleteHeaderParameters1BoxedMap> {
        private static @Nullable FakeDeleteHeaderParameters1 instance = null;
    
        protected FakeDeleteHeaderParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("required_boolean_group", Schema1.Schema11.class),
                    new PropertyEntry("boolean_group", Schema4.Schema41.class)
                ))
                .required(Set.of(
                    "required_boolean_group"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static FakeDeleteHeaderParameters1 getInstance() {
            if (instance == null) {
                instance = new FakeDeleteHeaderParameters1();
            }
            return instance;
        }
        
        public HeaderParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new HeaderParametersMap(castProperties);
        }
        
        public HeaderParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakeDeleteHeaderParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakeDeleteHeaderParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakeDeleteHeaderParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
