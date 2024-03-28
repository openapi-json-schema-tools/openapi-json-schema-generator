package org.openapijsonschematools.client.paths.storeinventory.get;

import org.openapijsonschematools.client.paths.storeinventory.get.security.StoreinventoryGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class StoreinventoryGetSecurityInfo {
    public static class StoreinventoryGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final StoreinventoryGetSecurityRequirementObject0 security0;

        public StoreinventoryGetSecurityInfo1() {
            security0 = new StoreinventoryGetSecurityRequirementObject0();
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