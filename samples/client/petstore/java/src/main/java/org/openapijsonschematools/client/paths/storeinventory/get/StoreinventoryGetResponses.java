package org.openapijsonschematools.client.paths.storeinventory.get;

import org.openapijsonschematools.client.paths.storeinventory.get.responses.StoreinventoryGetCode200Response;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.SuccessInlineContentAndHeaderHeadersSchema;
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

public class StoreinventoryGetResponses {
    public sealed interface EndpointResponse permits EndpointStoreinventoryGetCode200Response {}

    public record EndpointStoreinventoryGetCode200Response(
        HttpResponse<byte[]> response,
        StoreinventoryGetCode200Response.SealedResponseBody body,
        SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap headers
    ) implements EndpointResponse, ApiResponse<StoreinventoryGetCode200Response.SealedResponseBody, SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusStoreinventoryGetCode200ResponseDeserializer {}

    public static final class StatusStoreinventoryGetCode200ResponseDeserializer extends StoreinventoryGetCode200Response.StoreinventoryGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class StoreinventoryGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public StoreinventoryGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusStoreinventoryGetCode200ResponseDeserializer())
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
            StatusStoreinventoryGetCode200ResponseDeserializer castDeserializer = (StatusStoreinventoryGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointStoreinventoryGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
