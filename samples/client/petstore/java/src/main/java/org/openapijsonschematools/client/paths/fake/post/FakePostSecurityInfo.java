package org.openapijsonschematools.client.paths.fake.post;

import org.openapijsonschematools.client.paths.fake.post.security.FakePostSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakePostSecurityInfo {
    public static class FakePostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public FakePostSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakePostSecurityRequirementObject0())
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