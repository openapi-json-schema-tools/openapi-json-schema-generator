package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.DecimalJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ObjectWithDecimalProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Width extends DecimalJsonSchema {}
    
    
    public static class ObjectWithDecimalPropertiesMap extends FrozenMap<String, Object> {

        ObjectWithDecimalPropertiesMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static ObjectWithDecimalPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return ObjectWithDecimalProperties1.validate(arg, configuration);
        }
        
        public String length() {

            String key = "length";
            if (!containsKey(key)) {
                throw new RuntimeException("length is unset");
            }
            return String get(key);

        }
        
        public String width() {

            String key = "width";
            if (!containsKey(key)) {
                throw new RuntimeException("width is unset");
            }
            return String get(key);

        }
        
        public Money.MoneyMap cost() {

            String key = "cost";
            if (!containsKey(key)) {
                throw new RuntimeException("cost is unset");
            }
            return Money.MoneyMap get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class ObjectWithDecimalProperties1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("length", DecimalPayload.DecimalPayload1.class),
                new PropertyEntry("width", Width.class),
                new PropertyEntry("cost", Money.Money1.class)
            )))
        ));
        protected static ObjectWithDecimalPropertiesMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new ObjectWithDecimalPropertiesMap(arg);
        }
        public static ObjectWithDecimalPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ObjectWithDecimalProperties1.class, arg, configuration);
        }
    }
}
