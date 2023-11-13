package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class PublicKey {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Key(LinkedHashSet<Class<?>> type) implements Schema {
        public static Key withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Key(type);
        }
    }}
