package org.openapijsonschematools.client.paths.fakeinlineadditionalproperties;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.post.RequestBody;
import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakeinlineadditionalproperties;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakeinlineadditionalpropertiesPost {
    private static class FakeinlineadditionalpropertiesPostProvider {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            FakeinlineadditionalpropertiesPostRequest request,
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

            String url = host + Fakeinlineadditionalproperties.path;
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

    public interface FakeinlineadditionalpropertiesPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(FakeinlineadditionalpropertiesPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeinlineadditionalpropertiesPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface InlineAdditionalPropertiesOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse inlineAdditionalProperties(FakeinlineadditionalpropertiesPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeinlineadditionalpropertiesPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakeinlineadditionalpropertiesPost1 extends ApiClient implements FakeinlineadditionalpropertiesPostOperation {
        public FakeinlineadditionalpropertiesPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakeinlineadditionalpropertiesPostRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public FakeinlineadditionalpropertiesPostRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class FakeinlineadditionalpropertiesPostNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakeinlineadditionalpropertiesPostNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakeinlineadditionalpropertiesPostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakeinlineadditionalpropertiesPostNullableRequest getInstance();
        T getBuilderAfterTimeout(FakeinlineadditionalpropertiesPostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        FakeinlineadditionalpropertiesPostNullableRequest getInstance();
        T getBuilderAfterRequestBody(FakeinlineadditionalpropertiesPostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForServerIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final FakeinlineadditionalpropertiesPostNullableRequest instance;

        public Post0RequestBuilder(FakeinlineadditionalpropertiesPostNullableRequest instance) {
            this.instance = instance;
        }

        public FakeinlineadditionalpropertiesPostRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakeinlineadditionalpropertiesPostRequest(
                requestBody,
                instance.serverIndex,
                instance.timeout
            );
        }

        public FakeinlineadditionalpropertiesPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(FakeinlineadditionalpropertiesPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(FakeinlineadditionalpropertiesPostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForRequestBody<Post0RequestBuilder> {
        private final FakeinlineadditionalpropertiesPostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new FakeinlineadditionalpropertiesPostNullableRequest();
        }

        public FakeinlineadditionalpropertiesPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(FakeinlineadditionalpropertiesPostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
