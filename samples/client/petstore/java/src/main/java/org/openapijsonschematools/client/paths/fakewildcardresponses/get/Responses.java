package org.openapijsonschematools.client.paths.fakewildcardresponses.get;

import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code1XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code200Response;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code2XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code3XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code4XXResponse;
import org.openapijsonschematools.client.paths.fakewildcardresponses.get.responses.Code5XXResponse;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode1XXResponse, EndpointCode200Response, EndpointCode2XXResponse, EndpointCode3XXResponse, EndpointCode4XXResponse, EndpointCode5XXResponse {}

    public record EndpointCode1XXResponse(
        HttpResponse<byte[]> response,
        Code1XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code1XXResponse.SealedResponseBody, Void>{
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

    public record EndpointCode2XXResponse(
        HttpResponse<byte[]> response,
        Code2XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code2XXResponse.SealedResponseBody, Void>{
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

    public record EndpointCode4XXResponse(
        HttpResponse<byte[]> response,
        Code4XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code4XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode5XXResponse(
        HttpResponse<byte[]> response,
        Code5XXResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code5XXResponse.SealedResponseBody, Void>{
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

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
