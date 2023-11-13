package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ReadOnlyFirst {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Bar(LinkedHashSet<Class<?>> type) implements Schema {
        public static Bar withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Bar(type);
        }
    }    
    
    public record Baz(LinkedHashSet<Class<?>> type) implements Schema {
        public static Baz withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Baz(type);
        }
    }}
