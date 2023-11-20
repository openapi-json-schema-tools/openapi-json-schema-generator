package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Set;


public class DoubleJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Double.class
    ));
    static final String format = "double";

    public static Double validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(DoubleJsonSchema.class, arg, configuration);
    }
}
