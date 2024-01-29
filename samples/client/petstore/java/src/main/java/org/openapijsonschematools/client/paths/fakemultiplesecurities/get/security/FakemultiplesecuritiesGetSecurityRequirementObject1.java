package org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.HttpBasicTest;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class FakemultiplesecuritiesGetSecurityRequirementObject1 extends SecurityRequirementObject {

    public FakemultiplesecuritiesGetSecurityRequirementObject1(
        HttpBasicTest securityScheme0,
        ApiKey securityScheme1
    ) {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<SecurityScheme, List<String>>(
                    securityScheme0,
                    List.of()
                ),
                new AbstractMap.SimpleEntry<SecurityScheme, List<String>>(
                    securityScheme1,
                    List.of()
                )
            )
        );
    }
}
