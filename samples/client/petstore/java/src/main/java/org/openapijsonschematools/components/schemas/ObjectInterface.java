package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ObjectInterface {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record ObjectInterface2 implements JsonSchema {
        public static MapSchema withDefaults() {
            return MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapSchema.class, arg, configuration);
        }
    }
}
