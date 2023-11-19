package org.openapijsonschematools.paths.storeorderorderid.get.parameters.parameter0;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

public class Schema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema01 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        static final String format = "int64";
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema01.class, Long.parseLong(arg.toString()), configuration);
        }
    }}
