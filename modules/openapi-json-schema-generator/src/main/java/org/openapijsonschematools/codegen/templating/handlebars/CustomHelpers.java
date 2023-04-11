package org.openapijsonschematools.codegen.templating.handlebars;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.TagType;
import org.openapijsonschematools.codegen.model.CodegenKey;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public enum CustomHelpers implements Helper<Object> {
    /**
     * Indicates the set or map contains the given key
     * For example:
     *
     * <pre>
     * {{#contains someMap "someKey"}}
     * {{/contains}}
     * </pre>
     *
     * <pre>
     * {{#contains someSet "someItem"}}
     * {{/contains}}
     * </pre>
     */
    contains {
        @Override public Object apply(final Object a, final Options options) throws IOException {
            Object b = options.param(0, null);
            boolean result = false;
            if (a instanceof Map<?, ?>) {
                Map<?, ?> mapA = (Map<?, ?>) a;
                result = mapA.containsKey(b);
            } else if (a instanceof Set<?>) {
                Set<?> setA = (Set<?>) a;
                result = setA.contains(b);
            }
            if (options.tagType == TagType.SECTION) {
                return result ? options.fn() : options.inverse();
            }
            return result
                    ? options.hash("yes", true)
                    : options.hash("no", false);
        }
    },

    /**
     * Makes an empty array of strings
     */
    newArray {
        @Override public Object apply(final Object a, final Options options) throws IOException {
            return Collections.unmodifiableList(new ArrayList<>());
        }
    },

    /**
     * Adds items on to an immutable List
     *
     * <pre>
     * {{join value " // " [prefix=""] [suffix=""]}}
     * </pre>
     *
     * <p>
     * If value is the list ['a', 'b', 'c'], the output will be the string "a // b // c".
     * </p>
     * Or:
     *
     * <pre>
     * {{join "a" "b" "c" " // " [prefix=""] [suffix=""]}}
     * Join the "a", "b", "c", the output will be the string "a // b // c".
     * </pre>
     */
    append {
        @Override
        public Object apply(final Object context, final Options options) {
            if (context instanceof List) {
                ArrayList<Object> newContext = new ArrayList<>((Collection<?>) context);
                Collections.addAll(newContext, options.params);
                return Collections.unmodifiableList(newContext);
            }
            return null;
        }
    },
}
