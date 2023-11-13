package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class EnumTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record EnumString(LinkedHashSet<Class<?>> type) implements Schema {
        public static EnumString withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumString(type);
        }
    
    }    
    
    public record EnumStringRequired(LinkedHashSet<Class<?>> type) implements Schema {
        public static EnumStringRequired withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumStringRequired(type);
        }
    
    }}
