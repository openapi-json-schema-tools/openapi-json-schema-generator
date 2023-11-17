package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class UuidJsonSchema implements JsonSchema {
    static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        String.class
    ));
    static final String format = "uuid";

    public static String validate(String arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(UuidJsonSchema.class, arg, configuration);
    }

    public static String validate(UUID arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(UuidJsonSchema.class, arg, configuration);
    }
}