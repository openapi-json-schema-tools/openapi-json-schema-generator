package org.openapijsonschematools.paths.fake.delete.parameters.parameter4;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema41 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema41.class, arg, configuration);
        }
    }}
