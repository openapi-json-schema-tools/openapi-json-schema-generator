package org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post;

import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses.FakeuploaddownloadfilePostCode200Response;
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

public class FakeuploaddownloadfilePostResponses {
    public sealed interface EndpointResponse permits EndpointFakeuploaddownloadfilePostCode200Response {}

    public record EndpointFakeuploaddownloadfilePostCode200Response(
        HttpResponse<byte[]> response,
        FakeuploaddownloadfilePostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakeuploaddownloadfilePostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeuploaddownloadfilePostCode200ResponseDeserializer {}

    public static final class StatusFakeuploaddownloadfilePostCode200ResponseDeserializer extends FakeuploaddownloadfilePostCode200Response.FakeuploaddownloadfilePostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeuploaddownloadfilePostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeuploaddownloadfilePostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeuploaddownloadfilePostCode200ResponseDeserializer())
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
            StatusFakeuploaddownloadfilePostCode200ResponseDeserializer castDeserializer = (StatusFakeuploaddownloadfilePostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeuploaddownloadfilePostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
