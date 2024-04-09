package org.openapijsonschematools.client.paths.fakerefsenum;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakerefsenum.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefsenum.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakerefsenum;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakerefsenumPost {
    private static class FakerefsenumPostProvider {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            FakerefsenumPostRequest request,
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

            String url = host + Fakerefsenum.path;
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

    public interface FakerefsenumPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(FakerefsenumPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakerefsenumPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface StringEnumOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse stringEnum(FakerefsenumPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakerefsenumPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakerefsenumPost1 extends ApiClient implements FakerefsenumPostOperation {
        public FakerefsenumPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakerefsenumPostRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        FakerefsenumPostRequest getInstance();
        T getBuilderAfterRequestBody(FakerefsenumPostRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        FakerefsenumPostRequest getInstance();
        T getBuilderAfterServerIndex(FakerefsenumPostRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakerefsenumPostRequest getInstance();
        T getBuilderAfterTimeout(FakerefsenumPostRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class PostRequestBuilder implements SetterForRequestBody<PostRequestBuilder>, SetterForServerIndex<PostRequestBuilder>, SetterForTimeout<PostRequestBuilder> {
        private final FakerefsenumPostRequest instance;

        public PostRequestBuilder() {
            this.instance = new FakerefsenumPostRequest();
        }

        public FakerefsenumPostRequest build() {
            return instance;
        }

        public FakerefsenumPostRequest getInstance() {
            return instance;
        }

        public PostRequestBuilder getBuilderAfterRequestBody(FakerefsenumPostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterServerIndex(FakerefsenumPostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterTimeout(FakerefsenumPostRequest instance) {
            return this;
        }
    }
}
