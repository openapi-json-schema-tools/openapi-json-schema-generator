package org.openapijsonschematools.client.paths.fakerefsnumber.post;

import org.openapijsonschematools.client.paths.fakerefsnumber.post.responses.FakerefsnumberPostCode200Response;
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

public class FakerefsnumberPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsnumberPostCode200Response {}

    public record EndpointFakerefsnumberPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsnumberPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakerefsnumberPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsnumberPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsnumberPostCode200ResponseDeserializer extends FakerefsnumberPostCode200Response.FakerefsnumberPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsnumberPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsnumberPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsnumberPostCode200ResponseDeserializer())
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
            StatusFakerefsnumberPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsnumberPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsnumberPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
