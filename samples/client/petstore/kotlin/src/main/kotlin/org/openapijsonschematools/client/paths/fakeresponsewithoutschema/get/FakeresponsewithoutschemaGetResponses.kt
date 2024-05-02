package org.openapijsonschematools.client.paths.fakeresponsewithoutschema.get;

import org.openapijsonschematools.client.paths.fakeresponsewithoutschema.get.responses.FakeresponsewithoutschemaGetCode200Response;
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

public class FakeresponsewithoutschemaGetResponses {
    public sealed interface EndpointResponse permits EndpointFakeresponsewithoutschemaGetCode200Response {}

    public record EndpointFakeresponsewithoutschemaGetCode200Response(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeresponsewithoutschemaGetCode200ResponseDeserializer {}

    public static final class StatusFakeresponsewithoutschemaGetCode200ResponseDeserializer extends FakeresponsewithoutschemaGetCode200Response.FakeresponsewithoutschemaGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeresponsewithoutschemaGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeresponsewithoutschemaGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeresponsewithoutschemaGetCode200ResponseDeserializer())
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
            StatusFakeresponsewithoutschemaGetCode200ResponseDeserializer castDeserializer = (StatusFakeresponsewithoutschemaGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeresponsewithoutschemaGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
