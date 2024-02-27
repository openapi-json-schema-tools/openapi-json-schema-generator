package org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete;

import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.responses.Code200Response;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.responses.CodedefaultResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.ResponsesDeserializer;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpResponse;
import java.util.Map;
import java.util.AbstractMap;

public class Responses {
    public sealed interface EndpointResponse permits EndpointCode200Response, EndpointCodedefaultResponse {}

    public record EndpointCode200Response(
        HttpResponse<byte[]> response,
        Void body
    ) implements EndpointResponse, ApiResponse<Void, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public record EndpointCodedefaultResponse(
        HttpResponse<byte[]> response,
        Void body
    ) implements EndpointResponse, ApiResponse<Void, Void>{
        @Override
        public Void headers() {
            return null;
        }
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusCode200ResponseDeserializer {}

    public static final class StatusCode200ResponseDeserializer extends Code200Response.Code200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class Responses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        private final CodedefaultResponse.CodedefaultResponse1 defaultResponseDeserializer;
        public Responses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusCode200ResponseDeserializer())
            );
            this.defaultResponseDeserializer = new CodedefaultResponse.CodedefaultResponse1();
        }

        public EndpointResponse deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
            String statusCode = String.valueOf(response.statusCode());
        }
    }
}
