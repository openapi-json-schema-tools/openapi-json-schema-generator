package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class StringJsonSchema implements JsonSchema {
    static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        String.class
    ));

    public static String validate(String arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(StringJsonSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(StringJsonSchema.class, arg, configuration);
    }

    public static String validate(LocalDate arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(StringJsonSchema.class, arg, configuration);
    }
}
