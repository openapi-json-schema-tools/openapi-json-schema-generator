package org.openapijsonschematools.client.paths.usercreatewitharray;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.usercreatewitharray.post.RequestBody;
import org.openapijsonschematools.client.paths.usercreatewitharray.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Usercreatewitharray;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class UsercreatewitharrayPost {
    private static class UsercreatewitharrayPostProvider {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            UsercreatewitharrayPostRequest request,
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

            String url = host + Usercreatewitharray.path;
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

    public interface UsercreatewitharrayPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(UsercreatewitharrayPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return UsercreatewitharrayPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface CreateUsersWithArrayInputOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse createUsersWithArrayInput(UsercreatewitharrayPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return UsercreatewitharrayPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class UsercreatewitharrayPost1 extends ApiClient implements UsercreatewitharrayPostOperation {
        public UsercreatewitharrayPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class UsercreatewitharrayPostRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public UsercreatewitharrayPostRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class UsercreatewitharrayPostNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        UsercreatewitharrayPostNullableRequest getInstance();
        T getBuilderAfterServerIndex(UsercreatewitharrayPostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        UsercreatewitharrayPostNullableRequest getInstance();
        T getBuilderAfterTimeout(UsercreatewitharrayPostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        UsercreatewitharrayPostNullableRequest getInstance();
        T getBuilderAfterRequestBody(UsercreatewitharrayPostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForServerIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final UsercreatewitharrayPostNullableRequest instance;

        public Post0RequestBuilder(UsercreatewitharrayPostNullableRequest instance) {
            this.instance = instance;
        }

        public UsercreatewitharrayPostRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new UsercreatewitharrayPostRequest(
                requestBody,
                instance.serverIndex,
                instance.timeout
            );
        }

        public UsercreatewitharrayPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(UsercreatewitharrayPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(UsercreatewitharrayPostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForRequestBody<Post0RequestBuilder> {
        private final UsercreatewitharrayPostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new UsercreatewitharrayPostNullableRequest();
        }

        public UsercreatewitharrayPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(UsercreatewitharrayPostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
