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
import org.openapijsonschematools.client.schemas.DecimalJsonSchema;
import org.openapijsonschematools.client.schemas.MapBuilder;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithDecimalProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Width extends DecimalJsonSchema {
        private static @Nullable Width instance = null;
        public static Width getInstance() {
            if (instance == null) {
                instance = new Width();
            }
            return instance;
        }
    }
    
    
    public static class ObjectWithDecimalPropertiesMap extends FrozenMap<@Nullable Object> {
        protected ObjectWithDecimalPropertiesMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "length",
            "width",
            "cost"
        );
        public static ObjectWithDecimalPropertiesMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithDecimalProperties1.getInstance().validate(arg, configuration);
        }
        
        public String length() throws UnsetPropertyException {
            String key = "length";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for length");
            }
            return (String) value;
        }
        
        public String width() throws UnsetPropertyException {
            String key = "width";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for width");
            }
            return (String) value;
        }
        
        public Money.MoneyMap cost() throws UnsetPropertyException {
            String key = "cost";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Money.MoneyMap)) {
                throw new InvalidTypeException("Invalid value stored for cost");
            }
            return (Money.MoneyMap) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForLength <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterLength(Map<String, @Nullable Object> instance);
        
        default T length(String value) {
            var instance = getInstance();
            instance.put("length", value);
            return getBuilderAfterLength(instance);
        }
    }
    
    public interface SetterForWidth <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterWidth(Map<String, @Nullable Object> instance);
        
        default T width(String value) {
            var instance = getInstance();
            instance.put("width", value);
            return getBuilderAfterWidth(instance);
        }
    }
    
    public interface SetterForCost <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterCost(Map<String, @Nullable Object> instance);
        
        default T cost(Map<String, @Nullable Object> value) {
            var instance = getInstance();
            instance.put("cost", value);
            return getBuilderAfterCost(instance);
        }
    }
    
    public static class ObjectWithDecimalPropertiesMapBuilder extends UnsetAddPropsSetter<ObjectWithDecimalPropertiesMapBuilder> implements MapBuilder<@Nullable Object>, SetterForLength<ObjectWithDecimalPropertiesMapBuilder>, SetterForWidth<ObjectWithDecimalPropertiesMapBuilder>, SetterForCost<ObjectWithDecimalPropertiesMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "length",
            "width",
            "cost"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectWithDecimalPropertiesMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithDecimalPropertiesMapBuilder getBuilderAfterLength(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithDecimalPropertiesMapBuilder getBuilderAfterWidth(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithDecimalPropertiesMapBuilder getBuilderAfterCost(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithDecimalPropertiesMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static class ObjectWithDecimalProperties1 extends JsonSchema implements MapSchemaValidator<ObjectWithDecimalPropertiesMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjectWithDecimalProperties1 instance = null;
    
        protected ObjectWithDecimalProperties1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("length", DecimalPayload.DecimalPayload1.class),
                    new PropertyEntry("width", Width.class),
                    new PropertyEntry("cost", Money.Money1.class)
                ))
            );
        }
    
        public static ObjectWithDecimalProperties1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithDecimalProperties1();
            }
            return instance;
        }
        
        public ObjectWithDecimalPropertiesMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectWithDecimalPropertiesMap(castProperties);
        }
        
        public ObjectWithDecimalPropertiesMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
    }

}
