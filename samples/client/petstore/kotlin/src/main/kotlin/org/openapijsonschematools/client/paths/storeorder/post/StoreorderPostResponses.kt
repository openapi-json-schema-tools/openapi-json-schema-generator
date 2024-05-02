package org.openapijsonschematools.client.paths.storeorder.post;

import org.openapijsonschematools.client.paths.storeorder.post.responses.StoreorderPostCode200Response;
import org.openapijsonschematools.client.paths.storeorder.post.responses.StoreorderPostCode400Response;
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

public class StoreorderPostResponses {
    public sealed interface EndpointResponse permits EndpointStoreorderPostCode200Response {}

    public record EndpointStoreorderPostCode200Response(
        HttpResponse<byte[]> response,
        StoreorderPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<StoreorderPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusStoreorderPostCode200ResponseDeserializer, StatusStoreorderPostCode400ResponseDeserializer {}

    public static final class StatusStoreorderPostCode200ResponseDeserializer extends StoreorderPostCode200Response.StoreorderPostCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusStoreorderPostCode400ResponseDeserializer extends StoreorderPostCode400Response.StoreorderPostCode400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class StoreorderPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public StoreorderPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusStoreorderPostCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusStoreorderPostCode400ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusStoreorderPostCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointStoreorderPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusStoreorderPostCode400ResponseDeserializer castDeserializer = (StatusStoreorderPostCode400ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new StoreorderPostCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
