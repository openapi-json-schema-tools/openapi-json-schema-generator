package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Set;


public class BooleanJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Boolean.class
    ));

    public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(BooleanJsonSchema.class, arg, configuration);
    }
}
