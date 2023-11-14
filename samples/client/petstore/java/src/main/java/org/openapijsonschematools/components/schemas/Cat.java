package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Cat {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Declawed implements JsonSchema {
        public static BooleanSchema withDefaults() {
            return BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanSchema.class, arg, configuration);
        }
    }
}
