package org.openapijsonschematools.client.paths.fakebodywithqueryparams;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.RequestBody;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.QueryParameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Parameters;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakebodywithqueryparams;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakebodywithqueryparamsPut {
    private static class FakebodywithqueryparamsPutProvider {
        private static final String method = "put";

        public static Responses.EndpointResponse put(
            FakebodywithqueryparamsPutRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            SerializedRequestBody serializedRequestBody = new RequestBody.RequestBody1().serialize(
                request.requestBody
            );
            var contentTypeHeaderValues = headers.getOrDefault("Content-Type", new ArrayList<>());
            contentTypeHeaderValues.add(serializedRequestBody.contentType);
            HttpRequest.BodyPublisher bodyPublisher = serializedRequestBody.bodyPublisher;

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = querySerializer.getQueryMap(request.queryParameters);
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakebodywithqueryparams.path;
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

    public interface FakebodywithqueryparamsPutOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse put(FakebodywithqueryparamsPutRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakebodywithqueryparamsPutProvider.put(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface BodyWithQueryParamsOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse bodyWithQueryParams(FakebodywithqueryparamsPutRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakebodywithqueryparamsPutProvider.put(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakebodywithqueryparamsPut1 extends ApiClient implements FakebodywithqueryparamsPutOperation {
        public FakebodywithqueryparamsPut1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakebodywithqueryparamsPutRequest {
        public RequestBody.SealedRequestBody requestBody;
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public FakebodywithqueryparamsPutRequest(
            RequestBody.SealedRequestBody requestBody,
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class FakebodywithqueryparamsPutNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakebodywithqueryparamsPutNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakebodywithqueryparamsPutNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakebodywithqueryparamsPutNullableRequest getInstance();
        T getBuilderAfterTimeout(FakebodywithqueryparamsPutNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        FakebodywithqueryparamsPutNullableRequest getInstance();
        T getBuilderAfterRequestBody(FakebodywithqueryparamsPutNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        FakebodywithqueryparamsPutNullableRequest getInstance();
        T getBuilderAfterQueryParameters(FakebodywithqueryparamsPutNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Put00RequestBuilder implements SetterForServerIndex<Put00RequestBuilder>, SetterForTimeout<Put00RequestBuilder> {
        private final FakebodywithqueryparamsPutNullableRequest instance;

        public Put00RequestBuilder(FakebodywithqueryparamsPutNullableRequest instance) {
            this.instance = instance;
        }

        public FakebodywithqueryparamsPutRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakebodywithqueryparamsPutRequest(
                requestBody,
                queryParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public FakebodywithqueryparamsPutNullableRequest getInstance() {
            return instance;
        }

        public Put00RequestBuilder getBuilderAfterServerIndex(FakebodywithqueryparamsPutNullableRequest instance) {
            return this;
        }

        public Put00RequestBuilder getBuilderAfterTimeout(FakebodywithqueryparamsPutNullableRequest instance) {
            return this;
        }
    }
    public static class Put01RequestBuilder implements SetterForQueryParameters<Put00RequestBuilder> {
        private final FakebodywithqueryparamsPutNullableRequest instance;

        public Put01RequestBuilder(FakebodywithqueryparamsPutNullableRequest instance) {
            this.instance = instance;
        }

        public FakebodywithqueryparamsPutNullableRequest getInstance() {
            return instance;
        }

        public Put00RequestBuilder getBuilderAfterQueryParameters(FakebodywithqueryparamsPutNullableRequest instance) {
            return new Put00RequestBuilder(instance);
        }
    }
    public static class Put10RequestBuilder implements SetterForRequestBody<Put00RequestBuilder> {
        private final FakebodywithqueryparamsPutNullableRequest instance;

        public Put10RequestBuilder(FakebodywithqueryparamsPutNullableRequest instance) {
            this.instance = instance;
        }

        public FakebodywithqueryparamsPutNullableRequest getInstance() {
            return instance;
        }

        public Put00RequestBuilder getBuilderAfterRequestBody(FakebodywithqueryparamsPutNullableRequest instance) {
            return new Put00RequestBuilder(instance);
        }
    }
    public static class PutRequestBuilder implements SetterForRequestBody<Put01RequestBuilder>, SetterForQueryParameters<Put10RequestBuilder> {
        private final FakebodywithqueryparamsPutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new FakebodywithqueryparamsPutNullableRequest();
        }

        public FakebodywithqueryparamsPutNullableRequest getInstance() {
            return instance;
        }

        public Put01RequestBuilder getBuilderAfterRequestBody(FakebodywithqueryparamsPutNullableRequest instance) {
            return new Put01RequestBuilder(instance);
        }

        public Put10RequestBuilder getBuilderAfterQueryParameters(FakebodywithqueryparamsPutNullableRequest instance) {
            return new Put10RequestBuilder(instance);
        }
    }
}
