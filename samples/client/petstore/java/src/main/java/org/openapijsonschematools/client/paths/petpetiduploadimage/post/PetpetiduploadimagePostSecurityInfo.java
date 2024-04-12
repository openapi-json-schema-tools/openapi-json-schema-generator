package org.openapijsonschematools.client.paths.petpetiduploadimage.post;

import org.openapijsonschematools.client.paths.petpetiduploadimage.post.security.PetpetiduploadimagePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class PetpetiduploadimagePostSecurityInfo {
    public static class PetpetiduploadimagePostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final PetpetiduploadimagePostSecurityRequirementObject0 security0;

        public PetpetiduploadimagePostSecurityInfo1() {
            security0 = new PetpetiduploadimagePostSecurityRequirementObject0();
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