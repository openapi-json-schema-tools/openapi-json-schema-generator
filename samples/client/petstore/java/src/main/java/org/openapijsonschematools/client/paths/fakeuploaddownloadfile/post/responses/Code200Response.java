package org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses.code200response.content.applicationoctetstream.ApplicationoctetstreamSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class Code200Response {
    public sealed interface SealedMediaType permits ApplicationoctetstreamMediaType {}

    public record ApplicationoctetstreamMediaType(ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1 schema) implements SealedMediaType, MediaType<ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1, Void> {
        public ApplicationoctetstreamMediaType() {
            this(ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationoctetstreamResponseBody {}
    public record ApplicationoctetstreamResponseBody(ApplicationoctetstreamSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Code200Response1 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
        public Code200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/octet-stream", new ApplicationoctetstreamMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, SealedMediaType mediaType, byte[] body, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException, NotImplementedException {
            ApplicationoctetstreamMediaType thisMediaType = (ApplicationoctetstreamMediaType) mediaType;
            var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
            return new ApplicationoctetstreamResponseBody(deserializedBody);
        }

        @Override
        protected Void getHeaders(HttpHeaders headers, SchemaConfiguration configuration) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public static class ResponseApiException extends ApiException {
        public DeserializedHttpResponse<SealedResponseBody, Void> deserializedResponse;

        public ResponseApiException(String s, HttpResponse<byte[]> response, DeserializedHttpResponse<SealedResponseBody, Void> deserializedResponse) {
            super(s, response);
            this.deserializedResponse = deserializedResponse;
        }
    }
}
