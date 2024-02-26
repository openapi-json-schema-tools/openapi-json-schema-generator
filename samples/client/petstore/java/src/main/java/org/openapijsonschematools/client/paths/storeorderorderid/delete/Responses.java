package org.openapijsonschematools.client.paths.storeorderorderid.delete;

import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.Code400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.Code404Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {

    public sealed interface StatusCodeResponseDeserializer permits StatusCode400ResponseDeserializer, StatusCode404ResponseDeserializer {}

    public static final class StatusCode400ResponseDeserializer extends Code400Response.Code400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode404ResponseDeserializer extends Code404Response.Code404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusCode404ResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer deserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (deserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (deserializer instanceof StatusCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new Code400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else if (deserializer instanceof StatusCode404ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new Code404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
