package org.openapijsonschematools.client.paths.userusername.get;

import org.openapijsonschematools.client.paths.userusername.get.responses.Code200Response;
import org.openapijsonschematools.client.paths.userusername.get.responses.Code400Response;
import org.openapijsonschematools.client.paths.userusername.get.responses.Code404Response;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode200Response, EndpointCode400Response, EndpointCode404Response {}

    public record EndpointCode200Response(
        HttpResponse<byte[]> response,
        Code200Response.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCode400Response(
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

    public record EndpointCode404Response(
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

    public sealed interface StatusCodeResponseDeserializer permits StatusCode200ResponseDeserializer, StatusCode400ResponseDeserializer, StatusCode404ResponseDeserializer {}

    public static final class StatusCode200ResponseDeserializer extends Code200Response.Code200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode400ResponseDeserializer extends Code400Response.Code400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode404ResponseDeserializer extends Code404Response.Code404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
