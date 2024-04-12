package org.openapijsonschematools.client.paths.fake.get;

import org.openapijsonschematools.client.paths.fake.get.responses.FakeGetCode200Response;
import org.openapijsonschematools.client.paths.fake.get.responses.FakeGetCode404Response;
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

public class FakeGetResponses {
    public sealed interface EndpointResponse permits EndpointFakeGetCode200Response {}

    public record EndpointFakeGetCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeGetCode200ResponseDeserializer, StatusFakeGetCode404ResponseDeserializer {}

    public static final class StatusFakeGetCode200ResponseDeserializer extends FakeGetCode200Response.FakeGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusFakeGetCode404ResponseDeserializer extends FakeGetCode404Response.FakeGetCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusFakeGetCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusFakeGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointFakeGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusFakeGetCode404ResponseDeserializer castDeserializer = (StatusFakeGetCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakeGetCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
