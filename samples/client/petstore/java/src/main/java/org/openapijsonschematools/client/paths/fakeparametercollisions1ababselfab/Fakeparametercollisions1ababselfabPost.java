package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostRequestBody;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostHeaderParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostQueryParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostCookieParameters;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostPathParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Parameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostResponses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakeparametercollisions1ababselfab;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Fakeparametercollisions1ababselfabPost {
    private static class PostProvider {
        private static final String method = "post";

        public static Fakeparametercollisions1ababselfabPostResponses.EndpointResponse post(
            PostRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            @Nullable SerializedRequestBody serializedRequestBody;
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            if (request.requestBody != null) {
                serializedRequestBody = new Fakeparametercollisions1ababselfabPostRequestBody.Fakeparametercollisions1ababselfabPostRequestBody1().serialize(
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

            if (request.cookieParameters != null) {
                var cookieSerializer = new Parameters.CookieParametersSerializer();
                String serializedCookie = cookieSerializer.serialize(request.cookieParameters);
                var cookieHeaderValues = headers.getOrDefault("Cookie", new ArrayList<>());
                cookieHeaderValues.add(serializedCookie);
            }

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, Fakeparametercollisions1ababselfab.path);

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
            var responsesDeserializer = new Fakeparametercollisions1ababselfabPostResponses.Fakeparametercollisions1ababselfabPostResponses1();
            return responsesDeserializer.deserialize(response, schemaConfiguration);
        }
    }

    public interface PostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Fakeparametercollisions1ababselfabPostResponses.EndpointResponse post(PostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface ParameterCollisionsOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Fakeparametercollisions1ababselfabPostResponses.EndpointResponse parameterCollisions(PostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Post extends ApiClient implements PostOperation {
        public Post(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PostRequest {
        public Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters13 pathParameters;
        public Fakeparametercollisions1ababselfabPostRequestBody.@Nullable SealedRequestBody requestBody;
        public Fakeparametercollisions1ababselfabPostHeaderParameters.@Nullable Fakeparametercollisions1ababselfabPostHeaderParameters12 headerParameters;
        public Fakeparametercollisions1ababselfabPostQueryParameters.@Nullable Fakeparametercollisions1ababselfabPostQueryParameters13 queryParameters;
        public Fakeparametercollisions1ababselfabPostCookieParameters.@Nullable Fakeparametercollisions1ababselfabPostCookieParameters13 cookieParameters;
        public ServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public PostRequest(
            Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters13 pathParameters,
            Fakeparametercollisions1ababselfabPostRequestBody.@Nullable SealedRequestBody requestBody,
            Fakeparametercollisions1ababselfabPostHeaderParameters.@Nullable Fakeparametercollisions1ababselfabPostHeaderParameters12 headerParameters,
            Fakeparametercollisions1ababselfabPostQueryParameters.@Nullable Fakeparametercollisions1ababselfabPostQueryParameters13 queryParameters,
            Fakeparametercollisions1ababselfabPostCookieParameters.@Nullable Fakeparametercollisions1ababselfabPostCookieParameters13 cookieParameters,
            ServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.requestBody = requestBody;
            this.headerParameters = headerParameters;
            this.queryParameters = queryParameters;
            this.cookieParameters = cookieParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class PostNullableRequest {
        public Fakeparametercollisions1ababselfabPostPathParameters.@Nullable Fakeparametercollisions1ababselfabPostPathParameters13 pathParameters;
        public Fakeparametercollisions1ababselfabPostRequestBody.@Nullable SealedRequestBody requestBody;
        public Fakeparametercollisions1ababselfabPostHeaderParameters.@Nullable Fakeparametercollisions1ababselfabPostHeaderParameters12 headerParameters;
        public Fakeparametercollisions1ababselfabPostQueryParameters.@Nullable Fakeparametercollisions1ababselfabPostQueryParameters13 queryParameters;
        public Fakeparametercollisions1ababselfabPostCookieParameters.@Nullable Fakeparametercollisions1ababselfabPostCookieParameters13 cookieParameters;
        public ServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterRequestBody(PostNullableRequest instance);
        default T requestBody(Fakeparametercollisions1ababselfabPostRequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForHeaderParameters <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterHeaderParameters(PostNullableRequest instance);
        default T headerParameters(Fakeparametercollisions1ababselfabPostHeaderParameters.Fakeparametercollisions1ababselfabPostHeaderParameters12 headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterQueryParameters(PostNullableRequest instance);
        default T queryParameters(Fakeparametercollisions1ababselfabPostQueryParameters.Fakeparametercollisions1ababselfabPostQueryParameters13 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForCookieParameters <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterCookieParameters(PostNullableRequest instance);
        default T cookieParameters(Fakeparametercollisions1ababselfabPostCookieParameters.Fakeparametercollisions1ababselfabPostCookieParameters13 cookieParameters) {
            var instance = getInstance();
            instance.cookieParameters = cookieParameters;
            return getBuilderAfterCookieParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterServerIndex(PostNullableRequest instance);
        default T serverIndex(ServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterTimeout(PostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        PostNullableRequest getInstance();
        T getBuilderAfterPathParameters(PostNullableRequest instance);
        default T pathParameters(Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters13 pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForRequestBody<Post0RequestBuilder>, SetterForHeaderParameters<Post0RequestBuilder>, SetterForQueryParameters<Post0RequestBuilder>, SetterForCookieParameters<Post0RequestBuilder>, SetterForServerIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final PostNullableRequest instance;

        public Post0RequestBuilder(PostNullableRequest instance) {
            this.instance = instance;
        }

        public PostRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PostRequest(
                pathParameters,
                instance.requestBody,
                instance.headerParameters,
                instance.queryParameters,
                instance.cookieParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public PostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterHeaderParameters(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterQueryParameters(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterCookieParameters(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(PostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(PostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForPathParameters<Post0RequestBuilder> {
        private final PostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new PostNullableRequest();
        }

        public PostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterPathParameters(PostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
