package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ReadOnlyFirst {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Bar(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Bar withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Bar(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Bar.class, arg, configuration);
        }
    }    
    
    public record Baz(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Baz withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Baz(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Baz.class, arg, configuration);
        }
    }}
