package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post;

import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.security.FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakepetiduploadimagewithrequiredfilePostSecurityInfo {
    public static class FakepetiduploadimagewithrequiredfilePostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public FakepetiduploadimagewithrequiredfilePostSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0())
            ));
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}