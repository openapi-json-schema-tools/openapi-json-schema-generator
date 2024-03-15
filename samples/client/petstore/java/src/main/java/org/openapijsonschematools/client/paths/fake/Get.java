package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fake.get.RequestBody;
import org.openapijsonschematools.client.paths.fake.get.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.get.Parameters;
import org.openapijsonschematools.client.paths.fake.get.Responses;

public class Get {

    public static class GetRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForRequestBody <T> {
        GetRequest getInstance();
        T getBuilderAfterRequestBody(GetRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForHeaderParameters <T> {
        GetRequest getInstance();
        T getBuilderAfterHeaderParameters(GetRequest instance);
        default T headerParameters(HeaderParameters.HeaderParametersMap headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        GetRequest getInstance();
        T getBuilderAfterQueryParameters(GetRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        GetRequest getInstance();
        T getBuilderAfterServerIndex(GetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForRequestBody<GetRequestBuilder>, SetterForHeaderParameters<GetRequestBuilder>, SetterForQueryParameters<GetRequestBuilder>, SetterForServerIndex<GetRequestBuilder> {
        private final GetRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetRequest();
        }

        public GetRequest build() {
            return instance;
        }

        public GetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterRequestBody(GetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterHeaderParameters(GetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterQueryParameters(GetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(GetRequest instance) {
            return this;
        }
    }
}
