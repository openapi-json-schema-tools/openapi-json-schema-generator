package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidPostSecurityInfo implements SecurityRequirementObjectProvider<PetpetidPostSecurityInfo.SecurityIndex> {
    final private EnumMap<SecurityIndex, SecurityRequirementObject> securities;
    final private SecurityIndex securityIndex;

    public PetpetidPostSecurityInfo(SecurityIndex securityIndex) {
        this.securities = new EnumMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetpetidPostSecurityRequirementObject0()),
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetpetidPostSecurityRequirementObject1())
        ));
        this.securityIndex = securityIndex;
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}