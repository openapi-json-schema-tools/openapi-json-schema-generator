package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class GrandparentAnimal {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record PetType(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static PetType withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new PetType(type);
        }
    }}
