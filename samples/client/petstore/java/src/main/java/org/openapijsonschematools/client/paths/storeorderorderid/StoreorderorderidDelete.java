package org.openapijsonschematools.client.paths.storeorderorderid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.PathParameters;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.Parameters;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.Responses;
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

public class StoreorderorderidDelete {
    private static class StoreorderorderidDeleteProvider {
        private static final String method = "delete";

        public static Void delete(
            StoreorderorderidDeleteRequest request,
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

    public interface StoreorderorderidDeleteOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void delete(StoreorderorderidDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return StoreorderorderidDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface DeleteOrderOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Void deleteOrder(StoreorderorderidDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return StoreorderorderidDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class StoreorderorderidDelete1 extends ApiClient implements StoreorderorderidDeleteOperation {
        public StoreorderorderidDelete1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class StoreorderorderidDeleteRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public StoreorderorderidDeleteRequest(
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class StoreorderorderidDeleteNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        StoreorderorderidDeleteNullableRequest getInstance();
        T getBuilderAfterServerIndex(StoreorderorderidDeleteNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        StoreorderorderidDeleteNullableRequest getInstance();
        T getBuilderAfterTimeout(StoreorderorderidDeleteNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        StoreorderorderidDeleteNullableRequest getInstance();
        T getBuilderAfterPathParameters(StoreorderorderidDeleteNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Delete0RequestBuilder implements SetterForServerIndex<Delete0RequestBuilder>, SetterForTimeout<Delete0RequestBuilder> {
        private final StoreorderorderidDeleteNullableRequest instance;

        public Delete0RequestBuilder(StoreorderorderidDeleteNullableRequest instance) {
            this.instance = instance;
        }

        public StoreorderorderidDeleteRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new StoreorderorderidDeleteRequest(
                pathParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public StoreorderorderidDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterServerIndex(StoreorderorderidDeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterTimeout(StoreorderorderidDeleteNullableRequest instance) {
            return this;
        }
    }
    public static class DeleteRequestBuilder implements SetterForPathParameters<Delete0RequestBuilder> {
        private final StoreorderorderidDeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new StoreorderorderidDeleteNullableRequest();
        }

        public StoreorderorderidDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterPathParameters(StoreorderorderidDeleteNullableRequest instance) {
            return new Delete0RequestBuilder(instance);
        }
    }
}
