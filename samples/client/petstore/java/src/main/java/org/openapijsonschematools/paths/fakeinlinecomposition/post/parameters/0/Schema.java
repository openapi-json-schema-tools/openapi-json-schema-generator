package org.openapijsonschematools.paths.fakeinlinecomposition.post.parameters.0;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Model0(LinkedHashSet<Class<?>> type) implements Schema {
        public static Model0 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Model0(type);
        }
    }}
