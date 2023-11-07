package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.time.ZonedDateTime;
import java.time.LocalDate;

record StringSchema(LinkedHashSet<Class<?>> type) implements Schema {
    public static StringSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        return new StringSchema(type);
    }

    public static String validate(String arg, SchemaConfiguration configuration) {
        return Schema.validate(StringSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return Schema.validate(StringSchema.class, arg, configuration);
    }

    public static String validate(LocalDate arg, SchemaConfiguration configuration) {
        return Schema.validate(StringSchema.class, arg, configuration);
    }
}
