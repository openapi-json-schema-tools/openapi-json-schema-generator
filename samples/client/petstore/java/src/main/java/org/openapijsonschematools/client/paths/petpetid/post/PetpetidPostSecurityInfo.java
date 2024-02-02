package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.petpetid.post.security.PetpetidPostSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidPostSecurityInfo implements SecurityRequirementObjectProvider<PetpetidPostSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetpetidPostSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public interface SetterForPetpetidPostSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetpetidPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petpetidPostSecurityRequirementObject0(PetpetidPostSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterPetpetidPostSecurityRequirementObject0(instance);
        }
    }

    public interface SetterForPetpetidPostSecurityRequirementObject1 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetpetidPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petpetidPostSecurityRequirementObject1(PetpetidPostSecurityRequirementObject1 security1) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_1, security1);
            return getBuilderAfterPetpetidPostSecurityRequirementObject1(instance);
        }
    }

    public static class Securities01Builder implements GenericBuilder<Securities>, SetterForPetpetidPostSecurityRequirementObject1<Securities01Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public Securities01Builder(Map<SecurityIndex, SecurityRequirementObject> instance) {
            this.instance = instance;
        }
        public Securities build() {
            return new Securities(instance);
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities01Builder getBuilderAfterPetpetidPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities10Builder implements GenericBuilder<Securities>, SetterForPetpetidPostSecurityRequirementObject0<Securities10Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public Securities10Builder(Map<SecurityIndex, SecurityRequirementObject> instance) {
            this.instance = instance;
        }
        public Securities build() {
            return new Securities(instance);
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities10Builder getBuilderAfterPetpetidPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class SecuritiesBuilder implements SetterForPetpetidPostSecurityRequirementObject0<Securities01Builder>, SetterForPetpetidPostSecurityRequirementObject1<Securities10Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities01Builder getBuilderAfterPetpetidPostSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities01Builder(instance);
        }
        public Securities10Builder getBuilderAfterPetpetidPostSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities10Builder(instance);
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
        SECURITY_1
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}