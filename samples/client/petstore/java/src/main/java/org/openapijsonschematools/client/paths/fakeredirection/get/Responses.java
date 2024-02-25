package org.openapijsonschematools.client.paths.fakeredirection.get;

import org.openapijsonschematools.client.paths.fakeredirection.get.responses.Code303Response;
import org.openapijsonschematools.client.paths.fakeredirection.get.responses.Code3XXResponse;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode303Response, EndpointCode3XXResponse {}

    public record EndpointCode303Response(
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

    public record EndpointCode3XXResponse(
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

    public sealed interface StatusCodeResponseDeserializer permits StatusCode303ResponseDeserializer {}

    public static final class StatusCode303ResponseDeserializer extends Code303Response.Code303Response1 implements StatusCodeResponseDeserializer {
    }
    public sealed interface WildcardCodeResponseDeserializer permits WildcardCode3XXResponseDeserializer {}

    public static final class WildcardCode3XXResponseDeserializer extends Code3XXResponse.Code3XXResponse1 implements WildcardCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
