package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class MyObjectDto {
    // nest classes so all schemas and input/output classes can be public
    public record class AdditionalProperties implements Schema {
        public static NotAnyTypeSchema withDefaults() {
            return NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record Id(LinkedHashSet<Class<?>> type) implements Schema {
        public static Id withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Id(type);
        }
    }}
