package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.JsonSchema;

public class ReqPropsFromUnsetAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    class ReqPropsFromUnsetAddPropsMap extends FrozenMap<String, Object> {
        ReqPropsFromUnsetAddPropsMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static ReqPropsFromUnsetAddPropsMap of(Map<String, Object> arg, SchemaConfiguration configuration) {
            return ReqPropsFromUnsetAddProps1.validate(arg, configuration);
        }
    }    
    
    public class ReqPropsFromUnsetAddProps1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "invalid-name",
            "validName"
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ReqPropsFromUnsetAddProps1.class, arg, configuration);
        }
    }
}
