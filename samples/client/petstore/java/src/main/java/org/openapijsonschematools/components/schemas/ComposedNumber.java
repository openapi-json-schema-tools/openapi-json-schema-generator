package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapijsonschematools.schemas.AnyTypeJsonSchema;

public class ComposedNumber {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema0 extends AnyTypeJsonSchema {}
    
    
    public class ComposedNumber1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedNumber1.class, arg, configuration);
        }
        
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedNumber1.class, arg, configuration);
        }
        
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedNumber1.class, arg, configuration);
        }
        
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ComposedNumber1.class, arg, configuration);
        }
    }}
