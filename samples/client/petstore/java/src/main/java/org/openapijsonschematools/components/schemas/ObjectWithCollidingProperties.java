package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.MapJsonSchema;

public class ObjectWithCollidingProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class SomeProp extends MapJsonSchema {}
    
    
    public class Someprop extends MapJsonSchema {}
    
    
    public static class ObjectWithCollidingPropertiesMap extends FrozenMap<String, Object> {
        ObjectWithCollidingPropertiesMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ObjectWithCollidingPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ObjectWithCollidingProperties1.validate(arg, configuration);
        }
    }    
    
    public class ObjectWithCollidingProperties1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        component with properties that have name collisions
        */
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        public static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("someProp", SomeProp.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("someprop", Someprop.class)
        ));
        protected static ObjectWithCollidingPropertiesMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ObjectWithCollidingPropertiesMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectWithCollidingProperties1.class, arg, configuration);
        }
    }
}
