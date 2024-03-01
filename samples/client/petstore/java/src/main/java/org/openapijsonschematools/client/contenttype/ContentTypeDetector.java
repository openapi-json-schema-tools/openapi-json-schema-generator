package org.openapijsonschematools.client.contenttype;

import java.util.regex.Pattern;

public class ContentTypeDetector {
    private static final Pattern jsonContentTypePattern = Pattern.compile(
            "application/[^+]*[+]?(json);?.*"
    );
    private static final String textPlainContentType = "text/plain";

    public static boolean contentTypeIsJson(String contentType) {
        return jsonContentTypePattern.matcher(contentType).find();
    }

    public static boolean contentTypeIsTextPlain(String contentType) {
        return textPlainContentType.equals(contentType);
    }
}