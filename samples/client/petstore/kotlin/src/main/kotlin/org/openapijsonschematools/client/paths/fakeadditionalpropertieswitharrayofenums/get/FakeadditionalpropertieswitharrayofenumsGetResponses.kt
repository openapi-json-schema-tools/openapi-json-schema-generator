package org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.get;

import org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.get.responses.FakeadditionalpropertieswitharrayofenumsGetCode200Response;
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

public class FakeadditionalpropertieswitharrayofenumsGetResponses {
    public sealed interface EndpointResponse permits EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response {}

    public record EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response(
        HttpResponse<byte[]> response,
        FakeadditionalpropertieswitharrayofenumsGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakeadditionalpropertieswitharrayofenumsGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeadditionalpropertieswitharrayofenumsGetCode200ResponseDeserializer {}

    public static final class StatusFakeadditionalpropertieswitharrayofenumsGetCode200ResponseDeserializer extends FakeadditionalpropertieswitharrayofenumsGetCode200Response.FakeadditionalpropertieswitharrayofenumsGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeadditionalpropertieswitharrayofenumsGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeadditionalpropertieswitharrayofenumsGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeadditionalpropertieswitharrayofenumsGetCode200ResponseDeserializer())
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
            StatusFakeadditionalpropertieswitharrayofenumsGetCode200ResponseDeserializer castDeserializer = (StatusFakeadditionalpropertieswitharrayofenumsGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
