package org.openapijsonschematools.client.paths.usercreatewithlist.post;

import org.openapijsonschematools.client.paths.usercreatewithlist.post.responses.CodedefaultResponse;
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

public class UsercreatewithlistPostResponses {
    public sealed interface EndpointResponse permits EndpointCodedefaultResponse {}

    public record EndpointCodedefaultResponse(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public static final class UsercreatewithlistPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final CodedefaultResponse.CodedefaultResponse1 defaultResponseDeserializer;
        public UsercreatewithlistPostResponses1() {
            this.defaultResponseDeserializer = new CodedefaultResponse.CodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            var deserializedResponse = defaultResponseDeserializer.deserialize(response, configuration);
            return new EndpointCodedefaultResponse(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
