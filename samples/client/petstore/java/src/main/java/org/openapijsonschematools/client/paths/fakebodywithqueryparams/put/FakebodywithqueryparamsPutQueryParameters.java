package org.openapijsonschematools.client.paths.fakebodywithqueryparams.put;
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
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.parameters.parameter0.Schema0;
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

public class FakebodywithqueryparamsPutQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class FakebodywithqueryparamsPutQueryParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable FakebodywithqueryparamsPutQueryParameters4 instance = null;
        public static FakebodywithqueryparamsPutQueryParameters4 getInstance() {
            if (instance == null) {
                instance = new FakebodywithqueryparamsPutQueryParameters4();
            }
            return instance;
        }
    }
    
    
    public static class FakebodywithqueryparamsPutQueryParameters9 extends FrozenMap<String> {
        protected FakebodywithqueryparamsPutQueryParameters9(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "query"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static FakebodywithqueryparamsPutQueryParameters9 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return FakebodywithqueryparamsPutQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public String query() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForFakebodywithqueryparamsPutQueryParameters2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterFakebodywithqueryparamsPutQueryParameters2(Map<String, String> instance);
        
        default T query(String value) {
            var instance = getInstance();
            instance.put("query", value);
            return getBuilderAfterFakebodywithqueryparamsPutQueryParameters2(instance);
        }
    }
    
    public static class FakebodywithqueryparamsPutQueryParameters10 implements GenericBuilder<Map<String, String>> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "query"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public FakebodywithqueryparamsPutQueryParameters10(Map<String, String> instance) {
            this.instance = instance;
        }
        public Map<String, String> build() {
            return instance;
        }
    }
    
    public static class FakebodywithqueryparamsPutQueryParameters8 implements SetterForFakebodywithqueryparamsPutQueryParameters2<FakebodywithqueryparamsPutQueryParameters10> {
        private final Map<String, String> instance;
        public FakebodywithqueryparamsPutQueryParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public FakebodywithqueryparamsPutQueryParameters10 getBuilderAfterFakebodywithqueryparamsPutQueryParameters2(Map<String, String> instance) {
            return new FakebodywithqueryparamsPutQueryParameters10(instance);
        }
    }
    
    
    public sealed interface FakebodywithqueryparamsPutQueryParameters1Boxed permits FakebodywithqueryparamsPutQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record FakebodywithqueryparamsPutQueryParameters1BoxedMap(FakebodywithqueryparamsPutQueryParameters9 data) implements FakebodywithqueryparamsPutQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class FakebodywithqueryparamsPutQueryParameters1 extends JsonSchema<FakebodywithqueryparamsPutQueryParameters1Boxed> implements MapSchemaValidator<FakebodywithqueryparamsPutQueryParameters9, FakebodywithqueryparamsPutQueryParameters1BoxedMap> {
        private static @Nullable FakebodywithqueryparamsPutQueryParameters1 instance = null;
    
        protected FakebodywithqueryparamsPutQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("query", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "query"
                ))
                .additionalProperties(FakebodywithqueryparamsPutQueryParameters4.class)
            );
        }
    
        public static FakebodywithqueryparamsPutQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new FakebodywithqueryparamsPutQueryParameters1();
            }
            return instance;
        }
        
        public FakebodywithqueryparamsPutQueryParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new FakebodywithqueryparamsPutQueryParameters9(castProperties);
        }
        
        public FakebodywithqueryparamsPutQueryParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public FakebodywithqueryparamsPutQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new FakebodywithqueryparamsPutQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public FakebodywithqueryparamsPutQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
