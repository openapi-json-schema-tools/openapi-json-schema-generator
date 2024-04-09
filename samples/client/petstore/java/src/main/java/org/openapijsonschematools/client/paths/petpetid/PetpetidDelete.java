package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetid.delete.HeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Parameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Petpetid;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class PetpetidDelete {
    private static class PetpetidDeleteProvider extends AuthApplier {
        private static final String method = "delete";

        public static Void delete(
            PetpetidDeleteRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            if (request.headerParameters != null) {
                var headersSerializer = new Parameters.HeaderParametersSerializer();
                Map<String, List<String>> serializedHeaders = headersSerializer.serialize(request.headerParameters);
                headers.putAll(serializedHeaders);
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

    public interface PetpetidDeleteOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void delete(PetpetidDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PetpetidDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface DeletePetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void deletePet(PetpetidDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PetpetidDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class PetpetidDelete1 extends ApiClient implements PetpetidDeleteOperation {
        public PetpetidDelete1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PetpetidDeleteRequest {
        public PathParameters.PathParametersMap pathParameters;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public PetpetidDeleteRequest(
            PathParameters.PathParametersMap pathParameters,
            HeaderParameters.@Nullable HeaderParametersMap headerParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.headerParameters = headerParameters;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class PetpetidDeleteNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForHeaderParameters <T> {
        PetpetidDeleteNullableRequest getInstance();
        T getBuilderAfterHeaderParameters(PetpetidDeleteNullableRequest instance);
        default T headerParameters(HeaderParameters.HeaderParametersMap headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PetpetidDeleteNullableRequest getInstance();
        T getBuilderAfterServerIndex(PetpetidDeleteNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PetpetidDeleteNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(PetpetidDeleteNullableRequest instance);
        default T securityIndex(PetpetidDeleteSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        PetpetidDeleteNullableRequest getInstance();
        T getBuilderAfterTimeout(PetpetidDeleteNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        PetpetidDeleteNullableRequest getInstance();
        T getBuilderAfterPathParameters(PetpetidDeleteNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Delete0RequestBuilder implements SetterForHeaderParameters<Delete0RequestBuilder>, SetterForServerIndex<Delete0RequestBuilder>, SetterForSecurityIndex<Delete0RequestBuilder>, SetterForTimeout<Delete0RequestBuilder> {
        private final PetpetidDeleteNullableRequest instance;

        public Delete0RequestBuilder(PetpetidDeleteNullableRequest instance) {
            this.instance = instance;
        }

        public PetpetidDeleteRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PetpetidDeleteRequest(
                pathParameters,
                instance.headerParameters,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public PetpetidDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterHeaderParameters(PetpetidDeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterServerIndex(PetpetidDeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterSecurityIndex(PetpetidDeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterTimeout(PetpetidDeleteNullableRequest instance) {
            return this;
        }
    }
    public static class DeleteRequestBuilder implements SetterForPathParameters<Delete0RequestBuilder> {
        private final PetpetidDeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new PetpetidDeleteNullableRequest();
        }

        public PetpetidDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterPathParameters(PetpetidDeleteNullableRequest instance) {
            return new Delete0RequestBuilder(instance);
        }
    }
}
