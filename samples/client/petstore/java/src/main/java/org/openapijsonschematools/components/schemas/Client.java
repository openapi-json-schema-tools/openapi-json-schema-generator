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
import org.openapijsonschematools.schemas.validation.PropertiesEntry;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Client {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Client2 extends StringJsonSchema {}
    
    
    public static class ClientMap extends FrozenMap<String, Object> {
        ClientMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ClientMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Client1.validate(arg, configuration);
        }
    }    
    
    public class Client1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("client", Client2.class)
        ));
        protected static ClientMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ClientMap(arg);
        }
        public static ClientMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Client1.class, arg, configuration);
        }
    }
}
