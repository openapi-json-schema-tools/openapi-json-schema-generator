package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.PathParameters;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.Parameters;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakepetiduploadimagewithrequiredfile;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakepetiduploadimagewithrequiredfilePost {
    private static class FakepetiduploadimagewithrequiredfilePostProvider extends AuthApplier {
        private static final String method = "post";

        public static Responses.EndpointResponse post(
            FakepetiduploadimagewithrequiredfilePostRequest request,
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

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, Fakepetiduploadimagewithrequiredfile.path);
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();
            SecurityRequirementObject securityRequirementObject = apiConfiguration.getSecurityRequirementObject(request.securityIndex);
            updateParamsForAuth(
                securityRequirementObject,
                headers,
                updatedPath,
                method,
                bodyPublisher,
                queryMap,
                apiConfiguration
            );

            String url = host + updatedPath;
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

    public interface FakepetiduploadimagewithrequiredfilePostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse post(FakepetiduploadimagewithrequiredfilePostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakepetiduploadimagewithrequiredfilePostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface UploadFileWithRequiredFileOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse uploadFileWithRequiredFile(FakepetiduploadimagewithrequiredfilePostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakepetiduploadimagewithrequiredfilePostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakepetiduploadimagewithrequiredfilePost1 extends ApiClient implements FakepetiduploadimagewithrequiredfilePostOperation {
        public FakepetiduploadimagewithrequiredfilePost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakepetiduploadimagewithrequiredfilePostRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public FakepetiduploadimagewithrequiredfilePostRequest(
            PathParameters.PathParametersMap pathParameters,
            RequestBody.@Nullable SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class FakepetiduploadimagewithrequiredfilePostNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance();
        T getBuilderAfterRequestBody(FakepetiduploadimagewithrequiredfilePostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakepetiduploadimagewithrequiredfilePostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(FakepetiduploadimagewithrequiredfilePostNullableRequest instance);
        default T securityIndex(FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance();
        T getBuilderAfterTimeout(FakepetiduploadimagewithrequiredfilePostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance();
        T getBuilderAfterPathParameters(FakepetiduploadimagewithrequiredfilePostNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForRequestBody<Post0RequestBuilder>, SetterForServerIndex<Post0RequestBuilder>, SetterForSecurityIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final FakepetiduploadimagewithrequiredfilePostNullableRequest instance;

        public Post0RequestBuilder(FakepetiduploadimagewithrequiredfilePostNullableRequest instance) {
            this.instance = instance;
        }

        public FakepetiduploadimagewithrequiredfilePostRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakepetiduploadimagewithrequiredfilePostRequest(
                pathParameters,
                instance.requestBody,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(FakepetiduploadimagewithrequiredfilePostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(FakepetiduploadimagewithrequiredfilePostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterSecurityIndex(FakepetiduploadimagewithrequiredfilePostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(FakepetiduploadimagewithrequiredfilePostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForPathParameters<Post0RequestBuilder> {
        private final FakepetiduploadimagewithrequiredfilePostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new FakepetiduploadimagewithrequiredfilePostNullableRequest();
        }

        public FakepetiduploadimagewithrequiredfilePostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterPathParameters(FakepetiduploadimagewithrequiredfilePostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
