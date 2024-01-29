package org.openapijsonschematools.client.paths.petfindbystatus.get.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PetfindbystatusGetSecurityRequirementObject0 extends SecurityRequirementObject {

    public PetfindbystatusGetSecurityRequirementObject0(
        ApiKey securityScheme0
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
}
