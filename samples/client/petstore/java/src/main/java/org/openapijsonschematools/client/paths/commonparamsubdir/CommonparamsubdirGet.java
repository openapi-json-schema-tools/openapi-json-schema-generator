package org.openapijsonschematools.client.paths.commonparamsubdir;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.PathParameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.Parameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetResponses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Commonparamsubdir;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class CommonparamsubdirGet {
    private static class GetProvider {
        private static final String method = "get";

        public static CommonparamsubdirGetResponses.EndpointResponse get(
            GetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, Commonparamsubdir.path);

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = null;
            if (request.queryParameters != null) {
                queryMap = querySerializer.getQueryMap(request.queryParameters);
            }
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + updatedPath;
            if (queryMap != null) {
                url = url + querySerializer.serialize(queryMap);
            }
            var httpRequest = RestClient.getRequest(
                url,
                method,
                bodyPublisher,
                headers,
                request.timeout
            );
            var response = RestClient.getResponse(httpRequest, client);
            var responsesDeserializer = new CommonparamsubdirGetResponses.CommonparamsubdirGetResponses1();
            return responsesDeserializer.deserialize(response, schemaConfiguration);
        }
    }

    public interface GetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default CommonparamsubdirGetResponses.EndpointResponse get(GetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return GetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface GetCommonParamOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default CommonparamsubdirGetResponses.EndpointResponse getCommonParam(GetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return GetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Get extends ApiClient implements GetOperation {
        public Get(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class GetRequest {
        public PathParameters.PathParametersMap pathParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public GetRequest(
            PathParameters.PathParametersMap pathParameters,
            QueryParameters.@Nullable QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class GetNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
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

    public interface SetterForTimeout <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterTimeout(GetNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
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

    public static class Get0RequestBuilder implements SetterForQueryParameters<Get0RequestBuilder>, SetterForServerIndex<Get0RequestBuilder>, SetterForTimeout<Get0RequestBuilder> {
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
                instance.serverIndex,
                instance.timeout
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

        public Get0RequestBuilder getBuilderAfterTimeout(GetNullableRequest instance) {
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
