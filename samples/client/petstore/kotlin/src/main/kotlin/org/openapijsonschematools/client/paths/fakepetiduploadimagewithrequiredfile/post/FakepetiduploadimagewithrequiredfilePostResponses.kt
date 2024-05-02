package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post;

import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.responses.FakepetiduploadimagewithrequiredfilePostCode200Response;
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

public class FakepetiduploadimagewithrequiredfilePostResponses {
    public sealed interface EndpointResponse permits EndpointFakepetiduploadimagewithrequiredfilePostCode200Response {}

    public record EndpointFakepetiduploadimagewithrequiredfilePostCode200Response(
        HttpResponse<byte[]> response,
        FakepetiduploadimagewithrequiredfilePostCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakepetiduploadimagewithrequiredfilePostCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakepetiduploadimagewithrequiredfilePostCode200ResponseDeserializer {}

    public static final class StatusFakepetiduploadimagewithrequiredfilePostCode200ResponseDeserializer extends FakepetiduploadimagewithrequiredfilePostCode200Response.FakepetiduploadimagewithrequiredfilePostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakepetiduploadimagewithrequiredfilePostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakepetiduploadimagewithrequiredfilePostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakepetiduploadimagewithrequiredfilePostCode200ResponseDeserializer())
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
            StatusFakepetiduploadimagewithrequiredfilePostCode200ResponseDeserializer castDeserializer = (StatusFakepetiduploadimagewithrequiredfilePostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakepetiduploadimagewithrequiredfilePostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
