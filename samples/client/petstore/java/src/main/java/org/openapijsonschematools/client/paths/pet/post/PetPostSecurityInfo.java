package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetPostSecurityInfo {
    public static class PetPostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetPostSecurityRequirementObject0 security0;
        public final PetPostSecurityRequirementObject1 security1;
        public final PetPostSecurityRequirementObject2 security2;

        public PetPostSecurityInfo1() {
            security0 = new PetPostSecurityRequirementObject0();
            security1 = new PetPostSecurityRequirementObject1();
            security2 = new PetPostSecurityRequirementObject2();
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