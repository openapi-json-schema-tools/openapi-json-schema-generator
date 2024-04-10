package org.openapijsonschematools.client.paths.userlogin.get;

import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode200Response;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.UserloginGetCode200ResponseHeadersSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode400Response;
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

public class UserloginGetResponses {
    public sealed interface EndpointResponse permits EndpointUserloginGetCode200Response {}

    public record EndpointUserloginGetCode200Response(
        HttpResponse<byte[]> response,
        UserloginGetCode200Response.SealedResponseBody body,
        UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap headers
    ) implements EndpointResponse, ApiResponse<UserloginGetCode200Response.SealedResponseBody, UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap>{
    }

    public sealed interface StatusCodeResponseDeserializer permits StatusUserloginGetCode200ResponseDeserializer, StatusUserloginGetCode400ResponseDeserializer {}

    public static final class StatusUserloginGetCode200ResponseDeserializer extends UserloginGetCode200Response.UserloginGetCode200Response1 implements StatusCodeResponseDeserializer {
    }
    public static final class StatusUserloginGetCode400ResponseDeserializer extends UserloginGetCode400Response.UserloginGetCode400Response1 implements StatusCodeResponseDeserializer {
    }

    public static final class UserloginGetResponses1 implements ResponsesDeserializer<EndpointResponse> {
        private final Map<String, StatusCodeResponseDeserializer> statusCodeToResponseDeserializer;
        public UserloginGetResponses1() {
            this.statusCodeToResponseDeserializer = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("200", new StatusUserloginGetCode200ResponseDeserializer()),
                new AbstractMap.SimpleEntry<>("400", new StatusUserloginGetCode400ResponseDeserializer())
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
            if (statusCodeDeserializer instanceof StatusUserloginGetCode200ResponseDeserializer castDeserializer) {
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                return new EndpointUserloginGetCode200Response(response, deserializedResponse.body(), deserializedResponse.headers());
            } else {
                StatusUserloginGetCode400ResponseDeserializer castDeserializer = (StatusUserloginGetCode400ResponseDeserializer) statusCodeDeserializer;
                var deserializedResponse = castDeserializer.deserialize(response, configuration);
                throw new UserloginGetCode400Response.ResponseApiException(
                    "Received error statusCode response from server",
                    response,
                    deserializedResponse
                );
            }
        }
    }
}
