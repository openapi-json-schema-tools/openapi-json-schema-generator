package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.List;

public record ListSchema(LinkedHashSet<Class<?>> type) implements Schema {
    public static ListSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(FrozenList.class);
        return new ListSchema(type);
    }

    public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(ListSchema.class, arg, configuration);
    }
}
