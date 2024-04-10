package org.openapijsonschematools.client.paths.storeorderorderid.delete;

import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.StoreorderorderidDeleteCode400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.StoreorderorderidDeleteCode404Response;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class StoreorderorderidDeleteResponses {

    public sealed interface StatusCodeResponseDeserializer permits StatusStoreorderorderidDeleteCode400ResponseDeserializer, StatusStoreorderorderidDeleteCode404ResponseDeserializer {}

    public static final class StatusStoreorderorderidDeleteCode400ResponseDeserializer extends StoreorderorderidDeleteCode400Response.StoreorderorderidDeleteCode400Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusStoreorderorderidDeleteCode404ResponseDeserializer extends StoreorderorderidDeleteCode404Response.StoreorderorderidDeleteCode404Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class StoreorderorderidDeleteResponses1 implements ResponsesDeserializer<Void> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public StoreorderorderidDeleteResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("400", new StatusStoreorderorderidDeleteCode400ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("404", new StatusStoreorderorderidDeleteCode404ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusStoreorderorderidDeleteCode400ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new StoreorderorderidDeleteCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            } else {
                StatusStoreorderorderidDeleteCode404ResponseDeserializer castDeserializer = (StatusStoreorderorderidDeleteCode404ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new StoreorderorderidDeleteCode404Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
