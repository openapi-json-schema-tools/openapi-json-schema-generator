package org.openapijsonschematools.client.paths.fakemultiplesecurities.get;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
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

    public static class Securities {
        private final EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public Securities(FakemultiplesecuritiesGetSecurityRequirementObject0 security0) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_0, security0));
        }
        public Securities(FakemultiplesecuritiesGetSecurityRequirementObject1 security1) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_1, security1));
        }
        public Securities(FakemultiplesecuritiesGetSecurityRequirementObject2 security2) {
            securities = new EnumMap<>(Map.of(SecurityIndex.SECURITY_2, security2));
        }
        public Securities(
            @Nullable FakemultiplesecuritiesGetSecurityRequirementObject0 security0,
            @Nullable FakemultiplesecuritiesGetSecurityRequirementObject1 security1,
            @Nullable FakemultiplesecuritiesGetSecurityRequirementObject2 security2
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