package org.openapijsonschematools.client.paths.user.post;

import org.openapijsonschematools.client.paths.user.post.responses.CodedefaultResponse;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface SealedEndpointResponse permits EndpointCodedefaultResponse {}

    public record EndpointCodedefaultResponse(
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
