package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;

public class StyleSimpleSerializer extends ParameterSerializerBase {
    public static String serializeSimple(
            @Nullable Object inData,
            String name,
            boolean explode,
            boolean percentEncode
    ) {
        var prefixSeparatorIterator = new PrefixSeparatorIterator("", ",");
        return rfc6570Expansion(
                name,
                inData,
                explode,
                percentEncode,
                prefixSeparatorIterator
        );
    }
}
