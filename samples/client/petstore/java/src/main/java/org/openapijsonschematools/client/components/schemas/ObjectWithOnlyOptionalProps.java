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
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ObjectWithOnlyOptionalProps {
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
    
    
    public static class A extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable A instance = null;
        public static A getInstance() {
            if (instance == null) {
                instance = new A();
            }
            return instance;
        }
    }
    
    
    public static class B extends NumberJsonSchema.NumberJsonSchema1 {
        private static @Nullable B instance = null;
        public static B getInstance() {
            if (instance == null) {
                instance = new B();
            }
            return instance;
        }
    }
    
    
    public static class ArrayPropertyList extends FrozenList<String> {
        protected ArrayPropertyList(FrozenList<String> m) {
            super(m);
        }
        public static ArrayPropertyList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayProperty.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayPropertyListBuilder {
        // class to build List<String>
        private final List<String> list;
    
        public ArrayPropertyListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayPropertyListBuilder(List<String> list) {
            this.list = list;
        }
        
        public ArrayPropertyListBuilder add(String item) {
            list.add(item);
            return this;
        }
        
        public ArrayPropertyListBuilder add(EnumClass.StringEnumClassEnums item) {
            list.add(item.value());
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayPropertyBoxed permits ArrayPropertyBoxedVoid, ArrayPropertyBoxedList {
        @Nullable Object getData();
    }
    
    public record ArrayPropertyBoxedVoid(Void data) implements ArrayPropertyBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    public record ArrayPropertyBoxedList(ArrayPropertyList data) implements ArrayPropertyBoxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    
    public static class ArrayProperty extends JsonSchema<ArrayPropertyBoxed> implements NullSchemaValidator<ArrayPropertyBoxedVoid>, ListSchemaValidator<ArrayPropertyList, ArrayPropertyBoxedList> {
        private static @Nullable ArrayProperty instance = null;
    
        protected ArrayProperty() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    Void.class,
                    List.class
                ))
                .items(EnumClass.EnumClass1.class)
            );
        }
    
        public static ArrayProperty getInstance() {
            if (instance == null) {
                instance = new ArrayProperty();
            }
            return instance;
        }
        
        @Override
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Void castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return castArg;
        }
        
        @Override
        public ArrayPropertyList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new RuntimeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof String)) {
                    throw new RuntimeException("Invalid instantiated value");
                }
                items.add((String) itemInstance);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new ArrayPropertyList(newInstanceItems);
        }
        
        public ArrayPropertyList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                return validate((Void) null, configuration);
            } else if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg == null) {
                return getNewInstance((Void) null, pathToItem, pathToSchemas);
            } else if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        @Override
        public ArrayPropertyBoxedVoid validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayPropertyBoxedVoid(validate(arg, configuration));
        }
        @Override
        public ArrayPropertyBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ArrayPropertyBoxedList(validate(arg, configuration));
        }
        @Override
        public ArrayPropertyBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg == null) {
                Void castArg = (Void) arg;
                return validateAndBox(castArg, configuration);
            } else if (arg instanceof List<?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }    
    
    public static class ObjectWithOnlyOptionalPropsMap extends FrozenMap<@Nullable Object> {
        protected ObjectWithOnlyOptionalPropsMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "a",
            "b",
            "ArrayProperty"
        );
        public static ObjectWithOnlyOptionalPropsMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithOnlyOptionalProps1.getInstance().validate(arg, configuration);
        }
        
        public String a() throws UnsetPropertyException {
            String key = "a";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof String)) {
                throw new RuntimeException("Invalid value stored for a");
            }
            return (String) value;
        }
        
        public Number b() throws UnsetPropertyException {
            String key = "b";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof Number)) {
                throw new RuntimeException("Invalid value stored for b");
            }
            return (Number) value;
        }
        
        public @Nullable ArrayPropertyList ArrayProperty() throws UnsetPropertyException {
            String key = "ArrayProperty";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value == null || value instanceof ArrayPropertyList)) {
                throw new RuntimeException("Invalid value stored for ArrayProperty");
            }
            return (@Nullable ArrayPropertyList) value;
        }
    }
    
    public interface SetterForA <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterA(Map<String, @Nullable Object> instance);
        
        default T a(String value) {
            var instance = getInstance();
            instance.put("a", value);
            return getBuilderAfterA(instance);
        }
    }
    
    public interface SetterForB <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterB(Map<String, @Nullable Object> instance);
        
        default T b(int value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
        
        default T b(float value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
        
        default T b(long value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
        
        default T b(double value) {
            var instance = getInstance();
            instance.put("b", value);
            return getBuilderAfterB(instance);
        }
    }
    
    public interface SetterForArrayProperty <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayProperty(Map<String, @Nullable Object> instance);
        
        default T ArrayProperty(Void value) {
            var instance = getInstance();
            instance.put("ArrayProperty", null);
            return getBuilderAfterArrayProperty(instance);
        }
        
        default T ArrayProperty(List<String> value) {
            var instance = getInstance();
            instance.put("ArrayProperty", value);
            return getBuilderAfterArrayProperty(instance);
        }
    }
    
    public static class ObjectWithOnlyOptionalPropsMapBuilder implements GenericBuilder<Map<String, @Nullable Object>>, SetterForA<ObjectWithOnlyOptionalPropsMapBuilder>, SetterForB<ObjectWithOnlyOptionalPropsMapBuilder>, SetterForArrayProperty<ObjectWithOnlyOptionalPropsMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "a",
            "b",
            "ArrayProperty"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder getBuilderAfterA(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder getBuilderAfterB(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ObjectWithOnlyOptionalPropsMapBuilder getBuilderAfterArrayProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ObjectWithOnlyOptionalProps1Boxed permits ObjectWithOnlyOptionalProps1BoxedMap {
        @Nullable Object getData();
    }
    
    public record ObjectWithOnlyOptionalProps1BoxedMap(ObjectWithOnlyOptionalPropsMap data) implements ObjectWithOnlyOptionalProps1Boxed {
        @Override
        public @Nullable Object getData() {
            return data;
        }
    }
    
    
    public static class ObjectWithOnlyOptionalProps1 extends JsonSchema<ObjectWithOnlyOptionalProps1Boxed> implements MapSchemaValidator<ObjectWithOnlyOptionalPropsMap, ObjectWithOnlyOptionalProps1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ObjectWithOnlyOptionalProps1 instance = null;
    
        protected ObjectWithOnlyOptionalProps1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("a", A.class),
                    new PropertyEntry("b", B.class),
                    new PropertyEntry("ArrayProperty", ArrayProperty.class)
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static ObjectWithOnlyOptionalProps1 getInstance() {
            if (instance == null) {
                instance = new ObjectWithOnlyOptionalProps1();
            }
            return instance;
        }
        
        public ObjectWithOnlyOptionalPropsMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ObjectWithOnlyOptionalPropsMap(castProperties);
        }
        
        public ObjectWithOnlyOptionalPropsMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        public ObjectWithOnlyOptionalProps1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException {
            return new ObjectWithOnlyOptionalProps1BoxedMap(validate(arg, configuration));
        }
        @Override
        public ObjectWithOnlyOptionalProps1Boxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException {
            if (arg instanceof Map<?, ?> castArg) {
                return validateAndBox(castArg, configuration);
            }
            throw new ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

}
