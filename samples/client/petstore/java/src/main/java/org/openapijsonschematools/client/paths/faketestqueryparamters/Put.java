package org.openapijsonschematools.client.paths.faketestqueryparamters;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.QueryParameters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.Parameters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.Responses;

public class Put {
    public static class PutCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
    }

    public static class Put0RequestBuilder {
        private final PutCallData instance;

        public Put0RequestBuilderPutCallData instance) {
            this.instance = instance;
        }
    }
    public static class PutRequestBuilder {
        private final PutCallData instance;

        public PutRequestBuilder() {
            this.instance = new PutCallData();
        }
    }
}
