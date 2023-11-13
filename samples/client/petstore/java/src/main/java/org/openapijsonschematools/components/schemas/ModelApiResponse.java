package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ModelApiResponse {
    // nest classes so all schemas and input/output classes can be public
    public record class Code implements Schema {
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
    
    
    public record Type(LinkedHashSet<Class<?>> type) implements Schema {
        public static Type withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Type(type);
        }
    }    
    
    public record Message(LinkedHashSet<Class<?>> type) implements Schema {
        public static Message withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Message(type);
        }
    }}
