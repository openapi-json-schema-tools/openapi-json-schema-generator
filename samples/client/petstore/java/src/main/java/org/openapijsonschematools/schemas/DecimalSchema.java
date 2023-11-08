package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;

public record DecimalSchema(LinkedHashSet<Class<?>> type, String format) implements Schema {
    public static DecimalSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        String format = "number";
        return new DecimalSchema(type, format);
    }

    public static String validate(String arg, SchemaConfiguration configuration) {
        return Schema.validate(DecimalSchema.class, arg, configuration);
    }
}
