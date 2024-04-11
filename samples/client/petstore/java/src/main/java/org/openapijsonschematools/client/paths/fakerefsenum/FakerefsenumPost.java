package org.openapijsonschematools.client.paths.fakerefsenum;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakerefsenum.post.FakerefsenumPostRequestBody;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.fakerefsenum.post.FakerefsenumPostResponses;
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
    private static class PostProvider {
        private static final String method = "post";

        public static FakerefsenumPostResponses.EndpointResponse post(
            PostRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            @Nullable SerializedRequestBody serializedRequestBody;
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            if (request.requestBody != null) {
                serializedRequestBody = new FakerefsenumPostRequestBody.FakerefsenumPostRequestBody1().serialize(
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
            var responsesDeserializer = new FakerefsenumPostResponses.FakerefsenumPostResponses1();
            return responsesDeserializer.deserialize(response, schemaConfiguration);
        }
    }

    public interface PostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default FakerefsenumPostResponses.EndpointResponse post(PostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface StringEnumOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default FakerefsenumPostResponses.EndpointResponse stringEnum(PostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Post extends ApiClient implements PostOperation {
        public Post(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PostRequest {
        public FakerefsenumPostRequestBody.@Nullable SealedRequestBody requestBody;
        public ServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        PostRequest getInstance();
        T getBuilderAfterRequestBody(PostRequest instance);
        default T requestBody(FakerefsenumPostRequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PostRequest getInstance();
        T getBuilderAfterServerIndex(PostRequest instance);
        default T serverIndex(ServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        PostRequest getInstance();
        T getBuilderAfterTimeout(PostRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class PostRequestBuilder implements SetterForRequestBody<PostRequestBuilder>, SetterForServerIndex<PostRequestBuilder>, SetterForTimeout<PostRequestBuilder> {
        private final PostRequest instance;

        public PostRequestBuilder() {
            this.instance = new PostRequest();
        }

        public PostRequest build() {
            return instance;
        }

        public PostRequest getInstance() {
            return instance;
        }

        public PostRequestBuilder getBuilderAfterRequestBody(PostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterServerIndex(PostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterTimeout(PostRequest instance) {
            return this;
        }
    }
}
