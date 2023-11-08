package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;

public record Int32Schema(LinkedHashSet<Class<?>> type, String format) implements Schema {
    public static Int32Schema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(Integer.class);
        type.add(Float.class);
        String format = "int32";
        return new Int32Schema(type, format);
    }

    public static Integer validate(Integer arg, SchemaConfiguration configuration) {
        return Schema.validate(Int32Schema.class, arg, configuration);
    }

    public static Integer validate(Float arg, SchemaConfiguration configuration) {
        return Schema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
    }
}
