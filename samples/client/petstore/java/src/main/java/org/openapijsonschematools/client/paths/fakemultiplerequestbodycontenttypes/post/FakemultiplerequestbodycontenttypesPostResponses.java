package org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post;

import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post.responses.FakemultiplerequestbodycontenttypesPostCode200Response;
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

public class FakemultiplerequestbodycontenttypesPostResponses {
    public sealed interface EndpointResponse permits EndpointFakemultiplerequestbodycontenttypesPostCode200Response {}

    public record EndpointFakemultiplerequestbodycontenttypesPostCode200Response(
        HttpResponse<byte[]> response,
        FakemultiplerequestbodycontenttypesPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakemultiplerequestbodycontenttypesPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakemultiplerequestbodycontenttypesPostCode200ResponseDeserializer {}

    public static final class StatusFakemultiplerequestbodycontenttypesPostCode200ResponseDeserializer extends FakemultiplerequestbodycontenttypesPostCode200Response.FakemultiplerequestbodycontenttypesPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakemultiplerequestbodycontenttypesPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakemultiplerequestbodycontenttypesPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakemultiplerequestbodycontenttypesPostCode200ResponseDeserializer())
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
            StatusFakemultiplerequestbodycontenttypesPostCode200ResponseDeserializer castDeserializer = (StatusFakemultiplerequestbodycontenttypesPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakemultiplerequestbodycontenttypesPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
