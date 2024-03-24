package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPostSecurityInfo implements SecurityRequirementObjectProvider<PetPostSecurityInfo.SecurityIndex> {
    final private EnumMap<SecurityIndex, SecurityRequirementObject> securities;
    final private SecurityIndex securityIndex;

    public PetPostSecurityInfo(SecurityIndex securityIndex) {
        this.securities = new EnumMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetPostSecurityRequirementObject0()),
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetPostSecurityRequirementObject1()),
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, new PetPostSecurityRequirementObject2())
        ));
        this.securityIndex = securityIndex;
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1,
        SECURITY_2
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}