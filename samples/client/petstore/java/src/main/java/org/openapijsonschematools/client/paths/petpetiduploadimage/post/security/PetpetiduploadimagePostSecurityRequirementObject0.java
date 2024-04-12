package org.openapijsonschematools.client.paths.petpetiduploadimage.post.security;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PetpetiduploadimagePostSecurityRequirementObject0 extends SecurityRequirementObject {

    public PetpetiduploadimagePostSecurityRequirementObject0() {
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
