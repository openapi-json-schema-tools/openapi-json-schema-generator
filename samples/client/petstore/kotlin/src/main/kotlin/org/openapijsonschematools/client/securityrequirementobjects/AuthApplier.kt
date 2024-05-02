package org.openapijsonschematools.client.securityrequirementobjects;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.configurations.ApiConfiguration;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

public class AuthApplier {
    protected static void updateParamsForAuth(
        @Nullable SecurityRequirementObject securityRequirementObject,
        Map<String, List<String>> headers,
        String resourcePath,
        String method,
        HttpRequest.BodyPublisher bodyPublisher,
        @Nullable Map<String, String> queryMap,
        ApiConfiguration apiConfiguration
    ) {
        if (securityRequirementObject == null) {
            return;
        }
        // TODO change securityRequirementObject to be a map of enum to scopes
        // TODO store the SecurityScheme instances in a map in apiConfiguration
        for (Map.Entry<Class<? extends SecurityScheme>, List<String>> entry: securityRequirementObject.securitySchemeToScopes.entrySet()) {
            Class<? extends SecurityScheme> securitySchemeClass = entry.getKey();
            SecurityScheme securityScheme = apiConfiguration.getSecurityScheme(securitySchemeClass);
            List<String> scopeNames = entry.getValue();
            securityScheme.applyAuth(
                headers,
                resourcePath,
                method,
                bodyPublisher,
                queryMap,
                scopeNames
            );
        }
    }
}
