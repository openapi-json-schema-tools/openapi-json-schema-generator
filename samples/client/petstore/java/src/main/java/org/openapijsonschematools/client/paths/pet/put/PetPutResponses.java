package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.paths.pet.put.responses.PetPutCode400Response;
import org.openapijsonschematools.client.paths.pet.put.responses.PetPutCode404Response;
import org.openapijsonschematools.client.paths.pet.put.responses.PetPutCode405Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class PetPutResponses {

    public sealed interface StatusCodeResponseDeserializer permits StatusPetPutCode400ResponseDeserializer, StatusPetPutCode404ResponseDeserializer, StatusPetPutCode405ResponseDeserializer {}

    public static final class StatusPetPutCode400ResponseDeserializer extends PetPutCode400Response.PetPutCode400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetPutCode404ResponseDeserializer extends PetPutCode404Response.PetPutCode404Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetPutCode405ResponseDeserializer extends PetPutCode405Response.PetPutCode405Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetPutResponses1 implements ResponsesDeserializer<Void> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetPutResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusPetPutCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusPetPutCode404ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("405", new StatusPetPutCode405ResponseDeserializer())
            );
        }

        public Void deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (statusCodeDeserializer instanceof StatusPetPutCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetPutCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else if (statusCodeDeserializer instanceof StatusPetPutCode404ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetPutCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusPetPutCode405ResponseDeserializer castDeserializer = (StatusPetPutCode405ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetPutCode405Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
