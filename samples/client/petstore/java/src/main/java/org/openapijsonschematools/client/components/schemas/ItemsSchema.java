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

public class ItemsSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Name extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Name instance = null;
        public static Name getInstance() {
            if (instance == null) {
                instance = new Name();
            }
            return instance;
        }
    }
    
    
    public static class SomeProperty extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable SomeProperty instance = null;
        public static SomeProperty getInstance() {
            if (instance == null) {
                instance = new SomeProperty();
            }
            return instance;
        }
    }
    
    
    public static class SecondAdditionalProperty extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable SecondAdditionalProperty instance = null;
        public static SecondAdditionalProperty getInstance() {
            if (instance == null) {
                instance = new SecondAdditionalProperty();
            }
            return instance;
        }
    }
    
    
    public static class ItemsSchemaMap extends FrozenMap<@Nullable Object> {
        protected ItemsSchemaMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "name",
            "someProperty",
            "secondAdditionalProperty"
        );
        public static ItemsSchemaMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ItemsSchema1.getInstance().validate(arg, configuration);
        }
        
        public String name() throws UnsetPropertyException {
            String key = "name";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for name");
            }
            return (String) value;
        }
        
        public String someProperty() throws UnsetPropertyException {
            String key = "someProperty";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for someProperty");
            }
            return (String) value;
        }
        
        public String secondAdditionalProperty() throws UnsetPropertyException {
            String key = "secondAdditionalProperty";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for secondAdditionalProperty");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForName <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterName(Map<String, @Nullable Object> instance);
        
        default T name(String value) {
            var instance = getInstance();
            instance.put("name", value);
            return getBuilderAfterName(instance);
        }
    }
    
    public interface SetterForSomeProperty <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSomeProperty(Map<String, @Nullable Object> instance);
        
        default T someProperty(String value) {
            var instance = getInstance();
            instance.put("someProperty", value);
            return getBuilderAfterSomeProperty(instance);
        }
    }
    
    public interface SetterForSecondAdditionalProperty <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterSecondAdditionalProperty(Map<String, @Nullable Object> instance);
        
        default T secondAdditionalProperty(String value) {
            var instance = getInstance();
            instance.put("secondAdditionalProperty", value);
            return getBuilderAfterSecondAdditionalProperty(instance);
        }
    }
    
    public static class ItemsSchemaMapBuilder extends UnsetAddPropsSetter<ItemsSchemaMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForName<ItemsSchemaMapBuilder>, SetterForSomeProperty<ItemsSchemaMapBuilder>, SetterForSecondAdditionalProperty<ItemsSchemaMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "name",
            "someProperty",
            "secondAdditionalProperty"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ItemsSchemaMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ItemsSchemaMapBuilder getBuilderAfterName(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ItemsSchemaMapBuilder getBuilderAfterSomeProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ItemsSchemaMapBuilder getBuilderAfterSecondAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ItemsSchemaMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ItemsSchema1Boxed permits ItemsSchema1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ItemsSchema1BoxedMap(ItemsSchemaMap data) implements ItemsSchema1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ItemsSchema1 extends JsonSchema<ItemsSchema1Boxed> implements MapSchemaValidator<ItemsSchemaMap, ItemsSchema1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ItemsSchema1 instance = null;
    
        protected ItemsSchema1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("name", Name.class),
                    new PropertyEntry("someProperty", SomeProperty.class),
                    new PropertyEntry("secondAdditionalProperty", SecondAdditionalProperty.class)
                ))
            );
        }
    
        public static ItemsSchema1 getInstance() {
            if (instance == null) {
                instance = new ItemsSchema1();
            }
            return instance;
        }
        
        public ItemsSchemaMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ItemsSchemaMap(castProperties);
        }
        
        public ItemsSchemaMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ItemsSchema1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ItemsSchema1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ItemsSchema1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
