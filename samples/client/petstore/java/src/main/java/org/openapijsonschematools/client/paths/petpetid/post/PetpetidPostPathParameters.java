package org.openapijsonschematools.client.paths.petpetid.post;
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
import org.openapijsonschematools.client.paths.petpetid.post.parameters.parameter0.Schema0;
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

public class PetpetidPostPathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class PetpetidPostadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable PetpetidPostadditionalProperties instance = null;
        public static PetpetidPostadditionalProperties getInstance() {
            if (instance == null) {
                instance = new PetpetidPostadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class PetpetidPostPathParametersMap extends FrozenMap<Number> {
        protected PetpetidPostPathParametersMap(FrozenMap<Number> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "petId"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PetpetidPostPathParametersMap of(Map<String, Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return PetpetidPostPathParameters1.getInstance().validate(arg, configuration);
        }
        
        public Number petId() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForPetpetidPostpetId <T> {
        Map<String, Number> getInstance();
        T getBuilderAfterPetpetidPostpetId(Map<String, Number> instance);
        
        default T petId(int value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetpetidPostpetId(instance);
        }
        
        default T petId(float value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetpetidPostpetId(instance);
        }
        
        default T petId(long value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetpetidPostpetId(instance);
        }
        
        default T petId(double value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetpetidPostpetId(instance);
        }
    }
    
    public static class PetpetidPostPathParametersMap0Builder implements GenericBuilder<Map<String, Number>> {
        private final Map<String, Number> instance;
        private static final Set<String> knownKeys = Set.of(
            "petId"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PetpetidPostPathParametersMap0Builder(Map<String, Number> instance) {
            this.instance = instance;
        }
        public Map<String, Number> build() {
            return instance;
        }
    }
    
    public static class PetpetidPostPathParametersMapBuilder implements SetterForPetpetidPostpetId<PetpetidPostPathParametersMap0Builder> {
        private final Map<String, Number> instance;
        public PetpetidPostPathParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Number> getInstance() {
            return instance;
        }
        public PetpetidPostPathParametersMap0Builder getBuilderAfterPetpetidPostpetId(Map<String, Number> instance) {
            return new PetpetidPostPathParametersMap0Builder(instance);
        }
    }
    
    
    public sealed interface PetpetidPostPathParameters1Boxed permits PetpetidPostPathParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PetpetidPostPathParameters1BoxedMap(PetpetidPostPathParametersMap data) implements PetpetidPostPathParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PetpetidPostPathParameters1 extends JsonSchema<PetpetidPostPathParameters1Boxed> implements MapSchemaValidator<PetpetidPostPathParametersMap, PetpetidPostPathParameters1BoxedMap> {
        private static @Nullable PetpetidPostPathParameters1 instance = null;
    
        protected PetpetidPostPathParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("petId", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "petId"
                ))
                .additionalProperties(PetpetidPostadditionalProperties.class)
            );
        }
    
        public static PetpetidPostPathParameters1 getInstance() {
            if (instance == null) {
                instance = new PetpetidPostPathParameters1();
            }
            return instance;
        }
        
        public PetpetidPostPathParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Number> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Number)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Number) propertyInstance);
            }
            FrozenMap<Number> castProperties = new FrozenMap<>(properties);
            return new PetpetidPostPathParametersMap(castProperties);
        }
        
        public PetpetidPostPathParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PetpetidPostPathParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PetpetidPostPathParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PetpetidPostPathParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
