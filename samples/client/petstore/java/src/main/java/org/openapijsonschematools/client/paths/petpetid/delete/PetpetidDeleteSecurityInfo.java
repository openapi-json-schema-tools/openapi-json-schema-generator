package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.paths.petpetid.delete.security.PetpetidDeleteSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.delete.security.PetpetidDeleteSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetpetidDeleteSecurityInfo {
    public static class PetpetidDeleteSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetpetidDeleteSecurityRequirementObject0 security0;
        public final PetpetidDeleteSecurityRequirementObject1 security1;

        public PetpetidDeleteSecurityInfo1() {
            security0 = new PetpetidDeleteSecurityRequirementObject0();
            security1 = new PetpetidDeleteSecurityRequirementObject1();
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