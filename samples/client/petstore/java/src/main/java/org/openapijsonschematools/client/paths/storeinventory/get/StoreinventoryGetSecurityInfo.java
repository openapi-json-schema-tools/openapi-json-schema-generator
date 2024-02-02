package org.openapijsonschematools.client.paths.storeinventory.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.storeinventory.get.security.StoreinventoryGetSecurityRequirementObject0;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class StoreinventoryGetSecurityInfo implements SecurityRequirementObjectProvider<StoreinventoryGetSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public StoreinventoryGetSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public interface SetterForStoreinventoryGetSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterStoreinventoryGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T storeinventoryGetSecurityRequirementObject0(StoreinventoryGetSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterStoreinventoryGetSecurityRequirementObject0(instance);
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

    public static class SecuritiesBuilder implements SetterForStoreinventoryGetSecurityRequirementObject0<Securities0Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities0Builder getBuilderAfterStoreinventoryGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
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