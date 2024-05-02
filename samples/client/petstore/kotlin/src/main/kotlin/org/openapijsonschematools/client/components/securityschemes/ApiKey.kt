package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.ApiKeyHeaderSecurityScheme;

public class ApiKey extends ApiKeyHeaderSecurityScheme {
    /*
    apiKey in header
    */
    public ApiKey(String apiKey) {
        super(apiKey, "api_key");
    }
}
