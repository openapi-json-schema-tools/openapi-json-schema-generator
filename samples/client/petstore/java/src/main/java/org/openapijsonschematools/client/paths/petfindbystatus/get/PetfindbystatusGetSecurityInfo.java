package org.openapijsonschematools.client.paths.petfindbystatus.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class PetfindbystatusGetSecurityInfo implements SecurityRequirementObjectProvider<PetfindbystatusGetSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetfindbystatusGetSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public interface SetterForPetfindbystatusGetSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetfindbystatusGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petfindbystatusGetSecurityRequirementObject0(PetfindbystatusGetSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterPetfindbystatusGetSecurityRequirementObject0(instance);
        }
    }

    public interface SetterForPetfindbystatusGetSecurityRequirementObject1 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetfindbystatusGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petfindbystatusGetSecurityRequirementObject1(PetfindbystatusGetSecurityRequirementObject1 security1) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_1, security1);
            return getBuilderAfterPetfindbystatusGetSecurityRequirementObject1(instance);
        }
    }

    public interface SetterForPetfindbystatusGetSecurityRequirementObject2 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetfindbystatusGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petfindbystatusGetSecurityRequirementObject2(PetfindbystatusGetSecurityRequirementObject2 security2) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_2, security2);
            return getBuilderAfterPetfindbystatusGetSecurityRequirementObject2(instance);
        }
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(PetfindbystatusGetSecurityRequirementObject0 security0) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_0, security0));
        }
        public Securities(PetfindbystatusGetSecurityRequirementObject1 security1) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_1, security1));
        }
        public Securities(PetfindbystatusGetSecurityRequirementObject2 security2) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_2, security2));
        }
        public Securities(
            @Nullable PetfindbystatusGetSecurityRequirementObject0 security0,
            @Nullable PetfindbystatusGetSecurityRequirementObject1 security1,
            @Nullable PetfindbystatusGetSecurityRequirementObject2 security2
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