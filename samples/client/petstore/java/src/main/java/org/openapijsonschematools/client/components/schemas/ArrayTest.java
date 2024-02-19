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
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
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

public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends StringJsonSchema.StringJsonSchema1 {
        private static @Nullable Items instance = null;
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
    }
    
    
    public static class ArrayOfStringList extends FrozenList<String> {
        protected ArrayOfStringList(FrozenList<String> m) {
            super(m);
        }
        public static ArrayOfStringList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayOfString.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayOfStringListBuilder {
        // class to build List<String>
        private final List<String> list;
    
        public ArrayOfStringListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayOfStringListBuilder(List<String> list) {
            this.list = list;
        }
        
        public ArrayOfStringListBuilder add(String item) {
            list.add(item);
            return this;
        }
    
        public List<String> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayOfStringBoxed permits ArrayOfStringBoxedList {
        @Nullable Object data();
    }
    
    public static final class ArrayOfStringBoxedList implements ArrayOfStringBoxed {
        public final ArrayOfStringList data;
        private ArrayOfStringBoxedList(ArrayOfStringList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ArrayOfString extends JsonSchema implements ListSchemaValidator<ArrayOfStringList, ArrayOfStringBoxedList> {
        private static @Nullable ArrayOfString instance = null;
    
        protected ArrayOfString() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
            );
        }
    
        public static ArrayOfString getInstance() {
            if (instance == null) {
                instance = new ArrayOfString();
            }
            return instance;
        }
        
        @Override
        public ArrayOfStringList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
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
                if (!(itemInstance instanceof String)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((String) itemInstance);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new ArrayOfStringList(newInstanceItems);
        }
        
        public ArrayOfStringList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        @Override
        public ArrayOfStringBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayOfStringBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class Items2 extends Int64JsonSchema.Int64JsonSchema1 {
        private static @Nullable Items2 instance = null;
        public static Items2 getInstance() {
            if (instance == null) {
                instance = new Items2();
            }
            return instance;
        }
    }
    
    
    public static class ItemsList extends FrozenList<Number> {
        protected ItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items1.getInstance().validate(arg, configuration);
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
    
    
    public sealed interface Items1Boxed permits Items1BoxedList {
        @Nullable Object data();
    }
    
    public static final class Items1BoxedList implements Items1Boxed {
        public final ItemsList data;
        private Items1BoxedList(ItemsList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class Items1 extends JsonSchema implements ListSchemaValidator<ItemsList, Items1BoxedList> {
        private static @Nullable Items1 instance = null;
    
        protected Items1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items2.class)
            );
        }
    
        public static Items1 getInstance() {
            if (instance == null) {
                instance = new Items1();
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
        @Override
        public Items1BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Items1BoxedList(validate(arg, configuration));
        }
    }    
    
    public static class ArrayArrayOfIntegerList extends FrozenList<ItemsList> {
        protected ArrayArrayOfIntegerList(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ArrayArrayOfIntegerList of(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayOfInteger.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayArrayOfIntegerListBuilder {
        // class to build List<List<Number>>
        private final List<List<Number>> list;
    
        public ArrayArrayOfIntegerListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayArrayOfIntegerListBuilder(List<List<Number>> list) {
            this.list = list;
        }
        
        public ArrayArrayOfIntegerListBuilder add(List<Number> item) {
            list.add(item);
            return this;
        }
    
        public List<List<Number>> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayArrayOfIntegerBoxed permits ArrayArrayOfIntegerBoxedList {
        @Nullable Object data();
    }
    
    public static final class ArrayArrayOfIntegerBoxedList implements ArrayArrayOfIntegerBoxed {
        public final ArrayArrayOfIntegerList data;
        private ArrayArrayOfIntegerBoxedList(ArrayArrayOfIntegerList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ArrayArrayOfInteger extends JsonSchema implements ListSchemaValidator<ArrayArrayOfIntegerList, ArrayArrayOfIntegerBoxedList> {
        private static @Nullable ArrayArrayOfInteger instance = null;
    
        protected ArrayArrayOfInteger() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items1.class)
            );
        }
    
        public static ArrayArrayOfInteger getInstance() {
            if (instance == null) {
                instance = new ArrayArrayOfInteger();
            }
            return instance;
        }
        
        @Override
        public ArrayArrayOfIntegerList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ArrayArrayOfIntegerList(newInstanceItems);
        }
        
        public ArrayArrayOfIntegerList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        @Override
        public ArrayArrayOfIntegerBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayArrayOfIntegerBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> {
        protected ItemsList1(FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> m) {
            super(m);
        }
        public static ItemsList1 of(List<Map<String, ? extends @Nullable Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items3.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListBuilder1 {
        // class to build List<Map<String, @Nullable Object>>
        private final List<Map<String, @Nullable Object>> list;
    
        public ItemsListBuilder1() {
            list = new ArrayList<>();
        }
    
        public ItemsListBuilder1(List<Map<String, @Nullable Object>> list) {
            this.list = list;
        }
        
        public ItemsListBuilder1 add(Map<String, @Nullable Object> item) {
            list.add(item);
            return this;
        }
    
        public List<Map<String, @Nullable Object>> build() {
            return list;
        }
    }
    
    
    public sealed interface Items3Boxed permits Items3BoxedList {
        @Nullable Object data();
    }
    
    public static final class Items3BoxedList implements Items3Boxed {
        public final ItemsList1 data;
        private Items3BoxedList(ItemsList1 data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class Items3 extends JsonSchema implements ListSchemaValidator<ItemsList1, Items3BoxedList> {
        private static @Nullable Items3 instance = null;
    
        protected Items3() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(ReadOnlyFirst.ReadOnlyFirst1.class)
            );
        }
    
        public static Items3 getInstance() {
            if (instance == null) {
                instance = new Items3();
            }
            return instance;
        }
        
        @Override
        public ItemsList1 getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ReadOnlyFirst.ReadOnlyFirstMap> items = new ArrayList<>();
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
                if (!(itemInstance instanceof ReadOnlyFirst.ReadOnlyFirstMap)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((ReadOnlyFirst.ReadOnlyFirstMap) itemInstance);
                i += 1;
            }
            FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> newInstanceItems = new FrozenList<>(items);
            return new ItemsList1(newInstanceItems);
        }
        
        public ItemsList1 validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        @Override
        public Items3BoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new Items3BoxedList(validate(arg, configuration));
        }
    }    
    
    public static class ArrayArrayOfModelList extends FrozenList<ItemsList1> {
        protected ArrayArrayOfModelList(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ArrayArrayOfModelList of(List<List<Map<String, ? extends @Nullable Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayOfModel.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayArrayOfModelListBuilder {
        // class to build List<List<Map<String, @Nullable Object>>>
        private final List<List<Map<String, @Nullable Object>>> list;
    
        public ArrayArrayOfModelListBuilder() {
            list = new ArrayList<>();
        }
    
        public ArrayArrayOfModelListBuilder(List<List<Map<String, @Nullable Object>>> list) {
            this.list = list;
        }
        
        public ArrayArrayOfModelListBuilder add(List<Map<String, @Nullable Object>> item) {
            list.add(item);
            return this;
        }
    
        public List<List<Map<String, @Nullable Object>>> build() {
            return list;
        }
    }
    
    
    public sealed interface ArrayArrayOfModelBoxed permits ArrayArrayOfModelBoxedList {
        @Nullable Object data();
    }
    
    public static final class ArrayArrayOfModelBoxedList implements ArrayArrayOfModelBoxed {
        public final ArrayArrayOfModelList data;
        private ArrayArrayOfModelBoxedList(ArrayArrayOfModelList data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    
    public static class ArrayArrayOfModel extends JsonSchema implements ListSchemaValidator<ArrayArrayOfModelList, ArrayArrayOfModelBoxedList> {
        private static @Nullable ArrayArrayOfModel instance = null;
    
        protected ArrayArrayOfModel() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items3.class)
            );
        }
    
        public static ArrayArrayOfModel getInstance() {
            if (instance == null) {
                instance = new ArrayArrayOfModel();
            }
            return instance;
        }
        
        @Override
        public ArrayArrayOfModelList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ItemsList1> items = new ArrayList<>();
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
                if (!(itemInstance instanceof ItemsList1)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((ItemsList1) itemInstance);
                i += 1;
            }
            FrozenList<ItemsList1> newInstanceItems = new FrozenList<>(items);
            return new ArrayArrayOfModelList(newInstanceItems);
        }
        
        public ArrayArrayOfModelList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
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
        @Override
        public ArrayArrayOfModelBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayArrayOfModelBoxedList(validate(arg, configuration));
        }
    }    
    
    public static class ArrayTestMap extends FrozenMap<@Nullable Object> {
        protected ArrayTestMap(FrozenMap<@Nullable Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "array_of_string",
            "array_array_of_integer",
            "array_array_of_model"
        );
        public static ArrayTestMap of(Map<String, ? extends @Nullable Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayTest1.getInstance().validate(arg, configuration);
        }
        
        public ArrayOfStringList array_of_string() throws UnsetPropertyException {
            String key = "array_of_string";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayOfStringList)) {
                throw new InvalidTypeException("Invalid value stored for array_of_string");
            }
            return (ArrayOfStringList) value;
        }
        
        public ArrayArrayOfIntegerList array_array_of_integer() throws UnsetPropertyException {
            String key = "array_array_of_integer";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayArrayOfIntegerList)) {
                throw new InvalidTypeException("Invalid value stored for array_array_of_integer");
            }
            return (ArrayArrayOfIntegerList) value;
        }
        
        public ArrayArrayOfModelList array_array_of_model() throws UnsetPropertyException {
            String key = "array_array_of_model";
            throwIfKeyNotPresent(key);
            @Nullable Object value = get(key);
            if (!(value instanceof ArrayArrayOfModelList)) {
                throw new InvalidTypeException("Invalid value stored for array_array_of_model");
            }
            return (ArrayArrayOfModelList) value;
        }
        
        public @Nullable Object getAdditionalProperty(String name) throws UnsetPropertyException, InvalidAdditionalPropertyException {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    
    public interface SetterForArrayOfString <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayOfString(Map<String, @Nullable Object> instance);
        
        default T array_of_string(List<String> value) {
            var instance = getInstance();
            instance.put("array_of_string", value);
            return getBuilderAfterArrayOfString(instance);
        }
    }
    
    public interface SetterForArrayArrayOfInteger <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayArrayOfInteger(Map<String, @Nullable Object> instance);
        
        default T array_array_of_integer(List<List<Number>> value) {
            var instance = getInstance();
            instance.put("array_array_of_integer", value);
            return getBuilderAfterArrayArrayOfInteger(instance);
        }
    }
    
    public interface SetterForArrayArrayOfModel <T> {
        Map<String, @Nullable Object> getInstance();
        T getBuilderAfterArrayArrayOfModel(Map<String, @Nullable Object> instance);
        
        default T array_array_of_model(List<List<Map<String, @Nullable Object>>> value) {
            var instance = getInstance();
            instance.put("array_array_of_model", value);
            return getBuilderAfterArrayArrayOfModel(instance);
        }
    }
    
    public static class ArrayTestMapBuilder extends UnsetAddPropsSetter<ArrayTestMapBuilder> implements GenericBuilder<Map<String, @Nullable Object>>, SetterForArrayOfString<ArrayTestMapBuilder>, SetterForArrayArrayOfInteger<ArrayTestMapBuilder>, SetterForArrayArrayOfModel<ArrayTestMapBuilder> {
        private final Map<String, @Nullable Object> instance;
        private static final Set<String> knownKeys = Set.of(
            "array_of_string",
            "array_array_of_integer",
            "array_array_of_model"
        );
        public Set<String> getKnownKeys() {
            return knownKeys;
        }
        public ArrayTestMapBuilder() {
            this.instance = new LinkedHashMap<>();
        }
        public Map<String, @Nullable Object> build() {
            return instance;
        }
        public Map<String, @Nullable Object> getInstance() {
            return instance;
        }
        public ArrayTestMapBuilder getBuilderAfterArrayOfString(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ArrayTestMapBuilder getBuilderAfterArrayArrayOfInteger(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ArrayTestMapBuilder getBuilderAfterArrayArrayOfModel(Map<String, @Nullable Object> instance) {
            return this;
        }
        public ArrayTestMapBuilder getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance) {
            return this;
        }
    }
    
    
    public sealed interface ArrayTest1Boxed permits ArrayTest1BoxedMap {
        @Nullable Object data();
    }
    
    public static final class ArrayTest1BoxedMap implements ArrayTest1Boxed {
        public final ArrayTestMap data;
        private ArrayTest1BoxedMap(ArrayTestMap data) {
            this.data = data;
        }
        @Override
        public @Nullable Object data() {
            return data;
        }
    }
    
    
    public static class ArrayTest1 extends JsonSchema implements MapSchemaValidator<ArrayTestMap, ArrayTest1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable ArrayTest1 instance = null;
    
        protected ArrayTest1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("array_of_string", ArrayOfString.class),
                    new PropertyEntry("array_array_of_integer", ArrayArrayOfInteger.class),
                    new PropertyEntry("array_array_of_model", ArrayArrayOfModel.class)
                ))
            );
        }
    
        public static ArrayTest1 getInstance() {
            if (instance == null) {
                instance = new ArrayTest1();
            }
            return instance;
        }
        
        public ArrayTestMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new ArrayTestMap(castProperties);
        }
        
        public ArrayTestMap validate(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
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
        public ArrayTest1BoxedMap validateAndBox(Map<?, ?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayTest1BoxedMap(validate(arg, configuration));
        }
    }

}
