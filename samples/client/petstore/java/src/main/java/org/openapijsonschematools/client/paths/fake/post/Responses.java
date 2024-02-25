package org.openapijsonschematools.client.paths.fake.post;

import org.openapijsonschematools.client.paths.fake.post.responses.Code200Response;
import org.openapijsonschematools.client.paths.fake.post.responses.Code404Response;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface SealedEndpointResponse permits EndpointCode200Response, EndpointCode404Response {}

    public record EndpointCode200Response(
        HttpResponse<byte[]> response
        
    ) implements SealedEndpointResponse, ApiResponse<Void, Void>{
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
        
    ) implements SealedEndpointResponse, ApiResponse<Void, Void>{
        @Override
        public Void body() {
            return null;
        }
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
