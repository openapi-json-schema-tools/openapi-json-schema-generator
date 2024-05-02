package org.openapijsonschematools.client.mediatype;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.header.Header;

import java.util.Map;

public class Encoding {
    public final String contentType;
    public final @Nullable Map<String, Header> headers;
    public final @Nullable ParameterStyle style;
    public final boolean explode;
    public final boolean allowReserved;

    public Encoding(String contentType) {
        this.contentType = contentType;
        headers = null;
        style = null;
        explode = false;
        allowReserved = false;
    }
    public Encoding(String contentType, @Nullable Map<String, Header> headers) {
        this.contentType = contentType;
        this.headers = headers;
        style = null;
        explode = false;
        allowReserved = false;
    }
}