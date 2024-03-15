package org.openapijsonschematools.client.paths.fakemultiplesecurities;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.FakemultiplesecuritiesGetSecurityInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable FakemultiplesecuritiesGetSecurityInfo.SecurityIndex securityIndex;
    }

    public static class GetRequestBuilder {
        private final GetCallData instance;

        public GetRequestBuilder() {
            this.instance = new GetCallData();
        }
    }
}
