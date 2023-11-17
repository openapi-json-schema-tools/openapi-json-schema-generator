package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class BooleanJsonSchema implements JsonSchema {
    static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Boolean.class
    ));

    public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(BooleanJsonSchema.class, arg, configuration);
    }
}
