package org.openapijsonschematools.client.paths.fake.delete.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.BearerTest;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class FakeDeleteSecurityRequirementObject0 extends SecurityRequirementObject {

    public FakeDeleteSecurityRequirementObject0(
        BearerTest securityScheme0
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
