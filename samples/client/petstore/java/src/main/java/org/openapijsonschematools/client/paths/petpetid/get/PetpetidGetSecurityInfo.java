package org.openapijsonschematools.client.paths.petpetid.get;

import org.openapijsonschematools.client.paths.petpetid.get.security.PetpetidGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetpetidGetSecurityInfo {
    public static class PetpetidGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetpetidGetSecurityRequirementObject0 security0;

        public PetpetidGetSecurityInfo1() {
            security0 = new PetpetidGetSecurityRequirementObject0();
        }

        @Override
        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return security0;
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}