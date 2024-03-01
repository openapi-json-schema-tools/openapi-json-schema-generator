package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;

public class StyleSimpleSerializer extends Rfc6570Serializer {
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
