package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.put.PathParameters;
import org.openapijsonschematools.client.paths.userusername.put.RequestBody;
import org.openapijsonschematools.client.paths.userusername.put.Parameters;
import org.openapijsonschematools.client.paths.userusername.put.Responses;

public class Put {
    public static class PutCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
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
