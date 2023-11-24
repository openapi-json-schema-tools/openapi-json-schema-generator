package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ArrayOfArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items1 extends NumberJsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Number> {

        ItemsList(FrozenList<Number> m) {

            super(m);
        }
        public static ItemsList of(List<Number> arg, SchemaConfiguration configuration) {

            return Items.validate(arg, configuration);
        }
    }
    
    
    public class Items extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items1.class))
        ));
        protected static ItemsList getListOutputInstance(FrozenList<Number> arg) {

            return new ItemsList(arg);
        }
        public static ItemsList validate(List<Number> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public static class ArrayArrayNumberList extends FrozenList<ItemsList> {

        ArrayArrayNumberList(FrozenList<ItemsList> m) {

            super(m);
        }
        public static ArrayArrayNumberList of(List<List<Number>> arg, SchemaConfiguration configuration) {


            return ArrayArrayNumber.validate(arg, configuration);
        }
    }
    
    
    public class ArrayArrayNumber extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static ArrayArrayNumberList getListOutputInstance(FrozenList<ItemsList> arg) {

            return new ArrayArrayNumberList(arg);
        }
        public static ArrayArrayNumberList validate(List<List<Number>> arg, SchemaConfiguration configuration) {


            return JsonSchema.validate(ArrayArrayNumber.class, arg, configuration);
        }
    }    
    
    public static class ArrayOfArrayOfNumberOnlyMap extends FrozenMap<String, Object> {

        ArrayOfArrayOfNumberOnlyMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "ArrayArrayNumber"
        );
        public static ArrayOfArrayOfNumberOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return ArrayOfArrayOfNumberOnly1.validate(arg, configuration);
        }
        
        public ArrayArrayNumberList ArrayArrayNumber() {

            String key = "ArrayArrayNumber";
            throwIfKeyNotPresent(key);
            return (ArrayArrayNumberList) get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public class ArrayOfArrayOfNumberOnly1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("ArrayArrayNumber", ArrayArrayNumber.class)
            )))
        ));
        protected static ArrayOfArrayOfNumberOnlyMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new ArrayOfArrayOfNumberOnlyMap(arg);
        }
        public static ArrayOfArrayOfNumberOnlyMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ArrayOfArrayOfNumberOnly1.class, arg, configuration);
        }
    }
}
