package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class AnyTypeNotString {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Not(LinkedHashSet<Class<?>> type) implements Schema {
        public static Not withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Not(type);
        }
    }}
