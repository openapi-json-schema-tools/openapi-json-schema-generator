package org.openapijsonschematools.client.paths.storeorderorderid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.get.PathParameters;
import org.openapijsonschematools.client.paths.storeorderorderid.get.Parameters;
import org.openapijsonschematools.client.paths.storeorderorderid.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Storeorderorderid;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class StoreorderorderidGet {
    private static class StoreorderorderidGetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            StoreorderorderidGetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, Storeorderorderid.path);
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

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

    public interface StoreorderorderidGetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(StoreorderorderidGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return StoreorderorderidGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface GetOrderByIdOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse getOrderById(StoreorderorderidGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return StoreorderorderidGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class StoreorderorderidGet1 extends ApiClient implements StoreorderorderidGetOperation {
        public StoreorderorderidGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class StoreorderorderidGetRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public StoreorderorderidGetRequest(
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class StoreorderorderidGetNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        StoreorderorderidGetNullableRequest getInstance();
        T getBuilderAfterServerIndex(StoreorderorderidGetNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        StoreorderorderidGetNullableRequest getInstance();
        T getBuilderAfterTimeout(StoreorderorderidGetNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        StoreorderorderidGetNullableRequest getInstance();
        T getBuilderAfterPathParameters(StoreorderorderidGetNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Get0RequestBuilder implements SetterForServerIndex<Get0RequestBuilder>, SetterForTimeout<Get0RequestBuilder> {
        private final StoreorderorderidGetNullableRequest instance;

        public Get0RequestBuilder(StoreorderorderidGetNullableRequest instance) {
            this.instance = instance;
        }

        public StoreorderorderidGetRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new StoreorderorderidGetRequest(
                pathParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public StoreorderorderidGetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterServerIndex(StoreorderorderidGetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterTimeout(StoreorderorderidGetNullableRequest instance) {
            return this;
        }
    }
    public static class GetRequestBuilder implements SetterForPathParameters<Get0RequestBuilder> {
        private final StoreorderorderidGetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new StoreorderorderidGetNullableRequest();
        }

        public StoreorderorderidGetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterPathParameters(StoreorderorderidGetNullableRequest instance) {
            return new Get0RequestBuilder(instance);
        }
    }
}
