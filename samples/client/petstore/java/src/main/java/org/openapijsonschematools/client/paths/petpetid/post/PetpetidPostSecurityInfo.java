package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidPostSecurityInfo {
    public static class PetpetidPostSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public PetpetidPostSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new PetpetidPostSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new PetpetidPostSecurityRequirementObject1())
            ));
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1
    }
}