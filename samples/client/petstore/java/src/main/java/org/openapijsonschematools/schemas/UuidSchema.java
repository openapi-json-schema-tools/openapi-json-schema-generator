package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.UUID;

public record UuidSchema(LinkedHashSet<Class<?>> type, String format) implements Schema {
    public static UuidSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        String format = "uuid";
        return new UuidSchema(type, format);
    }

    public static String validate(String arg, SchemaConfiguration configuration) {
        return Schema.validate(UuidSchema.class, arg, configuration);
    }

    public static String validate(UUID arg, SchemaConfiguration configuration) {
        return Schema.validate(UuidSchema.class, arg, configuration);
    }
}
