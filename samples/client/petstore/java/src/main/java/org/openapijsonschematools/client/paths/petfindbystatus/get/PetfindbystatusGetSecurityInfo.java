package org.openapijsonschematools.client.paths.petfindbystatus.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.petfindbystatus.get.security.PetfindbystatusGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
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

    public static class Securities011Builder implements GenericBuilder<Securities>, SetterForPetfindbystatusGetSecurityRequirementObject1<Securities011Builder>, SetterForPetfindbystatusGetSecurityRequirementObject2<Securities011Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public Securities011Builder(Map<SecurityIndex, SecurityRequirementObject> instance) {
            this.instance = instance;
        }
        public Securities build() {
            return new Securities(instance);
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities011Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities011Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities101Builder implements GenericBuilder<Securities>, SetterForPetfindbystatusGetSecurityRequirementObject0<Securities101Builder>, SetterForPetfindbystatusGetSecurityRequirementObject2<Securities101Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public Securities101Builder(Map<SecurityIndex, SecurityRequirementObject> instance) {
            this.instance = instance;
        }
        public Securities build() {
            return new Securities(instance);
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities101Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities101Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities110Builder implements GenericBuilder<Securities>, SetterForPetfindbystatusGetSecurityRequirementObject0<Securities110Builder>, SetterForPetfindbystatusGetSecurityRequirementObject1<Securities110Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public Securities110Builder(Map<SecurityIndex, SecurityRequirementObject> instance) {
            this.instance = instance;
        }
        public Securities build() {
            return new Securities(instance);
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities110Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities110Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class SecuritiesBuilder implements SetterForPetfindbystatusGetSecurityRequirementObject0<Securities011Builder>, SetterForPetfindbystatusGetSecurityRequirementObject1<Securities101Builder>, SetterForPetfindbystatusGetSecurityRequirementObject2<Securities110Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities011Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities011Builder(instance);
        }
        public Securities101Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities101Builder(instance);
        }
        public Securities110Builder getBuilderAfterPetfindbystatusGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities110Builder(instance);
        }
    }

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        Securities(Map<SecurityIndex, SecurityRequirementObject> securityMap) {
            securities = new EnumMap<>(securityMap);
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