package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class MixedPropertiesAndAdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Uuid(LinkedHashSet<Class<?>> type) implements Schema {
        public static Uuid withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Uuid(type);
        }
    }    
    
    public record DateTime(LinkedHashSet<Class<?>> type) implements Schema {
        public static DateTime withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new DateTime(type);
        }
    }}
