package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class HttpBearerSecurityScheme implements SecurityScheme {
    private final String accessToken;
    private final @Nullable String bearerFormat;
    /*
    scheme = BEARER, type = HTTP
    https://www.rfc-editor.org/rfc/rfc7617.html
     */

    protected HttpBearerSecurityScheme(String accessToken, @Nullable String bearerFormat) {
        this.accessToken = accessToken;
        this.bearerFormat = bearerFormat;
    }

    protected HttpBearerSecurityScheme(String accessToken) {
        this.accessToken = accessToken;
        this.bearerFormat = null;
    }

    @Override
    public void applyAuth(
        Map<String, List<String>> headers,
        String resourcePath,
        String method,
        HttpRequest.BodyPublisher bodyPublisher,
        @Nullable Map<String, String> queryMap,
        List<String> scopeNames
    ) {
        List<String> headerValue = headers.getOrDefault("Authorization", new ArrayList<>());
        headerValue.add("Bearer " + accessToken);
    }
}