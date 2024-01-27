package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.ApiKeySecurityScheme;
import org.openapijsonschematools.client.securityschemes.ApiKeyInLocation;

public class ApiKey extends ApiKeySecurityScheme {
    /*
    apiKey in header
    */
    public ApiKey(String apiKey) {
        super(apiKey, "api_key", ApiKeyInLocation.HEADER);
    }
}
