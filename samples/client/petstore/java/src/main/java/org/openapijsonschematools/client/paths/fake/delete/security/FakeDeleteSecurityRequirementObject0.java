package org.openapijsonschematools.client.paths.fake.delete.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class FakeDeleteSecurityRequirementObject0 extends SecurityRequirementObject {
    // todo make n specific constructors
    public FakeDeleteSecurityRequirementObject0(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
