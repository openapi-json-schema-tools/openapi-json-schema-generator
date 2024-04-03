package org.openapijsonschematools.client.paths.petfindbystatus;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.QueryParameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Parameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Petfindbystatus;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Get {
    private static class GetProvider extends AuthApplier {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            GetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, InvalidTypeException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = querySerializer.getQueryMap(request.queryParameters);
            String host = apiConfiguration.getServer(request.serverIndex).url();
            SecurityRequirementObject securityRequirementObject = apiConfiguration.getSecurityRequirementObject(request.securityIndex);
            updateParamsForAuth(
                securityRequirementObject,
                headers,
                Petfindbystatus.path,
                method,
                bodyPublisher,
                queryMap,
                apiConfiguration
            );

            String url = host + Petfindbystatus.path;
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

    public interface GetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(GetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, InvalidTypeException, ApiException {
            return GetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Get1 extends ApiClient implements GetOperation {
        public Get1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class GetRequest {
        public QueryParameters.QueryParametersMap queryParameters;
        public PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex;
        public PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public GetRequest(
            QueryParameters.QueryParametersMap queryParameters,
            PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex,
            PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class GetNullableRequest {
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex;
        public PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterServerIndex(GetNullableRequest instance);
        default T serverIndex(PetfindbystatusServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(GetNullableRequest instance);
        default T securityIndex(PetfindbystatusGetSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterTimeout(GetNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterQueryParameters(GetNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Get0RequestBuilder implements SetterForServerIndex<Get0RequestBuilder>, SetterForSecurityIndex<Get0RequestBuilder>, SetterForTimeout<Get0RequestBuilder> {
        private final GetNullableRequest instance;

        public Get0RequestBuilder(GetNullableRequest instance) {
            this.instance = instance;
        }

        public GetRequest build() {
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new GetRequest(
                queryParameters,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public GetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterServerIndex(GetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterSecurityIndex(GetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterTimeout(GetNullableRequest instance) {
            return this;
        }
    }
    public static class GetRequestBuilder implements SetterForQueryParameters<Get0RequestBuilder> {
        private final GetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetNullableRequest();
        }

        public GetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterQueryParameters(GetNullableRequest instance) {
            return new Get0RequestBuilder(instance);
        }
    }
}
