package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class NestedItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items3 extends NumberJsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Number> {
        ItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ItemsList of(ItemsListInput arg, SchemaConfiguration configuration) throws ValidationException {
            return Items2.validate(arg, configuration);
        }
    }
    
    public static interface ItemsListInput extends List<Number> {}
    
    
    public static class Items2 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items3.class))
        ));
        
        protected static ItemsList getListOutputInstance(FrozenList<Number> arg) {
            return new ItemsList(arg);
        }
        public static ItemsList validate(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Items2.class, arg, configuration);
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ItemsList> {
        ItemsList1(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ItemsList1 of(ItemsListInput1 arg, SchemaConfiguration configuration) throws ValidationException {
            return Items1.validate(arg, configuration);
        }
    }
    
    public static interface ItemsListInput1 extends List<List<Number>> {}
    
    
    public static class Items1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items2.class))
        ));
        
        protected static ItemsList1 getListOutputInstance(FrozenList<ItemsList> arg) {
            return new ItemsList1(arg);
        }
        public static ItemsList1 validate(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Items1.class, arg, configuration);
        }
    }    
    
    public static class ItemsList2 extends FrozenList<ItemsList1> {
        ItemsList2(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ItemsList2 of(ItemsListInput2 arg, SchemaConfiguration configuration) throws ValidationException {
            return Items.validate(arg, configuration);
        }
    }
    
    public static interface ItemsListInput2 extends List<List<List<Number>>> {}
    
    
    public static class Items extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items1.class))
        ));
        
        protected static ItemsList2 getListOutputInstance(FrozenList<ItemsList1> arg) {
            return new ItemsList2(arg);
        }
        public static ItemsList2 validate(List<List<List<Number>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Items.class, arg, configuration);
        }
    }    
    
    public static class NestedItemsList extends FrozenList<ItemsList2> {
        NestedItemsList(FrozenList<ItemsList2> m) {
            super(m);
        }
        public static NestedItemsList of(NestedItemsListInput arg, SchemaConfiguration configuration) throws ValidationException {
            return NestedItems1.validate(arg, configuration);
        }
    }
    
    public static interface NestedItemsListInput extends List<List<List<List<Number>>>> {}
    
    
    public static class NestedItems1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        
        protected static NestedItemsList getListOutputInstance(FrozenList<ItemsList2> arg) {
            return new NestedItemsList(arg);
        }
        public static NestedItemsList validate(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(NestedItems1.class, arg, configuration);
        }
    }}
