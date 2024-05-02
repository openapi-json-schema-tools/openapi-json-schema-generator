package org.openapijsonschematools.client.paths.fakepemcontenttype.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakepemcontenttype.get.responses.code200response.content.applicationxpemfile.ApplicationxpemfileSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class FakepemcontenttypeGetCode200Response {
    public sealed interface SealedMediaType permits ApplicationxpemfileMediaType {}

    public record ApplicationxpemfileMediaType(ApplicationxpemfileSchema.ApplicationxpemfileSchema1 schema) implements SealedMediaType, MediaType<ApplicationxpemfileSchema.ApplicationxpemfileSchema1, Nothing?> {
        public ApplicationxpemfileMediaType() {
            this(ApplicationxpemfileSchema.ApplicationxpemfileSchema1.getInstance());
        }
        @Override
        public Nothing? encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationxpemfileResponseBody {}
    public record ApplicationxpemfileResponseBody(ApplicationxpemfileSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class FakepemcontenttypeGetCode200Response1 extends ResponseDeserializer<SealedResponseBody, Nothing?, SealedMediaType> {
        public FakepemcontenttypeGetCode200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/x-pem-file", new ApplicationxpemfileMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, SealedMediaType mediaType, byte[] body, SchemaConfiguration configuration) throws ValidationException, NotImplementedException {
            ApplicationxpemfileMediaType thisMediaType = (ApplicationxpemfileMediaType) mediaType;
            var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
            return new ApplicationxpemfileResponseBody(deserializedBody);
        }

        @Override
        protected Nothing? getHeaders(HttpHeaders headers, SchemaConfiguration configuration) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public static class ResponseApiException extends ApiException {
        public DeserializedHttpResponse<SealedResponseBody, Nothing?> deserializedResponse;

        public ResponseApiException(String s, HttpResponse<byte[]> response, DeserializedHttpResponse<SealedResponseBody, Nothing?> deserializedResponse) {
            super(s, response);
            this.deserializedResponse = deserializedResponse;
        }
    }
}
