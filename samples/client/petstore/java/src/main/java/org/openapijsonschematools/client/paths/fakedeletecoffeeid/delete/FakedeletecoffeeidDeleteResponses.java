package org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete;

import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.responses.FakedeletecoffeeidDeleteCode200Response;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.responses.FakedeletecoffeeidDeleteCodedefaultResponse;
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

public class FakedeletecoffeeidDeleteResponses {
    public sealed interface EndpointResponse permits EndpointFakedeletecoffeeidDeleteCode200Response, EndpointFakedeletecoffeeidDeleteCodedefaultResponse {}

    public record EndpointFakedeletecoffeeidDeleteCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public record EndpointFakedeletecoffeeidDeleteCodedefaultResponse(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakedeletecoffeeidDeleteCode200ResponseDeserializer {}

    public static final class StatusFakedeletecoffeeidDeleteCode200ResponseDeserializer extends FakedeletecoffeeidDeleteCode200Response.FakedeletecoffeeidDeleteCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakedeletecoffeeidDeleteResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        private final FakedeletecoffeeidDeleteCodedefaultResponse.FakedeletecoffeeidDeleteCodedefaultResponse1 defaultResponseDeserializer;
        public FakedeletecoffeeidDeleteResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakedeletecoffeeidDeleteCode200ResponseDeserializer())
            );
            this.defaultResponseDeserializer = new FakedeletecoffeeidDeleteCodedefaultResponse.FakedeletecoffeeidDeleteCodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
            String statusCode = String.valueOf(response.statusCode());
            @Nullable StatusCodeResponseDeserializer statusCodeDeserializer = statusCodeToResponseDeserializer.get(statusCode);
            if (statusCodeDeserializer != null) {
                StatusFakedeletecoffeeidDeleteCode200ResponseDeserializer castDeserializer = (StatusFakedeletecoffeeidDeleteCode200ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointFakedeletecoffeeidDeleteCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            }
            var deserializedResponse = defaultResponseDeserializer.deserialize(response, configuration);
            return new EndpointFakedeletecoffeeidDeleteCodedefaultResponse(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
