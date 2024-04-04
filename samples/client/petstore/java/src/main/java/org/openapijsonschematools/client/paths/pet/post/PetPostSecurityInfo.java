package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPostSecurityInfo {
    public static class PetPostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public PetPostSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetPostSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetPostSecurityRequirementObject1()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, new PetPostSecurityRequirementObject2())
            ));
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1,
        SECURITY_2
    }
}