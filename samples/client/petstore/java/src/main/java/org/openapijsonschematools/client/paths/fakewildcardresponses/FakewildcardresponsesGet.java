package org.openapijsonschematools.client.paths.fakewildcardresponses;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Fakewildcardresponses;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakewildcardresponsesGet {
    private static class FakewildcardresponsesGetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            FakewildcardresponsesGetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakewildcardresponses.path;
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

    public interface FakewildcardresponsesGetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(FakewildcardresponsesGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakewildcardresponsesGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface WildCardResponsesOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse wildCardResponses(FakewildcardresponsesGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakewildcardresponsesGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakewildcardresponsesGet1 extends ApiClient implements FakewildcardresponsesGetOperation {
        public FakewildcardresponsesGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakewildcardresponsesGetRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakewildcardresponsesGetRequest getInstance();
        T getBuilderAfterServerIndex(FakewildcardresponsesGetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakewildcardresponsesGetRequest getInstance();
        T getBuilderAfterTimeout(FakewildcardresponsesGetRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForServerIndex<GetRequestBuilder>, SetterForTimeout<GetRequestBuilder> {
        private final FakewildcardresponsesGetRequest instance;

        public GetRequestBuilder() {
            this.instance = new FakewildcardresponsesGetRequest();
        }

        public FakewildcardresponsesGetRequest build() {
            return instance;
        }

        public FakewildcardresponsesGetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(FakewildcardresponsesGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterTimeout(FakewildcardresponsesGetRequest instance) {
            return this;
        }
    }
}
