package org.openapijsonschematools.client.paths.fake.post;

import org.openapijsonschematools.client.paths.fake.post.security.FakePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class FakePostSecurityInfo {
    public static class FakePostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final FakePostSecurityRequirementObject0 security0;

        public FakePostSecurityInfo1() {
            security0 = new FakePostSecurityRequirementObject0();
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return security0;
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}