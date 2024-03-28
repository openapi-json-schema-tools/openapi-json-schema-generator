package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetpetidPostSecurityInfo {
    public static class PetpetidPostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetpetidPostSecurityRequirementObject0 security0;
        public final PetpetidPostSecurityRequirementObject1 security1;

        public PetpetidPostSecurityInfo1() {
            security0 = new PetpetidPostSecurityRequirementObject0();
            security1 = new PetpetidPostSecurityRequirementObject1();
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