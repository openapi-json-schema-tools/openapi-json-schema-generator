package org.openapijsonschematools.client.paths.pet.put.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class PetPutSecurityRequirementObject0 extends SecurityRequirementObject {
    // todo make n specific constructors
    public PetPutSecurityRequirementObject0(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
