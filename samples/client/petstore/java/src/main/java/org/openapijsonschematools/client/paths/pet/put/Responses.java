package org.openapijsonschematools.client.paths.pet.put;

import org.openapijsonschematools.client.paths.pet.put.responses.Code400Response;
import org.openapijsonschematools.client.paths.pet.put.responses.Code404Response;
import org.openapijsonschematools.client.paths.pet.put.responses.Code405Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {

    public sealed interface StatusCodeResponseDeserializer permits StatusCode400ResponseDeserializer, StatusCode404ResponseDeserializer, StatusCode405ResponseDeserializer {}

    public static final class StatusCode400ResponseDeserializer extends Code400Response.Code400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode404ResponseDeserializer extends Code404Response.Code404Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusCode405ResponseDeserializer extends Code405Response.Code405Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<Void> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusCode404ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("405", new StatusCode405ResponseDeserializer())
            );
        }

        public Void deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (statusCodeDeserializer instanceof StatusCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else if (statusCodeDeserializer instanceof StatusCode404ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusCode405ResponseDeserializer castDeserializer = (StatusCode405ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new Code405Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
