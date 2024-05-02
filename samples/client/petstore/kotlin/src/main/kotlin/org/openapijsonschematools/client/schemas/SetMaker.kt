package org.openapijsonschematools.client.schemas;

import java.util.HashSet;
import java.util.Set;

/**
 * A builder for maps that allows in null values
 * Schema tests + doc code samples need it
 */
public class SetMaker {
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <E> Set<E> makeSet(E... items) {
        Set<E> set = new HashSet<>();
        for (E item : items) {
            set.add(item);
        }
        return set;
    }
}