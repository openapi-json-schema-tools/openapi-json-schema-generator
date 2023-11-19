package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.IntJsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class FromSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Data extends StringJsonSchema {}
    
    
    public class Id extends IntJsonSchema {}
    
    
    public static class FromSchemaMap extends FrozenMap<String, Object> {
        FromSchemaMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static FromSchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return FromSchema1.validate(arg, configuration);
        }
    }    
    
    public class FromSchema1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("data", Data.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("id", Id.class)
        ));
        static FromSchemaMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new FromSchemaMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FromSchema1.class, arg, configuration);
        }
    }
}
