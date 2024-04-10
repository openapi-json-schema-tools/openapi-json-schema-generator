package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.QueryParameters;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.Parameters;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Fakequeryparamwithjsoncontenttype;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakequeryparamwithjsoncontenttypeGet {
    private static class GetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            GetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = querySerializer.getQueryMap(request.queryParameters);
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakequeryparamwithjsoncontenttype.path;
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
            var responsesDeserializer = new Responses.Responses1();
            return responsesDeserializer.deserialize(response, schemaConfiguration);
        }
    }

    public interface GetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(GetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return GetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface QueryParamWithJsonContentTypeOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse queryParamWithJsonContentType(FakequeryparamwithjsoncontenttypeGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakequeryparamwithjsoncontenttypeGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Get extends ApiClient implements FakequeryparamwithjsoncontenttypeGetOperation {
        public Get(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class GetRequest {
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public GetRequest(
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class GetNullableRequest {
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakequeryparamwithjsoncontenttypeGetNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakequeryparamwithjsoncontenttypeGetNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakequeryparamwithjsoncontenttypeGetNullableRequest getInstance();
        T getBuilderAfterTimeout(FakequeryparamwithjsoncontenttypeGetNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        FakequeryparamwithjsoncontenttypeGetNullableRequest getInstance();
        T getBuilderAfterQueryParameters(FakequeryparamwithjsoncontenttypeGetNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Get0RequestBuilder implements SetterForServerIndex<Get0RequestBuilder>, SetterForTimeout<Get0RequestBuilder> {
        private final FakequeryparamwithjsoncontenttypeGetNullableRequest instance;

        public Get0RequestBuilder(FakequeryparamwithjsoncontenttypeGetNullableRequest instance) {
            this.instance = instance;
        }

        public FakequeryparamwithjsoncontenttypeGetRequest build() {
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakequeryparamwithjsoncontenttypeGetRequest(
                queryParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public FakequeryparamwithjsoncontenttypeGetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterServerIndex(FakequeryparamwithjsoncontenttypeGetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterTimeout(FakequeryparamwithjsoncontenttypeGetNullableRequest instance) {
            return this;
        }
    }
    public static class GetRequestBuilder implements SetterForQueryParameters<Get0RequestBuilder> {
        private final FakequeryparamwithjsoncontenttypeGetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new FakequeryparamwithjsoncontenttypeGetNullableRequest();
        }

        public FakequeryparamwithjsoncontenttypeGetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterQueryParameters(FakequeryparamwithjsoncontenttypeGetNullableRequest instance) {
            return new Get0RequestBuilder(instance);
        }
    }
}
