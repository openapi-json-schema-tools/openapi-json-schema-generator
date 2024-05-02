package org.openapijsonschematools.client.paths.userlogout.get;

import org.openapijsonschematools.client.paths.userlogout.get.responses.UserlogoutGetCodedefaultResponse;
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

public class UserlogoutGetResponses {
    public sealed interface EndpointResponse permits EndpointUserlogoutGetCodedefaultResponse {}

    public record EndpointUserlogoutGetCodedefaultResponse(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public static final class UserlogoutGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final UserlogoutGetCodedefaultResponse.UserlogoutGetCodedefaultResponse1 defaultResponseDeserializer;
        public UserlogoutGetResponses1() {
            this.defaultResponseDeserializer = new UserlogoutGetCodedefaultResponse.UserlogoutGetCodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            var deserializedResponse = defaultResponseDeserializer.deserialize(response, configuration);
            return new EndpointUserlogoutGetCodedefaultResponse(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
