package org.openapijsonschematools.client.paths.fakerefsmammal;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefsmammal.post.RequestBody;
import org.openapijsonschematools.client.paths.fakerefsmammal.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakerefsmammal;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakerefsmammalPost {
    private static class FakerefsmammalPostProvider {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            FakerefsmammalPostRequest request,
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
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakerefsmammal.path;
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

    public interface FakerefsmammalPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(FakerefsmammalPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakerefsmammalPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface MammalOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse mammal(FakerefsmammalPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakerefsmammalPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakerefsmammalPost1 extends ApiClient implements FakerefsmammalPostOperation {
        public FakerefsmammalPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakerefsmammalPostRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public FakerefsmammalPostRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class FakerefsmammalPostNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakerefsmammalPostNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakerefsmammalPostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakerefsmammalPostNullableRequest getInstance();
        T getBuilderAfterTimeout(FakerefsmammalPostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        FakerefsmammalPostNullableRequest getInstance();
        T getBuilderAfterRequestBody(FakerefsmammalPostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForServerIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final FakerefsmammalPostNullableRequest instance;

        public Post0RequestBuilder(FakerefsmammalPostNullableRequest instance) {
            this.instance = instance;
        }

        public FakerefsmammalPostRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakerefsmammalPostRequest(
                requestBody,
                instance.serverIndex,
                instance.timeout
            );
        }

        public FakerefsmammalPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(FakerefsmammalPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(FakerefsmammalPostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForRequestBody<Post0RequestBuilder> {
        private final FakerefsmammalPostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new FakerefsmammalPostNullableRequest();
        }

        public FakerefsmammalPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(FakerefsmammalPostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
