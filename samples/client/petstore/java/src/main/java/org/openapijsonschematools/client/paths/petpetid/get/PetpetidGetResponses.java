package org.openapijsonschematools.client.paths.petpetid.get;

import org.openapijsonschematools.client.paths.petpetid.get.responses.PetpetidGetCode200Response;
import org.openapijsonschematools.client.paths.petpetid.get.responses.PetpetidGetCode400Response;
import org.openapijsonschematools.client.paths.petpetid.get.responses.PetpetidGetCode404Response;
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

public class PetpetidGetResponses {
    public sealed interface EndpointResponse permits EndpointPetpetidGetCode200Response {}

    public record EndpointPetpetidGetCode200Response(
        HttpResponse<byte[]> response,
        PetpetidGetCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<PetpetidGetCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusPetpetidGetCode200ResponseDeserializer, StatusPetpetidGetCode400ResponseDeserializer, StatusPetpetidGetCode404ResponseDeserializer {}

    public static final class StatusPetpetidGetCode200ResponseDeserializer extends PetpetidGetCode200Response.PetpetidGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetpetidGetCode400ResponseDeserializer extends PetpetidGetCode400Response.PetpetidGetCode400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetpetidGetCode404ResponseDeserializer extends PetpetidGetCode404Response.PetpetidGetCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetpetidGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetpetidGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusPetpetidGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusPetpetidGetCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusPetpetidGetCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusPetpetidGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointPetpetidGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else if (statusCodeDeserializer instanceof StatusPetpetidGetCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetpetidGetCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusPetpetidGetCode404ResponseDeserializer castDeserializer = (StatusPetpetidGetCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetpetidGetCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
