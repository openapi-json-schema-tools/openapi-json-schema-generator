package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petpetid.delete.security.PetpetidDeleteSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.delete.security.PetpetidDeleteSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;
import java.util.EnumMap;

public class PetpetidDeleteSecurityInfo implements SecurityRequirementObjectProvider<PetpetidDeleteSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetpetidDeleteSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(PetpetidDeleteSecurityRequirementObject0 security0) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_0, security0));
        }
        public Securities(PetpetidDeleteSecurityRequirementObject1 security1) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_1, security1));
        }
        public Securities(
            @Nullable PetpetidDeleteSecurityRequirementObject0 security0,
            @Nullable PetpetidDeleteSecurityRequirementObject1 security1
        ) {
            securities = new EnumMap<>(SecurityRequirementObject.class);
            if (security0 != null) {
                securities.put(SecurityIndex.SECURITY_0, security0);
            }
            if (security1 != null) {
                securities.put(SecurityIndex.SECURITY_1, security1);
            }
            if (securities.isEmpty()) {
                throw new RuntimeException("Invalid empty input for securities, set at least one of them;");
            }
        }

        public SecurityRequirementObject get(SecurityIndex securityIndex) {
            if (securities.containsKey(securityIndex)) {
                return get(securityIndex);
            }
            throw new UnsetPropertyException(securityIndex+" is unset");
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}