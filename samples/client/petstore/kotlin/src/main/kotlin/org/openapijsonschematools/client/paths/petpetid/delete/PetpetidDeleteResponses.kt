package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.paths.petpetid.delete.responses.PetpetidDeleteCode400Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class PetpetidDeleteResponses {

    public sealed interface StatusCodeResponseDeserializer permits StatusPetpetidDeleteCode400ResponseDeserializer {}

    public static final class StatusPetpetidDeleteCode400ResponseDeserializer extends PetpetidDeleteCode400Response.PetpetidDeleteCode400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetpetidDeleteResponses1 implements ResponsesDeserializer<Nothing?> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetpetidDeleteResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusPetpetidDeleteCode400ResponseDeserializer())
            );
        }

        public Nothing? deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            StatusPetpetidDeleteCode400ResponseDeserializer castDeserializer = (StatusPetpetidDeleteCode400ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            throw new PetpetidDeleteCode400Response.ResponseApiException(
                "Received error statusCode response from server",
                response,
                deserializedResponse
            );
        }
    }
}
