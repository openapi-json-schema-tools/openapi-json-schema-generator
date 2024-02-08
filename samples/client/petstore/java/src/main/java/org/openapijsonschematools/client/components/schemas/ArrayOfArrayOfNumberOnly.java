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
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ArrayOfArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items1 extends NumberJsonSchema {
        private static @Nullable Items1 instance = null;
        public static Items1 getInstance() {
            if (instance == null) {
                instance = new Items1();
            }
            return instance;
        }
    }
    
    
    public static class ItemsList extends FrozenList<Number> {
        protected ItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListBuilder {
        // class to build List<Number>
        private final List<Number> list;
    
        public ItemsListBuilder() {
            list = new ArrayList<>();
        }
    
        public ItemsListBuilder(List<Number> list) {
            this.list = list;
        }
        
        public ItemsListBuilder add(int item) {
            list.add(item);
            return this;
        }
        
        public ItemsListBuilder add(float item) {
            list.add(item);
            return this;
        }
        
        public ItemsListBuilder add(long item) {
            list.add(item);
            return this;
        }
        
        public ItemsListBuilder add(double item) {
            list.add(item);
            return this;
        }
    
        public List<Number> build() {
            return list;
        }
    }
    
    
    public static abstract sealed class ItemsBoxed permits ItemsBoxedList {}
    public static final class ItemsBoxedList extends ItemsBoxed {
        public final ItemsList data;
        private ItemsBoxedList(ItemsList data) {
            this.data = data;
        }
    }
    
    
    public static class Items extends JsonSchema implements ListSchemaValidator<ItemsList> {
        private static @Nullable Items instance = null;
    
        protected Items() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items1.class)
            );
        }
    
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
        
        @Override
        public ItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Number> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Number)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((Number) itemInstance);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ItemsList(newInstanceItems);
        }
        
        public ItemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public ItemsBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ItemsBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class ArrayArrayNumberList extends FrozenList<ItemsList> {
        protected ArrayArrayNumberList(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ArrayArrayNumberList of(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayNumber.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayArrayNumberListBuilder {
        // class to build List<List<Number>>
        private final List<List<Number>> list;
    
        public ArrayArrayNumberListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayArrayNumberListBuilder(List<List<Number>> list) {
            this.list = list;
        }
        
        public ArrayArrayNumberListBuilder add(List<Number> item) {
            list.add(item);
            return this;
        }
    
        public List<List<Number>> build() {
            return list;
        }
    }
    
    
    public static abstract sealed class ArrayArrayNumberBoxed permits ArrayArrayNumberBoxedList {}
    public static final class ArrayArrayNumberBoxedList extends ArrayArrayNumberBoxed {
        public final ArrayArrayNumberList data;
        private ArrayArrayNumberBoxedList(ArrayArrayNumberList data) {
            this.data = data;
        }
    }
    
    
    public static class ArrayArrayNumber extends JsonSchema implements ListSchemaValidator<ArrayArrayNumberList> {
        private static @Nullable ArrayArrayNumber instance = null;
    
        protected ArrayArrayNumber() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
            );
        }
    
        public static ArrayArrayNumber getInstance() {
            if (instance == null) {
                instance = new ArrayArrayNumber();
            }
            return instance;
        }
        
        @Override
        public ArrayArrayNumberList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ItemsList> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof ItemsList)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((ItemsList) itemInstance);
                i += 1;
            }
            FrozenList<ItemsList> newInstanceItems = new FrozenList<>(items);
            return new ArrayArrayNumberList(newInstanceItems);
        }
        
        public ArrayArrayNumberList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
        public ArrayArrayNumberBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayArrayNumberBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class ArrayOfArrayOfNumberOnlyMap extends FrozenMap<@Nullable Object> {
        protected ArrayOfArrayOfNumberOnlyMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "ArrayArrayNumber"
        );
        public static ArrayOfArrayOfNumberOnlyMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayOfArrayOfNumberOnly1.getInstance().validate(arg, configuration);
        }
        
        public ArrayArrayNumberList ArrayArrayNumber() throws UnsetPropertyException {
            String key = "ArrayArrayNumber";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayArrayNumberList)) {
                throw new InvalidTypeException("Invalid value stored for ArrayArrayNumber");
            }
            return (ArrayArrayNumberList) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForArrayArrayNumber <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayArrayNumber(Map<String, @Nullable Object> instance);
        
        default T ArrayArrayNumber(List<List<Number>> value) {
            var instance = getInstance();
            instance.put("ArrayArrayNumber", value);
            return getBuilderAfterArrayArrayNumber(instance);
        }
    }
    
    public static class ArrayOfArrayOfNumberOnlyMapBuilder extends UnsetAddPropsSetter<ArrayOfArrayOfNumberOnlyMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForArrayArrayNumber<ArrayOfArrayOfNumberOnlyMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "ArrayArrayNumber"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ArrayOfArrayOfNumberOnlyMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ArrayOfArrayOfNumberOnlyMapBuilder getBuilderAfterArrayArrayNumber(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ArrayOfArrayOfNumberOnlyMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public static abstract sealed class ArrayOfArrayOfNumberOnly1Boxed permits ArrayOfArrayOfNumberOnly1BoxedMap {}
    public static final class ArrayOfArrayOfNumberOnly1BoxedMap extends ArrayOfArrayOfNumberOnly1Boxed {
        public final ArrayOfArrayOfNumberOnlyMap data;
        private ArrayOfArrayOfNumberOnly1BoxedMap(ArrayOfArrayOfNumberOnlyMap data) {
            this.data = data;
        }
    }
    
    
    public static class ArrayOfArrayOfNumberOnly1 extends JsonSchema implements MapSchemaValidator<ArrayOfArrayOfNumberOnlyMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ArrayOfArrayOfNumberOnly1 instance = null;
    
        protected ArrayOfArrayOfNumberOnly1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("ArrayArrayNumber", ArrayArrayNumber.class)
                ))
            );
        }
    
        public static ArrayOfArrayOfNumberOnly1 getInstance() {
            if (instance == null) {
                instance = new ArrayOfArrayOfNumberOnly1();
            }
            return instance;
        }
        
        public ArrayOfArrayOfNumberOnlyMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ArrayOfArrayOfNumberOnlyMap(castProperties);
        }
        
        public ArrayOfArrayOfNumberOnlyMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ArrayOfArrayOfNumberOnly1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayOfArrayOfNumberOnly1BoxedMap(validate(arg, configuration));
        }
    }

}
