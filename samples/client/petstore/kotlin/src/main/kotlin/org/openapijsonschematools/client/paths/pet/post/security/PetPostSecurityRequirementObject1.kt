package org.openapijsonschematools.client.paths.pet.post.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PetPostSecurityRequirementObject1 extends SecurityRequirementObject {

    public PetPostSecurityRequirementObject1() {
        super(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<Class<? extends SecurityScheme>, List<String>>(
                    HttpSignatureTest.class,
                    List.of()
                )
            )
        );
    }
}
