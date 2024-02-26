package org.openapijsonschematools.client.paths.fakeredirection.get;

import org.openapijsonschematools.client.paths.fakeredirection.get.responses.Code303Response;
import org.openapijsonschematools.client.paths.fakeredirection.get.responses.Code3XXResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode3XXResponse, EndpointCode303Response {}

    public record EndpointCode3XXResponse(
        HttpResponse<byte[]> response,
        Void body
    ) implements EndpointResponse, ApiResponse<Void, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode303Response(
        HttpResponse<byte[]> response,
        Void body
    ) implements EndpointResponse, ApiResponse<Void, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusCode303ResponseDeserializer {}

    public static final class StatusCode303ResponseDeserializer extends Code303Response.Code303Response1 implements StatusCodeResponseDeserializer {
    }
    public sealed interface WildcardCodeResponseDeserializer permits WildcardCode3XXResponseDeserializer {}

    public static final class WildcardCode3XXResponseDeserializer extends Code3XXResponse.Code3XXResponse1 implements WildcardCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        private final Map<String, WildcardCodeResponseDeserializer> wildcardCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("303", new StatusCode303ResponseDeserializer())
            );
            this.wildcardCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("3", new WildcardCode3XXResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer != null) {
                StatusCode303ResponseDeserializer castDeserializer = (StatusCode303ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode303Response(response, deserializedResponse.body());
            }
            @Nullable WildcardCodeResponseDeserializer wildcardCodeDeserializer = wildcardCodeToResponseDeserializer.get(statusCode);
            if (wildcardCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            WildcardCode3XXResponseDeserializer castDeserializer = (WildcardCode3XXResponseDeserializer) wildcardCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            throw new Code3XXResponse.ResponseApiException(
                "Received error statusCode response from server",
                response,
                deserializedResponse
            );
        }
    }
}
