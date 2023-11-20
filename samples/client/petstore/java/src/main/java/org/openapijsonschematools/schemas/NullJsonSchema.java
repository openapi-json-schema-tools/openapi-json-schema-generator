package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Set;


public class NullJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Void.class
    ));

    public static Void validate(Void arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NullJsonSchema.class, arg, configuration);
    }
}
