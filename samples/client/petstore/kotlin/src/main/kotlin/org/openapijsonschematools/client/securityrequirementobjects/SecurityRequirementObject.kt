package org.openapijsonschematools.client.securityrequirementobjects;

import org.openapijsonschematools.client.securityschemes.SecurityScheme;

import java.util.List;
import java.util.Map;

public class SecurityRequirementObject {
    public final Map<Class<? extends SecurityScheme>, List<String>> securitySchemeToScopes;

    public SecurityRequirementObject(Map<Class<? extends SecurityScheme>, List<String>> securitySchemeToScopes) {
        this.securitySchemeToScopes = securitySchemeToScopes;
    }
}
