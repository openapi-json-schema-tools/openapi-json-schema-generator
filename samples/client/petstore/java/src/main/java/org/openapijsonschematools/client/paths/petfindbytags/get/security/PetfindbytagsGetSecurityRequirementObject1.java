package org.openapijsonschematools.client.paths.petfindbytags.get.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class PetfindbytagsGetSecurityRequirementObject1 extends SecurityRequirementObject {
    // todo make n specific constructors
    public PetfindbytagsGetSecurityRequirementObject1(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
