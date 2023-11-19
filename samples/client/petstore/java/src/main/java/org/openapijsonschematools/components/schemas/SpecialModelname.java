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

public class SpecialModelname {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class A extends StringJsonSchema {}
    
    
    class SpecialModelnameMap extends FrozenMap<String, Object> {
        SpecialModelnameMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static SpecialModelnameMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return SpecialModelname1.validate(arg, configuration);
        }
    }    
    
    public class SpecialModelname1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        model with an invalid class name for python
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("a", A.class)
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SpecialModelname1.class, arg, configuration);
        }
    }
}
