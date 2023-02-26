package org.openapijsonschematools.codegen.model;

import io.swagger.v3.oas.models.security.Scopes;

import java.util.Map;

public class CodegenOauthFlow {
    public final String authorizationUrl;
    public final String tokenUrl;
    public final String refreshUrl;
    public final Scopes scopes;
    public final Map<String, Object> vendorExtensions;

    public CodegenOauthFlow(String authorizationUrl, String tokenUrl, String refreshUrl, Scopes scopes, Map<String, Object> vendorExtensions) {
        this.authorizationUrl = authorizationUrl;
        this.tokenUrl = tokenUrl;
        this.refreshUrl = refreshUrl;
        this.scopes = scopes;
        this.vendorExtensions = vendorExtensions;
    }
}
