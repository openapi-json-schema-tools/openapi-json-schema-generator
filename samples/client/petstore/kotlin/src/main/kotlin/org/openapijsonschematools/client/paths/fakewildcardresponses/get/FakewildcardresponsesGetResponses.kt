package org.openapijsonschematools.client.paths.fakewildcardresponses.get;

import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.FakewildcardresponsesGetCode1XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.FakewildcardresponsesGetCode200Response;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.FakewildcardresponsesGetCode2XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.FakewildcardresponsesGetCode3XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.FakewildcardresponsesGetCode4XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.FakewildcardresponsesGetCode5XXResponse;
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

public class FakewildcardresponsesGetResponses {
    public sealed interface EndpointResponse permits EndpointFakewildcardresponsesGetCode1XXResponse, EndpointFakewildcardresponsesGetCode2XXResponse, EndpointFakewildcardresponsesGetCode200Response, EndpointFakewildcardresponsesGetCode3XXResponse {}

    public record EndpointFakewildcardresponsesGetCode1XXResponse(
        HttpResponse<byte[]> response,
        FakewildcardresponsesGetCode1XXResponse.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode1XXResponse.SealedResponseBody, Nothing?>{
    }

    public record EndpointFakewildcardresponsesGetCode2XXResponse(
        HttpResponse<byte[]> response,
        FakewildcardresponsesGetCode2XXResponse.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode2XXResponse.SealedResponseBody, Nothing?>{
    }

    public record EndpointFakewildcardresponsesGetCode200Response(
        HttpResponse<byte[]> response,
        FakewildcardresponsesGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public record EndpointFakewildcardresponsesGetCode3XXResponse(
        HttpResponse<byte[]> response,
        FakewildcardresponsesGetCode3XXResponse.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode3XXResponse.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakewildcardresponsesGetCode200ResponseDeserializer {}

    public static final class StatusFakewildcardresponsesGetCode200ResponseDeserializer extends FakewildcardresponsesGetCode200Response.FakewildcardresponsesGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public sealed interface WildcardCodeResponseDeserializer permits WildcardFakewildcardresponsesGetCode1XXResponseDeserializer, WildcardFakewildcardresponsesGetCode2XXResponseDeserializer, WildcardFakewildcardresponsesGetCode3XXResponseDeserializer, WildcardFakewildcardresponsesGetCode4XXResponseDeserializer, WildcardFakewildcardresponsesGetCode5XXResponseDeserializer {}

    public static final class WildcardFakewildcardresponsesGetCode1XXResponseDeserializer extends FakewildcardresponsesGetCode1XXResponse.FakewildcardresponsesGetCode1XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardFakewildcardresponsesGetCode2XXResponseDeserializer extends FakewildcardresponsesGetCode2XXResponse.FakewildcardresponsesGetCode2XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardFakewildcardresponsesGetCode3XXResponseDeserializer extends FakewildcardresponsesGetCode3XXResponse.FakewildcardresponsesGetCode3XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardFakewildcardresponsesGetCode4XXResponseDeserializer extends FakewildcardresponsesGetCode4XXResponse.FakewildcardresponsesGetCode4XXResponse1 implements WildcardCodeResponseDeserializer {
    }
    public static final class WildcardFakewildcardresponsesGetCode5XXResponseDeserializer extends FakewildcardresponsesGetCode5XXResponse.FakewildcardresponsesGetCode5XXResponse1 implements WildcardCodeResponseDeserializer {
    }

    public static final class FakewildcardresponsesGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        private final Map<String, WildcardCodeResponseDeserializer> wildcardCodeToResponseDeserializer;
        public FakewildcardresponsesGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakewildcardresponsesGetCode200ResponseDeserializer())
            );
            this.wildcardCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("1", new WildcardFakewildcardresponsesGetCode1XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("2", new WildcardFakewildcardresponsesGetCode2XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("3", new WildcardFakewildcardresponsesGetCode3XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("4", new WildcardFakewildcardresponsesGetCode4XXResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("5", new WildcardFakewildcardresponsesGetCode5XXResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer != null) {
                StatusFakewildcardresponsesGetCode200ResponseDeserializer castDeserializer = (StatusFakewildcardresponsesGetCode200ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointFakewildcardresponsesGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            }
            @Nullable WildcardCodeResponseDeserializer wildcardCodeDeserializer = wildcardCodeToResponseDeserializer.get(statusCode);
            if (wildcardCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (wildcardCodeDeserializer instanceof WildcardFakewildcardresponsesGetCode1XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakewildcardresponsesGetCode1XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else if (wildcardCodeDeserializer instanceof WildcardFakewildcardresponsesGetCode2XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakewildcardresponsesGetCode2XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else if (wildcardCodeDeserializer instanceof WildcardFakewildcardresponsesGetCode3XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakewildcardresponsesGetCode3XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else if (wildcardCodeDeserializer instanceof WildcardFakewildcardresponsesGetCode4XXResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakewildcardresponsesGetCode4XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                WildcardFakewildcardresponsesGetCode5XXResponseDeserializer castDeserializer = (WildcardFakewildcardresponsesGetCode5XXResponseDeserializer) wildcardCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakewildcardresponsesGetCode5XXResponse.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
