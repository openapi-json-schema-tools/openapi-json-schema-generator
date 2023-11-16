package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter4;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Schema4 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema41(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema41 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Schema41(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema41.class, arg, configuration);
        }
    }}
