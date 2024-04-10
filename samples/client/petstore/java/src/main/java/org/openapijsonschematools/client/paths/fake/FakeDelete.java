package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.delete.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.delete.QueryParameters;
import org.openapijsonschematools.client.paths.fake.delete.Parameters;
import org.openapijsonschematools.client.paths.fake.delete.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Fake;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;
import org.openapijsonschematools.client.securityrequirementobjects.AuthApplier;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakeDelete {
    private static class DeleteProvider extends AuthApplier {
        private static final String method = "delete";

        public static Responses.EndpointResponse delete(
            DeleteRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var headersSerializer = new Parameters.HeaderParametersSerializer();
            Map<String, List<String>> serializedHeaders = headersSerializer.serialize(request.headerParameters);
            headers.putAll(serializedHeaders);

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = querySerializer.getQueryMap(request.queryParameters);
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

    public interface DeleteOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse delete(DeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return DeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface GroupParametersOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse groupParameters(FakeDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Delete extends ApiClient implements FakeDeleteOperation {
        public Delete(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class DeleteRequest {
        public HeaderParameters.HeaderParametersMap headerParameters;
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;

        public DeleteRequest(
            HeaderParameters.HeaderParametersMap headerParameters,
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex,
            @Nullable Duration timeout
        ) {
            this.headerParameters = headerParameters;
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
            this.timeout = timeout;
        }
    }

    public static class DeleteNullableRequest {
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakeDeleteNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakeDeleteNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        FakeDeleteNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(FakeDeleteNullableRequest instance);
        default T securityIndex(FakeDeleteSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakeDeleteNullableRequest getInstance();
        T getBuilderAfterTimeout(FakeDeleteNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForHeaderParameters <T> {
        FakeDeleteNullableRequest getInstance();
        T getBuilderAfterHeaderParameters(FakeDeleteNullableRequest instance);
        default T headerParameters(HeaderParameters.HeaderParametersMap headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        FakeDeleteNullableRequest getInstance();
        T getBuilderAfterQueryParameters(FakeDeleteNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Delete00RequestBuilder implements SetterForServerIndex<Delete00RequestBuilder>, SetterForSecurityIndex<Delete00RequestBuilder>, SetterForTimeout<Delete00RequestBuilder> {
        private final FakeDeleteNullableRequest instance;

        public Delete00RequestBuilder(FakeDeleteNullableRequest instance) {
            this.instance = instance;
        }

        public FakeDeleteRequest build() {
            var headerParameters = instance.headerParameters;
            if (headerParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakeDeleteRequest(
                headerParameters,
                queryParameters,
                instance.serverIndex,
                instance.securityIndex,
                instance.timeout
            );
        }

        public FakeDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete00RequestBuilder getBuilderAfterServerIndex(FakeDeleteNullableRequest instance) {
            return this;
        }

        public Delete00RequestBuilder getBuilderAfterSecurityIndex(FakeDeleteNullableRequest instance) {
            return this;
        }

        public Delete00RequestBuilder getBuilderAfterTimeout(FakeDeleteNullableRequest instance) {
            return this;
        }
    }
    public static class Delete01RequestBuilder implements SetterForQueryParameters<Delete00RequestBuilder> {
        private final FakeDeleteNullableRequest instance;

        public Delete01RequestBuilder(FakeDeleteNullableRequest instance) {
            this.instance = instance;
        }

        public FakeDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete00RequestBuilder getBuilderAfterQueryParameters(FakeDeleteNullableRequest instance) {
            return new Delete00RequestBuilder(instance);
        }
    }
    public static class Delete10RequestBuilder implements SetterForHeaderParameters<Delete00RequestBuilder> {
        private final FakeDeleteNullableRequest instance;

        public Delete10RequestBuilder(FakeDeleteNullableRequest instance) {
            this.instance = instance;
        }

        public FakeDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete00RequestBuilder getBuilderAfterHeaderParameters(FakeDeleteNullableRequest instance) {
            return new Delete00RequestBuilder(instance);
        }
    }
    public static class DeleteRequestBuilder implements SetterForHeaderParameters<Delete01RequestBuilder>, SetterForQueryParameters<Delete10RequestBuilder> {
        private final FakeDeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new FakeDeleteNullableRequest();
        }

        public FakeDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete01RequestBuilder getBuilderAfterHeaderParameters(FakeDeleteNullableRequest instance) {
            return new Delete01RequestBuilder(instance);
        }

        public Delete10RequestBuilder getBuilderAfterQueryParameters(FakeDeleteNullableRequest instance) {
            return new Delete10RequestBuilder(instance);
        }
    }
}
