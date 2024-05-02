package org.openapijsonschematools.client.paths.fakebodywithqueryparams.put;

import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.responses.FakebodywithqueryparamsPutCode200Response;
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

public class FakebodywithqueryparamsPutResponses {
    public sealed interface EndpointResponse permits EndpointFakebodywithqueryparamsPutCode200Response {}

    public record EndpointFakebodywithqueryparamsPutCode200Response(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakebodywithqueryparamsPutCode200ResponseDeserializer {}

    public static final class StatusFakebodywithqueryparamsPutCode200ResponseDeserializer extends FakebodywithqueryparamsPutCode200Response.FakebodywithqueryparamsPutCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakebodywithqueryparamsPutResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakebodywithqueryparamsPutResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakebodywithqueryparamsPutCode200ResponseDeserializer())
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
            StatusFakebodywithqueryparamsPutCode200ResponseDeserializer castDeserializer = (StatusFakebodywithqueryparamsPutCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakebodywithqueryparamsPutCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
