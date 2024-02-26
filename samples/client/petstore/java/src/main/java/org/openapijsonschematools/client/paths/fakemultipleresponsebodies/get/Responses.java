package org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get;

import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get.responses.Code200Response;
import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get.responses.Code202Response;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode200Response, EndpointCode202Response {}

    public record EndpointCode200Response(
        HttpResponse<byte[]> response,
        Code200Response.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode202Response(
        HttpResponse<byte[]> response,
        Code202Response.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code202Response.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusCode200ResponseDeserializer, StatusCode202ResponseDeserializer {}

    public static final class StatusCode200ResponseDeserializer extends Code200Response.Code200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode202ResponseDeserializer extends Code202Response.Code202Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("202", new StatusCode202ResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer deserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (deserializer == null) {
                // todo throw ApiException and include the response in it
                throw new RuntimeException("Invalid response statusCode="+statusCode+" has no response defined in the openapi document");
            }
            if (deserializer instanceof StatusCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                // todo switch on the status code and return the endpoint class instance
                return new EndpointCode200Response(response, deserializedResponse.body());
            } else if (deserializer instanceof StatusCode202ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                // todo switch on the status code and return the endpoint class instance
                return new EndpointCode202Response(response, deserializedResponse.body());
            }
        }
    }
}
