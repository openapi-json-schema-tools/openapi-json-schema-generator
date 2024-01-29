package org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security;

import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class FakemultiplesecuritiesGetSecurityRequirementObject2 extends SecurityRequirementObject {
    // todo make n specific constructors
    public FakemultiplesecuritiesGetSecurityRequirementObject2(Map<SecurityScheme, List<String>> securitySchemeToScopes) {
        super(securitySchemeToScopes);
    }
}
