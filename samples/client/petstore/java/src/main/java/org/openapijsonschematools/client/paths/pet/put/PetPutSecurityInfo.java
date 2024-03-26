package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPutSecurityInfo {
    public static class PetPutSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;
        final private SecurityIndex securityIndex;

        public PetPutSecurityInfo1(SecurityIndex securityIndex) {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetPutSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetPutSecurityRequirementObject1())
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
        SECURITY_0,
        SECURITY_1
    }
}