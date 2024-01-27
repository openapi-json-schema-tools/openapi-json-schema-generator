package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.HttpBearerSecurityScheme;

public class BearerTest extends HttpBearerSecurityScheme {
    /*
    http bearer with JWT bearer format
    */
    public BearerTest(String accessToken) {
        super(accessToken, "JWT");
    }
}
