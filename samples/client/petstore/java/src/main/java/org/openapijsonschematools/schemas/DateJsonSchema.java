package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


public class DateJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        String.class
    ));
    static final String format = "date";

    public static String validate(String arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(DateJsonSchema.class, arg, configuration);
    }

    public static String validate(LocalDate arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(DateJsonSchema.class, arg, configuration);
    }
}
