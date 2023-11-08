package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Map;

public record ListSchema(LinkedHashSet<Class<?>> type) implements Schema {
    public static MapSchema withDefaults() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(FrozenList.class);
        return new MapSchema(type);
    }

    public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return Schema.validate(MapSchema.class, arg, configuration);
    }
}
