package org.openapijsonschematools.client.paths.fakeclassnametest.patch;

import org.openapijsonschematools.client.paths.fakeclassnametest.patch.security.FakeclassnametestPatchSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class FakeclassnametestPatchSecurityInfo {
    public static class FakeclassnametestPatchSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final FakeclassnametestPatchSecurityRequirementObject0 security0;

        public FakeclassnametestPatchSecurityInfo1() {
            security0 = new FakeclassnametestPatchSecurityRequirementObject0();
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