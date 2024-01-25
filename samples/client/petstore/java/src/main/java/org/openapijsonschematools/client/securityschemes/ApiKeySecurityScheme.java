package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApiKeySecurityScheme implements SecurityScheme {
    private final String apiKey;
    private final @Nullable String name;
    private final ApiKeyInLocation inLocation;

    private ApiKeySecurityScheme(String apiKey, @Nullable String name, ApiKeyInLocation inLocation) {
        this.apiKey = apiKey;
        this.name = name;
        this.inLocation = inLocation;
    }

    public static ApiKeySecurityScheme inCookie(String apiKey) {
        return new ApiKeySecurityScheme(apiKey, null, ApiKeyInLocation.COOKIE);
    }

    public static ApiKeySecurityScheme inHeader(String apiKey, String name) {
        return new ApiKeySecurityScheme(apiKey, name, ApiKeyInLocation.HEADER);
    }

    @Override
    public void applyAuth(Map<String, List<String>> headers, String resourcePath, String method, HttpRequest.BodyPublisher bodyPublisher, @Nullable String queryParamsSuffix, List<String> scopeNames) {
        switch (inLocation) {
            case COOKIE -> {
                List<String> cookieValue = headers.getOrDefault("Cookie", new ArrayList<>());
                cookieValue.add(apiKey);
            }
            case HEADER -> {
                List<String> headerValue = headers.getOrDefault(name, new ArrayList<>());
                headerValue.add(apiKey);
            }
            case QUERY -> throw new UnsupportedOperationException("If you need this, submit a PR adding this feature");
        }
    }
}