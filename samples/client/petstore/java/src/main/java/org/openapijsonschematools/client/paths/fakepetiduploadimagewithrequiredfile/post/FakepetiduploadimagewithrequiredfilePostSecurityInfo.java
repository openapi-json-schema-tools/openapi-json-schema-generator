package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.security.FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakepetiduploadimagewithrequiredfilePostSecurityInfo implements SecurityRequirementObjectProvider<FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public FakepetiduploadimagewithrequiredfilePostSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, @Nullable SecurityRequirementObject> securities;

        public Securities(
            @Nullable FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0 security0
        ) {
            securities = new EnumMap<>(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        SecurityIndex.SECURITY_0,
                        security0
                    )
                )
            );
        }

        public SecurityRequirementObject get(SecurityIndex securityIndex) {
            @Nullable SecurityRequirementObject securityRequirementObject = get(securityIndex);
            if (securityRequirementObject == null) {
                throw new UnsetPropertyException(securityIndex+" is unset");
            }
            return securityRequirementObject;
        }
    }

    public enum SecurityIndex {
        SECURITY_0
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}