package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.parameter.ParameterStyle;

public class HeaderBase {
    public final boolean required;
    public final @Nullable ParameterStyle style;
    public final @Nullable boolean explode;
    public final @Nullable boolean allowReserved;

    public HeaderBase(boolean required, @Nullable ParameterStyle style, @Nullable boolean explode, @Nullable boolean allowReserved) {
        this.required = required;
        this.style = style;
        this.explode = explode;
        this.allowReserved = allowReserved;
    }
}