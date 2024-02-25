package org.openapijsonschematools.client.paths.foo.get;

import org.openapijsonschematools.client.paths.foo.get.responses.CodedefaultResponse;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpResponse;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCodedefaultResponse {}

    public record EndpointCodedefaultResponse(
        HttpResponse<byte[]> response,
        CodedefaultResponse.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<CodedefaultResponse.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        }
    }
}
