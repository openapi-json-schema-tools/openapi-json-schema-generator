package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends StringJsonSchema {}
    
    
    public static class ArrayOfStringList extends FrozenList<String> {
        ArrayOfStringList(FrozenList<String> m) {
            super(m);
        }
        public static ArrayOfStringList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayOfString.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayOfStringListInput {
        // class to build List<String>
    }
    
    
    public static class ArrayOfString extends JsonSchema implements SchemaListValidator<String, String, ArrayOfStringList> {
        private static ArrayOfString instance;
        protected ArrayOfString() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
    
        public static ArrayOfString getInstance() {
            if (instance == null) {
                instance = new ArrayOfString();
            }
            return instance;
        }
        
        @Override
        public FrozenList<String> castToAllowedTypes(List<String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<String> argFixed = new ArrayList<>();
            int i =0;
            for (String item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                String fixedVal = (String) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ArrayOfStringList getNewInstance(FrozenList<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<String> items = new ArrayList<>();
            int i = 0;
            for (String item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                String castItem = (String) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new ArrayOfStringList(newInstanceItems);
        }
        
        @Override
        public ArrayOfStringList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<String> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<String> castArg = (FrozenList<String>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class Items2 extends Int64JsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Long> {
        ItemsList(FrozenList<Long> m) {
            super(m);
        }
        public static ItemsList of(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListInput {
        // class to build List<Long>
    }
    
    
    public static class Items1 extends JsonSchema implements SchemaListValidator<Long, Long, ItemsList> {
        private static Items1 instance;
        protected Items1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            )));
        }
    
        public static Items1 getInstance() {
            if (instance == null) {
                instance = new Items1();
            }
            return instance;
        }
        
        @Override
        public FrozenList<Long> castToAllowedTypes(List<Long> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<Long> argFixed = new ArrayList<>();
            int i =0;
            for (Long item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                Long fixedVal = (Long) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ItemsList getNewInstance(FrozenList<Long> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<Long> items = new ArrayList<>();
            int i = 0;
            for (Long item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                Long castItem = (Long) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<Long> newInstanceItems = new FrozenList<>(items);
            return new ItemsList(newInstanceItems);
        }
        
        @Override
        public ItemsList validate(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<Long> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<Long> castArg = (FrozenList<Long>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ArrayArrayOfIntegerList extends FrozenList<ItemsList> {
        ArrayArrayOfIntegerList(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ArrayArrayOfIntegerList of(List<List<Long>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayOfInteger.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayArrayOfIntegerListInput {
        // class to build List<List<Long>>
    }
    
    
    public static class ArrayArrayOfInteger extends JsonSchema implements SchemaListValidator<List<Long>, FrozenList<Long>, ArrayArrayOfIntegerList> {
        private static ArrayArrayOfInteger instance;
        protected ArrayArrayOfInteger() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items1.class))
            )));
        }
    
        public static ArrayArrayOfInteger getInstance() {
            if (instance == null) {
                instance = new ArrayArrayOfInteger();
            }
            return instance;
        }
        
        @Override
        public FrozenList<FrozenList<Long>> castToAllowedTypes(List<List<Long>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenList<Long>> argFixed = new ArrayList<>();
            int i =0;
            for (List<Long> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenList<Long> fixedVal = (FrozenList<Long>) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ArrayArrayOfIntegerList getNewInstance(FrozenList<FrozenList<Long>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<ItemsList> items = new ArrayList<>();
            int i = 0;
            for (FrozenList<Long> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                ItemsList castItem = (ItemsList) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<ItemsList> newInstanceItems = new FrozenList<>(items);
            return new ArrayArrayOfIntegerList(newInstanceItems);
        }
        
        @Override
        public ArrayArrayOfIntegerList validate(List<List<Long>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenList<Long>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<FrozenList<Long>> castArg = (FrozenList<FrozenList<Long>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> {
        ItemsList1(FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> m) {
            super(m);
        }
        public static ItemsList1 of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items3.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListInput1 {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class Items3 extends JsonSchema implements SchemaListValidator<Map<String, Object>, FrozenMap<Object>, ItemsList1> {
        private static Items3 instance;
        protected Items3() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(ReadOnlyFirst.ReadOnlyFirst1.class))
            )));
        }
    
        public static Items3 getInstance() {
            if (instance == null) {
                instance = new Items3();
            }
            return instance;
        }
        
        @Override
        public FrozenList<FrozenMap<Object>> castToAllowedTypes(List<Map<String, Object>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenMap<Object>> argFixed = new ArrayList<>();
            int i =0;
            for (Map<String, Object> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenMap<Object> fixedVal = (FrozenMap<Object>) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ItemsList1 getNewInstance(FrozenList<FrozenMap<Object>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<ReadOnlyFirst.ReadOnlyFirstMap> items = new ArrayList<>();
            int i = 0;
            for (FrozenMap<Object> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                ReadOnlyFirst.ReadOnlyFirstMap castItem = (ReadOnlyFirst.ReadOnlyFirstMap) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> newInstanceItems = new FrozenList<>(items);
            return new ItemsList1(newInstanceItems);
        }
        
        @Override
        public ItemsList1 validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenMap<Object>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<FrozenMap<Object>> castArg = (FrozenList<FrozenMap<Object>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ArrayArrayOfModelList extends FrozenList<ItemsList1> {
        ArrayArrayOfModelList(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ArrayArrayOfModelList of(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayOfModel.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ArrayArrayOfModelListInput {
        // class to build List<List<Map<String, Object>>>
    }
    
    
    public static class ArrayArrayOfModel extends JsonSchema implements SchemaListValidator<List<Map<String, Object>>, FrozenList<FrozenMap<Object>>, ArrayArrayOfModelList> {
        private static ArrayArrayOfModel instance;
        protected ArrayArrayOfModel() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items3.class))
            )));
        }
    
        public static ArrayArrayOfModel getInstance() {
            if (instance == null) {
                instance = new ArrayArrayOfModel();
            }
            return instance;
        }
        
        @Override
        public FrozenList<FrozenList<FrozenMap<Object>>> castToAllowedTypes(List<List<Map<String, Object>>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenList<FrozenMap<Object>>> argFixed = new ArrayList<>();
            int i =0;
            for (List<Map<String, Object>> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenList<FrozenMap<Object>> fixedVal = (FrozenList<FrozenMap<Object>>) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ArrayArrayOfModelList getNewInstance(FrozenList<FrozenList<FrozenMap<Object>>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<ItemsList1> items = new ArrayList<>();
            int i = 0;
            for (FrozenList<FrozenMap<Object>> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                ItemsList1 castItem = (ItemsList1) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<ItemsList1> newInstanceItems = new FrozenList<>(items);
            return new ArrayArrayOfModelList(newInstanceItems);
        }
        
        @Override
        public ArrayArrayOfModelList validate(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenList<FrozenMap<Object>>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<FrozenList<FrozenMap<Object>>> castArg = (FrozenList<FrozenList<FrozenMap<Object>>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ArrayTestMap extends FrozenMap<Object> {
        ArrayTestMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "array_of_string",
            "array_array_of_integer",
            "array_array_of_model"
        );
        public static ArrayTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayTest1.getInstance().validate(arg, configuration);
        }
        
        public ArrayOfStringList array_of_string() {
            String key = "array_of_string";
            throwIfKeyNotPresent(key);
            return (ArrayOfStringList) get(key);
        }
        
        public ArrayArrayOfIntegerList array_array_of_integer() {
            String key = "array_array_of_integer";
            throwIfKeyNotPresent(key);
            return (ArrayArrayOfIntegerList) get(key);
        }
        
        public ArrayArrayOfModelList array_array_of_model() {
            String key = "array_array_of_model";
            throwIfKeyNotPresent(key);
            return (ArrayArrayOfModelList) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class ArrayTestMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ArrayTest1 extends JsonSchema implements SchemaMapValidator<Object, Object, ArrayTestMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static ArrayTest1 instance;
        protected ArrayTest1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("array_of_string", ArrayOfString.class),
                    new PropertyEntry("array_array_of_integer", ArrayArrayOfInteger.class),
                    new PropertyEntry("array_array_of_model", ArrayArrayOfModel.class)
                )))
            )));
        }
    
        public static ArrayTest1 getInstance() {
            if (instance == null) {
                instance = new ArrayTest1();
            }
            return instance;
        }
        
        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, Object> entry: arg.entrySet()) {
                String key = entry.getKey();
                                Object val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                Object fixedVal = (Object) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public ArrayTestMap getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<String, Object> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new ArrayTestMap(castProperties);
        }
        
        @Override
        public ArrayTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
