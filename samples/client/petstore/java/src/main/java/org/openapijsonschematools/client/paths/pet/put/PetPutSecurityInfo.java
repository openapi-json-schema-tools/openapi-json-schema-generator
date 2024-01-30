package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPutSecurityInfo implements SecurityRequirementObjectProvider<PetPutSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetPutSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(
            PetPutSecurityRequirementObject0 security0,
            @Nullable PetPutSecurityRequirementObject1 security1
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
            @Nullable PetPutSecurityRequirementObject0 security0,
            PetPutSecurityRequirementObject1 security1
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