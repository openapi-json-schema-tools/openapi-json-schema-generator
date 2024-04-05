package org.openapijsonschematools.client.paths.fakemultiplesecurities.get;

import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject0;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject1;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.security.FakemultiplesecuritiesGetSecurityRequirementObject2;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObjectProvider;

public class FakemultiplesecuritiesGetSecurityInfo {
    public static class FakemultiplesecuritiesGetSecurityInfo1 implements SecurityRequirementObjectProvider<SecurityIndex> {
        public final FakemultiplesecuritiesGetSecurityRequirementObject0 security0;
        public final FakemultiplesecuritiesGetSecurityRequirementObject1 security1;
        public final FakemultiplesecuritiesGetSecurityRequirementObject2 security2;

        public FakemultiplesecuritiesGetSecurityInfo1() {
            security0 = new FakemultiplesecuritiesGetSecurityRequirementObject0();
            security1 = new FakemultiplesecuritiesGetSecurityRequirementObject1();
            security2 = new FakemultiplesecuritiesGetSecurityRequirementObject2();
        }

        @Override
        public SecurityRequirementObject getSecurityRequirementObject(SecurityIndex securityIndex) {
            switch (securityIndex) {
                case SECURITY_0:
                    return security0;
                case SECURITY_1:
                    return security1;
                default:
                    return security2;
            }
        }
    }

    public enum SecurityIndex {
        SECURITY_0,
        SECURITY_1,
        SECURITY_2
    }
}