package org.openapijsonschematools.client.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded;
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
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Param extends StringJsonSchema {
        private static @Nullable Param instance = null;
        public static Param getInstance() {
            if (instance == null) {
                instance = new Param();
            }
            return instance;
        }
    }
    
    
    public static class Param2 extends StringJsonSchema {
        private static @Nullable Param2 instance = null;
        public static Param2 getInstance() {
            if (instance == null) {
                instance = new Param2();
            }
            return instance;
        }
    }
    
    
    public static class SchemaMap extends FrozenMap<@Nullable Object> {
        protected SchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "param",
            "param2"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static SchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.getInstance().validate(arg, configuration);
        }
        
        public String param() {
                        @Nullable Object value = get("param");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for param");
            }
            return (String) value;
        }
        
        public String param2() {
                        @Nullable Object value = get("param2");
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for param2");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForParam <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterParam(Map<String, @Nullable Object> instance);
        
        default T param(String value) {
            var instance = getInstance();
            instance.put("param", value);
            return getBuilderAfterParam(instance);
        }
    }
    
    public interface SetterForParam2 <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterParam2(Map<String, @Nullable Object> instance);
        
        default T param2(String value) {
            var instance = getInstance();
            instance.put("param2", value);
            return getBuilderAfterParam2(instance);
        }
    }
    
    public static class SchemaMap00Builder extends UnsetAddPropsSetter<SchemaMap00Builder> implements GenericBuilder<Map<String, @Nullable Object>> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "param",
            "param2"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public SchemaMap00Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap00Builder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    public static class SchemaMap01Builder implements SetterForParam2<SchemaMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap01Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap00Builder getBuilderAfterParam2(Map<String, @Nullable Object> instance) {
            return new SchemaMap00Builder(instance);
        }
    }
    
    public static class SchemaMap10Builder implements SetterForParam<SchemaMap00Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMap10Builder(Map<String, @Nullable Object> instance) {
            this.instance = instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap00Builder getBuilderAfterParam(Map<String, @Nullable Object> instance) {
            return new SchemaMap00Builder(instance);
        }
    }
    
    public static class SchemaMapBuilder implements SetterForParam<SchemaMap01Builder>, SetterForParam2<SchemaMap10Builder> {
        private final Map<String, @Nullable Object> instance;
        public SchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public SchemaMap01Builder getBuilderAfterParam(Map<String, @Nullable Object> instance) {
            return new SchemaMap01Builder(instance);
        }
        public SchemaMap10Builder getBuilderAfterParam2(Map<String, @Nullable Object> instance) {
            return new SchemaMap10Builder(instance);
        }
    }
    
    
    public static abstract sealed class Schema1Boxed permits Schema1BoxedMap {}
    public static final class Schema1BoxedMap extends Schema1Boxed {
        public final SchemaMap data;
        private Schema1BoxedMap(SchemaMap data) {
            this.data = data;
        }
    }
    
    
    public static class Schema1 extends JsonSchema implements MapSchemaValidator<SchemaMap, Schema1BoxedMap> {
        private static @Nullable Schema1 instance = null;
    
        protected Schema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("param", Param.class),
                    new PropertyEntry("param2", Param2.class)
                ))
                .required(Set.of(
                    "param",
                    "param2"
                ))
            );
        }
    
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
        
        public SchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, @Nullable Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                @Nullable Object entryKey = entry.getKey();
                if (!(entryKey instanceof String)) {
                    throw new InvalidTypeException("Invalid non-string key value");
                }
                String propertyName = (String) entryKey;
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(propertyPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema propertySchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object propertyInstance = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, propertyInstance);
            }
            FrozenMap<@Nullable Object> castProperties = new FrozenMap<>(properties);
            return new SchemaMap(castProperties);
        }
        
        public SchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public Schema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Schema1BoxedMap(validate(arg, configuration));
        }
    }

}
