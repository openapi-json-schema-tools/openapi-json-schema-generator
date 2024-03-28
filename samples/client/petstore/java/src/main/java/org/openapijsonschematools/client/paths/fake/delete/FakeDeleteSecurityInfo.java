package org.openapijsonschematools.client.paths.fake.delete;

import org.openapijsonschematools.client.paths.fake.delete.security.FakeDeleteSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class FakeDeleteSecurityInfo {
    public static class FakeDeleteSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final FakeDeleteSecurityRequirementObject0 security0;

        public FakeDeleteSecurityInfo1() {
            security0 = new FakeDeleteSecurityRequirementObject0();
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return security0;
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}