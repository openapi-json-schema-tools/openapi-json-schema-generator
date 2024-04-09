package org.openapijsonschematools.client.paths.foo;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.foo.get.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.Foo;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FooGet {
    private static class FooGetProvider {
        private static final String method = "get";

        public static Responses.EndpointResponse get(
            FooGetRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Foo.path;
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

    public interface FooGetOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse get(FooGetRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return FooGetProvider.get(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class FooGet1 extends ApiClient implements FooGetOperation {
        public FooGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class FooGetRequest {
        public FooGetServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        FooGetRequest getInstance();
        T getBuilderAfterServerIndex(FooGetRequest instance);
        default T serverIndex(FooGetServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        FooGetRequest getInstance();
        T getBuilderAfterTimeout(FooGetRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForServerIndex<GetRequestBuilder>, SetterForTimeout<GetRequestBuilder> {
        private final FooGetRequest instance;

        public GetRequestBuilder() {
            this.instance = new FooGetRequest();
        }

        public FooGetRequest build() {
            return instance;
        }

        public FooGetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(FooGetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterTimeout(FooGetRequest instance) {
            return this;
        }
    }
}
