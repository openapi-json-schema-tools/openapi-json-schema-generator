package org.openapijsonschematools.client.paths.fakebodywithfileschema;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.RequestBody;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.Responses;

public class Put {
    public static class PutCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable RequestBody.SealedRequestBody requestBody;
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
