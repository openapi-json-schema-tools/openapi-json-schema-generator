package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class MapTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties2(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalProperties2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties2(type);
        }
    }    
    
    public record AdditionalProperties3(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalProperties3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties3(type);
        }
    
    }    public record class AdditionalProperties4 implements Schema {
        public static BooleanSchema withDefaults() {
            return BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return Schema.validate(BooleanSchema.class, arg, configuration);
        }
    }
}
