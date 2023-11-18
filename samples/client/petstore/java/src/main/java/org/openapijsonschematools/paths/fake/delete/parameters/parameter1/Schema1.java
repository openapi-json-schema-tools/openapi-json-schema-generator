package org.openapijsonschematools.paths.fake.delete.parameters.parameter1;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.schemas.StringJsonSchema;

public class Schema1 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Schema11 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema11.class, arg, configuration);
        }
    }}
