package org.openapijsonschematools.client.paths.petfindbytags.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.petfindbytags.get.security.PetfindbytagsGetSecurityRequirementProvider;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.securityrequirementobjects.SecuritySchemeToScopeProvider;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;
import java.util.EnumMap;

public class PetfindbytagsGetSecurityInfo implements SecurityRequirementObjectProvider<PetfindbytagsGetSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetfindbytagsGetSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, PetfindbytagsGetSecurityRequirementProvider> securities;

        public Securities(
                Map<SecurityIndex, PetfindbytagsGetSecurityRequirementProvider> securitiesData
        ) {
            securities = new EnumMap<>(securitiesData);
        }

        public Securities(
            PetfindbytagsGetSecurityRequirementObject0 security0
        ) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_0, security0));
        }

        public Securities(
            PetfindbytagsGetSecurityRequirementObject1 security1
        ) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_1, security1));
        }

        public PetfindbytagsGetSecurityRequirementProvider get(SecurityIndex securityIndex) {
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

    public SecuritySchemeToScopeProvider getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}