package org.openapijsonschematools.client.paths.petpetid.post.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class PetpetidPostSecurityRequirementObject1 extends SecurityRequirementObject {
    // todo make n specific constructors
    public PetpetidPostSecurityRequirementObject1(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
