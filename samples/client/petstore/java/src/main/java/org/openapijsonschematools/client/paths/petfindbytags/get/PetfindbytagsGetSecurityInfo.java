package org.openapijsonschematools.client.paths.petfindbytags.get;

import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetfindbytagsGetSecurityInfo implements SecurityRequirementObjectProvider<PetfindbytagsGetSecurityInfo.SecurityIndex> {
    final private EnumMap<SecurityIndex, SecurityRequirementObject> securities;
    final private SecurityIndex securityIndex;

    public PetfindbytagsGetSecurityInfo(SecurityIndex securityIndex) {
        this.securities = new EnumMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetfindbytagsGetSecurityRequirementObject0()),
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetfindbytagsGetSecurityRequirementObject1())
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