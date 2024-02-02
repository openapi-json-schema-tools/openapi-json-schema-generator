package org.openapijsonschematools.client.paths.petpetid.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.petpetid.get.security.PetpetidGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class PetpetidGetSecurityInfo implements SecurityRequirementObjectProvider<PetpetidGetSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public PetpetidGetSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public interface SetterForPetpetidGetSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterPetpetidGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T petpetidGetSecurityRequirementObject0(PetpetidGetSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterPetpetidGetSecurityRequirementObject0(instance);
        }
    }

    public static class Securities0Builder implements GenericBuilder<Securities> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public Securities0Builder(Map<SecurityIndex, SecurityRequirementObject> instance) {
            this.instance = instance;
        }
        public Securities build() {
            return new Securities(instance);
        }
    }

    public static class SecuritiesBuilder implements SetterForPetpetidGetSecurityRequirementObject0<Securities0Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities0Builder getBuilderAfterPetpetidGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities0Builder(instance);
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
        SECURITY_0
    }

    public SecurityRequirementObject getSecurityRequirementObject(@Nullable SecurityIndex securityIndex) {
        if (securityIndex == null) {
            return securities.get(this.securityIndex);
        }
        return securities.get(securityIndex);
    }
}