package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApiKeyCookieSecurityScheme implements SecurityScheme {
    private final String apiKey;
    private final String name;

    protected ApiKeyCookieSecurityScheme(String apiKey, String name) {
        this.apiKey = apiKey;
        this.name = name;
    }

    @Override
    public void applyAuth(
        Map<String, List<String>> headers,
        String resourcePath, String method,
        HttpRequest.BodyPublisher bodyPublisher,
        @Nullable Map<String, String> queryMap,
        List<String> scopeNames
    ) {
        List<String> cookieHeaderValues = headers.getOrDefault("Cookie", new ArrayList<>());
        String cookieValue = name + "=" + apiKey;
        if (cookieHeaderValues.isEmpty()) {
            cookieHeaderValues.add(cookieValue);
        } else {
            cookieHeaderValues.set(0, cookieHeaderValues.get(0)+ "; " + cookieValue);
        }
    }
}