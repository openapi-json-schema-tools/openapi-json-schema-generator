package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class QuadrilateralInterface {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record ShapeType(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ShapeType withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ShapeType(type);
        }
    
    }    
    
    public record QuadrilateralType(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static QuadrilateralType withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new QuadrilateralType(type);
        }
    }}
