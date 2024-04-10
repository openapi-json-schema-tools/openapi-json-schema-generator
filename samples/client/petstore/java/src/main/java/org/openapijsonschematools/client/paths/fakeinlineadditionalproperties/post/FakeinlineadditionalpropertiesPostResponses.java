package org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.post;

import org.openapijsonschematools.client.paths.fakeinlineadditionalproperties.post.responses.FakeinlineadditionalpropertiesPostCode200Response;
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

public class FakeinlineadditionalpropertiesPostResponses {
    public sealed interface EndpointResponse permits EndpointFakeinlineadditionalpropertiesPostCode200Response {}

    public record EndpointFakeinlineadditionalpropertiesPostCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakeinlineadditionalpropertiesPostCode200ResponseDeserializer {}

    public static final class StatusFakeinlineadditionalpropertiesPostCode200ResponseDeserializer extends FakeinlineadditionalpropertiesPostCode200Response.FakeinlineadditionalpropertiesPostCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakeinlineadditionalpropertiesPostResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakeinlineadditionalpropertiesPostResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakeinlineadditionalpropertiesPostCode200ResponseDeserializer())
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
            StatusFakeinlineadditionalpropertiesPostCode200ResponseDeserializer castDeserializer = (StatusFakeinlineadditionalpropertiesPostCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakeinlineadditionalpropertiesPostCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
