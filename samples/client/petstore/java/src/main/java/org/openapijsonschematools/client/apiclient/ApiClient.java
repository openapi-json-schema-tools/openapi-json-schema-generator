package org.openapijsonschematools.client.apiclient;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

public class ApiClient {
    protected final ApiConfiguration apiConfiguration;
    protected final SchemaConfiguration schemaConfiguration;
    protected final HttpClient client;

    public ApiClient(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        this.apiConfiguration = apiConfiguration;
        this.schemaConfiguration = schemaConfiguration;
        this.client = HttpClient.newHttpClient();
    }

    protected void updateParamsForAuth(
        @Nullable SecurityRequirementObject securityRequirementObject,
        Map<String, List<String>> headers,
        String resourcePath,
        String method,
        HttpRequest.BodyPublisher bodyPublisher,
        Map<String, String> queryMap
    ) {
        if (securityRequirementObject == null) {
            return;
        }
        // TODO change securityRequirementObject to be a map of enum to scopes
        // TODO store the SecurityScheme instances in a map in apiConfiguration
        for (Map.Entry<SecurityScheme, List<String>> entry: securityRequirementObject.securitySchemeToScopes.entrySet()) {
            SecurityScheme securityScheme = entry.getKey();
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
