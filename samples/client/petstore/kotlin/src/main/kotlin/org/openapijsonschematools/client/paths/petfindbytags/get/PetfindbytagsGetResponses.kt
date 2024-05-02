package org.openapijsonschematools.client.paths.petfindbytags.get;

import org.openapijsonschematools.client.paths.petfindbytags.get.responses.PetfindbytagsGetCode200Response;
import org.openapijsonschematools.client.paths.petfindbytags.get.responses.PetfindbytagsGetCode400Response;
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

public class PetfindbytagsGetResponses {
    public sealed interface EndpointResponse permits EndpointPetfindbytagsGetCode200Response {}

    public record EndpointPetfindbytagsGetCode200Response(
        HttpResponse<byte[]> response,
        PetfindbytagsGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<PetfindbytagsGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusPetfindbytagsGetCode200ResponseDeserializer, StatusPetfindbytagsGetCode400ResponseDeserializer {}

    public static final class StatusPetfindbytagsGetCode200ResponseDeserializer extends PetfindbytagsGetCode200Response.PetfindbytagsGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetfindbytagsGetCode400ResponseDeserializer extends PetfindbytagsGetCode400Response.PetfindbytagsGetCode400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetfindbytagsGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetfindbytagsGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusPetfindbytagsGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusPetfindbytagsGetCode400ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusPetfindbytagsGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointPetfindbytagsGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusPetfindbytagsGetCode400ResponseDeserializer castDeserializer = (StatusPetfindbytagsGetCode400ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetfindbytagsGetCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
