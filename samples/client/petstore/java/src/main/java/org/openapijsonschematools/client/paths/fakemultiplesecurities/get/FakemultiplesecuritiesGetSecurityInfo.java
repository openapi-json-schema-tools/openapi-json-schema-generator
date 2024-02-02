package org.openapijsonschematools.client.paths.fakemultiplesecurities.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.openapijsonschematools.client.schemas.GenericBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

public class FakemultiplesecuritiesGetSecurityInfo implements SecurityRequirementObjectProvider<FakemultiplesecuritiesGetSecurityInfo.SecurityIndex> {
    final private Securities securities;
    final private SecurityIndex securityIndex;

    public FakemultiplesecuritiesGetSecurityInfo(Securities securities, SecurityIndex securityIndex) {
        this.securities = securities;
        this.securityIndex = securityIndex;
    }

    public interface SetterForFakemultiplesecuritiesGetSecurityRequirementObject0 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T fakemultiplesecuritiesGetSecurityRequirementObject0(FakemultiplesecuritiesGetSecurityRequirementObject0 security0) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_0, security0);
            return getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject0(instance);
        }
    }

    public interface SetterForFakemultiplesecuritiesGetSecurityRequirementObject1 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T fakemultiplesecuritiesGetSecurityRequirementObject1(FakemultiplesecuritiesGetSecurityRequirementObject1 security1) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_1, security1);
            return getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject1(instance);
        }
    }

    public interface SetterForFakemultiplesecuritiesGetSecurityRequirementObject2 <T> {
        Map<SecurityIndex, SecurityRequirementObject> getInstance();
        T getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance);
        default T fakemultiplesecuritiesGetSecurityRequirementObject2(FakemultiplesecuritiesGetSecurityRequirementObject2 security2) {
            var instance = getInstance();
            instance.put(SecurityIndex.SECURITY_2, security2);
            return getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject2(instance);
        }
    }

    public static class Securities011Builder implements GenericBuilder<Securities>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject1<Securities011Builder>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject2<Securities011Builder> {
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
        public Securities011Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities011Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities101Builder implements GenericBuilder<Securities>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject0<Securities101Builder>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject2<Securities101Builder> {
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
        public Securities101Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities101Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class Securities110Builder implements GenericBuilder<Securities>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject0<Securities110Builder>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject1<Securities110Builder> {
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
        public Securities110Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
        public Securities110Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return this;
        }
    }

    public static class SecuritiesBuilder implements SetterForFakemultiplesecuritiesGetSecurityRequirementObject0<Securities011Builder>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject1<Securities101Builder>, SetterForFakemultiplesecuritiesGetSecurityRequirementObject2<Securities110Builder> {
        private final Map<SecurityIndex, SecurityRequirementObject> instance;
        public SecuritiesBuilder() {
            this.instance = new HashMap<>();
        }
        public Map<SecurityIndex, SecurityRequirementObject> getInstance() {
            return instance;
        }
        public Securities011Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject0(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities011Builder(instance);
        }
        public Securities101Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject1(Map<SecurityIndex, SecurityRequirementObject> instance) {
            return new Securities101Builder(instance);
        }
        public Securities110Builder getBuilderAfterFakemultiplesecuritiesGetSecurityRequirementObject2(Map<SecurityIndex, SecurityRequirementObject> instance) {
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