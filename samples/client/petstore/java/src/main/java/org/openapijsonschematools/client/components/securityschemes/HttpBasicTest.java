package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.HttpBasicSecurityScheme;

public class HttpBasicTest extends HttpBasicSecurityScheme {
    /*
    http basic
    */
    public HttpBasicTest(String userId, String password) {
        super(userId, password);
    }
}
