package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetid.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.post.Parameters;
import org.openapijsonschematools.client.paths.petpetid.post.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Petpetid;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class PetpetidPost {
    private static class PetpetidPostProvider extends AuthApplier {
        private static final String method = "post";

        public static Void post(
            PetpetidPostRequest request,
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
            String updatedPath = pathSerializer.serialize(request.pathParameters, Petpetid.path);
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

    public interface PetpetidPostOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void post(PetpetidPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PetpetidPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface UpdatePetWithFormOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void updatePetWithForm(PetpetidPostRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PetpetidPostProvider.post(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class PetpetidPost1 extends ApiClient implements PetpetidPostOperation {
        public PetpetidPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PetpetidPostRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidPostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public PetpetidPostRequest(
            PathParameters.PathParametersMap pathParameters,
            RequestBody.@Nullable SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            PetpetidPostSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class PetpetidPostNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidPostSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForRequestBody <T> {
        PetpetidPostNullableRequest getInstance();
        T getBuilderAfterRequestBody(PetpetidPostNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PetpetidPostNullableRequest getInstance();
        T getBuilderAfterServerIndex(PetpetidPostNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PetpetidPostNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(PetpetidPostNullableRequest instance);
        default T securityIndex(PetpetidPostSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        PetpetidPostNullableRequest getInstance();
        T getBuilderAfterTimeout(PetpetidPostNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        PetpetidPostNullableRequest getInstance();
        T getBuilderAfterPathParameters(PetpetidPostNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Post0RequestBuilder implements SetterForRequestBody<Post0RequestBuilder>, SetterForServerIndex<Post0RequestBuilder>, SetterForSecurityIndex<Post0RequestBuilder>, SetterForTimeout<Post0RequestBuilder> {
        private final PetpetidPostNullableRequest instance;

        public Post0RequestBuilder(PetpetidPostNullableRequest instance) {
            this.instance = instance;
        }

        public PetpetidPostRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PetpetidPostRequest(
                pathParameters,
                instance.requestBody,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public PetpetidPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterRequestBody(PetpetidPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterServerIndex(PetpetidPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterSecurityIndex(PetpetidPostNullableRequest instance) {
            return this;
        }

        public Post0RequestBuilder getBuilderAfterTimeout(PetpetidPostNullableRequest instance) {
            return this;
        }
    }
    public static class PostRequestBuilder implements SetterForPathParameters<Post0RequestBuilder> {
        private final PetpetidPostNullableRequest instance;

        public PostRequestBuilder() {
            this.instance = new PetpetidPostNullableRequest();
        }

        public PetpetidPostNullableRequest getInstance() {
            return instance;
        }

        public Post0RequestBuilder getBuilderAfterPathParameters(PetpetidPostNullableRequest instance) {
            return new Post0RequestBuilder(instance);
        }
    }
}
