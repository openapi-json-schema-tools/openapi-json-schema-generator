package org.openapijsonschematools.client.paths.petpetid.delete;
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
import org.openapijsonschematools.client.paths.petpetid.delete.parameters.parameter0.Schema0;
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

public class PetpetidDeleteHeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class PetpetidDeleteHeaderParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable PetpetidDeleteHeaderParameters4 instance = null;
        public static PetpetidDeleteHeaderParameters4 getInstance() {
            if (instance == null) {
                instance = new PetpetidDeleteHeaderParameters4();
            }
            return instance;
        }
    }
    
    
    public static class PetpetidDeleteHeaderParameters9 extends FrozenMap<String> {
        protected PetpetidDeleteHeaderParameters9(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "api_key"
        );
        public static PetpetidDeleteHeaderParameters9 of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return PetpetidDeleteHeaderParameters1.getInstance().validate(arg, configuration);
        }
        
        public String api_key() throws UnsetPropertyException {
            return getOrThrow("api_key");
        }
    }
    
    public interface SetterForPetpetidDeleteHeaderParameters2 <T> {
        Map<String, String> getInstance();
        T getBuilderAfterPetpetidDeleteHeaderParameters2(Map<String, String> instance);
        
        default T api_key(String value) {
            var instance = getInstance();
            instance.put("api_key", value);
            return getBuilderAfterPetpetidDeleteHeaderParameters2(instance);
        }
    }
    
    public static class PetpetidDeleteHeaderParameters8 implements GenericBuilder<Map<String, String>>, SetterForPetpetidDeleteHeaderParameters2<PetpetidDeleteHeaderParameters8> {
        private final Map<String, String> instance;
        private static final Set<String> knownKeys = Set.of(
            "api_key"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PetpetidDeleteHeaderParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, String> build() {
            return instance;
        }
        public Map<String, String> getInstance() {
            return instance;
        }
        public PetpetidDeleteHeaderParameters8 getBuilderAfterPetpetidDeleteHeaderParameters2(Map<String, String> instance) {
            return this;
        }
    }
    
    
    public sealed interface PetpetidDeleteHeaderParameters1Boxed permits PetpetidDeleteHeaderParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PetpetidDeleteHeaderParameters1BoxedMap(PetpetidDeleteHeaderParameters9 data) implements PetpetidDeleteHeaderParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PetpetidDeleteHeaderParameters1 extends JsonSchema<PetpetidDeleteHeaderParameters1Boxed> implements MapSchemaValidator<PetpetidDeleteHeaderParameters9, PetpetidDeleteHeaderParameters1BoxedMap> {
        private static @Nullable PetpetidDeleteHeaderParameters1 instance = null;
    
        protected PetpetidDeleteHeaderParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("api_key", Schema0.Schema01.class)
                ))
                .additionalProperties(PetpetidDeleteHeaderParameters4.class)
            );
        }
    
        public static PetpetidDeleteHeaderParameters1 getInstance() {
            if (instance == null) {
                instance = new PetpetidDeleteHeaderParameters1();
            }
            return instance;
        }
        
        public PetpetidDeleteHeaderParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PetpetidDeleteHeaderParameters9(castProperties);
        }
        
        public PetpetidDeleteHeaderParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PetpetidDeleteHeaderParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PetpetidDeleteHeaderParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PetpetidDeleteHeaderParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
