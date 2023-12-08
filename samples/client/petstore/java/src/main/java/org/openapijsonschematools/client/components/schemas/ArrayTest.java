package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends StringJsonSchema {}
    
    
    public static class ArrayOfStringList extends FrozenList<String> {
        ArrayOfStringList(FrozenList<String> m) {
            super(m);
        }
        public static ArrayOfStringList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayOfString.class).validate(arg, configuration);
        }
    }
    
    public class ArrayOfStringListInput {
        // class to build List<String>
    }
    
    
    public static class ArrayOfString extends JsonSchema<FrozenMap, ArrayOfStringList> {
        public ArrayOfString() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            ));
        }
        
        @Override
        protected ArrayOfStringList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayOfStringList((FrozenList<String>) arg);
        }
        public ArrayOfStringList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Items2 extends Int64JsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Long> {
        ItemsList(FrozenList<Long> m) {
            super(m);
        }
        public static ItemsList of(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Items1.class).validate(arg, configuration);
        }
    }
    
    public class ItemsListInput {
        // class to build List<Long>
    }
    
    
    public static class Items1 extends JsonSchema<FrozenMap, ItemsList> {
        public Items1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            ));
        }
        
        @Override
        protected ItemsList getListOutputInstance(FrozenList<?> arg) {
            return new ItemsList((FrozenList<Long>) arg);
        }
        public ItemsList validate(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfIntegerList extends FrozenList<ItemsList> {
        ArrayArrayOfIntegerList(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ArrayArrayOfIntegerList of(List<List<Long>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayArrayOfInteger.class).validate(arg, configuration);
        }
    }
    
    public class ArrayArrayOfIntegerListInput {
        // class to build List<List<Long>>
    }
    
    
    public static class ArrayArrayOfInteger extends JsonSchema<FrozenMap, ArrayArrayOfIntegerList> {
        public ArrayArrayOfInteger() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items1.class))
            ));
        }
        
        @Override
        protected ArrayArrayOfIntegerList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayArrayOfIntegerList((FrozenList<ItemsList>) arg);
        }
        public ArrayArrayOfIntegerList validate(List<List<Long>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> {
        ItemsList1(FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> m) {
            super(m);
        }
        public static ItemsList1 of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Items3.class).validate(arg, configuration);
        }
    }
    
    public class ItemsListInput1 {
        // class to build List<Map<String, Object>>
    }
    
    
    public static class Items3 extends JsonSchema<FrozenMap, ItemsList1> {
        public Items3() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(ReadOnlyFirst.ReadOnlyFirst1.class))
            ));
        }
        
        @Override
        protected ItemsList1 getListOutputInstance(FrozenList<?> arg) {
            return new ItemsList1((FrozenList<ReadOnlyFirst.ReadOnlyFirstMap>) arg);
        }
        public ItemsList1 validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfModelList extends FrozenList<ItemsList1> {
        ArrayArrayOfModelList(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ArrayArrayOfModelList of(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayArrayOfModel.class).validate(arg, configuration);
        }
    }
    
    public class ArrayArrayOfModelListInput {
        // class to build List<List<Map<String, Object>>>
    }
    
    
    public static class ArrayArrayOfModel extends JsonSchema<FrozenMap, ArrayArrayOfModelList> {
        public ArrayArrayOfModel() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items3.class))
            ));
        }
        
        @Override
        protected ArrayArrayOfModelList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayArrayOfModelList((FrozenList<ItemsList1>) arg);
        }
        public ArrayArrayOfModelList validate(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class ArrayTestMap extends FrozenMap<String, Object> {
        ArrayTestMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "array_of_string",
            "array_array_of_integer",
            "array_array_of_model"
        );
        public static ArrayTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayTest1.class).validate(arg, configuration);
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
    public class ArrayTestMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ArrayTest1 extends JsonSchema<ArrayTestMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ArrayTest1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("array_of_string", ArrayOfString.class),
                    new PropertyEntry("array_array_of_integer", ArrayArrayOfInteger.class),
                    new PropertyEntry("array_array_of_model", ArrayArrayOfModel.class)
                )))
            ));
        }
        
        @Override
        protected ArrayTestMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new ArrayTestMap((FrozenMap<String, Object>) arg);
        }
        public ArrayTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
