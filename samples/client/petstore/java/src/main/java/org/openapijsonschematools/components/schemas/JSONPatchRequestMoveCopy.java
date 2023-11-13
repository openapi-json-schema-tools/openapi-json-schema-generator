package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class JSONPatchRequestMoveCopy {
    // nest classes so all schemas and input/output classes can be public
    public record class AdditionalProperties implements Schema {
        public static NotAnyTypeSchema withDefaults() {
            return NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record From(LinkedHashSet<Class<?>> type) implements Schema {
        public static From withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new From(type);
        }
    }    
    
    public record Path(LinkedHashSet<Class<?>> type) implements Schema {
        public static Path withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Path(type);
        }
    }    
    
    public record Op(LinkedHashSet<Class<?>> type) implements Schema {
        public static Op withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Op(type);
        }
    
    }}
