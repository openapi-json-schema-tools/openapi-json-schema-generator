package org.openapijsonschematools.client.paths.faketestqueryparamters;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.QueryParameters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.Parameters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Put {

    public static class Put1 {
        private final ApiConfiguration apiConfiguration;

        public Put1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse put(PutRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            // todo serialize all parameter types
        }
    }

    public static class PutRequest {
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PutRequest(
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
        }
    }

    public static class PutNullableRequest {
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
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

    public static class Put0RequestBuilder implements SetterForServerIndex<Put0RequestBuilder> {
        private final PutNullableRequest instance;

        public Put0RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutRequest build() {
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PutRequest(
                queryParameters,
                instance.serverIndex
            );
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterServerIndex(PutNullableRequest instance) {
            return this;
        }
    }
    public static class PutRequestBuilder implements SetterForQueryParameters<Put0RequestBuilder> {
        private final PutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new PutNullableRequest();
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterQueryParameters(PutNullableRequest instance) {
            return new Put0RequestBuilder(instance);
        }
    }
}
