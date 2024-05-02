package org.openapijsonschematools.client.paths.fakerefsenum.post;

import org.openapijsonschematools.client.paths.fakerefsenum.post.responses.FakerefsenumPostCode200Response;
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

public class FakerefsenumPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsenumPostCode200Response {}

    public record EndpointFakerefsenumPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsenumPostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakerefsenumPostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsenumPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsenumPostCode200ResponseDeserializer extends FakerefsenumPostCode200Response.FakerefsenumPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsenumPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsenumPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsenumPostCode200ResponseDeserializer())
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
            StatusFakerefsenumPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsenumPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsenumPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
