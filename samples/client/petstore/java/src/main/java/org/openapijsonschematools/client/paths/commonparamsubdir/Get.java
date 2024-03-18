package org.openapijsonschematools.client.paths.commonparamsubdir;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.PathParameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.Parameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.paths.CommonParamsubDir;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Get {

    public static class Get1 extends CommonParamsubDir {
        private final ApiConfiguration apiConfiguration;

        public Get1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse get(GetRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, path);

            var querySerializer = new Parameters.QueryParametersSerializer();
            Map<String, String> queryMap = new HashMap<>();
            if (request.queryParameters != null) {
                queryMap = querySerializer.getQueryMap(request.queryParameters);
            }
            String host = apiConfiguration.getServer(request.serverIndex).url();
        }
    }

    public static class GetRequest {
        public PathParameters.PathParametersMap pathParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public GetRequest(
            PathParameters.PathParametersMap pathParameters,
            QueryParameters.@Nullable QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.pathParameters = pathParameters;
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
        }
    }

    public static class GetNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForQueryParameters <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterQueryParameters(GetNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterServerIndex(GetNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterPathParameters(GetNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Get0RequestBuilder implements SetterForQueryParameters<Get0RequestBuilder>, SetterForServerIndex<Get0RequestBuilder> {
        private final GetNullableRequest instance;

        public Get0RequestBuilder(GetNullableRequest instance) {
            this.instance = instance;
        }

        public GetRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new GetRequest(
                pathParameters,
                instance.queryParameters,
                instance.serverIndex
            );
        }

        public GetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterQueryParameters(GetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterServerIndex(GetNullableRequest instance) {
            return this;
        }
    }
    public static class GetRequestBuilder implements SetterForPathParameters<Get0RequestBuilder> {
        private final GetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetNullableRequest();
        }

        public GetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterPathParameters(GetNullableRequest instance) {
            return new Get0RequestBuilder(instance);
        }
    }
}
