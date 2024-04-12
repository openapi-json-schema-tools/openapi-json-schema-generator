package org.openapijsonschematools.client.paths.fakerefobjinquery.get;

import org.openapijsonschematools.client.paths.fakerefobjinquery.get.responses.FakerefobjinqueryGetCode200Response;
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

public class FakerefobjinqueryGetResponses {
    public sealed interface EndpointResponse permits EndpointFakerefobjinqueryGetCode200Response {}

    public record EndpointFakerefobjinqueryGetCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakerefobjinqueryGetCode200ResponseDeserializer {}

    public static final class StatusFakerefobjinqueryGetCode200ResponseDeserializer extends FakerefobjinqueryGetCode200Response.FakerefobjinqueryGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakerefobjinqueryGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakerefobjinqueryGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakerefobjinqueryGetCode200ResponseDeserializer())
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
            StatusFakerefobjinqueryGetCode200ResponseDeserializer castDeserializer = (StatusFakerefobjinqueryGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakerefobjinqueryGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
