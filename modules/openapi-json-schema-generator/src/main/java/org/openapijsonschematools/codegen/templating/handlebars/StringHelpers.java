package org.openapijsonschematools.codegen.templating.handlebars;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.TagType;

import java.io.IOException;
import java.util.Locale;
import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;
import org.apache.commons.lang3.StringUtils;
import java.util.Iterator;

public enum StringHelpers implements Helper<Object> {
    /**
     * Custom version of this helper written to allow strings to be joined to empty string
     * Joins an array, iterator or an iterable with a string.
     * For example:
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
    join {
        @Override
        public Object apply(final Object context, final Options options) {
            if (!(context instanceof String)) {
                return "";
            }
            return safeApply(context, options);
        }

        protected CharSequence safeApply(final Object context, final Options options) {
            int separatorIdx = options.params.length - 1;
            Object separator = options.param(separatorIdx, null);
            notNull(separator, "found 'null', expected 'separator' at param[%s]", separatorIdx);
            isTrue(separator instanceof String,
                    "found '%s', expected 'separator' at param[%s]", separator, separatorIdx);
            String prefix = options.hash("prefix", "");
            String suffix = options.hash("suffix", "");
            if (context instanceof Iterable) {
                return prefix + StringUtils.join((Iterable<?>) context, (String) separator) + suffix;
            }
            if (context instanceof Iterator) {
                return prefix + StringUtils.join((Iterator<?>) context, (String) separator) + suffix;
            }
            if (context.getClass().isArray()) {
                return prefix + StringUtils.join((Object[]) context, (String) separator) + suffix;
            }
            // join everything as single values
            Object[] values = new Object[options.params.length];
            System.arraycopy(options.params, 0, values, 1, separatorIdx);
            values[0] = context;
            return prefix + StringUtils.join(values, (String) separator) + suffix;
        }
    },

    /**
     * Indicates the string starts with the defined value.
     * For example:
     *
     * <pre>
     * {{startsWith a b ["insensitive"]}}
     * </pre>
     *
     * <pre>
     * {{startsWith a text='b' [insensitive=true]}}
     * </pre>
     *
     * Render 'yes' or 'no':
     * <pre>
     *   {{#startsWith a b}}
     *     yes
     *   {{else}}
     *     no
     *   {{/startsWith}}
     * </pre>
     *
     * Render 'true' or 'false':
     * <pre>
     *   {{startsWith a b}}
     * </pre>
     *
     * Render 'y' or 'n':
     * <pre>
     *   {{startsWith a b yes='y' no='n'}}
     * </pre>
     *
     * If value is "handlebars.java", the output will be "Handlebars.java".
     */
    startsWith {
        @Override
        public Object apply(Object value, Options options) throws IOException {
            String match = options.param(0, options.hash("text", ""));
            if (match.length() < 1) {
                return false;
            }

            boolean caseInsensitive = options.hash("insensitive", false);
            boolean result = caseInsensitive ? value.toString().toLowerCase(Locale.ROOT).startsWith(match.toLowerCase(Locale.ROOT)) : value.toString().startsWith(match);

            if (options.tagType == TagType.SECTION) {
                return result ? options.fn() : options.inverse();
            }

            return result
                    ? options.hash("yes", true)
                    : options.hash("no", false);
        }
    }
}
