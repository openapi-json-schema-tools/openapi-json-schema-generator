package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
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

public class ArrayOfArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items1 extends NumberJsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Number> {
        ItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Items.class).validate(arg, configuration);
        }
    }
    
    public class ItemsListInput {
        // class to build List<Number>
    }
    
    
    public static class Items extends JsonSchema<Object, FrozenMap<String, Object>, Number, ItemsList> {
        public Items() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items1.class))
            )));
        }
        
        @Override
        protected ItemsList getListOutputInstance(FrozenList<?> arg) {
            return new ItemsList((FrozenList<Number>) arg);
        }
        public ItemsList validate(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class ArrayArrayNumberList extends FrozenList<ItemsList> {
        ArrayArrayNumberList(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ArrayArrayNumberList of(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayArrayNumber.class).validate(arg, configuration);
        }
    }
    
    public class ArrayArrayNumberListInput {
        // class to build List<List<Number>>
    }
    
    
    public static class ArrayArrayNumber extends JsonSchema<Object, FrozenMap<String, Object>, List<Number>, ArrayArrayNumberList> {
        public ArrayArrayNumber() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
        
        @Override
        protected ArrayArrayNumberList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayArrayNumberList((FrozenList<ItemsList>) arg);
        }
        public ArrayArrayNumberList validate(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
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
        public static ArrayOfArrayOfNumberOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayOfArrayOfNumberOnly1.class).validate(arg, configuration);
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
    public class ArrayOfArrayOfNumberOnlyMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ArrayOfArrayOfNumberOnly1 extends JsonSchema<Object, ArrayOfArrayOfNumberOnlyMap, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ArrayOfArrayOfNumberOnly1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("ArrayArrayNumber", ArrayArrayNumber.class)
                )))
            )));
        }
        
        @Override
        protected ArrayOfArrayOfNumberOnlyMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new ArrayOfArrayOfNumberOnlyMap((FrozenMap<String, Object>) arg);
        }
        public ArrayOfArrayOfNumberOnlyMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
