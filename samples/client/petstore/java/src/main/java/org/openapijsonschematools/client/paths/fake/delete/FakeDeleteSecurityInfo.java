package org.openapijsonschematools.client.paths.fake.delete;

import org.openapijsonschematools.client.paths.fake.delete.security.FakeDeleteSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakeDeleteSecurityInfo {
    public static class FakeDeleteSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public FakeDeleteSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakeDeleteSecurityRequirementObject0())
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