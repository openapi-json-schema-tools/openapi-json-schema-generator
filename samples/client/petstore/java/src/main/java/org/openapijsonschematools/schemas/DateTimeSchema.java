package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.time.ZonedDateTime;

public record DateTimeSchema(LinkedHashSet<Class<?>> type, String format) implements Schema {
    public static DateTimeSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        String format = "date-time";
        return new DateTimeSchema(type, format);
    }

    public static String validate(String arg, SchemaConfiguration configuration) {
        return Schema.validate(DateTimeSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return Schema.validate(DateTimeSchema.class, arg, configuration);
    }
}
