package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.Map;

public class CodegenOauthFlows {
    public final CodegenOauthFlow implicit;
    public final CodegenOauthFlow password;
    public final CodegenOauthFlow clientCredentials;
    public final CodegenOauthFlow authorizationCode;
    public final Map<String, Object> vendorExtensions;

    public CodegenOauthFlows(CodegenOauthFlow implicit, CodegenOauthFlow password, CodegenOauthFlow clientCredentials, CodegenOauthFlow authorizationCode, Map<String, Object> vendorExtensions) {
        this.implicit = implicit;
        this.password = password;
        this.clientCredentials = clientCredentials;
        this.authorizationCode = authorizationCode;
        this.vendorExtensions = vendorExtensions;
    }
}
