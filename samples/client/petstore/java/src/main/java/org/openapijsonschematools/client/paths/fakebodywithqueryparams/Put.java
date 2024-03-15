package org.openapijsonschematools.client.paths.fakebodywithqueryparams;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.QueryParameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.RequestBody;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Parameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Responses;

public class Put {
    public static class PutCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable RequestBody.SealedRequestBody requestBody;
    }

    public static class Put00RequestBuilder {
        private final PutCallData instance;

        public Put00RequestBuilderPutCallData instance) {
            this.instance = instance;
        }
    }
    public static class Put01RequestBuilder {
        private final PutCallData instance;

        public Put01RequestBuilderPutCallData instance) {
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
