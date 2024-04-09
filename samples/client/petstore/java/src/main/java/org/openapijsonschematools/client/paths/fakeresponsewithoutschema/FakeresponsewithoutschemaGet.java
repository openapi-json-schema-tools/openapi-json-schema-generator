package org.openapijsonschematools.client.paths.fakeresponsewithoutschema;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeresponsewithoutschema.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Fakeresponsewithoutschema;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FakeresponsewithoutschemaGet {
    private static class FakeresponsewithoutschemaGetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            FakeresponsewithoutschemaGetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Fakeresponsewithoutschema.path;
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

    public interface FakeresponsewithoutschemaGetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(FakeresponsewithoutschemaGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeresponsewithoutschemaGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface ResponseWithoutSchemaOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse responseWithoutSchema(FakeresponsewithoutschemaGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FakeresponsewithoutschemaGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FakeresponsewithoutschemaGet1 extends ApiClient implements FakeresponsewithoutschemaGetOperation {
        public FakeresponsewithoutschemaGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FakeresponsewithoutschemaGetRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FakeresponsewithoutschemaGetRequest getInstance();
        T getBuilderAfterServerIndex(FakeresponsewithoutschemaGetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FakeresponsewithoutschemaGetRequest getInstance();
        T getBuilderAfterTimeout(FakeresponsewithoutschemaGetRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForServerIndex<GetRequestBuilder>, SetterForTimeout<GetRequestBuilder> {
        private final FakeresponsewithoutschemaGetRequest instance;

        public GetRequestBuilder() {
            this.instance = new FakeresponsewithoutschemaGetRequest();
        }

        public FakeresponsewithoutschemaGetRequest build() {
            return instance;
        }

        public FakeresponsewithoutschemaGetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(FakeresponsewithoutschemaGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterTimeout(FakeresponsewithoutschemaGetRequest instance) {
            return this;
        }
    }
}
