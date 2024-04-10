package org.openapijsonschematools.client.paths.fakemultiplesecurities.get;

import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.responses.FakemultiplesecuritiesGetCode200Response;
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

public class FakemultiplesecuritiesGetResponses {
    public sealed interface EndpointResponse permits EndpointFakemultiplesecuritiesGetCode200Response {}

    public record EndpointFakemultiplesecuritiesGetCode200Response(
        HttpResponse<byte[]> response,
        FakemultiplesecuritiesGetCode200Response.SealedResponseBody body,
        Void headers
    ) implements EndpointResponse, ApiResponse<FakemultiplesecuritiesGetCode200Response.SealedResponseBody, Void>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusFakemultiplesecuritiesGetCode200ResponseDeserializer {}

    public static final class StatusFakemultiplesecuritiesGetCode200ResponseDeserializer extends FakemultiplesecuritiesGetCode200Response.FakemultiplesecuritiesGetCode200Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class FakemultiplesecuritiesGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public FakemultiplesecuritiesGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusFakemultiplesecuritiesGetCode200ResponseDeserializer())
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
            StatusFakemultiplesecuritiesGetCode200ResponseDeserializer castDeserializer = (StatusFakemultiplesecuritiesGetCode200ResponseDeserializer) statusCodeDeserializer;
            var deserializedResponse = castDeserializer.deserialize(response, configuration);
            return new EndpointFakemultiplesecuritiesGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
        }
    }
}
