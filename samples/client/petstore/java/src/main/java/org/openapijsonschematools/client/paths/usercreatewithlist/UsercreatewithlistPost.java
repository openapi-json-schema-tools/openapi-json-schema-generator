package org.openapijsonschematools.client.paths.usercreatewithlist;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.usercreatewithlist.post.RequestBody;
import org.openapijsonschematools.client.paths.usercreatewithlist.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Usercreatewithlist;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class UsercreatewithlistPost {
    private static class UsercreatewithlistPostProvider {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            UsercreatewithlistPostRequest request,
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

            String url = host + Usercreatewithlist.path;
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

    public interface UsercreatewithlistPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(UsercreatewithlistPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return UsercreatewithlistPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface CreateUsersWithListInputOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse createUsersWithListInput(UsercreatewithlistPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return UsercreatewithlistPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class UsercreatewithlistPost1 extends ApiClient implements UsercreatewithlistPostOperation {
        public UsercreatewithlistPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class UsercreatewithlistPostRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public UsercreatewithlistPostRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class UsercreatewithlistPostNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        UsercreatewithlistPostNullableRequest getInstance();
        T getBuilderAfterServerIndex(UsercreatewithlistPostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        UsercreatewithlistPostNullableRequest getInstance();
        T getBuilderAfterTimeout(UsercreatewithlistPostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        UsercreatewithlistPostNullableRequest getInstance();
        T getBuilderAfterRequestBody(UsercreatewithlistPostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForServerIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final UsercreatewithlistPostNullableRequest instance;

        public Post0RequestBuilder(UsercreatewithlistPostNullableRequest instance) {
            this.instance = instance;
        }

        public UsercreatewithlistPostRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new UsercreatewithlistPostRequest(
                requestBody,
                instance.serverIndex,
                instance.timeout
            );
        }

        public UsercreatewithlistPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(UsercreatewithlistPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(UsercreatewithlistPostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForRequestBody<Post0RequestBuilder> {
        private final UsercreatewithlistPostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new UsercreatewithlistPostNullableRequest();
        }

        public UsercreatewithlistPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(UsercreatewithlistPostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
