package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.NotImplementedException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Rfc6570Serializer {
    private static final String ENCODING = "UTF-8";
    private static final Set<String> namedParameterSeparators = Set.of("&", ";");

    private static String percentEncode(String s) throws NotImplementedException {
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
            @Nullable String msg = wow.getMessage();
            if (msg == null) {
                throw new NotImplementedException("UnsupportedEncodingException thrown");
            }
            throw new NotImplementedException(msg);
        }
    }

    private static @Nullable String rfc6570ItemValue(@Nullable Object item, boolean percentEncode) throws NotImplementedException {
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
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return null;
        } else if (item instanceof Map<?, ?> && ((Map<?, ?>) item).isEmpty()) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return null;
        }
        throw new NotImplementedException("Unable to generate a rfc6570 item representation of "+item);
    }

    private static String rfc6570StrNumberExpansion(
        @Nullable Object inData,
        boolean percentEncode,
        PrefixSeparatorIterator prefixSeparatorIterator,
        String varNamePiece,
        boolean namedParameterExpansion
    ) throws NotImplementedException {
        var itemValue = rfc6570ItemValue(inData, percentEncode);
        if (itemValue == null || (itemValue.isEmpty() && prefixSeparatorIterator.separator.equals(";"))) {
            return prefixSeparatorIterator.next() + varNamePiece;
        }
        var valuePairEquals = namedParameterExpansion ? "=" : "";
        return prefixSeparatorIterator.next() + varNamePiece + valuePairEquals + itemValue;
    }

    private static String rfc6570ListExpansion(
        List<?> inData,
        boolean explode,
        boolean percentEncode,
        PrefixSeparatorIterator prefixSeparatorIterator,
        String varNamePiece,
        boolean namedParameterExpansion
    ) throws NotImplementedException {
        List<String> itemValues = new ArrayList<>();
        for (Object v: inData) {
            @Nullable String value = rfc6570ItemValue(v, percentEncode);
            if (value == null) {
                continue;
            }
            itemValues.add(value);
        }
        if (itemValues.isEmpty()) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return "";
        }
        var valuePairEquals = namedParameterExpansion ? "=" : "";
        if (!explode) {
            return (
                    prefixSeparatorIterator.next() +
                            varNamePiece +
                            valuePairEquals +
                            String.join(prefixSeparatorIterator.itemSeparator, itemValues)
            );
        }
        // exploded
        return prefixSeparatorIterator.next() + itemValues.stream().map(v -> varNamePiece + valuePairEquals + v).collect(Collectors.joining(prefixSeparatorIterator.next()));
    }

    private static String rfc6570MapExpansion(
        Map<?, ?> inData,
        boolean explode,
        boolean percentEncode,
        PrefixSeparatorIterator prefixSeparatorIterator,
        String varNamePiece,
        boolean namedParameterExpansion
    ) throws NotImplementedException {
        Map<String, String> inDataMap = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry: inData.entrySet()) {
            @Nullable String value = rfc6570ItemValue(entry.getValue(), percentEncode);
            if (value == null) {
                continue;
            }
            @Nullable Object key = entry.getKey();
            if (!(key instanceof String strKey)) {
                continue;
            }
            inDataMap.put(strKey, value);
        }
        if (inDataMap.isEmpty()) {
            // ignored by the expansion process https://datatracker.ietf.org/doc/html/rfc6570#section-3.2.1
            return "";
        }
        var valuePairEquals = namedParameterExpansion ? "=" : "";
        if (!explode) {
            return prefixSeparatorIterator.next() +
                varNamePiece +
                valuePairEquals +
                    inDataMap.entrySet().stream().map(e -> e.getKey()+prefixSeparatorIterator.itemSeparator+e.getValue()).collect(Collectors.joining(prefixSeparatorIterator.itemSeparator));
        }
        // exploded
        return prefixSeparatorIterator.next() + inDataMap.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining(prefixSeparatorIterator.next()));
    }

    protected static String rfc6570Expansion(
        String variableName,
        @Nullable Object inData,
        boolean explode,
        boolean percentEncode,
        PrefixSeparatorIterator prefixSeparatorIterator
    ) throws NotImplementedException {
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
        throw new NotImplementedException("Unable to generate a rfc6570 representation of "+inData);
    }
}