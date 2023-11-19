package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class ObjectWithOptionalTestProp {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Test extends StringJsonSchema {}
    
    
    public static class ObjectWithOptionalTestPropMap extends FrozenMap<String, Object> {
        ObjectWithOptionalTestPropMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ObjectWithOptionalTestPropMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ObjectWithOptionalTestProp1.validate(arg, configuration);
        }
    }    
    
    public class ObjectWithOptionalTestProp1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("test", Test.class)
        ));
        protected static ObjectWithOptionalTestPropMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new ObjectWithOptionalTestPropMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectWithOptionalTestProp1.class, arg, configuration);
        }
    }
}
