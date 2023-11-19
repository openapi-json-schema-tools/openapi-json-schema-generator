package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class NumberJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Integer.class,
        Long.class,
        Float.class,
        Double.class
    ));

    public static Number validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }

    public static Number validate(Long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }

    public static Number validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }

    public static Number validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }
}
