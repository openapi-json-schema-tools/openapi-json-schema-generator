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
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithCollidingProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SomeProp extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable SomeProp instance = null;
        public static SomeProp getInstance() {
            if (instance == null) {
                instance = new SomeProp();
            }
            return instance;
        }
    }
    
    
    public static class Someprop extends MapJsonSchema.MapJsonSchema1 {
        private static @Nullable Someprop instance = null;
        public static Someprop getInstance() {
            if (instance == null) {
                instance = new Someprop();
            }
            return instance;
        }
    }
    
    
    public static class ObjectWithCollidingPropertiesMap extends FrozenMap<@Nullable Object> {
        protected ObjectWithCollidingPropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "someProp",
            "someprop"
        );
        public static ObjectWithCollidingPropertiesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithCollidingProperties1.getInstance().validate(arg, configuration);
        }
        
        public FrozenMap<?> someProp() throws UnsetPropertyException {
            String key = "someProp";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FrozenMap<?>)) {
                throw new RuntimeException("Invalid value stored for someProp");
            }
            return (FrozenMap<?>) value;
        }
        
        public FrozenMap<?> someprop() throws UnsetPropertyException {
            String key = "someprop";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof FrozenMap<?>)) {
                throw new RuntimeException("Invalid value stored for someprop");
            }
            return (FrozenMap<?>) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForSomeProp <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSomeProp(Map<String, @Nullable Object> instance);
        
        default T someProp(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("someProp", value);
            return getBuilderAfterSomeProp(instance);
        }
    }
    
    public interface SetterForSomeprop <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSomeprop(Map<String, @Nullable Object> instance);
        
        default T someprop(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("someprop", value);
            return getBuilderAfterSomeprop(instance);
        }
    }
    
    public static class ObjectWithCollidingPropertiesMapBuilder extends UnsetAddPropsSetter<ObjectWithCollidingPropertiesMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForSomeProp<ObjectWithCollidingPropertiesMapBuilder>, SetterForSomeprop<ObjectWithCollidingPropertiesMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "someProp",
            "someprop"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectWithCollidingPropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithCollidingPropertiesMapBuilder getBuilderAfterSomeProp(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithCollidingPropertiesMapBuilder getBuilderAfterSomeprop(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithCollidingPropertiesMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ObjectWithCollidingProperties1Boxed permits ObjectWithCollidingProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectWithCollidingProperties1BoxedMap(ObjectWithCollidingPropertiesMap data) implements ObjectWithCollidingProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectWithCollidingProperties1 extends JsonSchema<ObjectWithCollidingProperties1Boxed> implements MapSchemaValidator<ObjectWithCollidingPropertiesMap, ObjectWithCollidingProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        component with properties that have name collisions
        */
        private static @Nullable ObjectWithCollidingProperties1 instance = null;
    
        protected ObjectWithCollidingProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("someProp", SomeProp.class),
                    new PropertyEntry("someprop", Someprop.class)
                ))
            );
        }
    
        public static ObjectWithCollidingProperties1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithCollidingProperties1();
            }
            return instance;
        }
        
        public ObjectWithCollidingPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectWithCollidingPropertiesMap(castProperties);
        }
        
        public ObjectWithCollidingPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ObjectWithCollidingProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectWithCollidingProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectWithCollidingProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
