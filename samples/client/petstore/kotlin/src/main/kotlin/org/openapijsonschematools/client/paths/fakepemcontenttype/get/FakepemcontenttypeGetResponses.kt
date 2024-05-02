package org.openapijsonschematools.client.paths.fakepemcontenttype.get;

import org.openapijsonschematools.client.paths.fakepemcontenttype.get.responses.FakepemcontenttypeGetCode200Response;
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

public class FakepemcontenttypeGetResponses {
    public sealed interface EndpointResponse permits EndpointFakepemcontenttypeGetCode200Response {}

    public record EndpointFakepemcontenttypeGetCode200Response(
        HttpResponse<byte[]> response,
        FakepemcontenttypeGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakepemcontenttypeGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakepemcontenttypeGetCode200ResponseDeserializer {}

    public static final class StatusFakepemcontenttypeGetCode200ResponseDeserializer extends FakepemcontenttypeGetCode200Response.FakepemcontenttypeGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakepemcontenttypeGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakepemcontenttypeGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakepemcontenttypeGetCode200ResponseDeserializer())
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
            StatusFakepemcontenttypeGetCode200ResponseDeserializer castDeserializer = (StatusFakepemcontenttypeGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakepemcontenttypeGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
