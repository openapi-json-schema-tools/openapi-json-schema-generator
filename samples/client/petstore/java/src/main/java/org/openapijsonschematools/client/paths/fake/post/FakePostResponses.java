package org.openapijsonschematools.client.paths.fake.post;

import org.openapijsonschematools.client.paths.fake.post.responses.FakePostCode200Response;
import org.openapijsonschematools.client.paths.fake.post.responses.FakePostCode404Response;
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

public class FakePostResponses {
    public sealed interface EndpointResponse permits EndpointFakePostCode200Response {}

    public record EndpointFakePostCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakePostCode200ResponseDeserializer, StatusFakePostCode404ResponseDeserializer {}

    public static final class StatusFakePostCode200ResponseDeserializer extends FakePostCode200Response.FakePostCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusFakePostCode404ResponseDeserializer extends FakePostCode404Response.FakePostCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakePostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakePostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakePostCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusFakePostCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusFakePostCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointFakePostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusFakePostCode404ResponseDeserializer castDeserializer = (StatusFakePostCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new FakePostCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
