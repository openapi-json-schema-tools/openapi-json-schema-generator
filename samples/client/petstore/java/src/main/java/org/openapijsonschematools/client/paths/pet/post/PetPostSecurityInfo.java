package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPostSecurityInfo implements SecurityRequirementObjectProvider<PetPostSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetPostSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(PetPostSecurityRequirementObject0 security0) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_0, security0));
        }
        public Securities(PetPostSecurityRequirementObject1 security1) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_1, security1));
        }
        public Securities(PetPostSecurityRequirementObject2 security2) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_2, security2));
        }
        public Securities(
            @Nullable PetPostSecurityRequirementObject0 security0,
            @Nullable PetPostSecurityRequirementObject1 security1,
            @Nullable PetPostSecurityRequirementObject2 security2
        ) {
            var secMap = new HashMap<SecurityIndex, SecurityRequirementObject>();
            if (security0 != null) {
                secMap.put(SecurityIndex.SECURITY_0, security0);
            }
            if (security1 != null) {
                secMap.put(SecurityIndex.SECURITY_1, security1);
            }
            if (security2 != null) {
                secMap.put(SecurityIndex.SECURITY_2, security2);
            }
            if (secMap.isEmpty()) {
                throw new RuntimeException("Invalid empty input for securities, set at least one of them;");
            }
            securities = new EnumMap<>(secMap);
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
        SECURITY_1,
        SECURITY_2
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}