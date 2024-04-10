package org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post;

import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.responses.FakerefsobjectmodelwithrefpropsPostCode200Response;
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

public class FakerefsobjectmodelwithrefpropsPostResponses {
    public sealed interface EndpointResponse permits EndpointFakerefsobjectmodelwithrefpropsPostCode200Response {}

    public record EndpointFakerefsobjectmodelwithrefpropsPostCode200Response(
        HttpResponse<byte[]> response,
        FakerefsobjectmodelwithrefpropsPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakerefsobjectmodelwithrefpropsPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefsobjectmodelwithrefpropsPostCode200ResponseDeserializer {}

    public static final class StatusFakerefsobjectmodelwithrefpropsPostCode200ResponseDeserializer extends FakerefsobjectmodelwithrefpropsPostCode200Response.FakerefsobjectmodelwithrefpropsPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefsobjectmodelwithrefpropsPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefsobjectmodelwithrefpropsPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefsobjectmodelwithrefpropsPostCode200ResponseDeserializer())
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
            StatusFakerefsobjectmodelwithrefpropsPostCode200ResponseDeserializer castDeserializer = (StatusFakerefsobjectmodelwithrefpropsPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefsobjectmodelwithrefpropsPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
