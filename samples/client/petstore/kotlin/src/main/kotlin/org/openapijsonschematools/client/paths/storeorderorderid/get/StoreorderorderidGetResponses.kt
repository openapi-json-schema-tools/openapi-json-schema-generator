package org.openapijsonschematools.client.paths.storeorderorderid.get;

import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode200Response;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode404Response;
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

public class StoreorderorderidGetResponses {
    public sealed interface EndpointResponse permits EndpointStoreorderorderidGetCode200Response {}

    public record EndpointStoreorderorderidGetCode200Response(
        HttpResponse<byte[]> response,
        StoreorderorderidGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<StoreorderorderidGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusStoreorderorderidGetCode200ResponseDeserializer, StatusStoreorderorderidGetCode400ResponseDeserializer, StatusStoreorderorderidGetCode404ResponseDeserializer {}

    public static final class StatusStoreorderorderidGetCode200ResponseDeserializer extends StoreorderorderidGetCode200Response.StoreorderorderidGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusStoreorderorderidGetCode400ResponseDeserializer extends StoreorderorderidGetCode400Response.StoreorderorderidGetCode400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusStoreorderorderidGetCode404ResponseDeserializer extends StoreorderorderidGetCode404Response.StoreorderorderidGetCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class StoreorderorderidGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public StoreorderorderidGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusStoreorderorderidGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusStoreorderorderidGetCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusStoreorderorderidGetCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusStoreorderorderidGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointStoreorderorderidGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else if (statusCodeDeserializer instanceof StatusStoreorderorderidGetCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new StoreorderorderidGetCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusStoreorderorderidGetCode404ResponseDeserializer castDeserializer = (StatusStoreorderorderidGetCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new StoreorderorderidGetCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
