package org.openapijsonschematools.paths.commonparamsubdir.parameters.parameter0;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import java.util.LinkedHashSet;
import java.util.Set;

public class PathParamSchema0 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class PathParamSchema01 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PathParamSchema01.class, arg, configuration);
        }
    }}
