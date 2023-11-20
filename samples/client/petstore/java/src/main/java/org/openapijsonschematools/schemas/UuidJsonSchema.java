package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;


public class UuidJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        String.class
    ));
    public static final String format = "uuid";

    public static String validate(String arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(UuidJsonSchema.class, arg, configuration);
    }

    public static String validate(UUID arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(UuidJsonSchema.class, arg, configuration);
    }
}
