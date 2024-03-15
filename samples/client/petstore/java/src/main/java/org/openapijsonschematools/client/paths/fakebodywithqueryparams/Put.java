package org.openapijsonschematools.client.paths.fakebodywithqueryparams;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.QueryParameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.RequestBody;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Parameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Responses;

public class Put {

    public static class PutRequest {
        public RequestBody.SealedRequestBody requestBody;
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PutRequest(
            RequestBody.SealedRequestBody requestBody,
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.requestBody = requestBody;
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
        }
    }

    public static class PutNullableRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
    }

    public interface SetterForServerIndex <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterServerIndex(PutNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterQueryParameters(PutNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterRequestBody(PutNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Put00RequestBuilder {
        private final PutNullableRequest instance;

        public Put00RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutRequest build() {
            // todo casting code here
        }
    }
    public static class Put01RequestBuilder {
        private final PutNullableRequest instance;

        public Put01RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }
    }
    public static class PutRequestBuilder {
        private final PutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new PutNullableRequest();
        }
    }
}
