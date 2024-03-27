package org.openapijsonschematools.client.paths.petpetid.get;

import org.openapijsonschematools.client.paths.petpetid.get.security.PetpetidGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidGetSecurityInfo {
    public static class PetpetidGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public PetpetidGetSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetpetidGetSecurityRequirementObject0())
            ));
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}