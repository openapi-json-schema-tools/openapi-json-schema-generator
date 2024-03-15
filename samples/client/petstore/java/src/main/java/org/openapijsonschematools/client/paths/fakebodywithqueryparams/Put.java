package org.openapijsonschematools.client.paths.fakebodywithqueryparams;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.QueryParameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.RequestBody;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Parameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Responses;

public class Put {
    public static class PutCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
    }

    public interface SetterForServerIndex <T> {
        PutCallData getInstance();
        T getBuilderAfterServerIndex(PutCallData instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        PutCallData getInstance();
        T getBuilderAfterQueryParameters(PutCallData instance);
        default T queryParameters(QueryParameters.QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PutCallData getInstance();
        T getBuilderAfterRequestBody(PutCallData instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
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
