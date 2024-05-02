package org.openapijsonschematools.client.paths.fakejsonformdata.get;

import org.openapijsonschematools.client.paths.fakejsonformdata.get.responses.FakejsonformdataGetCode200Response;
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

public class FakejsonformdataGetResponses {
    public sealed interface EndpointResponse permits EndpointFakejsonformdataGetCode200Response {}

    public record EndpointFakejsonformdataGetCode200Response(
        HttpResponse<byte[]> response,
        Nothing? body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<Nothing?, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakejsonformdataGetCode200ResponseDeserializer {}

    public static final class StatusFakejsonformdataGetCode200ResponseDeserializer extends FakejsonformdataGetCode200Response.FakejsonformdataGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakejsonformdataGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakejsonformdataGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakejsonformdataGetCode200ResponseDeserializer())
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
            StatusFakejsonformdataGetCode200ResponseDeserializer castDeserializer = (StatusFakejsonformdataGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakejsonformdataGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
