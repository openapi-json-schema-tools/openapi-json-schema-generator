package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class FloatJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Float.class
    ));
    static final String format = "float";

    public static Float validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(FloatJsonSchema.class, arg, configuration);
    }
}
