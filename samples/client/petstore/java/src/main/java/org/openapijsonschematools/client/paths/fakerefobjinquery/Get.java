package org.openapijsonschematools.client.paths.fakerefobjinquery;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakerefobjinquery.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefobjinquery.get.Parameters;
import org.openapijsonschematools.client.paths.fakerefobjinquery.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
    }

    public static class GetRequestBuilder {
        private final GetCallData instance;

        public GetRequestBuilder() {
            this.instance = new GetCallData();
        }
    }
}
