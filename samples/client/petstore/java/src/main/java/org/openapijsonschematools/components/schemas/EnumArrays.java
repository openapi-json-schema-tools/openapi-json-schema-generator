package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class EnumArrays {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record JustSymbol(LinkedHashSet<Class<?>> type) implements Schema {
        public static JustSymbol withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new JustSymbol(type);
        }
    
    }    
    
    public record Items(LinkedHashSet<Class<?>> type) implements Schema {
        public static Items withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Items(type);
        }
    
    }}
