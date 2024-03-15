package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.get.PathParameters;
import org.openapijsonschematools.client.paths.userusername.get.Parameters;
import org.openapijsonschematools.client.paths.userusername.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }

    public static class Get0RequestBuilder {
        private final GetCallData instance;

        public Get0RequestBuilderGetCallData instance) {
            this.instance = instance;
        }
    }
    public static class GetRequestBuilder {
        private final GetCallData instance;

        public GetRequestBuilder() {
            this.instance = new GetCallData();
        }
    }
}
