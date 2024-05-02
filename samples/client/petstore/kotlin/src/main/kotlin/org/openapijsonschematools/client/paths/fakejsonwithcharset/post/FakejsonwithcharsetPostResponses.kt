package org.openapijsonschematools.client.paths.fakejsonwithcharset.post;

import org.openapijsonschematools.client.paths.fakejsonwithcharset.post.responses.FakejsonwithcharsetPostCode200Response;
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

public class FakejsonwithcharsetPostResponses {
    public sealed interface EndpointResponse permits EndpointFakejsonwithcharsetPostCode200Response {}

    public record EndpointFakejsonwithcharsetPostCode200Response(
        HttpResponse<byte[]> response,
        FakejsonwithcharsetPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakejsonwithcharsetPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakejsonwithcharsetPostCode200ResponseDeserializer {}

    public static final class StatusFakejsonwithcharsetPostCode200ResponseDeserializer extends FakejsonwithcharsetPostCode200Response.FakejsonwithcharsetPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakejsonwithcharsetPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakejsonwithcharsetPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakejsonwithcharsetPostCode200ResponseDeserializer())
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
            StatusFakejsonwithcharsetPostCode200ResponseDeserializer castDeserializer = (StatusFakejsonwithcharsetPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakejsonwithcharsetPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
