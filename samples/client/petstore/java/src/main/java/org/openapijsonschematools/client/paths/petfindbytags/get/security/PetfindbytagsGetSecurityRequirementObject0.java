package org.openapijsonschematools.client.paths.petfindbytags.get.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public final class PetfindbytagsGetSecurityRequirementObject0 extends SecurityRequirementObject implements PetfindbytagsGetSecurityRequirementProvider {

    public PetfindbytagsGetSecurityRequirementObject0(
        HttpSignatureTest securityScheme0
    ) {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<SecurityScheme, List<String>>(
                    securityScheme0,
                    List.of()
                )
            )
        );
    }

    @Override
    public Map<SecurityScheme, List<String>> getSecuritySchemeToScopes() {
        return securitySchemeToScopes;
    }
}
