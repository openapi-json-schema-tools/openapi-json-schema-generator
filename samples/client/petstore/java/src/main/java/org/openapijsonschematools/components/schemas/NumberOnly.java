package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class NumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class JustNumber extends NumberJsonSchema {}
    
    
    public static class NumberOnlyMap extends FrozenMap<String, Object> {

        NumberOnlyMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static NumberOnlyMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return NumberOnly1.validate(arg, configuration);
        }
        
        public Number JustNumber() {

            String key = "JustNumber";
            if (!containsKey(key)) {
                throw new RuntimeException("JustNumber is unset");
            }
            return (Number) get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class NumberOnly1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("JustNumber", JustNumber.class)
            )))
        ));
        protected static NumberOnlyMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new NumberOnlyMap(arg);
        }
        public static NumberOnlyMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(NumberOnly1.class, arg, configuration);
        }
    }
}
