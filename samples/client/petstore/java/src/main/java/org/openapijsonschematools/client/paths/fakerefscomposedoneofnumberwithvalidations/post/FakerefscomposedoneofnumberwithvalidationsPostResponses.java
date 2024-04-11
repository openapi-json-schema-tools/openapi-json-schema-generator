package org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.post;

import org.openapijsonschematools.client.paths.fakerefscomposedoneofnumberwithvalidations.post.responses.FakerefscomposedoneofnumberwithvalidationsPostCode200Response;
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

public class FakerefscomposedoneofnumberwithvalidationsPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response {}

    public record EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefscomposedoneofnumberwithvalidationsPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakerefscomposedoneofnumberwithvalidationsPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefscomposedoneofnumberwithvalidationsPostCode200ResponseDeserializer {}

    public static final class StatusFakerefscomposedoneofnumberwithvalidationsPostCode200ResponseDeserializer extends FakerefscomposedoneofnumberwithvalidationsPostCode200Response.FakerefscomposedoneofnumberwithvalidationsPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefscomposedoneofnumberwithvalidationsPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefscomposedoneofnumberwithvalidationsPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefscomposedoneofnumberwithvalidationsPostCode200ResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            StatusFakerefscomposedoneofnumberwithvalidationsPostCode200ResponseDeserializer castDeserializer = (StatusFakerefscomposedoneofnumberwithvalidationsPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
