package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;

import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.responses.Fakeparametercollisions1ababselfabPostCode200Response;
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

public class Fakeparametercollisions1ababselfabPostResponses {
    public sealed interface EndpointResponse permits EndpointFakeparametercollisions1ababselfabPostCode200Response {}

    public record EndpointFakeparametercollisions1ababselfabPostCode200Response(
        HttpResponse<byte[]> response,
        Fakeparametercollisions1ababselfabPostCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Fakeparametercollisions1ababselfabPostCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeparametercollisions1ababselfabPostCode200ResponseDeserializer {}

    public static final class StatusFakeparametercollisions1ababselfabPostCode200ResponseDeserializer extends Fakeparametercollisions1ababselfabPostCode200Response.Fakeparametercollisions1ababselfabPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Fakeparametercollisions1ababselfabPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Fakeparametercollisions1ababselfabPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeparametercollisions1ababselfabPostCode200ResponseDeserializer())
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
            StatusFakeparametercollisions1ababselfabPostCode200ResponseDeserializer castDeserializer = (StatusFakeparametercollisions1ababselfabPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeparametercollisions1ababselfabPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
