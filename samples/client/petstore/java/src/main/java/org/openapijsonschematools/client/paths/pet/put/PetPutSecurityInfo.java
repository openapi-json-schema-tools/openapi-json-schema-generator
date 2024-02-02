package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.pet.put.security.PetPutSecurityRequirementObject1;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class PetPutSecurityInfo implements SecurityRequirementObjectProvider<PetPutSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetPutSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public interface SetterForPetPutSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetPutSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petPutSecurityRequirementObject0(PetPutSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterPetPutSecurityRequirementObject0(instance);
        }
    }

    public interface SetterForPetPutSecurityRequirementObject1 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetPutSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petPutSecurityRequirementObject1(PetPutSecurityRequirementObject1 security1) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_1, security1);
            return getBuilderAfterPetPutSecurityRequirementObject1(instance);
        }
    }

    public static class Securities01Builder implements GenericBuilder<Securities>, SetterForPetPutSecurityRequirementObject1<Securities01Builder> {
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
        public Securities01Builder getBuilderAfterPetPutSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities10Builder implements GenericBuilder<Securities>, SetterForPetPutSecurityRequirementObject0<Securities10Builder> {
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
        public Securities10Builder getBuilderAfterPetPutSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class SecuritiesBuilder implements SetterForPetPutSecurityRequirementObject0<Securities01Builder>, SetterForPetPutSecurityRequirementObject1<Securities10Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities01Builder getBuilderAfterPetPutSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities01Builder(instance);
        }
        public Securities10Builder getBuilderAfterPetPutSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
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