package org.openapijsonschematools.client.paths.fake.delete;

import org.openapijsonschematools.client.paths.fake.delete.responses.FakeDeleteCode200Response;
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

public class FakeDeleteResponses {
    public sealed interface EndpointResponse permits EndpointFakeDeleteCode200Response {}

    public record EndpointFakeDeleteCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeDeleteCode200ResponseDeserializer {}

    public static final class StatusFakeDeleteCode200ResponseDeserializer extends FakeDeleteCode200Response.FakeDeleteCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeDeleteResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeDeleteResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeDeleteCode200ResponseDeserializer())
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
            StatusFakeDeleteCode200ResponseDeserializer castDeserializer = (StatusFakeDeleteCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeDeleteCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
