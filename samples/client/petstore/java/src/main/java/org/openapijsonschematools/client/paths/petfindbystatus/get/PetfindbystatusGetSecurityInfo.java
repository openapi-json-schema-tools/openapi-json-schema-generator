package org.openapijsonschematools.client.paths.petfindbystatus.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class PetfindbystatusGetSecurityInfo implements SecurityRequirementObjectProvider<PetfindbystatusGetSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetfindbystatusGetSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(
            PetfindbystatusGetSecurityRequirementObject0 security0,
            @Nullable PetfindbystatusGetSecurityRequirementObject1 security1,
            @Nullable PetfindbystatusGetSecurityRequirementObject2 security2
        ) {
            securities = new EnumMap<>(
                Stream.of(
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, security0),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, security1),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, security2)
                )
                .filter(entry -> entry != null && entry.getValue() != null)
                .collect(HashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll)
            );
        }        public Securities(
            @Nullable PetfindbystatusGetSecurityRequirementObject0 security0,
            PetfindbystatusGetSecurityRequirementObject1 security1,
            @Nullable PetfindbystatusGetSecurityRequirementObject2 security2
        ) {
            securities = new EnumMap<>(
                Stream.of(
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, security0),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, security1),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, security2)
                )
                .filter(entry -> entry != null && entry.getValue() != null)
                .collect(HashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll)
            );
        }        public Securities(
            @Nullable PetfindbystatusGetSecurityRequirementObject0 security0,
            @Nullable PetfindbystatusGetSecurityRequirementObject1 security1,
            PetfindbystatusGetSecurityRequirementObject2 security2
        ) {
            securities = new EnumMap<>(
                Stream.of(
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, security0),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, security1),
                    new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, security2)
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