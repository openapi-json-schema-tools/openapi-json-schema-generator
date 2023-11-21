package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends StringJsonSchema {}
    
    
    public static class ArrayOfStringList extends FrozenList<Object> {
        ArrayOfStringList(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayOfString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(Items.class)
        ));
        protected static ArrayOfStringList getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayOfStringList(arg);
        }
        public static ArrayOfStringList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayOfString.class, arg, configuration);
        }
    }    
    
    public class Items2 extends Int64JsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Object> {
        ItemsList(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Items1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(Items2.class)
        ));
        protected static ItemsList getListOutputInstance(FrozenList<Object> arg) {
            return new ItemsList(arg);
        }
        public static ItemsList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items1.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfIntegerList extends FrozenList<Object> {
        ArrayArrayOfIntegerList(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayArrayOfInteger extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(Items1.class)
        ));
        protected static ArrayArrayOfIntegerList getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayArrayOfIntegerList(arg);
        }
        public static ArrayArrayOfIntegerList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayOfInteger.class, arg, configuration);
        }
    }    
    
    public static class ItemsList1 extends FrozenList<Object> {
        ItemsList1(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class Items3 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(ReadOnlyFirst.ReadOnlyFirst1.class)
        ));
        protected static ItemsList1 getListOutputInstance(FrozenList<Object> arg) {
            return new ItemsList1(arg);
        }
        public static ItemsList1 validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items3.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayOfModelList extends FrozenList<Object> {
        ArrayArrayOfModelList(FrozenList<Object> m) {
            super(m);
        }
    }    
    
    public class ArrayArrayOfModel extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)),
            new KeywordEntry("items", new ItemsValidator(Items3.class)
        ));
        protected static ArrayArrayOfModelList getListOutputInstance(FrozenList<Object> arg) {
            return new ArrayArrayOfModelList(arg);
        }
        public static ArrayArrayOfModelList validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayOfModel.class, arg, configuration);
        }
    }    
    
    public static class ArrayTestMap extends FrozenMap<String, Object> {
        ArrayTestMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ArrayTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ArrayTest1.validate(arg, configuration);
        }
    }    
    
    public class ArrayTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class)),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("array_of_string", ArrayOfString.class),
                new PropertyEntry("array_array_of_integer", ArrayArrayOfInteger.class),
                new PropertyEntry("array_array_of_model", ArrayArrayOfModel.class)
            ))
        ));
        protected static ArrayTestMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ArrayTestMap(arg);
        }
        public static ArrayTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayTest1.class, arg, configuration);
        }
    }
}
