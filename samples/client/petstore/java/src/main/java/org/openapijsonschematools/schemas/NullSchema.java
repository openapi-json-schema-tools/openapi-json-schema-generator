package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;

public record NullSchema(LinkedHashSet<Class<?>> type) implements Schema {
    public static NullSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(Void.class);
        return new NullSchema(type);
    }

    public static Void validate(Void arg, SchemaConfiguration configuration) {
        return Schema.validate(NullSchema.class, arg, configuration);
    }
}
