package org.openapijsonschematools.client.paths.petfindbystatus.get;

import org.openapijsonschematools.client.paths.petfindbystatus.get.responses.PetfindbystatusGetCode200Response;
import org.openapijsonschematools.client.paths.petfindbystatus.get.responses.PetfindbystatusGetCode400Response;
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

public class PetfindbystatusGetResponses {
    public sealed interface EndpointResponse permits EndpointPetfindbystatusGetCode200Response {}

    public record EndpointPetfindbystatusGetCode200Response(
        HttpResponse<byte[]> response,
        PetfindbystatusGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<PetfindbystatusGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusPetfindbystatusGetCode200ResponseDeserializer, StatusPetfindbystatusGetCode400ResponseDeserializer {}

    public static final class StatusPetfindbystatusGetCode200ResponseDeserializer extends PetfindbystatusGetCode200Response.PetfindbystatusGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetfindbystatusGetCode400ResponseDeserializer extends PetfindbystatusGetCode400Response.PetfindbystatusGetCode400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetfindbystatusGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetfindbystatusGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusPetfindbystatusGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusPetfindbystatusGetCode400ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusPetfindbystatusGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointPetfindbystatusGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusPetfindbystatusGetCode400ResponseDeserializer castDeserializer = (StatusPetfindbystatusGetCode400ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetfindbystatusGetCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
