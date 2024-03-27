package org.openapijsonschematools.client.paths.petfindbytags.get;

import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetfindbytagsGetSecurityInfo {
    public static class PetfindbytagsGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public PetfindbytagsGetSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetfindbytagsGetSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetfindbytagsGetSecurityRequirementObject1())
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