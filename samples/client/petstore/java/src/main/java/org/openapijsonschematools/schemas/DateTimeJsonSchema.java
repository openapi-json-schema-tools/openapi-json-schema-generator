package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Set;


public class DateTimeJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        String.class
    ));
    static final String format = "date-time";

    public static String validate(String arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(DateTimeJsonSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(DateTimeJsonSchema.class, arg, configuration);
    }
}
