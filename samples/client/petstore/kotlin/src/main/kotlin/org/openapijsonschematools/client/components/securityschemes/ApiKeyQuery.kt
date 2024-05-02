package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.ApiKeyQuerySecurityScheme;

public class ApiKeyQuery extends ApiKeyQuerySecurityScheme {
    /*
    apiKey in query
    */
    public ApiKeyQuery(String apiKey) {
        super(apiKey, "api_key_query");
    }
}
