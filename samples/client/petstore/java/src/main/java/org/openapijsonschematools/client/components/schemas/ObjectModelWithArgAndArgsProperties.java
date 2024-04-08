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
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectModelWithArgAndArgsProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Arg extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Arg instance = null;
        public static Arg getInstance() {
            if (instance == null) {
                instance = new Arg();
            }
            return instance;
        }
    }
    
    
    public static class Args extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Args instance = null;
        public static Args getInstance() {
            if (instance == null) {
                instance = new Args();
            }
            return instance;
        }
    }
    
    
    public static class ObjectModelWithArgAndArgsPropertiesMap extends FrozenMap<@Nullable Object> {
        protected ObjectModelWithArgAndArgsPropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "arg",
            "args"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectModelWithArgAndArgsPropertiesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectModelWithArgAndArgsProperties1.getInstance().validate(arg, configuration);
        }
        
        public String arg() {
                        @Nullable Object value = get("arg");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for arg");
            }
            return (String) value;
        }
        
        public String args() {
                        @Nullable Object value = get("args");
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for args");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForArg <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArg(Map<String, @Nullable Object> instance);
        
        default T arg(String value) {
            var instance = getInstance();
            instance.put("arg", value);
            return getBuilderAfterArg(instance);
        }
    }
    
    public interface SetterForArgs <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArgs(Map<String, @Nullable Object> instance);
        
        default T args(String value) {
            var instance = getInstance();
            instance.put("args", value);
            return getBuilderAfterArgs(instance);
        }
    }
    
    public static class ObjectModelWithArgAndArgsPropertiesMap00Builder extends UnsetAddPropsSetter<ObjectModelWithArgAndArgsPropertiesMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "arg",
            "args"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectModelWithArgAndArgsPropertiesMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectModelWithArgAndArgsPropertiesMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class ObjectModelWithArgAndArgsPropertiesMap01Builder implements SetterForArgs<ObjectModelWithArgAndArgsPropertiesMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectModelWithArgAndArgsPropertiesMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectModelWithArgAndArgsPropertiesMap00Builder getBuilderAfterArgs(Map<String, @Nullable Object> instance) {
            return new ObjectModelWithArgAndArgsPropertiesMap00Builder(instance);
        }
    }
    
    public static class ObjectModelWithArgAndArgsPropertiesMap10Builder implements SetterForArg<ObjectModelWithArgAndArgsPropertiesMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectModelWithArgAndArgsPropertiesMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectModelWithArgAndArgsPropertiesMap00Builder getBuilderAfterArg(Map<String, @Nullable Object> instance) {
            return new ObjectModelWithArgAndArgsPropertiesMap00Builder(instance);
        }
    }
    
    public static class ObjectModelWithArgAndArgsPropertiesMapBuilder implements SetterForArg<ObjectModelWithArgAndArgsPropertiesMap01Builder>, SetterForArgs<ObjectModelWithArgAndArgsPropertiesMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public ObjectModelWithArgAndArgsPropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectModelWithArgAndArgsPropertiesMap01Builder getBuilderAfterArg(Map<String, @Nullable Object> instance) {
            return new ObjectModelWithArgAndArgsPropertiesMap01Builder(instance);
        }
        public ObjectModelWithArgAndArgsPropertiesMap10Builder getBuilderAfterArgs(Map<String, @Nullable Object> instance) {
            return new ObjectModelWithArgAndArgsPropertiesMap10Builder(instance);
        }
    }
    
    
    public sealed interface ObjectModelWithArgAndArgsProperties1Boxed permits ObjectModelWithArgAndArgsProperties1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectModelWithArgAndArgsProperties1BoxedMap(ObjectModelWithArgAndArgsPropertiesMap data) implements ObjectModelWithArgAndArgsProperties1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectModelWithArgAndArgsProperties1 extends JsonSchema<ObjectModelWithArgAndArgsProperties1Boxed> implements MapSchemaValidator<ObjectModelWithArgAndArgsPropertiesMap, ObjectModelWithArgAndArgsProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjectModelWithArgAndArgsProperties1 instance = null;
    
        protected ObjectModelWithArgAndArgsProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("arg", Arg.class),
                    new PropertyEntry("args", Args.class)
                ))
                .required(Set.of(
                    "arg",
                    "args"
                ))
            );
        }
    
        public static ObjectModelWithArgAndArgsProperties1 getInstance() {
            if (instance == null) {
                instance = new ObjectModelWithArgAndArgsProperties1();
            }
            return instance;
        }
        
        public ObjectModelWithArgAndArgsPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectModelWithArgAndArgsPropertiesMap(castProperties);
        }
        
        public ObjectModelWithArgAndArgsPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ObjectModelWithArgAndArgsProperties1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectModelWithArgAndArgsProperties1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectModelWithArgAndArgsProperties1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
