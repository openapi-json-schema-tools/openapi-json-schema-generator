package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class MapJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        FrozenMap.class
    ));

    public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(MapJsonSchema.class, arg, configuration);
    }
}
