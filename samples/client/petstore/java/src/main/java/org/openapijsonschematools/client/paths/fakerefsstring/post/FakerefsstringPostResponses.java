package org.openapijsonschematools.client.paths.fakerefsstring.post;

import org.openapijsonschematools.client.paths.fakerefsstring.post.responses.FakerefsstringPostCode200Response;
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

public class FakerefsstringPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsstringPostCode200Response {}

    public record EndpointFakerefsstringPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsstringPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakerefsstringPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsstringPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsstringPostCode200ResponseDeserializer extends FakerefsstringPostCode200Response.FakerefsstringPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsstringPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsstringPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsstringPostCode200ResponseDeserializer())
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
            StatusFakerefsstringPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsstringPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsstringPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
