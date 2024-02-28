package org.openapijsonschematools.client.header;

import java.util.Set;

public class PrefixSeparatorIterator {
    // A class to store prefixes and separators for rfc6570 expansions
    public final String prefix;
    public final String separator;
    private boolean first;
    public final String itemSeparator;
    private static final Set<String> reusedSeparators = Set.of(".", "|", "%20");

    public PrefixSeparatorIterator(String prefix, String separator) {
        this.prefix = prefix;
        this.separator = separator;
        itemSeparator = reusedSeparators.contains(separator) ? separator : ",";
        first = true;
    }

    public String next() {
        if (first) {
            first = false;
            return prefix;
        }
        return separator;
    }
}
