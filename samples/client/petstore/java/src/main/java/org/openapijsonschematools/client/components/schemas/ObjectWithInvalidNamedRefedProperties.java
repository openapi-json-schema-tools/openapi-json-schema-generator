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
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithInvalidNamedRefedProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ObjectWithInvalidNamedRefedPropertiesMap extends FrozenMap<@Nullable Object> {
        protected ObjectWithInvalidNamedRefedPropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "!reference",
            "from"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectWithInvalidNamedRefedPropertiesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return ObjectWithInvalidNamedRefedProperties1.getInstance().validate(arg, configuration);
        }
        
        public FromSchema.FromSchemaMap from() {
                        @Nullable Object value = get("from");
            if (!(value instanceof FromSchema.FromSchemaMap)) {
                throw new RuntimeException("Invalid value stored for from");
            }
            return (FromSchema.FromSchemaMap) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForReference <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterReference(Map<String, @Nullable Object> instance);
        
        default T exclamationMarkReference(List<Number> value) {
            var instance = getInstance();
            instance.put("!reference", value);
            return getBuilderAfterReference(instance);
        }
    }
    
    public interface SetterForFrom <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFrom(Map<String, @Nullable Object> instance);
        
        default T from(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("from", value);
            return getBuilderAfterFrom(instance);
        }
    }
    
    public static class ObjectWithInvalidNamedRefedPropertiesMap00Builder extends UnsetAddPropsSetter<ObjectWithInvalidNamedRefedPropertiesMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "!reference",
            "from"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectWithInvalidNamedRefedPropertiesMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithInvalidNamedRefedPropertiesMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ObjectWithInvalidNamedRefedPropertiesMap01Builder implements SetterForFrom<ObjectWithInvalidNamedRefedPropertiesMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectWithInvalidNamedRefedPropertiesMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithInvalidNamedRefedPropertiesMap00Builder getBuilderAfterFrom(Map<String, @Nullable Object> instance) {
            return new ObjectWithInvalidNamedRefedPropertiesMap00Builder(instance);
        }
    }
    
    public static class ObjectWithInvalidNamedRefedPropertiesMap10Builder implements SetterForReference<ObjectWithInvalidNamedRefedPropertiesMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectWithInvalidNamedRefedPropertiesMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithInvalidNamedRefedPropertiesMap00Builder getBuilderAfterReference(Map<String, @Nullable Object> instance) {
            return new ObjectWithInvalidNamedRefedPropertiesMap00Builder(instance);
        }
    }
    
    public static class ObjectWithInvalidNamedRefedPropertiesMapBuilder implements SetterForReference<ObjectWithInvalidNamedRefedPropertiesMap01Builder>, SetterForFrom<ObjectWithInvalidNamedRefedPropertiesMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectWithInvalidNamedRefedPropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithInvalidNamedRefedPropertiesMap01Builder getBuilderAfterReference(Map<String, @Nullable Object> instance) {
            return new ObjectWithInvalidNamedRefedPropertiesMap01Builder(instance);
        }
        public ObjectWithInvalidNamedRefedPropertiesMap10Builder getBuilderAfterFrom(Map<String, @Nullable Object> instance) {
            return new ObjectWithInvalidNamedRefedPropertiesMap10Builder(instance);
        }
    }
    
    
    public sealed interface ObjectWithInvalidNamedRefedProperties1Boxed permits ObjectWithInvalidNamedRefedProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectWithInvalidNamedRefedProperties1BoxedMap(ObjectWithInvalidNamedRefedPropertiesMap data) implements ObjectWithInvalidNamedRefedProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectWithInvalidNamedRefedProperties1 extends JsonSchema<ObjectWithInvalidNamedRefedProperties1Boxed> implements MapSchemaValidator<ObjectWithInvalidNamedRefedPropertiesMap, ObjectWithInvalidNamedRefedProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjectWithInvalidNamedRefedProperties1 instance = null;
    
        protected ObjectWithInvalidNamedRefedProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("from", FromSchema.FromSchema1.class),
                    new PropertyEntry("!reference", ArrayWithValidationsInItems.ArrayWithValidationsInItems1.class)
                ))
                .required(Set.of(
                    "!reference",
                    "from"
                ))
            );
        }
    
        public static ObjectWithInvalidNamedRefedProperties1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithInvalidNamedRefedProperties1();
            }
            return instance;
        }
        
        public ObjectWithInvalidNamedRefedPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectWithInvalidNamedRefedPropertiesMap(castProperties);
        }
        
        public ObjectWithInvalidNamedRefedPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map) {
                return validate((Map<?, ?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ObjectWithInvalidNamedRefedProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjectWithInvalidNamedRefedProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectWithInvalidNamedRefedProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
