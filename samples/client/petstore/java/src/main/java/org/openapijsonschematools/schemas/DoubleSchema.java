package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;

public record DoubleSchema(LinkedHashSet<Class<?>> type, String format) implements Schema {
    public static DoubleSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(Double.class);
        String format = "double";
        return new DoubleSchema(type, format);
    }

    public static Double validate(Double arg, SchemaConfiguration configuration) {
        return Schema.validate(DoubleSchema.class, arg, configuration);
    }
}
