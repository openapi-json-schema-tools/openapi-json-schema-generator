package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class BananaReq {
    // nest classes so all schemas and input/output classes can be public
    public record class AdditionalProperties implements Schema {
        public static NotAnyTypeSchema withDefaults() {
            return NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    public record class LengthCm implements Schema {
        public static NumberSchema withDefaults() {
            return NumberSchema.withDefaults();
        }
    
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    }
    public record class Sweet implements Schema {
        public static BooleanSchema withDefaults() {
            return BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return Schema.validate(BooleanSchema.class, arg, configuration);
        }
    }
}
