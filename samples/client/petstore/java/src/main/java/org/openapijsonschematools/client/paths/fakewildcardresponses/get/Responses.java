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
    public sealed interface SealedEndpointResponse permits EndpointCode1XXResponse, EndpointCode200Response, EndpointCode2XXResponse, EndpointCode3XXResponse, EndpointCode4XXResponse, EndpointCode5XXResponse {}

    public record EndpointCode1XXResponse(
        HttpResponse<byte[]> response,
        Code1XXResponse.SealedResponseBody body
    ) implements SealedEndpointResponse, ApiResponse<Code1XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode200Response(
        HttpResponse<byte[]> response,
        Code200Response.SealedResponseBody body
    ) implements SealedEndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode2XXResponse(
        HttpResponse<byte[]> response,
        Code2XXResponse.SealedResponseBody body
    ) implements SealedEndpointResponse, ApiResponse<Code2XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode3XXResponse(
        HttpResponse<byte[]> response,
        Code3XXResponse.SealedResponseBody body
    ) implements SealedEndpointResponse, ApiResponse<Code3XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode4XXResponse(
        HttpResponse<byte[]> response,
        Code4XXResponse.SealedResponseBody body
    ) implements SealedEndpointResponse, ApiResponse<Code4XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode5XXResponse(
        HttpResponse<byte[]> response,
        Code5XXResponse.SealedResponseBody body
    ) implements SealedEndpointResponse, ApiResponse<Code5XXResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    // seal the defined status codes into extended response classes
    // seal the wildcard status codes into extended response classes
    // pass them as map inputs into the below Responses1

    public static class Responses1 implements ResponsesDeserializer<SealedEndpointResponse> {

        public SealedEndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
