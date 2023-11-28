package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends StringJsonSchema {}
    
    
    public static class ArrayOfStringList extends FrozenList<String> {
        ArrayOfStringList(FrozenList<String> m) {
            super(m);
        }
        public static ArrayOfStringList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayOfString.validate(arg, configuration);
        }
    }
    
    
    public static class ArrayOfString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
            
        ));
        protected static ArrayOfStringList getListOutputInstance(FrozenList<String> arg) {
            return new ArrayOfStringList(arg);
        }
        public static ArrayOfStringList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ArrayOfString.class, arg, configuration);
        }
    }    
    
    public static class Items2 extends Int64JsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Long> {
        ItemsList(FrozenList<Long> m) {
            super(m);
        }
        public static ItemsList of(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items1.validate(arg, configuration);
        }
    }
    
    
    public static class Items1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items2.class))
            
        ));
        protected static ItemsList getListOutputInstance(FrozenList<Long> arg) {
            return new ItemsList(arg);
        }
        public static ItemsList validate(List<Long> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Items1.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfIntegerList extends FrozenList<ItemsList> {
        ArrayArrayOfIntegerList(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ArrayArrayOfIntegerList of(List<List<Long>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayOfInteger.validate(arg, configuration);
        }
    }
    
    
    public static class ArrayArrayOfInteger extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items1.class))
            
        ));
        protected static ArrayArrayOfIntegerList getListOutputInstance(FrozenList<ItemsList> arg) {
            return new ArrayArrayOfIntegerList(arg);
        }
        public static ArrayArrayOfIntegerList validate(List<List<Long>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ArrayArrayOfInteger.class, arg, configuration);
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> {
        ItemsList1(FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> m) {
            super(m);
        }
        public static ItemsList1 of(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items3.validate(arg, configuration);
        }
    }
    
    
    public static class Items3 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(ReadOnlyFirst.ReadOnlyFirst1.class))
            
        ));
        protected static ItemsList1 getListOutputInstance(FrozenList<ReadOnlyFirst.ReadOnlyFirstMap> arg) {
            return new ItemsList1(arg);
        }
        public static ItemsList1 validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Items3.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfModelList extends FrozenList<ItemsList1> {
        ArrayArrayOfModelList(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ArrayArrayOfModelList of(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayArrayOfModel.validate(arg, configuration);
        }
    }
    
    
    public static class ArrayArrayOfModel extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items3.class))
            
        ));
        protected static ArrayArrayOfModelList getListOutputInstance(FrozenList<ItemsList1> arg) {
            return new ArrayArrayOfModelList(arg);
        }
        public static ArrayArrayOfModelList validate(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ArrayArrayOfModel.class, arg, configuration);
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
            return ArrayTest1.validate(arg, configuration);
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
    
    public static class ArrayTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("array_of_string", ArrayOfString.class),
                new PropertyEntry("array_array_of_integer", ArrayArrayOfInteger.class),
                new PropertyEntry("array_array_of_model", ArrayArrayOfModel.class)
            )))
            
        ));
        protected static ArrayTestMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new ArrayTestMap(arg);
        }
        public static ArrayTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ArrayTest1.class, arg, configuration);
        }
    }
}
