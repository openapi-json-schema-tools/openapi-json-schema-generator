package org.openapijsonschematools.client.paths.userusername.put;

import org.openapijsonschematools.client.paths.userusername.put.responses.Code400Response;
import org.openapijsonschematools.client.paths.userusername.put.responses.Code404Response;
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
                // todo throw ApiException and include the response in it
                throw new RuntimeException("Invalid response statusCode="+statusCode+" has no response defined in the openapi document");
            }
            if (deserializer instanceof StatusCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                // todo switch on the status code and return the endpoint class instance
                return new EndpointCode400Response(response, deserializedResponse.body());
            } else if (deserializer instanceof StatusCode404ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                // todo switch on the status code and return the endpoint class instance
                return new EndpointCode404Response(response, deserializedResponse.body());
            }
        }
    }
}
