package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post;

import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.security.FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class FakepetiduploadimagewithrequiredfilePostSecurityInfo {
    public static class FakepetiduploadimagewithrequiredfilePostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0 security0;

        public FakepetiduploadimagewithrequiredfilePostSecurityInfo1() {
            security0 = new FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0();
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