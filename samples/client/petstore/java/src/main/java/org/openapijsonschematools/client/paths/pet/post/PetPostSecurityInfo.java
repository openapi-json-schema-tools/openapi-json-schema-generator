package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.pet.post.security.PetPostSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
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

    public interface SetterForPetPostSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petPostSecurityRequirementObject0(PetPostSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterPetPostSecurityRequirementObject0(instance);
        }
    }

    public interface SetterForPetPostSecurityRequirementObject1 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petPostSecurityRequirementObject1(PetPostSecurityRequirementObject1 security1) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_1, security1);
            return getBuilderAfterPetPostSecurityRequirementObject1(instance);
        }
    }

    public interface SetterForPetPostSecurityRequirementObject2 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetPostSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petPostSecurityRequirementObject2(PetPostSecurityRequirementObject2 security2) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_2, security2);
            return getBuilderAfterPetPostSecurityRequirementObject2(instance);
        }
    }

    public static class Securities011Builder implements GenericBuilder<Securities>, SetterForPetPostSecurityRequirementObject1<Securities011Builder>, SetterForPetPostSecurityRequirementObject2<Securities011Builder> {
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
        public Securities011Builder getBuilderAfterPetPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities011Builder getBuilderAfterPetPostSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities101Builder implements GenericBuilder<Securities>, SetterForPetPostSecurityRequirementObject0<Securities101Builder>, SetterForPetPostSecurityRequirementObject2<Securities101Builder> {
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
        public Securities101Builder getBuilderAfterPetPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities101Builder getBuilderAfterPetPostSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities110Builder implements GenericBuilder<Securities>, SetterForPetPostSecurityRequirementObject0<Securities110Builder>, SetterForPetPostSecurityRequirementObject1<Securities110Builder> {
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
        public Securities110Builder getBuilderAfterPetPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities110Builder getBuilderAfterPetPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class SecuritiesBuilder implements SetterForPetPostSecurityRequirementObject0<Securities011Builder>, SetterForPetPostSecurityRequirementObject1<Securities101Builder>, SetterForPetPostSecurityRequirementObject2<Securities110Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities011Builder getBuilderAfterPetPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities011Builder(instance);
        }
        public Securities101Builder getBuilderAfterPetPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities101Builder(instance);
        }
        public Securities110Builder getBuilderAfterPetPostSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
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