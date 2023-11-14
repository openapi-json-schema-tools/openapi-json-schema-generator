package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class ComplexQuadrilateral {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record QuadrilateralType(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static QuadrilateralType withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new QuadrilateralType(type);
        }
    
    }}
