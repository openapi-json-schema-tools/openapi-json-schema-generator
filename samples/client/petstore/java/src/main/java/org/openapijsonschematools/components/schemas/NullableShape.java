package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class NullableShape {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Model2(LinkedHashSet<Class<?>> type) implements Schema {
        public static Model2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
                type(None),
            return new Model2(type);
        }
    }}
