package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ObjectWithOnlyOptionalProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties implements JsonSchema {
        public static NotAnyTypeSchema withDefaults() {
            return NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record A(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static A withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new A(type);
        }
    }    
    
    public record B implements JsonSchema {
        public static NumberSchema withDefaults() {
            return NumberSchema.withDefaults();
        }
    
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    }
}
