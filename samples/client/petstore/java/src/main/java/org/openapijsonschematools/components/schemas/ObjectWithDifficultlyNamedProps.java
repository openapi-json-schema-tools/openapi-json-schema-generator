package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ObjectWithDifficultlyNamedProps {
    // nest classes so all schemas and input/output classes can be public
    public record class SpecialPropertyName implements Schema {
        public static Int64Schema withDefaults() {
            return Int64Schema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
    
    
    public record Model123List(LinkedHashSet<Class<?>> type) implements Schema {
        public static Model123List withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Model123List(type);
        }
    }    public record class Model123Number implements Schema {
        public static IntSchema withDefaults() {
            return IntSchema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(IntSchema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(IntSchema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
}
