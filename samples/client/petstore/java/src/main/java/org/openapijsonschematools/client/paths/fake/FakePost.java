package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fake.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.post.FakePostSecurityInfo;
import org.openapijsonschematools.client.paths.fake.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fake;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakePost {
    private static class FakePostProvider extends AuthApplier {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            FakePostRequest request,
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
            SecurityRequirementObject securityRequirementObject = apiConfiguration.getSecurityRequirementObject(request.securityIndex);
            updateParamsForAuth(
                securityRequirementObject,
                headers,
                Fake.path,
                method,
                bodyPublisher,
                queryMap,
                apiConfiguration
            );

            String url = host + Fake.path;
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

    public interface FakePostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(FakePostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakePostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface EndpointParametersOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse endpointParameters(FakePostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakePostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakePost1 extends ApiClient implements FakePostOperation {
        public FakePost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakePostRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakePostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        FakePostRequest getInstance();
        T getBuilderAfterRequestBody(FakePostRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        FakePostRequest getInstance();
        T getBuilderAfterServerIndex(FakePostRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        FakePostRequest getInstance();
        T getBuilderAfterSecurityIndex(FakePostRequest instance);
        default T securityIndex(FakePostSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakePostRequest getInstance();
        T getBuilderAfterTimeout(FakePostRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class PostRequestBuilder implements SetterForRequestBody<PostRequestBuilder>, SetterForServerIndex<PostRequestBuilder>, SetterForSecurityIndex<PostRequestBuilder>, SetterForTimeout<PostRequestBuilder> {
        private final FakePostRequest instance;

        public PostRequestBuilder() {
            this.instance = new FakePostRequest();
        }

        public FakePostRequest build() {
            return instance;
        }

        public FakePostRequest getInstance() {
            return instance;
        }

        public PostRequestBuilder getBuilderAfterRequestBody(FakePostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterServerIndex(FakePostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterSecurityIndex(FakePostRequest instance) {
            return this;
        }

        public PostRequestBuilder getBuilderAfterTimeout(FakePostRequest instance) {
            return this;
        }
    }
}
