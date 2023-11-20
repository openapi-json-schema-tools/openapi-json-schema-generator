package org.openapijsonschematools.paths.fake.get.parameters.parameter5;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class Schema5 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema51 extends JsonSchema {
        public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        public static final String format = "double";
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema51.class, arg, configuration);
        }
    }}
