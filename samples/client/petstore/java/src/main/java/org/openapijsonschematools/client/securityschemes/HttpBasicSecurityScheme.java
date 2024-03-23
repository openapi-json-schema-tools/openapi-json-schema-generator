package org.openapijsonschematools.client.securityschemes;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class HttpBasicSecurityScheme implements SecurityScheme {
    private final String userId;
    private final String password;
    /*
    scheme = BASIC, type = HTTP
    https://www.rfc-editor.org/rfc/rfc7617.html
     */

    public HttpBasicSecurityScheme(String userId, String password) {
        this.userId = userId;
        this.password = password;
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
        String userPass = userId + ":" + password;
        String b64UserPass = Base64.getEncoder().encodeToString(userPass.getBytes(StandardCharsets.UTF_8));
        List<String> headerValue = headers.getOrDefault("Authorization", new ArrayList<>());
        headerValue.add("Basic " + b64UserPass);
    }
}