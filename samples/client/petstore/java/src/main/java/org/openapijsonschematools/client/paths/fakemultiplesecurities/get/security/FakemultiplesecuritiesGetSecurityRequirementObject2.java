package org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class FakemultiplesecuritiesGetSecurityRequirementObject2 extends SecurityRequirementObject {

    public FakemultiplesecuritiesGetSecurityRequirementObject2() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<Class<? extends SecurityScheme>, List<String>>(
                    PetstoreAuth.class,
                    List.of("write:pets", "read:pets")
                )
            )
        );
    }
}
