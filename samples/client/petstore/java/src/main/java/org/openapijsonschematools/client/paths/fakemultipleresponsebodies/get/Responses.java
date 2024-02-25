package org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get;

import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get.responses.Code200Response;
import org.openapijsonschematools.client.paths.fakemultipleresponsebodies.get.responses.Code202Response;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

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

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
