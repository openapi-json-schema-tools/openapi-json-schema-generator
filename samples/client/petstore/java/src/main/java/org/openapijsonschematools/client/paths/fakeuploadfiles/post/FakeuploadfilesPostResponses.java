package org.openapijsonschematools.client.paths.fakeuploadfiles.post;

import org.openapijsonschematools.client.paths.fakeuploadfiles.post.responses.FakeuploadfilesPostCode200Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class FakeuploadfilesPostResponses {
    public sealed interface EndpointResponse permits EndpointFakeuploadfilesPostCode200Response {}

    public record EndpointFakeuploadfilesPostCode200Response(
        HttpResponse<byte[]> response,
        FakeuploadfilesPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakeuploadfilesPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeuploadfilesPostCode200ResponseDeserializer {}

    public static final class StatusFakeuploadfilesPostCode200ResponseDeserializer extends FakeuploadfilesPostCode200Response.FakeuploadfilesPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeuploadfilesPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeuploadfilesPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeuploadfilesPostCode200ResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            StatusFakeuploadfilesPostCode200ResponseDeserializer castDeserializer = (StatusFakeuploadfilesPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeuploadfilesPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
