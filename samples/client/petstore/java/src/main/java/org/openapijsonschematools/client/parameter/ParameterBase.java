package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;

import java.util.Map;

public class ParameterBase {
    public final ParameterInType inType;
    public final boolean required;
    public final @Nullable ParameterStyle style;
    public final @Nullable boolean explode;
    public final @Nullable boolean allowReserved;
    public final @Nullable JsonSchema<?> schema;
    public final @Nullable Map<String, MediaType<?, ?>> content;

    public ParameterBase(ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable boolean explode, @Nullable boolean allowReserved, JsonSchema<?> schema, @Nullable Map<String, MediaType<?, ?>> content) {
        this.inType = inType;
        this.required = required;
        this.style = style;
        this.explode = explode;
        this.allowReserved = allowReserved;
        this.schema = schema;
        this.content = content;
    }
}