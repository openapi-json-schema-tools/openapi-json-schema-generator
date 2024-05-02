package org.openapijsonschematools.client.paths.userusername.put;

import org.openapijsonschematools.client.paths.userusername.put.responses.UserusernamePutCode400Response;
import org.openapijsonschematools.client.paths.userusername.put.responses.UserusernamePutCode404Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class UserusernamePutResponses {

    public sealed interface StatusCodeResponseDeserializer permits StatusUserusernamePutCode400ResponseDeserializer, StatusUserusernamePutCode404ResponseDeserializer {}

    public static final class StatusUserusernamePutCode400ResponseDeserializer extends UserusernamePutCode400Response.UserusernamePutCode400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusUserusernamePutCode404ResponseDeserializer extends UserusernamePutCode404Response.UserusernamePutCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class UserusernamePutResponses1 implements ResponsesDeserializer<Nothing?> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public UserusernamePutResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusUserusernamePutCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusUserusernamePutCode404ResponseDeserializer())
            );
        }

        public Nothing? deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer == null) {
                throw new ApiException(
                    "Invalid response statusCode="+statusCode+" has no response defined in the openapi document",
                    response
                );
            }
            if (statusCodeDeserializer instanceof StatusUserusernamePutCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new UserusernamePutCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusUserusernamePutCode404ResponseDeserializer castDeserializer = (StatusUserusernamePutCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new UserusernamePutCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
