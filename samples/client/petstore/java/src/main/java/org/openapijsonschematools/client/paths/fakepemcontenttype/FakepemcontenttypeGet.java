package org.openapijsonschematools.client.paths.fakepemcontenttype;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakepemcontenttype.get.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakepemcontenttype.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakepemcontenttype;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakepemcontenttypeGet {
    private static class FakepemcontenttypeGetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            FakepemcontenttypeGetRequest request,
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
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakepemcontenttype.path;
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

    public interface FakepemcontenttypeGetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(FakepemcontenttypeGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakepemcontenttypeGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface PemContentTypeOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse pemContentType(FakepemcontenttypeGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakepemcontenttypeGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakepemcontenttypeGet1 extends ApiClient implements FakepemcontenttypeGetOperation {
        public FakepemcontenttypeGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakepemcontenttypeGetRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        FakepemcontenttypeGetRequest getInstance();
        T getBuilderAfterRequestBody(FakepemcontenttypeGetRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        FakepemcontenttypeGetRequest getInstance();
        T getBuilderAfterServerIndex(FakepemcontenttypeGetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakepemcontenttypeGetRequest getInstance();
        T getBuilderAfterTimeout(FakepemcontenttypeGetRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForRequestBody<GetRequestBuilder>, SetterForServerIndex<GetRequestBuilder>, SetterForTimeout<GetRequestBuilder> {
        private final FakepemcontenttypeGetRequest instance;

        public GetRequestBuilder() {
            this.instance = new FakepemcontenttypeGetRequest();
        }

        public FakepemcontenttypeGetRequest build() {
            return instance;
        }

        public FakepemcontenttypeGetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterRequestBody(FakepemcontenttypeGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(FakepemcontenttypeGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterTimeout(FakepemcontenttypeGetRequest instance) {
            return this;
        }
    }
}
