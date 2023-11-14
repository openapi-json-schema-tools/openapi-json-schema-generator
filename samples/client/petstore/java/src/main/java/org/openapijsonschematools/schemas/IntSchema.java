package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;

public record IntSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
    public static IntSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(Number.class);
        String format = "int";
        return new IntSchema(type, format);
    }

    public static Long validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntSchema.class, Long.valueOf(arg), configuration);
    }

    public static Long validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
    }

    public static Long validate(Long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntSchema.class, arg, configuration);
    }

    public static Long validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
    }
}
