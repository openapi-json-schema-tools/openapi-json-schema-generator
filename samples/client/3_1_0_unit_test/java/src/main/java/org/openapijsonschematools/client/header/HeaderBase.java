package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.parameter.ParameterStyle;

public class HeaderBase {
    public final boolean required;
    public final @Nullable ParameterStyle style;
    public final @Nullable Boolean explode;
    public final @Nullable Boolean allowReserved;

    public HeaderBase(boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved) {
        this.required = required;
        this.style = style;
        this.explode = explode;
        this.allowReserved = allowReserved;
    }
}