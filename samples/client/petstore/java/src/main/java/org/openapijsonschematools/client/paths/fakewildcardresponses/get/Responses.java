package org.openapijsonschematools.client.paths.fakewildcardresponses.get;

import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code1XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code200Response;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code2XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code3XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code4XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code5XXResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode1XXResponse, EndpointCode2XXResponse, EndpointCode200Response, EndpointCode3XXResponse {}

    public record EndpointCode1XXResponse(
        HttpResponse<byte[]> response,
        Code1XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code1XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode2XXResponse(
        HttpResponse<byte[]> response,
        Code2XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code2XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode200Response(
        HttpResponse<byte[]> response,
        Code200Response.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode3XXResponse(
        HttpResponse<byte[]> response,
        Code3XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code3XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusCode200ResponseDeserializer {}

    public static final class StatusCode200ResponseDeserializer extends Code200Response.Code200Response1 implements StatusCodeResponseDeserializer {
    }
    public sealed interface WildcardCodeResponseDeserializer permits WildcardCode1XXResponseDeserializer, WildcardCode2XXResponseDeserializer, WildcardCode3XXResponseDeserializer, WildcardCode4XXResponseDeserializer, WildcardCode5XXResponseDeserializer {}

    public static final class WildcardCode1XXResponseDeserializer extends Code1XXResponse.Code1XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardCode2XXResponseDeserializer extends Code2XXResponse.Code2XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardCode3XXResponseDeserializer extends Code3XXResponse.Code3XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardCode4XXResponseDeserializer extends Code4XXResponse.Code4XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardCode5XXResponseDeserializer extends Code5XXResponse.Code5XXResponse1 implements WildcardCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        private final Map<String, WildcardCodeResponseDeserializer> wildcardCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusCode200ResponseDeserializer())
            );
            this.wildcardCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("1", new WildcardCode1XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("2", new WildcardCode2XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("3", new WildcardCode3XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("4", new WildcardCode4XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("5", new WildcardCode5XXResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer != null) {
                StatusCode200ResponseDeserializer castDeserializer = (StatusCode200ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode200Response(response, deserializedResponse.body());
            }
            @Nullable WildcardCodeResponseDeserializer wildcardCodeDeserializer = wildcardCodeToResponseDeserializer.get(statusCode);
            if (wildcardCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (wildcardCodeDeserializer instanceof WildcardCode1XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode1XXResponse(response, deserializedResponse.body());
            } else if (wildcardCodeDeserializer instanceof WildcardCode2XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode2XXResponse(response, deserializedResponse.body());
            } else if (wildcardCodeDeserializer instanceof WildcardCode3XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode3XXResponse(response, deserializedResponse.body());
            } else if (wildcardCodeDeserializer instanceof WildcardCode4XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code4XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                WildcardCode5XXResponseDeserializer castDeserializer = (WildcardCode5XXResponseDeserializer) wildcardCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code5XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
