package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.mediatype.MediaType;

import java.util.Map;

public class ContentNonQueryParameter extends ContentParameter implements NonQueryParameter {

    public ContentNonQueryParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved, Map<String, MediaType<?, ?>> content) {
        super(name, inType, required, style, explode, allowReserved, content);
    }

    @Override
    public Map<String, String> serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration) {
        return super.serialize(inData, validate, configuration);
    }
}