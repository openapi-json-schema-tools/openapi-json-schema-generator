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

public class ObjectModelWithRefProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class ObjectModelWithRefPropsMap extends FrozenMap<@Nullable Object> {
        protected ObjectModelWithRefPropsMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "myNumber",
            "myString",
            "myBoolean"
        );
        public static ObjectModelWithRefPropsMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectModelWithRefProps1.getInstance().validate(arg, configuration);
        }
        
        public Number myNumber() throws UnsetPropertyException {
            String key = "myNumber";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new InvalidTypeException("Invalid value stored for myNumber");
            }
            return (Number) value;
        }
        
        public String myString() throws UnsetPropertyException {
            String key = "myString";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for myString");
            }
            return (String) value;
        }
        
        public boolean myBoolean() throws UnsetPropertyException {
            String key = "myBoolean";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Boolean)) {
                throw new InvalidTypeException("Invalid value stored for myBoolean");
            }
            return (boolean) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForMyNumber <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMyNumber(Map<String, @Nullable Object> instance);
        
        default T myNumber(int value) {
            var instance = getInstance();
            instance.put("myNumber", value);
            return getBuilderAfterMyNumber(instance);
        }
        
        default T myNumber(float value) {
            var instance = getInstance();
            instance.put("myNumber", value);
            return getBuilderAfterMyNumber(instance);
        }
        
        default T myNumber(long value) {
            var instance = getInstance();
            instance.put("myNumber", value);
            return getBuilderAfterMyNumber(instance);
        }
        
        default T myNumber(double value) {
            var instance = getInstance();
            instance.put("myNumber", value);
            return getBuilderAfterMyNumber(instance);
        }
    }
    
    public interface SetterForMyString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMyString(Map<String, @Nullable Object> instance);
        
        default T myString(String value) {
            var instance = getInstance();
            instance.put("myString", value);
            return getBuilderAfterMyString(instance);
        }
    }
    
    public interface SetterForMyBoolean <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterMyBoolean(Map<String, @Nullable Object> instance);
        
        default T myBoolean(boolean value) {
            var instance = getInstance();
            instance.put("myBoolean", value);
            return getBuilderAfterMyBoolean(instance);
        }
    }
    
    public static class ObjectModelWithRefPropsMapBuilder extends UnsetAddPropsSetter<ObjectModelWithRefPropsMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForMyNumber<ObjectModelWithRefPropsMapBuilder>, SetterForMyString<ObjectModelWithRefPropsMapBuilder>, SetterForMyBoolean<ObjectModelWithRefPropsMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "myNumber",
            "myString",
            "myBoolean"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectModelWithRefPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectModelWithRefPropsMapBuilder getBuilderAfterMyNumber(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectModelWithRefPropsMapBuilder getBuilderAfterMyString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectModelWithRefPropsMapBuilder getBuilderAfterMyBoolean(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectModelWithRefPropsMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static class ObjectModelWithRefProps1 extends JsonSchema implements MapSchemaValidator<ObjectModelWithRefPropsMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations
        */
        private static @Nullable ObjectModelWithRefProps1 instance = null;
    
        protected ObjectModelWithRefProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("myNumber", NumberWithValidations.NumberWithValidations1.class),
                    new PropertyEntry("myString", StringSchema.StringSchema1.class),
                    new PropertyEntry("myBoolean", BooleanSchema.BooleanSchema1.class)
                ))
            );
        }
    
        public static ObjectModelWithRefProps1 getInstance() {
            if (instance == null) {
                instance = new ObjectModelWithRefProps1();
            }
            return instance;
        }
        
        public ObjectModelWithRefPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectModelWithRefPropsMap(castProperties);
        }
        
        public ObjectModelWithRefPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public static abstract sealed class ObjectModelWithRefProps1Boxed permits ObjectModelWithRefProps1BoxedMap {}
        public static final class ObjectModelWithRefProps1BoxedMap extends ObjectModelWithRefProps1Boxed {
            public final ObjectModelWithRefPropsMap data;
            private ObjectModelWithRefProps1BoxedMap(ObjectModelWithRefPropsMap data) {
                this.data = data;
            }
        }
        public ObjectModelWithRefProps1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ObjectModelWithRefProps1BoxedMap(validate(arg, configuration));
        }
    }

}
