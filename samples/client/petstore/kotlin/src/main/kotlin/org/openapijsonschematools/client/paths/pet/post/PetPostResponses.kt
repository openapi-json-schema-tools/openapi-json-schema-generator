package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.paths.pet.post.responses.PetPostCode200Response;
import org.openapijsonschematools.client.paths.pet.post.responses.PetPostCode405Response;
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

public class PetPostResponses {
    public sealed interface EndpointResponse permits EndpointPetPostCode200Response {}

    public record EndpointPetPostCode200Response(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusPetPostCode200ResponseDeserializer, StatusPetPostCode405ResponseDeserializer {}

    public static final class StatusPetPostCode200ResponseDeserializer extends PetPostCode200Response.PetPostCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusPetPostCode405ResponseDeserializer extends PetPostCode405Response.PetPostCode405Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusPetPostCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("405", new StatusPetPostCode405ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusPetPostCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointPetPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusPetPostCode405ResponseDeserializer castDeserializer = (StatusPetPostCode405ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new PetPostCode405Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
