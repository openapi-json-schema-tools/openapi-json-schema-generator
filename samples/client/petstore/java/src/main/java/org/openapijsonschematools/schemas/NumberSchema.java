package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.math.BigDecimal;

record NumberSchema(LinkedHashSet<Class<?>> type) implements Schema {
    public static NumberSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(BigDecimal.class);
        return new NumberSchema(type);
    }

    public static BigDecimal validate(Integer arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, BigDecimal.valueOf(arg), configuration);
    }

    public static BigDecimal validate(Long arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, BigDecimal.valueOf(arg), configuration);
    }

    public static BigDecimal validate(Float arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, BigDecimal.valueOf(arg), configuration);
    }

    public static BigDecimal validate(Double arg, SchemaConfiguration configuration) {
        return Schema.validate(NumberSchema.class, BigDecimal.valueOf(arg), configuration);
    }
}
