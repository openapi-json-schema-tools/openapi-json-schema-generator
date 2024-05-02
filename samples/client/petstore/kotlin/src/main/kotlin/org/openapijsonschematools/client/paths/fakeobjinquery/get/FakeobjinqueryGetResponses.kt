package org.openapijsonschematools.client.paths.fakeobjinquery.get;

import org.openapijsonschematools.client.paths.fakeobjinquery.get.responses.FakeobjinqueryGetCode200Response;
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

public class FakeobjinqueryGetResponses {
    public sealed interface EndpointResponse permits EndpointFakeobjinqueryGetCode200Response {}

    public record EndpointFakeobjinqueryGetCode200Response(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeobjinqueryGetCode200ResponseDeserializer {}

    public static final class StatusFakeobjinqueryGetCode200ResponseDeserializer extends FakeobjinqueryGetCode200Response.FakeobjinqueryGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeobjinqueryGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeobjinqueryGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeobjinqueryGetCode200ResponseDeserializer())
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
            StatusFakeobjinqueryGetCode200ResponseDeserializer castDeserializer = (StatusFakeobjinqueryGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeobjinqueryGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
