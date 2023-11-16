package org.openapijsonschematools.paths.fake.get.parameters.parameter5;
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

public class Schema5 {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema51(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Schema51 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "double";
            return new Schema51(type, format);
        }
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema51.class, arg, configuration);
        }
    }}
