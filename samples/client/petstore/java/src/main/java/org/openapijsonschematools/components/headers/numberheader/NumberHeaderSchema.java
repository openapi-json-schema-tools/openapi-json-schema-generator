package org.openapijsonschematools.components.headers.numberheader;
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

public class NumberHeaderSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record NumberHeaderSchema1(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static NumberHeaderSchema1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "number";
            return new NumberHeaderSchema1(type, format);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberHeaderSchema1.class, arg, configuration);
        }
    }}
