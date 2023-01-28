package org.openapijsonschematools.codegen.model;

import org.openapijsonschematools.codegen.CodegenHeader;

import java.util.Map;
import java.util.Objects;

public class CodegenEncoding {
    public final String contentType;
    public final Map<String, CodegenHeader> headers;
    public final String style;
    public final boolean explode;
    public final boolean allowReserved;

    public CodegenEncoding(String contentType, Map<String, CodegenHeader> headers, String style, boolean explode, boolean allowReserved) {
        this.contentType = contentType;
        this.headers = headers;
        this.style = style;
        this.explode = explode;
        this.allowReserved = allowReserved;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenEncoding{");
        sb.append("contentType=").append(contentType);
        sb.append(", headers=").append(headers);
        sb.append(", style=").append(style);
        sb.append(", explode=").append(explode);
        sb.append(", allowReserved=").append(allowReserved);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenEncoding that = (CodegenEncoding) o;
        return contentType == that.contentType &&
                Objects.equals(headers, that.headers) &&
                style == that.style &&
                explode == that.explode &&
                allowReserved == that.allowReserved;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, headers, style, explode, allowReserved);
    }
}
