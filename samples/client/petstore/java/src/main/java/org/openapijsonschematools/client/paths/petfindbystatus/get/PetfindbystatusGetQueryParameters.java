package org.openapijsonschematools.client.paths.petfindbystatus.get;
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
import org.openapijsonschematools.client.paths.petfindbystatus.get.parameters.parameter0.Schema0;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class PetfindbystatusGetQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class PetfindbystatusGetQueryParameters4 extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable PetfindbystatusGetQueryParameters4 instance = null;
        public static PetfindbystatusGetQueryParameters4 getInstance() {
            if (instance == null) {
                instance = new PetfindbystatusGetQueryParameters4();
            }
            return instance;
        }
    }
    
    
    public static class PetfindbystatusGetQueryParameters9 extends FrozenMap<Schema0.SchemaList0> {
        protected PetfindbystatusGetQueryParameters9(FrozenMap<Schema0.SchemaList0> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "status"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PetfindbystatusGetQueryParameters9 of(Map<String, List<String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return PetfindbystatusGetQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema0.SchemaList0 status() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForPetfindbystatusGetQueryParameters2 <T> {
        Map<String, List<String>> getInstance();
        T getBuilderAfterPetfindbystatusGetQueryParameters2(Map<String, List<String>> instance);
        
        default T status(List<String> value) {
            var instance = getInstance();
            instance.put("status", value);
            return getBuilderAfterPetfindbystatusGetQueryParameters2(instance);
        }
    }
    
    public static class PetfindbystatusGetQueryParameters10 implements GenericBuilder<Map<String, List<String>>> {
        private final Map<String, List<String>> instance;
        private static final Set<String> knownKeys = Set.of(
            "status"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PetfindbystatusGetQueryParameters10(Map<String, List<String>> instance) {
            this.instance = instance;
        }
        public Map<String, List<String>> build() {
            return instance;
        }
    }
    
    public static class PetfindbystatusGetQueryParameters8 implements SetterForPetfindbystatusGetQueryParameters2<PetfindbystatusGetQueryParameters10> {
        private final Map<String, List<String>> instance;
        public PetfindbystatusGetQueryParameters8() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, List<String>> getInstance() {
            return instance;
        }
        public PetfindbystatusGetQueryParameters10 getBuilderAfterPetfindbystatusGetQueryParameters2(Map<String, List<String>> instance) {
            return new PetfindbystatusGetQueryParameters10(instance);
        }
    }
    
    
    public sealed interface PetfindbystatusGetQueryParameters1Boxed permits PetfindbystatusGetQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PetfindbystatusGetQueryParameters1BoxedMap(PetfindbystatusGetQueryParameters9 data) implements PetfindbystatusGetQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PetfindbystatusGetQueryParameters1 extends JsonSchema<PetfindbystatusGetQueryParameters1Boxed> implements MapSchemaValidator<PetfindbystatusGetQueryParameters9, PetfindbystatusGetQueryParameters1BoxedMap> {
        private static @Nullable PetfindbystatusGetQueryParameters1 instance = null;
    
        protected PetfindbystatusGetQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("status", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "status"
                ))
                .additionalProperties(PetfindbystatusGetQueryParameters4.class)
            );
        }
    
        public static PetfindbystatusGetQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new PetfindbystatusGetQueryParameters1();
            }
            return instance;
        }
        
        public PetfindbystatusGetQueryParameters9 getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Schema0.SchemaList0> properties = new LinkedHashMap<>();
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
                if (!(propertyInstance instanceof Schema0.SchemaList0)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                properties.put(propertyName, (Schema0.SchemaList0) propertyInstance);
            }
            FrozenMap<Schema0.SchemaList0> castProperties = new FrozenMap<>(properties);
            return new PetfindbystatusGetQueryParameters9(castProperties);
        }
        
        public PetfindbystatusGetQueryParameters9 validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PetfindbystatusGetQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PetfindbystatusGetQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PetfindbystatusGetQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
