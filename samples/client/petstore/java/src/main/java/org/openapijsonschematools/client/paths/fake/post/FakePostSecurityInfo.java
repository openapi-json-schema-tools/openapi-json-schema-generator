package org.openapijsonschematools.client.paths.fake.post;

import org.openapijsonschematools.client.paths.fake.post.security.FakePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakePostSecurityInfo implements SecurityRequirementObjectProvider<FakePostSecurityInfo.SecurityIndex> {
    final private EnumMap<SecurityIndex, SecurityRequirementObject> securities;
    final private SecurityIndex securityIndex;

    public FakePostSecurityInfo(SecurityIndex securityIndex) {
        this.securities = new EnumMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakePostSecurityRequirementObject0())
        ));
        this.securityIndex = securityIndex;
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