package org.openapijsonschematools.client.paths.fakehealth.get;

import org.openapijsonschematools.client.paths.fakehealth.get.responses.FakehealthGetCode200Response;
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

public class FakehealthGetResponses {
    public sealed interface EndpointResponse permits EndpointFakehealthGetCode200Response {}

    public record EndpointFakehealthGetCode200Response(
        HttpResponse<byte[]> response,
        FakehealthGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakehealthGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakehealthGetCode200ResponseDeserializer {}

    public static final class StatusFakehealthGetCode200ResponseDeserializer extends FakehealthGetCode200Response.FakehealthGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakehealthGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakehealthGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakehealthGetCode200ResponseDeserializer())
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
            StatusFakehealthGetCode200ResponseDeserializer castDeserializer = (StatusFakehealthGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakehealthGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
