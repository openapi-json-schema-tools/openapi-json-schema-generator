package org.openapijsonschematools.client.paths.foo.get;

import org.openapijsonschematools.client.paths.foo.get.responses.CodedefaultResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

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
        private final CodedefaultResponse.CodedefaultResponse1 defaultResponseDeserializer;
        public Responses1() {
            this.defaultResponseDeserializer = new CodedefaultResponse.CodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
        }
    }
}
