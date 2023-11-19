package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;

public class Apple {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Cultivar implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Cultivar.class, arg, configuration);
        }
    }    
    
    public class Origin implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Origin.class, arg, configuration);
        }
    }    
    
    class AppleMap extends FrozenMap<String, Object> {
        AppleMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static AppleMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Apple1.validate(arg, configuration);
        }
    }    
    
    public class Apple1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Void.class,
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("cultivar", Cultivar.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("origin", Origin.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "cultivar"
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Apple1.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Apple1.class, arg, configuration);
        }
    }}
