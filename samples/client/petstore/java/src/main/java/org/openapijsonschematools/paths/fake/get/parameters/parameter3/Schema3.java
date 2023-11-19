package org.openapijsonschematools.paths.fake.get.parameters.parameter3;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;

public class Schema3 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema31 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema31.class, arg, configuration);
        }
    }}
