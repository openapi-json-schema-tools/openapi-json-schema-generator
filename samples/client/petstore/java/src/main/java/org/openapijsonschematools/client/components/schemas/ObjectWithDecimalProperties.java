package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.DecimalJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ObjectWithDecimalProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Width extends DecimalJsonSchema {}
    
    
    public static class ObjectWithDecimalPropertiesMap extends FrozenMap<String, Object> {
        ObjectWithDecimalPropertiesMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "length",
            "width",
            "cost"
        );
        public static ObjectWithDecimalPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithDecimalProperties1.validate(arg, configuration);
        }
        
        public String length() {
            String key = "length";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String width() {
            String key = "width";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Money.MoneyMap cost() {
            String key = "cost";
            throwIfKeyNotPresent(key);
            return (Money.MoneyMap) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class ObjectWithDecimalProperties1 extends JsonSchema {
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
        public static ObjectWithDecimalPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(ObjectWithDecimalProperties1.class, arg, configuration);
        }
    }
}