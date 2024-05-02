package org.openapijsonschematools.client.paths.fakerefsmammal.post;

import org.openapijsonschematools.client.paths.fakerefsmammal.post.responses.FakerefsmammalPostCode200Response;
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

public class FakerefsmammalPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsmammalPostCode200Response {}

    public record EndpointFakerefsmammalPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsmammalPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakerefsmammalPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsmammalPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsmammalPostCode200ResponseDeserializer extends FakerefsmammalPostCode200Response.FakerefsmammalPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsmammalPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsmammalPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsmammalPostCode200ResponseDeserializer())
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
            StatusFakerefsmammalPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsmammalPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsmammalPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
