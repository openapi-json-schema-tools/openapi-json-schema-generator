package org.openapijsonschematools.client.paths.storeinventory.get;

import org.openapijsonschematools.client.paths.storeinventory.get.security.StoreinventoryGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class StoreinventoryGetSecurityInfo {
    public static class StoreinventoryGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public StoreinventoryGetSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new StoreinventoryGetSecurityRequirementObject0())
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