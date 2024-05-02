package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

public interface SecurityScheme {
    void applyAuth(
        Map<String, List<String>> headers,
        String resourcePath,
        String method,
        HttpRequest.BodyPublisher bodyPublisher,
        @Nullable Map<String, String> queryMap,
        List<String> scopeNames
    );
}

