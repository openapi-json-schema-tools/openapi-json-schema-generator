package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Animal {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record ClassName(LinkedHashSet<Class<?>> type) implements Schema {
        public static ClassName withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ClassName(type);
        }
    }    
    
    public record Color(LinkedHashSet<Class<?>> type) implements Schema {
        public static Color withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Color(type);
        }
    }}
