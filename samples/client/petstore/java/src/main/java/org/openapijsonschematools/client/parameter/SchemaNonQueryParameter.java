package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.header.PrefixSeparatorIterator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;

import java.util.Map;

public class SchemaNonQueryParameter extends SchemaParameter implements QueryParameter {

    public SchemaNonQueryParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved, JsonSchema<?> schema) {
        super(name, inType, required, ParameterStyle.SIMPLE, explode, allowReserved, schema);
    }

    @Override
    public Map<String, String> serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration, PrefixSeparatorIterator iterator) {
        return serialize(inType, validate, configuration, iterator);
    }
}