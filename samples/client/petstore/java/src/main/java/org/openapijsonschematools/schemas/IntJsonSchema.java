package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class IntJsonSchema implements JsonSchema {
    static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Long.class
    ));
    static final String format = "int";

    public static Long validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, Long.valueOf(arg), configuration);
    }

    public static Long validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, Long.parseLong(arg.toString()), configuration);
    }

    public static Long validate(Long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, arg, configuration);
    }

    public static Long validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, Long.parseLong(arg.toString()), configuration);
    }
}