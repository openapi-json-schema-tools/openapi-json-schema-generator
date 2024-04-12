package org.openapijsonschematools.client.paths.petpetiduploadimage.post;

import org.openapijsonschematools.client.paths.petpetiduploadimage.post.responses.PetpetiduploadimagePostCode200Response;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.SuccessWithJsonApiResponseHeadersSchema;
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

public class PetpetiduploadimagePostResponses {
    public sealed interface EndpointResponse permits EndpointPetpetiduploadimagePostCode200Response {}

    public record EndpointPetpetiduploadimagePostCode200Response(
        HttpResponse<byte[]> response,
        PetpetiduploadimagePostCode200Response.SealedResponseBody body,
        SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap headers
    ) implements EndpointResponse, ApiResponse<PetpetiduploadimagePostCode200Response.SealedResponseBody, SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusPetpetiduploadimagePostCode200ResponseDeserializer {}

    public static final class StatusPetpetiduploadimagePostCode200ResponseDeserializer extends PetpetiduploadimagePostCode200Response.PetpetiduploadimagePostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class PetpetiduploadimagePostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public PetpetiduploadimagePostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusPetpetiduploadimagePostCode200ResponseDeserializer())
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
            StatusPetpetiduploadimagePostCode200ResponseDeserializer castDeserializer = (StatusPetpetiduploadimagePostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointPetpetiduploadimagePostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
