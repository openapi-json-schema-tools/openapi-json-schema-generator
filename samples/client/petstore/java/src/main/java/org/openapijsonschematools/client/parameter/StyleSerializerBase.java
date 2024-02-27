package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class ParameterSerializerBase {
    private static final String ENCODING = "UTF-8";
    private static final Set<String> namedParameterSeparators = Set.of("&", ";");

    private static String percentEncode(String s) {
        if (s == null) {
            return "";
        }
        try {
            return URLEncoder.encode(s, ENCODING)
                    // OAuth encodes some characters differently:
                    .replace("+", "%20").replace("*", "%2A")
                    .replace("%7E", "~");
            // This could be done faster with more hand-crafted code.
        } catch (UnsupportedEncodingException wow) {
            throw new RuntimeException(wow.getMessage(), wow);
        }
    }

    private static @Nullable String rfc6570ItemValue(@Nullable Object item, boolean percentEncode) {
        /*
        Get representation if str/float/int/None/items in list/ values in dict
        None is returned if an item is undefined, use cases are value=
        - None
        - []
        - {}
        - [None, None None]
        - {'a': None, 'b': None}
        */
        if (item instanceof String stringItem) {
            if (percentEncode) {
                return percentEncode(stringItem);
            }
            return stringItem;
        } else if (item instanceof Number numberItem) {
            return numberItem.toString();
        } else if (item == null) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return null;
        } else if (item instanceof List<?> && ((List<?>) item).isEmpty()) {
            // // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return null;
        } else if (item instanceof Map<?, ?> && ((Map<?, ?>) item).isEmpty()) {
            // // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return null;
        }
        throw new InvalidTypeException("Unable to generate a rfc6570 item representation of "+item);
    }
    
    private static String rfc6570StrNumberExpansion(
        @Nullable Object inData,
        boolean percentEncode,
        Object prefixSeparatorIterator, // todo fix this
        String varNamePiece,
        boolean namedParameterExpansion
    ) {
        var itemValue = rfc6570ItemValue(inData, percentEncode);
        if (itemValue == null || (itemValue.isEmpty() && prefixSeparatorIterator.separator == ';')) {
            return next(prefixSeparatorIterator) + varNamePiece;
        }
        var valuePairEquals = namedParameterExpansion ? "=" : "";
        return next(prefixSeparatorIterator) + varNamePiece + valuePairEquals + itemValue;
    }

    private static String rfc6570ListExpansion(
        List<?> inData,
        boolean explode,
        boolean percentEncode,
        Object prefixSeparatorIterator, // todo fix this
        String varNamePiece,
        boolean namedParameterExpansion
    ) {
        var itemValues = inData.stream()
                .map(v -> rfc6570ItemValue(v, percentEncode))
                .filter(Objects::nonNull)
                .collect(toList());
        if (itemValues.isEmpty()) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return "";
        }
        var valuePairEquals = namedParameterExpansion ? "=" : "";
        if (!explode) {
            return (
                    next(prefixSeparatorIterator) +
                            varNamePiece +
                            valuePairEquals +
                            prefixSeparatorIterator.itemSeparator.join(itemValues)
            );
        }
        // exploded
        return next(prefixSeparatorIterator) + next(prefixSeparatorIterator).join(
                itemValues.stream().map(v -> varNamePiece + valuePairEquals + v).collect(toList())
        );
    }

    private static String rfc6570MapExpansion(
        Map<?, ?> inData,
        boolean explode,
        boolean percentEncode,
        Object prefixSeparatorIterator, // todo fix this
        String varNamePiece,
        boolean namedParameterExpansion
    ) {
        var inDataMap = inData.entrySet().stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), rfc6570ItemValue(entry.getValue(), percentEncode)))
                .filter(entry -> entry.getValue() != null)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, HashMap::new));

        if (inDataMap.isEmpty()) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return "";
        }
        var valuePairEquals = namedParameterExpansion ? "=" : "";
        if (!explode) {
            return (
                    next(prefixSeparatorIterator) +
                            varNamePiece +
                            valuePairEquals +
                            prefixSeparatorIterator.itemSeparator.join(
                                    prefixSeparatorIterator.itemSeparator.join(
                                            inDataMap.entrySet().stream().map(e -> List.of(e.getKey(), e.getValue()))
                                    )
                            )
            );
        }
        // exploded
        return next(prefixSeparatorIterator) + next(prefixSeparatorIterator).join(
                inDataMap.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(toList())
        );
    }

    public static String rfc6570Expansion(
        String variableName,
        @Nullable Object inData,
        boolean explode,
        boolean percentEncode,
        Object prefixSeparatorIterator // todo fix this
    ) {
        /*
        Separator is for separate variables like dict with explode true,
        not for array item separation
        */
        var namedParameterExpansion = namedParameterSeparators.contains(prefixSeparatorIterator.separator);
        var varNamePiece = namedParameterExpansion ? variableName : "";
        if (inData instanceof Number || inData instanceof String) {
            return rfc6570StrNumberExpansion(
                    inData,
                    percentEncode,
                    prefixSeparatorIterator,
                    varNamePiece,
                    namedParameterExpansion
            );
        } else if (inData == null) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return "";
        } else if (inData instanceof List<?> listData) {
            return rfc6570ListExpansion(
                    listData,
                    explode,
                    percentEncode,
                    prefixSeparatorIterator,
                    varNamePiece,
                    namedParameterExpansion
            );
        } else if (inData instanceof Map<?, ?> mapData) {
            return rfc6570MapExpansion(
                    mapData,
                    explode,
                    percentEncode,
                    prefixSeparatorIterator,
                    varNamePiece,
                    namedParameterExpansion
            );
        }
        // bool, bytes, etc
        throw new InvalidTypeException("Unable to generate a rfc6570 representation of "+inData);
    }
}