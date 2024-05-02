package org.openapijsonschematools.client.paths.anotherfakedummy.patch;

import org.openapijsonschematools.client.paths.anotherfakedummy.patch.responses.AnotherfakedummyPatchCode200Response;
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

public class AnotherfakedummyPatchResponses {
    public sealed interface EndpointResponse permits EndpointAnotherfakedummyPatchCode200Response {}

    public record EndpointAnotherfakedummyPatchCode200Response(
        HttpResponse<byte[]> response,
        AnotherfakedummyPatchCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<AnotherfakedummyPatchCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusAnotherfakedummyPatchCode200ResponseDeserializer {}

    public static final class StatusAnotherfakedummyPatchCode200ResponseDeserializer extends AnotherfakedummyPatchCode200Response.AnotherfakedummyPatchCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class AnotherfakedummyPatchResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public AnotherfakedummyPatchResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusAnotherfakedummyPatchCode200ResponseDeserializer())
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
            StatusAnotherfakedummyPatchCode200ResponseDeserializer castDeserializer = (StatusAnotherfakedummyPatchCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointAnotherfakedummyPatchCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
