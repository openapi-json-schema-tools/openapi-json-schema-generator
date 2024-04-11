package org.openapijsonschematools.client.paths.storeorderorderid.delete;
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
import org.openapijsonschematools.client.paths.storeorderorderid.delete.parameters.parameter0.Schema0;
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

public class StoreorderorderidDeletePathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class StoreorderorderidDeleteadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable StoreorderorderidDeleteadditionalProperties instance = null;
        public static StoreorderorderidDeleteadditionalProperties getInstance() {
            if (instance == null) {
                instance = new StoreorderorderidDeleteadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class StoreorderorderidDeletePathParametersMap extends FrozenMap<String> {
        protected StoreorderorderidDeletePathParametersMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "order_id"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static StoreorderorderidDeletePathParametersMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return StoreorderorderidDeletePathParameters1.getInstance().validate(arg, configuration);
        }
        
        public String order_id() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForStoreorderorderidDeleteorderId <T> {
        Map<String, String> getInstance();
        T getBuilderAfterStoreorderorderidDeleteorderId(Map<String, String> instance);
        
        default T order_id(String value) {
            var instance = getInstance();
            instance.put("order_id", value);
            return getBuilderAfterStoreorderorderidDeleteorderId(instance);
        }
    }
    
    public static class StoreorderorderidDeletePathParametersMap0Builder implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "order_id"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public StoreorderorderidDeletePathParametersMap0Builder(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class StoreorderorderidDeletePathParametersMapBuilder implements SetterForStoreorderorderidDeleteorderId<StoreorderorderidDeletePathParametersMap0Builder> {
        private final Map<String, String> instance;
        public StoreorderorderidDeletePathParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public StoreorderorderidDeletePathParametersMap0Builder getBuilderAfterStoreorderorderidDeleteorderId(Map<String, String> instance) {
            return new StoreorderorderidDeletePathParametersMap0Builder(instance);
        }
    }
    
    
    public sealed interface StoreorderorderidDeletePathParameters1Boxed permits StoreorderorderidDeletePathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record StoreorderorderidDeletePathParameters1BoxedMap(StoreorderorderidDeletePathParametersMap data) implements StoreorderorderidDeletePathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class StoreorderorderidDeletePathParameters1 extends JsonSchema<StoreorderorderidDeletePathParameters1Boxed> implements MapSchemaValidator<StoreorderorderidDeletePathParametersMap, StoreorderorderidDeletePathParameters1BoxedMap> {
        private static @Nullable StoreorderorderidDeletePathParameters1 instance = null;
    
        protected StoreorderorderidDeletePathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("order_id", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "order_id"
                ))
                .additionalProperties(StoreorderorderidDeleteadditionalProperties.class)
            );
        }
    
        public static StoreorderorderidDeletePathParameters1 getInstance() {
            if (instance == null) {
                instance = new StoreorderorderidDeletePathParameters1();
            }
            return instance;
        }
        
        public StoreorderorderidDeletePathParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new StoreorderorderidDeletePathParametersMap(castProperties);
        }
        
        public StoreorderorderidDeletePathParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public StoreorderorderidDeletePathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new StoreorderorderidDeletePathParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public StoreorderorderidDeletePathParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
