package org.openapijsonschematools.client.paths.fakecasesensitiveparams;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.QueryParameters;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.Parameters;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Fakecasesensitiveparams;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakecasesensitiveparamsPut {
    private static class PutProvider {
        private static final String method = "put";

        public static Responses.EndpointResponse put(
            PutRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var querySerializer = new Parameters.QueryParametersSerializer();
            @Nullable Map<String, String> queryMap = querySerializer.getQueryMap(request.queryParameters);
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakecasesensitiveparams.path;
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

    public interface PutOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse put(PutRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PutProvider.put(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface CaseSensitiveParamsOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse caseSensitiveParams(FakecasesensitiveparamsPutRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakecasesensitiveparamsPutProvider.put(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Put extends ApiClient implements FakecasesensitiveparamsPutOperation {
        public Put(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PutRequest {
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public PutRequest(
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class PutNullableRequest {
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakecasesensitiveparamsPutNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakecasesensitiveparamsPutNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakecasesensitiveparamsPutNullableRequest getInstance();
        T getBuilderAfterTimeout(FakecasesensitiveparamsPutNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        FakecasesensitiveparamsPutNullableRequest getInstance();
        T getBuilderAfterQueryParameters(FakecasesensitiveparamsPutNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Put0RequestBuilder implements SetterForServerIndex<Put0RequestBuilder>, SetterForTimeout<Put0RequestBuilder> {
        private final FakecasesensitiveparamsPutNullableRequest instance;

        public Put0RequestBuilder(FakecasesensitiveparamsPutNullableRequest instance) {
            this.instance = instance;
        }

        public FakecasesensitiveparamsPutRequest build() {
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakecasesensitiveparamsPutRequest(
                queryParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public FakecasesensitiveparamsPutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterServerIndex(FakecasesensitiveparamsPutNullableRequest instance) {
            return this;
        }

        public Put0RequestBuilder getBuilderAfterTimeout(FakecasesensitiveparamsPutNullableRequest instance) {
            return this;
        }
    }
    public static class PutRequestBuilder implements SetterForQueryParameters<Put0RequestBuilder> {
        private final FakecasesensitiveparamsPutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new FakecasesensitiveparamsPutNullableRequest();
        }

        public FakecasesensitiveparamsPutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterQueryParameters(FakecasesensitiveparamsPutNullableRequest instance) {
            return new Put0RequestBuilder(instance);
        }
    }
}
