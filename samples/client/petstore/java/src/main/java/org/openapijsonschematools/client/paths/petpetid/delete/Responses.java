package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.paths.petpetid.delete.responses.Code400Response;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode400Response {}

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

    public sealed interface StatusCodeResponseDeserializer permits StatusCode400ResponseDeserializer {}

    public static final class StatusCode400ResponseDeserializer extends Code400Response.Code400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
