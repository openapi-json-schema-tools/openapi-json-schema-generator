package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post;

import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.security.FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakepetiduploadimagewithrequiredfilePostSecurityInfo {
    public static class FakepetiduploadimagewithrequiredfilePostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;
        final private SecurityIndex securityIndex;

        public FakepetiduploadimagewithrequiredfilePostSecurityInfo1(SecurityIndex securityIndex) {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0())
            ));
            this.securityIndex = securityIndex;
        }

        public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
            if (securityIndex == null) {
                return securities.get(this.securityIndex);
            }
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }
}