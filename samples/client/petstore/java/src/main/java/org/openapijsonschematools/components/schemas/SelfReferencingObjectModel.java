package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;

public class SelfReferencingObjectModel {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SelfReferencingObjectModelMap extends FrozenMap<String, Object> {
        SelfReferencingObjectModelMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static SelfReferencingObjectModelMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return SelfReferencingObjectModel1.validate(arg, configuration);
        }
    }    
    
    public class SelfReferencingObjectModel1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("selfRef", SelfReferencingObjectModel1.class)
        ));
        static final Class<?> additionalProperties = SelfReferencingObjectModel1.class;
        static SelfReferencingObjectModelMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new SelfReferencingObjectModelMap(arg);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SelfReferencingObjectModel1.class, arg, configuration);
        }
    }
}
