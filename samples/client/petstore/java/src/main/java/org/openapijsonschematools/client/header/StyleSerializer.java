package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;

public class StyleSerializer extends Rfc6570Serializer {
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

    public static String serializeForm(
            @Nullable Object inData,
            String name,
            boolean explode,
            boolean percentEncode
    ) {
        // todo check that the prefix and suffix matches this one
        PrefixSeparatorIterator iterator = new PrefixSeparatorIterator("", "&");
        return rfc6570Expansion(
            name,
            inData,
            explode,
            percentEncode,
            iterator
        );
    }

    public static String serializeMatrix(
            @Nullable Object inData,
            String name,
            boolean explode
    ) {
        PrefixSeparatorIterator usedIterator = new PrefixSeparatorIterator(";", ";");
        return rfc6570Expansion(
            name,
            inData,
            explode,
            true,
            usedIterator
        );
    }

    public static String serializeLabel(
            @Nullable Object inData,
            String name,
            boolean explode
    ) {
        PrefixSeparatorIterator usedIterator = new PrefixSeparatorIterator(".", ".");
        return rfc6570Expansion(
            name,
            inData,
            explode,
            true,
            usedIterator
        );
    }

    public static String serializeSpaceDelimited(
            @Nullable Object inData,
            String name,
            boolean explode
    ) {
        PrefixSeparatorIterator usedIterator = new PrefixSeparatorIterator("", "%20");
        return rfc6570Expansion(
            name,
            inData,
            explode,
            true,
            usedIterator
        );
    }

    public static String serializePipeDelimited(
            @Nullable Object inData,
            String name,
            boolean explode
    ) {
        PrefixSeparatorIterator usedIterator = new PrefixSeparatorIterator("", "|");
        return rfc6570Expansion(
            name,
            inData,
            explode,
            true,
            usedIterator
        );
    }
}