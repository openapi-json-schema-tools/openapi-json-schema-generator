package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.ApiKeySecurityScheme;
import org.openapijsonschematools.client.securityschemes.ApiKeyInLocation;

public class ApiKeyQuery extends ApiKeySecurityScheme {
    /*
    apiKey in query
    */
    public ApiKeyQuery(String apiKey) {
        super(apiKey, "api_key_query", ApiKeyInLocation.QUERY);
    }
}
