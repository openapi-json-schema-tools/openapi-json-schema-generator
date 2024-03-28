package org.openapijsonschematools.client.paths.petfindbytags.get;

import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetfindbytagsGetSecurityInfo {
    public static class PetfindbytagsGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetfindbytagsGetSecurityRequirementObject0 security0;
        public final PetfindbytagsGetSecurityRequirementObject1 security1;

        public PetfindbytagsGetSecurityInfo1() {
            security0 = new PetfindbytagsGetSecurityRequirementObject0();
            security1 = new PetfindbytagsGetSecurityRequirementObject1();
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            switch (securityIndex) {
                case SECURITY_0:
                    return security0;
                default:
                    return security1;
            }
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1
    }
}