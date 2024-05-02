package org.openapijsonschematools.client.paths.petfindbystatus.get;

import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetfindbystatusGetSecurityInfo {
    public static class PetfindbystatusGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetfindbystatusGetSecurityRequirementObject0 security0;
        public final PetfindbystatusGetSecurityRequirementObject1 security1;
        public final PetfindbystatusGetSecurityRequirementObject2 security2;

        public PetfindbystatusGetSecurityInfo1() {
            security0 = new PetfindbystatusGetSecurityRequirementObject0();
            security1 = new PetfindbystatusGetSecurityRequirementObject1();
            security2 = new PetfindbystatusGetSecurityRequirementObject2();
        }

        @Override
        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            switch (securityIndex) {
                case SECURITY_0:
                    return security0;
                case SECURITY_1:
                    return security1;
                default:
                    return security2;
            }
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1,
        SECURITY_2
    }
}