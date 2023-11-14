package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ShapeOrNull {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema0(LinkedHashSet<Class<?>> type) implements Schema {
        public static Schema0 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
                type(None),
            return new Schema0(type);
        }
    }}
