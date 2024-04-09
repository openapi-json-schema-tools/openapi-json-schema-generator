package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fake.get.RequestBody;
import org.openapijsonschematools.client.paths.fake.get.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.get.Parameters;
import org.openapijsonschematools.client.paths.fake.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fake;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakeGet {
    private static class FakeGetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            FakeGetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            @Nullable SerializedRequestBody serializedRequestBody;
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            if (request.requestBody != null) {
                serializedRequestBody = new RequestBody.RequestBody1().serialize(
                    request.requestBody
                );
                var contentTypeHeaderValues = headers.getOrDefault("Content-Type", new ArrayList<>());
                contentTypeHeaderValues.add(serializedRequestBody.contentType);
                bodyPublisher = serializedRequestBody.bodyPublisher;
            }

            if (request.headerParameters != null) {
                var headersSerializer = new Parameters.HeaderParametersSerializer();
                Map<String, List<String>> serializedHeaders = headersSerializer.serialize(request.headerParameters);
                headers.putAll(serializedHeaders);
            }

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = null;
            if (request.queryParameters != null) {
                queryMap = querySerializer.getQueryMap(request.queryParameters);
            }
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fake.path;
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

    public interface FakeGetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(FakeGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface EnumParametersOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse enumParameters(FakeGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakeGet1 extends ApiClient implements FakeGetOperation {
        public FakeGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakeGetRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        FakeGetRequest getInstance();
        T getBuilderAfterRequestBody(FakeGetRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForHeaderParameters <T> {
        FakeGetRequest getInstance();
        T getBuilderAfterHeaderParameters(FakeGetRequest instance);
        default T headerParameters(HeaderParameters.HeaderParametersMap headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        FakeGetRequest getInstance();
        T getBuilderAfterQueryParameters(FakeGetRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        FakeGetRequest getInstance();
        T getBuilderAfterServerIndex(FakeGetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakeGetRequest getInstance();
        T getBuilderAfterTimeout(FakeGetRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForRequestBody<GetRequestBuilder>, SetterForHeaderParameters<GetRequestBuilder>, SetterForQueryParameters<GetRequestBuilder>, SetterForServerIndex<GetRequestBuilder>, SetterForTimeout<GetRequestBuilder> {
        private final FakeGetRequest instance;

        public GetRequestBuilder() {
            this.instance = new FakeGetRequest();
        }

        public FakeGetRequest build() {
            return instance;
        }

        public FakeGetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterRequestBody(FakeGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterHeaderParameters(FakeGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterQueryParameters(FakeGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(FakeGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterTimeout(FakeGetRequest instance) {
            return this;
        }
    }
}
