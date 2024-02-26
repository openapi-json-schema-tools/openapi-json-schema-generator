package org.openapijsonschematools.client.paths.pet.post;

import org.openapijsonschematools.client.paths.pet.post.responses.Code200Response;
import org.openapijsonschematools.client.paths.pet.post.responses.Code405Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode200Response {}

    public record EndpointCode200Response(
        HttpResponse<byte[]> response
        
    ) implements EndpointResponse, ApiResponse<Void, Void>{
        @Override
        public Void body() {
            return null;
        }
        @Override
        public Void headers() {
            return null;
        }
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusCode200ResponseDeserializer, StatusCode405ResponseDeserializer {}

    public static final class StatusCode200ResponseDeserializer extends Code200Response.Code200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode405ResponseDeserializer extends Code405Response.Code405Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("405", new StatusCode405ResponseDeserializer())
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
            if (deserializer instanceof StatusCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode200Response(response, deserializedResponse.body());
            } else if (deserializer instanceof StatusCode405ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code405Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
