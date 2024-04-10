package org.openapijsonschematools.client.paths.fakeinlinecomposition.post;

import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.FakeinlinecompositionPostCode200Response;
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

public class FakeinlinecompositionPostResponses {
    public sealed interface EndpointResponse permits EndpointFakeinlinecompositionPostCode200Response {}

    public record EndpointFakeinlinecompositionPostCode200Response(
        HttpResponse<byte[]> response,
        FakeinlinecompositionPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakeinlinecompositionPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeinlinecompositionPostCode200ResponseDeserializer {}

    public static final class StatusFakeinlinecompositionPostCode200ResponseDeserializer extends FakeinlinecompositionPostCode200Response.FakeinlinecompositionPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeinlinecompositionPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeinlinecompositionPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeinlinecompositionPostCode200ResponseDeserializer())
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
            StatusFakeinlinecompositionPostCode200ResponseDeserializer castDeserializer = (StatusFakeinlinecompositionPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeinlinecompositionPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
