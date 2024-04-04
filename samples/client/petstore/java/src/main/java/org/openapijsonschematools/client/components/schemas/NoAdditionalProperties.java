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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class NoAdditionalProperties {
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
    
    
    public static class Id extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Id instance = null;
        public static Id getInstance() {
            if (instance == null) {
                instance = new Id();
            }
            return instance;
        }
    }
    
    
    public static class PetId extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable PetId instance = null;
        public static PetId getInstance() {
            if (instance == null) {
                instance = new PetId();
            }
            return instance;
        }
    }
    
    
    public static class NoAdditionalPropertiesMap extends FrozenMap<Number> {
        protected NoAdditionalPropertiesMap(FrozenMap<Number> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "id"
        );
        public static final Set<String> optionalKeys = Set.of(
            "petId"
        );
        public static NoAdditionalPropertiesMap of(Map<String, Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return NoAdditionalProperties1.getInstance().validate(arg, configuration);
        }
        
        public Number id() {
            try {
                return getOrThrow("version");
            } catch (UnsetPropertyException e) {
                throw new RuntimeException(e);
            }
        }
        
        public Number petId() throws UnsetPropertyException {
            return getOrThrow("petId");
        }
    }
    
    public interface SetterForId <T> {
        Map<String, Number> getInstance();
        T getBuilderAfterId(Map<String, Number> instance);
        
        default T id(int value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(float value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(long value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
        
        default T id(double value) {
            var instance = getInstance();
            instance.put("id", value);
            return getBuilderAfterId(instance);
        }
    }
    
    public interface SetterForPetId <T> {
        Map<String, Number> getInstance();
        T getBuilderAfterPetId(Map<String, Number> instance);
        
        default T petId(int value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetId(instance);
        }
        
        default T petId(float value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetId(instance);
        }
        
        default T petId(long value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetId(instance);
        }
        
        default T petId(double value) {
            var instance = getInstance();
            instance.put("petId", value);
            return getBuilderAfterPetId(instance);
        }
    }
    
    public static class NoAdditionalPropertiesMap0Builder implements GenericBuilder<Map<String, Number>>, SetterForPetId<NoAdditionalPropertiesMap0Builder> {
        private final Map<String, Number> instance;
        private static final Set<String> knownKeys = Set.of(
            "id",
            "petId"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public NoAdditionalPropertiesMap0Builder(Map<String, Number> instance) {
            this.instance = instance;
        }
        public Map<String, Number> build() {
            return instance;
        }
        public Map<String, Number> getInstance() {
            return instance;
        }
        public NoAdditionalPropertiesMap0Builder getBuilderAfterPetId(Map<String, Number> instance) {
            return this;
        }
    }
    
    public static class NoAdditionalPropertiesMapBuilder implements SetterForId<NoAdditionalPropertiesMap0Builder> {
        private final Map<String, Number> instance;
        public NoAdditionalPropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, Number> getInstance() {
            return instance;
        }
        public NoAdditionalPropertiesMap0Builder getBuilderAfterId(Map<String, Number> instance) {
            return new NoAdditionalPropertiesMap0Builder(instance);
        }
    }
    
    
    public sealed interface NoAdditionalProperties1Boxed permits NoAdditionalProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record NoAdditionalProperties1BoxedMap(NoAdditionalPropertiesMap data) implements NoAdditionalProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class NoAdditionalProperties1 extends JsonSchema<NoAdditionalProperties1Boxed> implements MapSchemaValidator<NoAdditionalPropertiesMap, NoAdditionalProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable NoAdditionalProperties1 instance = null;
    
        protected NoAdditionalProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("id", Id.class),
                    new PropertyEntry("petId", PetId.class)
                ))
                .required(Set.of(
                    "id"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static NoAdditionalProperties1 getInstance() {
            if (instance == null) {
                instance = new NoAdditionalProperties1();
            }
            return instance;
        }
        
        public NoAdditionalPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new NoAdditionalPropertiesMap(castProperties);
        }
        
        public NoAdditionalPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
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
        public NoAdditionalProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new NoAdditionalProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public NoAdditionalProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
