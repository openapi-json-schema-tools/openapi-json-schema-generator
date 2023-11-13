package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Name {
    // nest classes so all schemas and input/output classes can be public
    public record class Name2 implements Schema {
        public static Int32Schema withDefaults() {
            return Int32Schema.withDefaults();
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
    public record class SnakeCase implements Schema {
        public static Int32Schema withDefaults() {
            return Int32Schema.withDefaults();
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
    
    
    public record Property(LinkedHashSet<Class<?>> type) implements Schema {
        public static Property withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Property(type);
        }
    }}
