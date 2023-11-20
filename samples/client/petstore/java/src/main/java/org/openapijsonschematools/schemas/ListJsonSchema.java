package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class ListJsonSchema extends JsonSchema {
    public static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
        FrozenList.class
    ));

    public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(ListJsonSchema.class, arg, configuration);
    }
}
