package org.openapijsonschematools.client.paths.userlogin.get;

import org.openapijsonschematools.client.paths.userlogin.get.responses.Code200Response;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.Code200ResponseHeadersSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.Code400Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode200Response {}

    public record EndpointCode200Response(
        HttpResponse<byte[]> response,
        Code200Response.SealedResponseBody body
    ) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusCode200ResponseDeserializer, StatusCode400ResponseDeserializer {}

    public static final class StatusCode200ResponseDeserializer extends Code200Response.Code200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode400ResponseDeserializer extends Code400Response.Code400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusCode400ResponseDeserializer())
            );
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (statusCodeDeserializer instanceof StatusCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointCode200Response(response, deserializedResponse.body());
            } else {
                StatusCode400ResponseDeserializer castDeserializer = (StatusCode400ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
