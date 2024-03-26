package org.openapijsonschematools.client.paths.petpetid.get;

import org.openapijsonschematools.client.paths.petpetid.get.security.PetpetidGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidGetSecurityInfo {
    public static class PetpetidGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;
        final private SecurityIndex securityIndex;

        public PetpetidGetSecurityInfo1(SecurityIndex securityIndex) {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetpetidGetSecurityRequirementObject0())
            ));
            this.securityIndex = securityIndex;
        }

        public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
            if (securityIndex == null) {
                return securities.get(this.securityIndex);
            }
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}