package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Client {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Client2 extends StringJsonSchema {}
    
    
    public static class ClientMap extends FrozenMap<String, Object> {

        ClientMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static ClientMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Client1.validate(arg, configuration);
        }
        
        public String client() {

            String key = "client";
            if (!containsKey(key)) {
                throw new RuntimeException("client is unset");
            }
            return (String) get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class Client1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("client", Client2.class)
            )))
        ));
        protected static ClientMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new ClientMap(arg);
        }
        public static ClientMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Client1.class, arg, configuration);
        }
    }
}
