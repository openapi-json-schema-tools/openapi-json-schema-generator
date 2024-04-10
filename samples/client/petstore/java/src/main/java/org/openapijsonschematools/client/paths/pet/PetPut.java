package org.openapijsonschematools.client.paths.pet;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutSecurityInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutRequestBody;
import org.openapijsonschematools.client.paths.pet.put.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Pet;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class PetPut {
    private static class PutProvider extends AuthApplier {
        private static final String method = "put";

        public static Void put(
            PutRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            SerializedRequestBody serializedRequestBody = new PetPutRequestBody.PetPutRequestBody1().serialize(
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
                Pet.path,
                method,
                bodyPublisher,
                queryMap,
                apiConfiguration
            );

            String url = host + Pet.path;
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

    public interface PutOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void put(PutRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PutProvider.put(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface UpdatePetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void updatePet(PutRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PutProvider.put(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Put extends ApiClient implements PutOperation {
        public Put(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PutRequest {
        public PetPutRequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetPutSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public PutRequest(
            PetPutRequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            PetPutSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class PutNullableRequest {
        public PetPutRequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetPutSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterServerIndex(PutNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(PutNullableRequest instance);
        default T securityIndex(PetPutSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterTimeout(PutNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterRequestBody(PutNullableRequest instance);
        default T requestBody(PetPutRequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Put0RequestBuilder implements SetterForServerIndex<Put0RequestBuilder>, SetterForSecurityIndex<Put0RequestBuilder>, SetterForTimeout<Put0RequestBuilder> {
        private final PutNullableRequest instance;

        public Put0RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PutRequest(
                requestBody,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterServerIndex(PutNullableRequest instance) {
            return this;
        }

        public Put0RequestBuilder getBuilderAfterSecurityIndex(PutNullableRequest instance) {
            return this;
        }

        public Put0RequestBuilder getBuilderAfterTimeout(PutNullableRequest instance) {
            return this;
        }
    }
    public static class PutRequestBuilder implements SetterForRequestBody<Put0RequestBuilder> {
        private final PutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new PutNullableRequest();
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterRequestBody(PutNullableRequest instance) {
            return new Put0RequestBuilder(instance);
        }
    }
}
