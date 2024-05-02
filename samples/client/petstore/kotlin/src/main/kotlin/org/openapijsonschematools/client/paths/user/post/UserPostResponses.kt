package org.openapijsonschematools.client.paths.user.post;

import org.openapijsonschematools.client.paths.user.post.responses.UserPostCodedefaultResponse;
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

public class UserPostResponses {
    public sealed interface EndpointResponse permits EndpointUserPostCodedefaultResponse {}

    public record EndpointUserPostCodedefaultResponse(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public static final class UserPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final UserPostCodedefaultResponse.UserPostCodedefaultResponse1 defaultResponseDeserializer;
        public UserPostResponses1() {
            this.defaultResponseDeserializer = new UserPostCodedefaultResponse.UserPostCodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            var deserializedResponse = defaultResponseDeserializer.deserialize(response, configuration);
            return new EndpointUserPostCodedefaultResponse(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
