package org.openapijsonschematools.client.paths.fakeclassnametest.patch;

import org.openapijsonschematools.client.paths.fakeclassnametest.patch.responses.FakeclassnametestPatchCode200Response;
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

public class FakeclassnametestPatchResponses {
    public sealed interface EndpointResponse permits EndpointFakeclassnametestPatchCode200Response {}

    public record EndpointFakeclassnametestPatchCode200Response(
        HttpResponse<byte[]> response,
        FakeclassnametestPatchCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakeclassnametestPatchCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeclassnametestPatchCode200ResponseDeserializer {}

    public static final class StatusFakeclassnametestPatchCode200ResponseDeserializer extends FakeclassnametestPatchCode200Response.FakeclassnametestPatchCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeclassnametestPatchResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeclassnametestPatchResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeclassnametestPatchCode200ResponseDeserializer())
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
            StatusFakeclassnametestPatchCode200ResponseDeserializer castDeserializer = (StatusFakeclassnametestPatchCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeclassnametestPatchCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
