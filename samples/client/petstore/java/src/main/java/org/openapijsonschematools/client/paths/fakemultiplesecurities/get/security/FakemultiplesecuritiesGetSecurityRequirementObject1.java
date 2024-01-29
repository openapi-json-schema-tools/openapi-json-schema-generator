package org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;

import java.util.Map;

public class SecurityRequirementObject1 extends SecurityRequirementObject {
    // todo make n specific constructors
    public SecurityRequirementObject(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
