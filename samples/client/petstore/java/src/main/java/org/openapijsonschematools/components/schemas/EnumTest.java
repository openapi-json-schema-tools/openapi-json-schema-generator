package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class EnumTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record EnumString(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static EnumString withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumString(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumString.class, arg, configuration);
        }
    }    
    
    public record EnumStringRequired(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static EnumStringRequired withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumStringRequired(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumStringRequired.class, arg, configuration);
        }
    }}
