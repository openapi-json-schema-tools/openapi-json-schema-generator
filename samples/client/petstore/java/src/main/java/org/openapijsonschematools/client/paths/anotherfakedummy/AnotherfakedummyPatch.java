package org.openapijsonschematools.client.paths.anotherfakedummy;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.AnotherfakedummyPatchRequestBody;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.Responses;
import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.paths.Anotherfakedummy;

import java.io.IOException;
import java.util.ArrayList;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class AnotherfakedummyPatch {
    private static class PatchProvider {
        private static final String method = "patch";

        public static Responses.EndpointResponse patch(
            PatchRequest request,
            ApiConfiguration apiConfiguration,
            SchemaConfiguration schemaConfiguration,
            HttpClient client
        ) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            SerializedRequestBody serializedRequestBody = new AnotherfakedummyPatchRequestBody.AnotherfakedummyPatchRequestBody1().serialize(
                request.requestBody
            );
            var contentTypeHeaderValues = headers.getOrDefault("Content-Type", new ArrayList<>());
            contentTypeHeaderValues.add(serializedRequestBody.contentType);
            HttpRequest.BodyPublisher bodyPublisher = serializedRequestBody.bodyPublisher;
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();

            String url = host + Anotherfakedummy.path;
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

    public interface PatchOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse patch(PatchRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PatchProvider.patch(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public interface Model123TestSpecialTagsOperation {
        ApiConfiguration getApiConfiguration();
        SchemaConfiguration getSchemaConfiguration();
        HttpClient getClient();
        default Responses.EndpointResponse model123TestSpecialTags(PatchRequest request) throws IOException, InterruptedException, ValidationException, NotImplementedException, ApiException {
            return PatchProvider.patch(request, getApiConfiguration(), getSchemaConfiguration(), getClient());
        }
    }

    public static class Patch extends ApiClient implements PatchOperation {
        public Patch(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }
    }

    public static class PatchRequest {
        public AnotherfakedummyPatchRequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;

        public PatchRequest(
            AnotherfakedummyPatchRequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            @Nullable Duration timeout
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.timeout = timeout;
        }
    }

    public static class PatchNullableRequest {
        public AnotherfakedummyPatchRequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public @Nullable Duration timeout;
    }

    public interface SetterForServerIndex <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterServerIndex(PatchNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForTimeout <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterTimeout(PatchNullableRequest instance);
        default T timeout(Duration timeout) {
            var instance = getInstance();
            instance.timeout = timeout;
            return getBuilderAfterTimeout(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterRequestBody(PatchNullableRequest instance);
        default T requestBody(AnotherfakedummyPatchRequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Patch0RequestBuilder implements SetterForServerIndex<Patch0RequestBuilder>, SetterForTimeout<Patch0RequestBuilder> {
        private final PatchNullableRequest instance;

        public Patch0RequestBuilder(PatchNullableRequest instance) {
            this.instance = instance;
        }

        public PatchRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PatchRequest(
                requestBody,
                instance.serverIndex,
                instance.timeout
            );
        }

        public PatchNullableRequest getInstance() {
            return instance;
        }

        public Patch0RequestBuilder getBuilderAfterServerIndex(PatchNullableRequest instance) {
            return this;
        }

        public Patch0RequestBuilder getBuilderAfterTimeout(PatchNullableRequest instance) {
            return this;
        }
    }
    public static class PatchRequestBuilder implements SetterForRequestBody<Patch0RequestBuilder> {
        private final PatchNullableRequest instance;

        public PatchRequestBuilder() {
            this.instance = new PatchNullableRequest();
        }

        public PatchNullableRequest getInstance() {
            return instance;
        }

        public Patch0RequestBuilder getBuilderAfterRequestBody(PatchNullableRequest instance) {
            return new Patch0RequestBuilder(instance);
        }
    }
}
