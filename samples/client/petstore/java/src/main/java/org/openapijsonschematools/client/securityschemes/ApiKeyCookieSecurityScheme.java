package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApiKeyCookieSecurityScheme implements SecurityScheme {
    private final String apiKey;

    protected ApiKeyCookieSecurityScheme(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void applyAuth(Map<String, List<String>> headers, String resourcePath, String method, HttpRequest.BodyPublisher bodyPublisher, @Nullable String queryParamsSuffix, List<String> scopeNames) {
        List<String> cookieValue = headers.getOrDefault("Cookie", new ArrayList<>());
        cookieValue.add(apiKey);
    }
}