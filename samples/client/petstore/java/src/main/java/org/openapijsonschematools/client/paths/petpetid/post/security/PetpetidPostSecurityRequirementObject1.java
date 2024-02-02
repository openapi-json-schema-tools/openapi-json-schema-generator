package org.openapijsonschematools.client.paths.petpetid.post.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PetpetidPostSecurityRequirementObject1 extends SecurityRequirementObject {

    public PetpetidPostSecurityRequirementObject1(
        PetstoreAuth securityScheme0
    ) {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<SecurityScheme, List<String>>(
                    securityScheme0,
                    List.of("write:pets", "read:pets")
                )
            )
        );
    }
}
