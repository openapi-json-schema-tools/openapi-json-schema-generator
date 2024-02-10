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
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class HasOnlyReadOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Bar extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Bar instance = null;
        public static Bar getInstance() {
            if (instance == null) {
                instance = new Bar();
            }
            return instance;
        }
    }
    
    
    public static class Foo extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Foo instance = null;
        public static Foo getInstance() {
            if (instance == null) {
                instance = new Foo();
            }
            return instance;
        }
    }
    
    
    public static class HasOnlyReadOnlyMap extends FrozenMap<@Nullable Object> {
        protected HasOnlyReadOnlyMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "bar",
            "foo"
        );
        public static HasOnlyReadOnlyMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return HasOnlyReadOnly1.getInstance().validate(arg, configuration);
        }
        
        public String bar() throws UnsetPropertyException {
            String key = "bar";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for bar");
            }
            return (String) value;
        }
        
        public String foo() throws UnsetPropertyException {
            String key = "foo";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new InvalidTypeException("Invalid value stored for foo");
            }
            return (String) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForBar <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterBar(Map<String, @Nullable Object> instance);
        
        default T bar(String value) {
            var instance = getInstance();
            instance.put("bar", value);
            return getBuilderAfterBar(instance);
        }
    }
    
    public interface SetterForFoo <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterFoo(Map<String, @Nullable Object> instance);
        
        default T foo(String value) {
            var instance = getInstance();
            instance.put("foo", value);
            return getBuilderAfterFoo(instance);
        }
    }
    
    public static class HasOnlyReadOnlyMapBuilder extends UnsetAddPropsSetter<HasOnlyReadOnlyMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForBar<HasOnlyReadOnlyMapBuilder>, SetterForFoo<HasOnlyReadOnlyMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "bar",
            "foo"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public HasOnlyReadOnlyMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public HasOnlyReadOnlyMapBuilder getBuilderAfterBar(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HasOnlyReadOnlyMapBuilder getBuilderAfterFoo(Map<String, @Nullable Object> instance) {
            return this;
        }
        public HasOnlyReadOnlyMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class HasOnlyReadOnly1Boxed permits HasOnlyReadOnly1BoxedMap {}
    
    public static final class HasOnlyReadOnly1BoxedMap extends HasOnlyReadOnly1Boxed {
        public final HasOnlyReadOnlyMap data;
        private HasOnlyReadOnly1BoxedMap(HasOnlyReadOnlyMap data) {
            this.data = data;
        }
    }
    
    
    public static class HasOnlyReadOnly1 extends JsonSchema implements MapSchemaValidator<HasOnlyReadOnlyMap, HasOnlyReadOnly1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable HasOnlyReadOnly1 instance = null;
    
        protected HasOnlyReadOnly1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("bar", Bar.class),
                    new PropertyEntry("foo", Foo.class)
                ))
            );
        }
    
        public static HasOnlyReadOnly1 getInstance() {
            if (instance == null) {
                instance = new HasOnlyReadOnly1();
            }
            return instance;
        }
        
        public HasOnlyReadOnlyMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new HasOnlyReadOnlyMap(castProperties);
        }
        
        public HasOnlyReadOnlyMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public HasOnlyReadOnly1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new HasOnlyReadOnly1BoxedMap(validate(arg, configuration));
        }
    }

}
