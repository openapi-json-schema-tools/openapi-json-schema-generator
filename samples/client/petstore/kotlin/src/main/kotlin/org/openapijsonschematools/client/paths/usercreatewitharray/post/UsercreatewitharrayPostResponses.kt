package org.openapijsonschematools.client.paths.usercreatewitharray.post;

import org.openapijsonschematools.client.paths.usercreatewitharray.post.responses.UsercreatewitharrayPostCodedefaultResponse;
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

public class UsercreatewitharrayPostResponses {
    public sealed interface EndpointResponse permits EndpointUsercreatewitharrayPostCodedefaultResponse {}

    public record EndpointUsercreatewitharrayPostCodedefaultResponse(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public static final class UsercreatewitharrayPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final UsercreatewitharrayPostCodedefaultResponse.UsercreatewitharrayPostCodedefaultResponse1 defaultResponseDeserializer;
        public UsercreatewitharrayPostResponses1() {
            this.defaultResponseDeserializer = new UsercreatewitharrayPostCodedefaultResponse.UsercreatewitharrayPostCodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            var deserializedResponse = defaultResponseDeserializer.deserialize(response, configuration);
            return new EndpointUsercreatewitharrayPostCodedefaultResponse(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
