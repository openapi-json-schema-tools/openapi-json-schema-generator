package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class HealthCheckResult {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class NullableMessage extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Void.class,
                String.class
            )))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NullableMessage.class, arg, configuration);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NullableMessage.class, arg, configuration);
        }
    }    
    
    public static class HealthCheckResultMap extends FrozenMap<String, Object> {

        HealthCheckResultMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static HealthCheckResultMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return HealthCheckResult1.validate(arg, configuration);
        }
        
        public String NullableMessage() {

            String key = "NullableMessage";
            if (!containsKey(key)) {
                throw new RuntimeException("NullableMessage is unset");
            }
            return String get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class HealthCheckResult1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("NullableMessage", NullableMessage.class)
            )))
        ));
        protected static HealthCheckResultMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new HealthCheckResultMap(arg);
        }
        public static HealthCheckResultMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(HealthCheckResult1.class, arg, configuration);
        }
    }
}
