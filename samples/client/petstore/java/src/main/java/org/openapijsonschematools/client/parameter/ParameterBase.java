package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.header.HeaderBase;
import org.openapijsonschematools.client.header.PrefixSeparatorIterator;

public class ParameterBase extends HeaderBase {
    public final String name;
    public final ParameterInType inType;

    public ParameterBase(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved) {
        super(required, style, explode, allowReserved);
        this.name = name;
        this.inType = inType;
    }

    protected ParameterStyle getStyle() {
        if (style != null) {
            return style;
        }
        if (inType == ParameterInType.QUERY || inType == ParameterInType.COOKIE) {
            return ParameterStyle.FORM;
        }
        //  ParameterInType.HEADER || ParameterInType.PATH
        return ParameterStyle.SIMPLE;
    }

    public PrefixSeparatorIterator getPrefixSeparatorIterator() {
        ParameterStyle usedStyle = getStyle();
        if (usedStyle == ParameterStyle.FORM) {
            return new PrefixSeparatorIterator("", "&");
        } else if (usedStyle == ParameterStyle.SPACE_DELIMITED) {
            return new PrefixSeparatorIterator("", "%20");
        } else if (usedStyle == ParameterStyle.PIPE_DELIMITED) {
            return new PrefixSeparatorIterator("", "|");
        }
        throw new RuntimeException("No iterator possible for style="+usedStyle);
    }
}