package org.openapijsonschematools.client.paths.fakedeletecoffeeid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.PathParameters;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.Parameters;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Fakedeletecoffeeid;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakedeletecoffeeidDelete {
    private static class FakedeletecoffeeidDeleteProvider {
        private static final String method = "delete";

        public static Responses.EndpointResponse delete(
            FakedeletecoffeeidDeleteRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, Fakedeletecoffeeid.path);
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

    public interface FakedeletecoffeeidDeleteOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse delete(FakedeletecoffeeidDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakedeletecoffeeidDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface DeleteCoffeeOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse deleteCoffee(FakedeletecoffeeidDeleteRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakedeletecoffeeidDeleteProvider.delete(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakedeletecoffeeidDelete1 extends ApiClient implements FakedeletecoffeeidDeleteOperation {
        public FakedeletecoffeeidDelete1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakedeletecoffeeidDeleteRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public FakedeletecoffeeidDeleteRequest(
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class FakedeletecoffeeidDeleteNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakedeletecoffeeidDeleteNullableRequest getInstance();
        T getBuilderAfterServerIndex(FakedeletecoffeeidDeleteNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakedeletecoffeeidDeleteNullableRequest getInstance();
        T getBuilderAfterTimeout(FakedeletecoffeeidDeleteNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        FakedeletecoffeeidDeleteNullableRequest getInstance();
        T getBuilderAfterPathParameters(FakedeletecoffeeidDeleteNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Delete0RequestBuilder implements SetterForServerIndex<Delete0RequestBuilder>, SetterForTimeout<Delete0RequestBuilder> {
        private final FakedeletecoffeeidDeleteNullableRequest instance;

        public Delete0RequestBuilder(FakedeletecoffeeidDeleteNullableRequest instance) {
            this.instance = instance;
        }

        public FakedeletecoffeeidDeleteRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new FakedeletecoffeeidDeleteRequest(
                pathParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public FakedeletecoffeeidDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterServerIndex(FakedeletecoffeeidDeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterTimeout(FakedeletecoffeeidDeleteNullableRequest instance) {
            return this;
        }
    }
    public static class DeleteRequestBuilder implements SetterForPathParameters<Delete0RequestBuilder> {
        private final FakedeletecoffeeidDeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new FakedeletecoffeeidDeleteNullableRequest();
        }

        public FakedeletecoffeeidDeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterPathParameters(FakedeletecoffeeidDeleteNullableRequest instance) {
            return new Delete0RequestBuilder(instance);
        }
    }
}
