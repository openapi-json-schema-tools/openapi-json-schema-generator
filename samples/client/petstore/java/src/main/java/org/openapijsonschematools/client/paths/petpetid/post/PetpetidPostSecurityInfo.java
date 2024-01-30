package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidPostSecurityInfo implements SecurityRequirementObjectProvider<PetpetidPostSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetpetidPostSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(
            PetpetidPostSecurityRequirementObject0 security0,
            @Nullable PetpetidPostSecurityRequirementObject1 security1
        ) {
            securities = new EnumMap<>(
                Stream.of(
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, security0),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, security1)
                )
                .filter(entry -> entry != null && entry.getValue() != null)
                .collect(HashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll)
            );
        }        public Securities(
            @Nullable PetpetidPostSecurityRequirementObject0 security0,
            PetpetidPostSecurityRequirementObject1 security1
        ) {
            securities = new EnumMap<>(
                Stream.of(
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, security0),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, security1)
                )
                .filter(entry -> entry != null && entry.getValue() != null)
                .collect(HashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll)
            );
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