package org.openapijsonschematools.client.paths.fakeredirection.get;

import org.openapijsonschematools.client.paths.fakeredirection.get.responses.FakeredirectionGetCode303Response;
import org.openapijsonschematools.client.paths.fakeredirection.get.responses.FakeredirectionGetCode3XXResponse;
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

public class FakeredirectionGetResponses {
    public sealed interface EndpointResponse permits EndpointFakeredirectionGetCode3XXResponse, EndpointFakeredirectionGetCode303Response {}

    public record EndpointFakeredirectionGetCode3XXResponse(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public record EndpointFakeredirectionGetCode303Response(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeredirectionGetCode303ResponseDeserializer {}

    public static final class StatusFakeredirectionGetCode303ResponseDeserializer extends FakeredirectionGetCode303Response.FakeredirectionGetCode303Response1 implements StatusCodeResponseDeserializer {
    }
    public sealed interface WildcardCodeResponseDeserializer permits WildcardFakeredirectionGetCode3XXResponseDeserializer {}

    public static final class WildcardFakeredirectionGetCode3XXResponseDeserializer extends FakeredirectionGetCode3XXResponse.FakeredirectionGetCode3XXResponse1 implements WildcardCodeResponseDeserializer {
    }

    public static final class FakeredirectionGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        private final Map<String, WildcardCodeResponseDeserializer> wildcardCodeToResponseDeserializer;
        public FakeredirectionGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("303", new StatusFakeredirectionGetCode303ResponseDeserializer())
            );
            this.wildcardCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("3", new WildcardFakeredirectionGetCode3XXResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer != null) {
                StatusFakeredirectionGetCode303ResponseDeserializer castDeserializer = (StatusFakeredirectionGetCode303ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointFakeredirectionGetCode303Response(response, deserializedResponse.body(), deserializedResponse.headers());
            }
            @Nullable WildcardCodeResponseDeserializer wildcardCodeDeserializer = wildcardCodeToResponseDeserializer.get(statusCode);
            if (wildcardCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            WildcardFakeredirectionGetCode3XXResponseDeserializer castDeserializer = (WildcardFakeredirectionGetCode3XXResponseDeserializer) wildcardCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            throw new FakeredirectionGetCode3XXResponse.ResponseApiException(
                "Received error statusCode response from server",
                response,
                deserializedResponse
            );
        }
    }
}
