package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.math.BigDecimal;

record FloatSchema(LinkedHashSet<Class<?>> type, String format) implements Schema {
    public static FloatSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(BigDecimal.class);
        String format = "float";
        return new FloatSchema(type, format);
    }

    public static Float validate(Float arg, SchemaConfiguration configuration) {
        return Schema.validate(FloatSchema.class, arg, configuration);
    }
}
