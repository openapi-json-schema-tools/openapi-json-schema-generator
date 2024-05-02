package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get;

import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.responses.FakequeryparamwithjsoncontenttypeGetCode200Response;
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

public class FakequeryparamwithjsoncontenttypeGetResponses {
    public sealed interface EndpointResponse permits EndpointFakequeryparamwithjsoncontenttypeGetCode200Response {}

    public record EndpointFakequeryparamwithjsoncontenttypeGetCode200Response(
        HttpResponse<byte[]> response,
        FakequeryparamwithjsoncontenttypeGetCode200Response.SealedResponseBody body,
        Nothing? headers
    ) implements EndpointResponse, ApiResponse<FakequeryparamwithjsoncontenttypeGetCode200Response.SealedResponseBody, Nothing?>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakequeryparamwithjsoncontenttypeGetCode200ResponseDeserializer {}

    public static final class StatusFakequeryparamwithjsoncontenttypeGetCode200ResponseDeserializer extends FakequeryparamwithjsoncontenttypeGetCode200Response.FakequeryparamwithjsoncontenttypeGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakequeryparamwithjsoncontenttypeGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakequeryparamwithjsoncontenttypeGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakequeryparamwithjsoncontenttypeGetCode200ResponseDeserializer())
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
            StatusFakequeryparamwithjsoncontenttypeGetCode200ResponseDeserializer castDeserializer = (StatusFakequeryparamwithjsoncontenttypeGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakequeryparamwithjsoncontenttypeGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
