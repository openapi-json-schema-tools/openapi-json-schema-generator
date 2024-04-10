package org.openapijsonschematools.client.paths.foo.get;

import org.openapijsonschematools.client.paths.foo.get.responses.FooGetCodedefaultResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class FooGetResponses {
    public sealed interface EndpointResponse permits EndpointFooGetCodedefaultResponse {}

    public record EndpointFooGetCodedefaultResponse(
        HttpResponse<byte[]> response,
        FooGetCodedefaultResponse.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FooGetCodedefaultResponse.SealedResponseBody, Void>{
    }

    public static final class FooGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final FooGetCodedefaultResponse.FooGetCodedefaultResponse1 defaultResponseDeserializer;
        public FooGetResponses1() {
            this.defaultResponseDeserializer = new FooGetCodedefaultResponse.FooGetCodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            var deserializedResponse = defaultResponseDeserializer.deserialize(response, configuration);
            return new EndpointFooGetCodedefaultResponse(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
