package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApiKeyQuerySecurityScheme implements SecurityScheme {
    private final String apiKey;
    private final String name;

    protected ApiKeyQuerySecurityScheme(String apiKey, String name) {
        this.apiKey = apiKey;
        this.name = name;
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
        if (queryMap == null) {
            throw new RuntimeException("Invalid null value for queryMap");
        }
        queryMap.put(name, apiKey);
    }
}