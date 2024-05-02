package org.openapijsonschematools.client.paths.fakerefsarrayofenums.post;

import org.openapijsonschematools.client.paths.fakerefsarrayofenums.post.responses.FakerefsarrayofenumsPostCode200Response;
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

public class FakerefsarrayofenumsPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsarrayofenumsPostCode200Response {}

    public record EndpointFakerefsarrayofenumsPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsarrayofenumsPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakerefsarrayofenumsPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsarrayofenumsPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsarrayofenumsPostCode200ResponseDeserializer extends FakerefsarrayofenumsPostCode200Response.FakerefsarrayofenumsPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsarrayofenumsPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsarrayofenumsPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsarrayofenumsPostCode200ResponseDeserializer())
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
            StatusFakerefsarrayofenumsPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsarrayofenumsPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsarrayofenumsPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
