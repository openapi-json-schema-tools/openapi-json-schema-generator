package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.HeaderParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.QueryParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.CookieParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.PathParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Parameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Responses;
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
    private static class Fakeparametercollisions1ababselfabPostProvider {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            Fakeparametercollisions1ababselfabPostRequest request,
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
            var responsesDeserializer = new Responses.Responses1();
            return responsesDeserializer.deserialize(response, schemaConfiguration);
        }
    }

    public interface Fakeparametercollisions1ababselfabPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(Fakeparametercollisions1ababselfabPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return Fakeparametercollisions1ababselfabPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface ParameterCollisionsOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse parameterCollisions(Fakeparametercollisions1ababselfabPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return Fakeparametercollisions1ababselfabPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Fakeparametercollisions1ababselfabPost1 extends ApiClient implements Fakeparametercollisions1ababselfabPostOperation {
        public Fakeparametercollisions1ababselfabPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class Fakeparametercollisions1ababselfabPostRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public CookieParameters.@Nullable CookieParametersMap cookieParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public Fakeparametercollisions1ababselfabPostRequest(
            PathParameters.PathParametersMap pathParameters,
            RequestBody.@Nullable SealedRequestBody requestBody,
            HeaderParameters.@Nullable HeaderParametersMap headerParameters,
            QueryParameters.@Nullable QueryParametersMap queryParameters,
            CookieParameters.@Nullable CookieParametersMap cookieParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
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

    public static class Fakeparametercollisions1ababselfabPostNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public CookieParameters.@Nullable CookieParametersMap cookieParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterRequestBody(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForHeaderParameters <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterHeaderParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T headerParameters(HeaderParameters.HeaderParametersMap headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterQueryParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForCookieParameters <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterCookieParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T cookieParameters(CookieParameters.CookieParametersMap cookieParameters) {
            var instance = getInstance();
            instance.cookieParameters = cookieParameters;
            return getBuilderAfterCookieParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterServerIndex(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterTimeout(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        Fakeparametercollisions1ababselfabPostNullableRequest getInstance();
        T getBuilderAfterPathParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForRequestBody<Post0RequestBuilder>, SetterForHeaderParameters<Post0RequestBuilder>, SetterForQueryParameters<Post0RequestBuilder>, SetterForCookieParameters<Post0RequestBuilder>, SetterForServerIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final Fakeparametercollisions1ababselfabPostNullableRequest instance;

        public Post0RequestBuilder(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            this.instance = instance;
        }

        public Fakeparametercollisions1ababselfabPostRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new Fakeparametercollisions1ababselfabPostRequest(
                pathParameters,
                instance.requestBody,
                instance.headerParameters,
                instance.queryParameters,
                instance.cookieParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public Fakeparametercollisions1ababselfabPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterHeaderParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterQueryParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterCookieParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForPathParameters<Post0RequestBuilder> {
        private final Fakeparametercollisions1ababselfabPostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new Fakeparametercollisions1ababselfabPostNullableRequest();
        }

        public Fakeparametercollisions1ababselfabPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterPathParameters(Fakeparametercollisions1ababselfabPostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
