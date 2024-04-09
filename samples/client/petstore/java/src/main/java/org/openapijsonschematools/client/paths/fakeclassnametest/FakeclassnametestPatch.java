package org.openapijsonschematools.client.paths.fakeclassnametest;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.RequestBody;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Fakeclassnametest;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakeclassnametestPatch {
    private static class FakeclassnametestPatchProvider extends AuthApplier {
        private static final String method = "patch";

        public static Responses.EndpointResponse patch(
            FakeclassnametestPatchRequest request,
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
            SecurityRequirementObject securityRequirementObject = apiConfiguration.getSecurityRequirementObject(request.securityIndex);
            updateParamsForAuth(
                securityRequirementObject,
                headers,
                Fakeclassnametest.path,
                method,
                bodyPublisher,
                queryMap,
                apiConfiguration
            );

            String url = host + Fakeclassnametest.path;
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

    public interface FakeclassnametestPatchOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse patch(FakeclassnametestPatchRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeclassnametestPatchProvider.patch(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface ClassnameOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse classname(FakeclassnametestPatchRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeclassnametestPatchProvider.patch(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakeclassnametestPatch1 extends ApiClient implements FakeclassnametestPatchOperation {
        public FakeclassnametestPatch1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakeclassnametestPatchRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public FakeclassnametestPatchRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class FakeclassnametestPatchNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakeclassnametestPatchNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakeclassnametestPatchNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        FakeclassnametestPatchNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(FakeclassnametestPatchNullableRequest instance);
        default T securityIndex(FakeclassnametestPatchSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakeclassnametestPatchNullableRequest getInstance();
        T getBuilderAfterTimeout(FakeclassnametestPatchNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        FakeclassnametestPatchNullableRequest getInstance();
        T getBuilderAfterRequestBody(FakeclassnametestPatchNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Patch0RequestBuilder implements SetterForServerIndex<Patch0RequestBuilder>, SetterForSecurityIndex<Patch0RequestBuilder>, SetterForTimeout<Patch0RequestBuilder> {
        private final FakeclassnametestPatchNullableRequest instance;

        public Patch0RequestBuilder(FakeclassnametestPatchNullableRequest instance) {
            this.instance = instance;
        }

        public FakeclassnametestPatchRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakeclassnametestPatchRequest(
                requestBody,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public FakeclassnametestPatchNullableRequest getInstance() {
            return instance;
        }

        public Patch0RequestBuilder getBuilderAfterServerIndex(FakeclassnametestPatchNullableRequest instance) {
            return this;
        }

        public Patch0RequestBuilder getBuilderAfterSecurityIndex(FakeclassnametestPatchNullableRequest instance) {
            return this;
        }

        public Patch0RequestBuilder getBuilderAfterTimeout(FakeclassnametestPatchNullableRequest instance) {
            return this;
        }
    }
    public static class PatchRequestBuilder implements SetterForRequestBody<Patch0RequestBuilder> {
        private final FakeclassnametestPatchNullableRequest instance;

        public PatchRequestBuilder() {
            this.instance = new FakeclassnametestPatchNullableRequest();
        }

        public FakeclassnametestPatchNullableRequest getInstance() {
            return instance;
        }

        public Patch0RequestBuilder getBuilderAfterRequestBody(FakeclassnametestPatchNullableRequest instance) {
            return new Patch0RequestBuilder(instance);
        }
    }
}
