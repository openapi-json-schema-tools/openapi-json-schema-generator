package org.openapijsonschematools.client.paths.fakepemcontenttype.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakepemcontenttype.get.responses.code200response.content.applicationxpemfile.ApplicationxpemfileSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class Code200Response {
    public sealed interface SealedMediaType permits ApplicationxpemfileMediaType {}

    public record ApplicationxpemfileMediaType(ApplicationxpemfileSchema.ApplicationxpemfileSchema1 schema) implements SealedMediaType, MediaType<ApplicationxpemfileSchema.ApplicationxpemfileSchema1, Void> {
        public ApplicationxpemfileMediaType() {
            this(ApplicationxpemfileSchema.ApplicationxpemfileSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationxpemfileResponseBody {}
    public record ApplicationxpemfileResponseBody(ApplicationxpemfileSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Code200Response1 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
        public Code200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/x-pem-file", new ApplicationxpemfileMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            SealedMediaType mediaType = content.get(contentType);
            if (mediaType == null) {
                throw new RuntimeException("Invalid contentType was received back from the server that does not exist in the openapi document");
            }
            if (mediaType instanceof ApplicationxpemfileMediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new ApplicationxpemfileResponseBody(deserializedBody);
            }
            throw new RuntimeException("contentType="+contentType+" returned by the server is unknown and does not exist in the openapi document");
        }

        @Override
        protected Void getHeaders(HttpHeaders headers) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public class ResponseApiException extends ApiException {
        public ApiResponse<SealedResponseBody, Void> apiResponse;

        public ValidationException(String s, HttpResponse<byte[]> response, ApiResponse<SealedResponseBody, Void> apiResponse) {
            super(s, response);
            this.apiResponse = apiResponse;
        }
    }
}
