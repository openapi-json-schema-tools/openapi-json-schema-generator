package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Set;


public class FloatJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Float.class
    ));
    static final String format = "float";

    public static Float validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(FloatJsonSchema.class, arg, configuration);
    }
}
