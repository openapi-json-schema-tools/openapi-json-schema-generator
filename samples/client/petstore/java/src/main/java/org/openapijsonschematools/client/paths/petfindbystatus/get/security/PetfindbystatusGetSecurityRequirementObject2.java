package org.openapijsonschematools.client.paths.petfindbystatus.get.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;

import java.util.Map;

public class SecurityRequirementObject2 extends SecurityRequirementObject {
    // todo make n specific constructors
    public SecurityRequirementObject(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
