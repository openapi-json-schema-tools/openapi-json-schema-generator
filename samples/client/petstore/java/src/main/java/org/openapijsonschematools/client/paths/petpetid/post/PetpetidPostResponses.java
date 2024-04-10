package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.paths.petpetid.post.responses.PetpetidPostCode405Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class PetpetidPostResponses {

    public sealed interface StatusCodeResponseDeserializer permits StatusPetpetidPostCode405ResponseDeserializer {}

    public static final class StatusPetpetidPostCode405ResponseDeserializer extends PetpetidPostCode405Response.PetpetidPostCode405Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetpetidPostResponses1 implements ResponsesDeserializer<Void> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetpetidPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("405", new StatusPetpetidPostCode405ResponseDeserializer())
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
            StatusPetpetidPostCode405ResponseDeserializer castDeserializer = (StatusPetpetidPostCode405ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            throw new PetpetidPostCode405Response.ResponseApiException(
                "Received error statusCode response from server",
                response,
                deserializedResponse
            );
        }
    }
}
