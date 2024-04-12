package org.openapijsonschematools.client.paths.userusername.get;

import org.openapijsonschematools.client.paths.userusername.get.responses.UserusernameGetCode200Response;
import org.openapijsonschematools.client.paths.userusername.get.responses.UserusernameGetCode400Response;
import org.openapijsonschematools.client.paths.userusername.get.responses.UserusernameGetCode404Response;
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

public class UserusernameGetResponses {
    public sealed interface EndpointResponse permits EndpointUserusernameGetCode200Response {}

    public record EndpointUserusernameGetCode200Response(
        HttpResponse<byte[]> response,
        UserusernameGetCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<UserusernameGetCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusUserusernameGetCode200ResponseDeserializer, StatusUserusernameGetCode400ResponseDeserializer, StatusUserusernameGetCode404ResponseDeserializer {}

    public static final class StatusUserusernameGetCode200ResponseDeserializer extends UserusernameGetCode200Response.UserusernameGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusUserusernameGetCode400ResponseDeserializer extends UserusernameGetCode400Response.UserusernameGetCode400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusUserusernameGetCode404ResponseDeserializer extends UserusernameGetCode404Response.UserusernameGetCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class UserusernameGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public UserusernameGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusUserusernameGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusUserusernameGetCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusUserusernameGetCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusUserusernameGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointUserusernameGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else if (statusCodeDeserializer instanceof StatusUserusernameGetCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new UserusernameGetCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusUserusernameGetCode404ResponseDeserializer castDeserializer = (StatusUserusernameGetCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new UserusernameGetCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
