package org.openapijsonschematools.client.paths.fakebodywithfileschema.put;

import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.responses.FakebodywithfileschemaPutCode200Response;
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

public class FakebodywithfileschemaPutResponses {
    public sealed interface EndpointResponse permits EndpointFakebodywithfileschemaPutCode200Response {}

    public record EndpointFakebodywithfileschemaPutCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakebodywithfileschemaPutCode200ResponseDeserializer {}

    public static final class StatusFakebodywithfileschemaPutCode200ResponseDeserializer extends FakebodywithfileschemaPutCode200Response.FakebodywithfileschemaPutCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakebodywithfileschemaPutResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakebodywithfileschemaPutResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakebodywithfileschemaPutCode200ResponseDeserializer())
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
            StatusFakebodywithfileschemaPutCode200ResponseDeserializer castDeserializer = (StatusFakebodywithfileschemaPutCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakebodywithfileschemaPutCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
