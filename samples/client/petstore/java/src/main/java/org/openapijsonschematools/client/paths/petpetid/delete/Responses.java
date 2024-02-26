package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.paths.petpetid.delete.responses.Code400Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {

    public sealed interface StatusCodeResponseDeserializer permits StatusCode400ResponseDeserializer {}

    public static final class StatusCode400ResponseDeserializer extends Code400Response.Code400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusCode400ResponseDeserializer())
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
            StatusCode400ResponseDeserializer castDeserializer = (StatusCode400ResponseDeserializer) deserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointCode400Response(response, deserializedResponse.body());
        }
    }
}
