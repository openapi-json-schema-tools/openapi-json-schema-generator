package org.openapijsonschematools.client.paths.fake.get.requestbody.content.applicationxwwwformurlencoded;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items extends NonCollectionJsonSchema {
        public Items() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    ">",
                    "$"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class EnumFormStringArrayList extends FrozenList<String> {
        EnumFormStringArrayList(FrozenList<String> m) {
            super(m);
        }
        public static EnumFormStringArrayList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(EnumFormStringArray.class).validate(arg, configuration);
        }
    }
    
    public class EnumFormStringArrayListInput {
        // class to build List<String>
    }
    
    
    public static class EnumFormStringArray extends JsonSchema<Object, Object, FrozenMap<String, Object>, String, String, EnumFormStringArrayList> {
        public EnumFormStringArray() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
        
        @Override
        protected EnumFormStringArrayList getListOutputInstance(FrozenList<String> arg) {
            return new EnumFormStringArrayList(arg);
        }
        
        @Override
        protected FrozenMap<String, Object> getMapOutputInstance(FrozenMap<String, Object> arg) {
            return arg;
        }
        public EnumFormStringArrayList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class EnumFormString extends NonCollectionJsonSchema {
        public EnumFormString() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "_abc",
                    "-efg",
                    "(xyz)"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class SchemaMap extends FrozenMap<String, Object> {
        SchemaMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "enum_form_string_array",
            "enum_form_string"
        );
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema1.class).validate(arg, configuration);
        }
        
        public EnumFormStringArrayList enum_form_string_array() {
            String key = "enum_form_string_array";
            throwIfKeyNotPresent(key);
            return (EnumFormStringArrayList) get(key);
        }
        
        public String enum_form_string() {
            String key = "enum_form_string";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class SchemaMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema1 extends JsonSchema<Object, Object, SchemaMap, Object, Object, FrozenList<Object>> {
        public Schema1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("enum_form_string_array", EnumFormStringArray.class),
                    new PropertyEntry("enum_form_string", EnumFormString.class)
                )))
            )));
        }
        
        @Override
        protected SchemaMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new SchemaMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
