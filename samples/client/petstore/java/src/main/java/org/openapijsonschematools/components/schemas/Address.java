package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Address {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties implements JsonSchema {
        public static IntSchema withDefaults() {
            return IntSchema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
}
