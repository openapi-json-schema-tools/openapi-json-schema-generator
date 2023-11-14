package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Apple {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Cultivar(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Cultivar withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Cultivar(type);
        }
    }    
    
    public record Origin(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Origin withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Origin(type);
        }
    }}
