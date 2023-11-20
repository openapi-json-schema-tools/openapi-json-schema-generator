package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Set;


public class Int32JsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        Integer.class,
        Float.class
    ));
    static final String format = "int32";

    public static Integer validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int32JsonSchema.class, arg, configuration);
    }

    public static Integer validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int32JsonSchema.class, Integer.parseInt(arg.toString()), configuration);
    }
}
