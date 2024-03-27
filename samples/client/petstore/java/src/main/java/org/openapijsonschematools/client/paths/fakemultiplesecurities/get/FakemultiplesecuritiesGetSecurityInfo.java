package org.openapijsonschematools.client.paths.fakemultiplesecurities.get;

import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakemultiplesecuritiesGetSecurityInfo {
    public static class FakemultiplesecuritiesGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        final public EnumMap<SecurityIndex, SecurityRequirementObject> securities;

        public FakemultiplesecuritiesGetSecurityInfo1() {
            this.securities = new EnumMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakemultiplesecuritiesGetSecurityRequirementObject0()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new FakemultiplesecuritiesGetSecurityRequirementObject1()),
                new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, new FakemultiplesecuritiesGetSecurityRequirementObject2())
            ));
        }

        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            return securities.get(securityIndex);
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1,
        SECURITY_2
    }
}