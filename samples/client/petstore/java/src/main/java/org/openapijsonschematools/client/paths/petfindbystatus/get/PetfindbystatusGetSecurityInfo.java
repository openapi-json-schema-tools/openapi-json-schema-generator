package org.openapijsonschematools.client.paths.petfindbystatus.get;

import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetfindbystatusGetSecurityInfo {
    public static class PetfindbystatusGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public PetfindbystatusGetSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetfindbystatusGetSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetfindbystatusGetSecurityRequirementObject1()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, new PetfindbystatusGetSecurityRequirementObject2())
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