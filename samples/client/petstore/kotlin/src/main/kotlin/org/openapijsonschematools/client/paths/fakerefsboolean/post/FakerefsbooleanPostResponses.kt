package org.openapijsonschematools.client.paths.fakerefsboolean.post;

import org.openapijsonschematools.client.paths.fakerefsboolean.post.responses.FakerefsbooleanPostCode200Response;
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

public class FakerefsbooleanPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsbooleanPostCode200Response {}

    public record EndpointFakerefsbooleanPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsbooleanPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakerefsbooleanPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsbooleanPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsbooleanPostCode200ResponseDeserializer extends FakerefsbooleanPostCode200Response.FakerefsbooleanPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsbooleanPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsbooleanPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsbooleanPostCode200ResponseDeserializer())
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
            StatusFakerefsbooleanPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsbooleanPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsbooleanPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
