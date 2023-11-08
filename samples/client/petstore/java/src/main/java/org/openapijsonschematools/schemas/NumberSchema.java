package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;

public record NumberSchema(LinkedHashSet<Class<?>> type) implements Schema {
    public static NumberSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(Integer.class);
        type.add(Long.class);
        type.add(Float.class);
        type.add(Double.class);
        return new NumberSchema(type);
    }

    public static Number validate(Integer arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, arg, configuration);
    }

    public static Number validate(Long arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, arg, configuration);
    }

    public static Number validate(Float arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, arg, configuration);
    }

    public static Number validate(Double arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, arg, configuration);
    }
}
