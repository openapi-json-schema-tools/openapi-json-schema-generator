package org.openapijsonschematools.client.paths.petfindbytags.get;
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
import org.openapijsonschematools.client.paths.petfindbytags.get.parameters.parameter0.Schema0;
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

public class PetfindbytagsGetQueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class PetfindbytagsGetadditionalProperties extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 {
        // NotAnyTypeSchema
        private static @Nullable PetfindbytagsGetadditionalProperties instance = null;
        public static PetfindbytagsGetadditionalProperties getInstance() {
            if (instance == null) {
                instance = new PetfindbytagsGetadditionalProperties();
            }
            return instance;
        }
    }
    
    
    public static class PetfindbytagsGetQueryParametersMap extends FrozenMap<Schema0.SchemaList0> {
        protected PetfindbytagsGetQueryParametersMap(FrozenMap<Schema0.SchemaList0> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "tags"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PetfindbytagsGetQueryParametersMap of(Map<String, List<String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return PetfindbytagsGetQueryParameters1.getInstance().validate(arg, configuration);
        }
        
        public Schema0.SchemaList0 tags() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public interface SetterForPetfindbytagsGettags <T> {
        Map<String, List<String>> getInstance();
        T getBuilderAfterPetfindbytagsGettags(Map<String, List<String>> instance);
        
        default T tags(List<String> value) {
            var instance = getInstance();
            instance.put("tags", value);
            return getBuilderAfterPetfindbytagsGettags(instance);
        }
    }
    
    public static class PetfindbytagsGetQueryParametersMap0Builder implements GenericBuilder<Map<String, List<String>>> {
        private final Map<String, List<String>> instance;
        private static final Set<String> knownKeys = Set.of(
            "tags"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public PetfindbytagsGetQueryParametersMap0Builder(Map<String, List<String>> instance) {
            this.instance = instance;
        }
        public Map<String, List<String>> build() {
            return instance;
        }
    }
    
    public static class PetfindbytagsGetQueryParametersMapBuilder implements SetterForPetfindbytagsGettags<PetfindbytagsGetQueryParametersMap0Builder> {
        private final Map<String, List<String>> instance;
        public PetfindbytagsGetQueryParametersMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, List<String>> getInstance() {
            return instance;
        }
        public PetfindbytagsGetQueryParametersMap0Builder getBuilderAfterPetfindbytagsGettags(Map<String, List<String>> instance) {
            return new PetfindbytagsGetQueryParametersMap0Builder(instance);
        }
    }
    
    
    public sealed interface PetfindbytagsGetQueryParameters1Boxed permits PetfindbytagsGetQueryParameters1BoxedMap {
        @Nullable Object getData();
    }
    
    public record PetfindbytagsGetQueryParameters1BoxedMap(PetfindbytagsGetQueryParametersMap data) implements PetfindbytagsGetQueryParameters1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class PetfindbytagsGetQueryParameters1 extends JsonSchema<PetfindbytagsGetQueryParameters1Boxed> implements MapSchemaValidator<PetfindbytagsGetQueryParametersMap, PetfindbytagsGetQueryParameters1BoxedMap> {
        private static @Nullable PetfindbytagsGetQueryParameters1 instance = null;
    
        protected PetfindbytagsGetQueryParameters1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("tags", Schema0.Schema01.class)
                ))
                .required(Set.of(
                    "tags"
                ))
                .additionalProperties(PetfindbytagsGetadditionalProperties.class)
            );
        }
    
        public static PetfindbytagsGetQueryParameters1 getInstance() {
            if (instance == null) {
                instance = new PetfindbytagsGetQueryParameters1();
            }
            return instance;
        }
        
        public PetfindbytagsGetQueryParametersMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new PetfindbytagsGetQueryParametersMap(castProperties);
        }
        
        public PetfindbytagsGetQueryParametersMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public PetfindbytagsGetQueryParameters1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new PetfindbytagsGetQueryParameters1BoxedMap(validate(arg, configuration));
        }
        @Override
        public PetfindbytagsGetQueryParameters1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
