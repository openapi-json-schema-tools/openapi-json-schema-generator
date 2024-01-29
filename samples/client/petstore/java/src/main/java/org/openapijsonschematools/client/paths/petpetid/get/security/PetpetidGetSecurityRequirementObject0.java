package org.openapijsonschematools.client.paths.petpetid.get.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PetpetidGetSecurityRequirementObject0 extends SecurityRequirementObject {

    public PetpetidGetSecurityRequirementObject0(
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
