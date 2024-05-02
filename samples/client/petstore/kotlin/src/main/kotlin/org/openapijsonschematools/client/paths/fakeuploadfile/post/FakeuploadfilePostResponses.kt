package org.openapijsonschematools.client.paths.fakeuploadfile.post;

import org.openapijsonschematools.client.paths.fakeuploadfile.post.responses.FakeuploadfilePostCode200Response;
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

public class FakeuploadfilePostResponses {
    public sealed interface EndpointResponse permits EndpointFakeuploadfilePostCode200Response {}

    public record EndpointFakeuploadfilePostCode200Response(
        HttpResponse<byte[]> response,
        FakeuploadfilePostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakeuploadfilePostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeuploadfilePostCode200ResponseDeserializer {}

    public static final class StatusFakeuploadfilePostCode200ResponseDeserializer extends FakeuploadfilePostCode200Response.FakeuploadfilePostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeuploadfilePostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeuploadfilePostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeuploadfilePostCode200ResponseDeserializer())
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
            StatusFakeuploadfilePostCode200ResponseDeserializer castDeserializer = (StatusFakeuploadfilePostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeuploadfilePostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
