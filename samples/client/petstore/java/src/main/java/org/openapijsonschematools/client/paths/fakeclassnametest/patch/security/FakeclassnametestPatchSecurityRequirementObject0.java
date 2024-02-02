package org.openapijsonschematools.client.paths.fakeclassnametest.patch.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKeyQuery;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class FakeclassnametestPatchSecurityRequirementObject0 extends SecurityRequirementObject {

    public FakeclassnametestPatchSecurityRequirementObject0(
        ApiKeyQuery securityScheme0
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
