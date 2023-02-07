package org.openapijsonschematools.codegen.templating.handlebars;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.TagType;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public enum ContainsHelper implements Helper<Object> {

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
            boolean result;
            if (Map.class.isInstance(a)) {
                Map mapA = (Map) a;
                result = mapA.containsKey(b);
            } else if (Set.class.isInstance(a)) {
                Set setA = (Set) a;
                result = setA.contains(b);
            } else {
                result = false;
            }
            if (options.tagType == TagType.SECTION) {
                return result ? options.fn() : options.inverse();
            }
            return result
                    ? options.hash("yes", true)
                    : options.hash("no", false);
        }
    }
}
