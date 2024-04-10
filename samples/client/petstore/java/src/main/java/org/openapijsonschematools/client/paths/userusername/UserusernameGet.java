package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.get.PathParameters;
import org.openapijsonschematools.client.paths.userusername.get.Parameters;
import org.openapijsonschematools.client.paths.userusername.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Userusername;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class UserusernameGet {
    private static class GetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            GetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, Userusername.path);
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

    public interface GetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(GetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return GetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface GetUserByNameOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse getUserByName(UserusernameGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return UserusernameGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Get extends ApiClient implements UserusernameGetOperation {
        public Get(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class GetRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public GetRequest(
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class GetNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        UserusernameGetNullableRequest getInstance();
        T getBuilderAfterServerIndex(UserusernameGetNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        UserusernameGetNullableRequest getInstance();
        T getBuilderAfterTimeout(UserusernameGetNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        UserusernameGetNullableRequest getInstance();
        T getBuilderAfterPathParameters(UserusernameGetNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Get0RequestBuilder implements SetterForServerIndex<Get0RequestBuilder>, SetterForTimeout<Get0RequestBuilder> {
        private final UserusernameGetNullableRequest instance;

        public Get0RequestBuilder(UserusernameGetNullableRequest instance) {
            this.instance = instance;
        }

        public UserusernameGetRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new UserusernameGetRequest(
                pathParameters,
                instance.serverIndex,
                instance.timeout
            );
        }

        public UserusernameGetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterServerIndex(UserusernameGetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterTimeout(UserusernameGetNullableRequest instance) {
            return this;
        }
    }
    public static class GetRequestBuilder implements SetterForPathParameters<Get0RequestBuilder> {
        private final UserusernameGetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new UserusernameGetNullableRequest();
        }

        public UserusernameGetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterPathParameters(UserusernameGetNullableRequest instance) {
            return new Get0RequestBuilder(instance);
        }
    }
}
