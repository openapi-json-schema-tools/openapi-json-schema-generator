package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put;

import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.responses.FakecasesensitiveparamsPutCode200Response;
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

public class FakecasesensitiveparamsPutResponses {
    public sealed interface EndpointResponse permits EndpointFakecasesensitiveparamsPutCode200Response {}

    public record EndpointFakecasesensitiveparamsPutCode200Response(
        HttpResponse<byte[]> response,
        Void body,
        Void headers
    ) implements EndpointResponse, ApiResponse<Void, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakecasesensitiveparamsPutCode200ResponseDeserializer {}

    public static final class StatusFakecasesensitiveparamsPutCode200ResponseDeserializer extends FakecasesensitiveparamsPutCode200Response.FakecasesensitiveparamsPutCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakecasesensitiveparamsPutResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakecasesensitiveparamsPutResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakecasesensitiveparamsPutCode200ResponseDeserializer())
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
            StatusFakecasesensitiveparamsPutCode200ResponseDeserializer castDeserializer = (StatusFakecasesensitiveparamsPutCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakecasesensitiveparamsPutCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
