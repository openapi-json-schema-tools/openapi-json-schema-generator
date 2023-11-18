package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.schemas.UnsetAnyTypeJsonSchema;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class ApiResponseSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Code extends Int32JsonSchema {
    }
    
    
    public class Type extends StringJsonSchema {
    }
    
    
    public class Message extends StringJsonSchema {
    }
    
    
    public class ApiResponseSchema1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("code", Code.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("type", Type.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("message", Message.class)
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ApiResponseSchema1.class, arg, configuration);
        }
    }
}
