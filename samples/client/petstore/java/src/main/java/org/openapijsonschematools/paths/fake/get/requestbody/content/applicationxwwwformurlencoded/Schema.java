package org.openapijsonschematools.paths.fake.get.requestbody.content.applicationxwwwformurlencoded;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Items extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public static class EnumFormStringArrayList extends FrozenList<String> {

        EnumFormStringArrayList(FrozenList<String> m) {

            super(m);
        }
        public static EnumFormStringArrayList of(List<String> arg, SchemaConfiguration configuration) {

            return EnumFormStringArray.validate(arg, configuration);
        }
    }
    
    
    public class EnumFormStringArray extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static EnumFormStringArrayList getListOutputInstance(FrozenList<String> arg) {

            return new EnumFormStringArrayList(arg);
        }
        public static EnumFormStringArrayList validate(List<String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(EnumFormStringArray.class, arg, configuration);
        }
    }    
    
    public class EnumFormString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumFormString.class, arg, configuration);
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
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema1.validate(arg, configuration);
        }
        
        public EnumFormStringArrayList enum_form_string_array() {

            String key = "enum_form_string_array";
            if (!containsKey(key)) {
                throw new RuntimeException("enum_form_string_array is unset");
            }
            return (EnumFormStringArrayList) get(key);

        }
        
        public String enum_form_string() {

            String key = "enum_form_string";
            if (!containsKey(key)) {
                throw new RuntimeException("enum_form_string is unset");
            }
            return (String) get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("enum_form_string_array", EnumFormStringArray.class),
                new PropertyEntry("enum_form_string", EnumFormString.class)
            )))
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
