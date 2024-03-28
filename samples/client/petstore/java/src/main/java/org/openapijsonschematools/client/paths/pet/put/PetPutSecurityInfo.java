package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetPutSecurityInfo {
    public static class PetPutSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetPutSecurityRequirementObject0 security0;
        public final PetPutSecurityRequirementObject1 security1;

        public PetPutSecurityInfo1() {
            security0 = new PetPutSecurityRequirementObject0();
            security1 = new PetPutSecurityRequirementObject1();
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