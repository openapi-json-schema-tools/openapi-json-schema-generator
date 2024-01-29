package org.openapijsonschematools.client.paths.pet.post.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class PetPostSecurityRequirementObject2 extends SecurityRequirementObject {
    // todo make n specific constructors
    public PetPostSecurityRequirementObject2(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
