package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.BooleanJsonSchema;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;

public class Whale {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class HasBaleen extends BooleanJsonSchema {}
    
    
    public class HasTeeth extends BooleanJsonSchema {}
    
    
    public class ClassName implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ClassName.class, arg, configuration);
        }
    }    
    
    public static class WhaleMap extends FrozenMap<String, Object> {
        WhaleMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static WhaleMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Whale1.validate(arg, configuration);
        }
    }    
    
    public class Whale1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("hasBaleen", HasBaleen.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("hasTeeth", HasTeeth.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("className", ClassName.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "className"
        ));
        static WhaleMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new WhaleMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Whale1.class, arg, configuration);
        }
    }
}
