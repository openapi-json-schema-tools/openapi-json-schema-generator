package org.openapijsonschematools.client.paths.fakemultiplesecurities.get;

import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.Map;
import java.util.EnumMap;

public class FakemultiplesecuritiesGetSecurityInfo implements SecurityRequirementObjectProvider<FakemultiplesecuritiesGetSecurityInfo.SecurityIndex> {
    final private EnumMap<SecurityIndex, SecurityRequirementObject> securities;
    final private SecurityIndex securityIndex;

    public FakemultiplesecuritiesGetSecurityInfo(SecurityIndex securityIndex) {
        this.securities = new EnumMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_0, new FakemultiplesecuritiesGetSecurityRequirementObject0()),
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_1, new FakemultiplesecuritiesGetSecurityRequirementObject1()),
            new AbstractMap.SimpleEntry<>(SecurityIndex.SECURITY_2, new FakemultiplesecuritiesGetSecurityRequirementObject2())
        ));
        this.securityIndex = securityIndex;
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