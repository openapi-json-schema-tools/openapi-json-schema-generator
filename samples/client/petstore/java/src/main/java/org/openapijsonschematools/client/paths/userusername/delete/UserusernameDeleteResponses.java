package org.openapijsonschematools.client.paths.userusername.delete;

import org.openapijsonschematools.client.paths.userusername.delete.responses.UserusernameDeleteCode200Response;
import org.openapijsonschematools.client.paths.userusername.delete.responses.UserusernameDeleteCode404Response;
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

public class UserusernameDeleteResponses {
    public sealed interface EndpointResponse permits EndpointUserusernameDeleteCode200Response {}

    public record EndpointUserusernameDeleteCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusUserusernameDeleteCode200ResponseDeserializer, StatusUserusernameDeleteCode404ResponseDeserializer {}

    public static final class StatusUserusernameDeleteCode200ResponseDeserializer extends UserusernameDeleteCode200Response.UserusernameDeleteCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusUserusernameDeleteCode404ResponseDeserializer extends UserusernameDeleteCode404Response.UserusernameDeleteCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class UserusernameDeleteResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public UserusernameDeleteResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusUserusernameDeleteCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusUserusernameDeleteCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusUserusernameDeleteCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointUserusernameDeleteCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusUserusernameDeleteCode404ResponseDeserializer castDeserializer = (StatusUserusernameDeleteCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new UserusernameDeleteCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
