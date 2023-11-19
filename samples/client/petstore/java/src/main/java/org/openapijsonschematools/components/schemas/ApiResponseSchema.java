package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class ApiResponseSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Code extends Int32JsonSchema {}
    
    
    public class Type extends StringJsonSchema {}
    
    
    public class Message extends StringJsonSchema {}
    
    
    public static class ApiResponseMap extends FrozenMap<String, Object> {
        ApiResponseMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ApiResponseMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ApiResponseSchema1.validate(arg, configuration);
        }
    }    
    
    public class ApiResponseSchema1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("code", Code.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("type", Type.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("message", Message.class)
        ));
        protected static ApiResponseMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ApiResponseMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ApiResponseSchema1.class, arg, configuration);
        }
    }
}
