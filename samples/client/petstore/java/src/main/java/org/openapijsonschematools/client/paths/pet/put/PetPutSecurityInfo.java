package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPutSecurityInfo {
    public static class PetPutSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public PetPutSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetPutSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetPutSecurityRequirementObject1())
            ));
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1
    }
}