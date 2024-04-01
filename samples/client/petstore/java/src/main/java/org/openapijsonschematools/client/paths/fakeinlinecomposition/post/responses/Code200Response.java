package org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.OpenapiDocumentException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.code200response.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.code200response.content.multipartformdata.MultipartformdataSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class Code200Response {
    public sealed interface SealedMediaType permits ApplicationjsonMediaType, MultipartformdataMediaType {}

    public record ApplicationjsonMediaType(ApplicationjsonSchema.ApplicationjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonSchema.ApplicationjsonSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public record MultipartformdataMediaType(MultipartformdataSchema.MultipartformdataSchema1 schema) implements SealedMediaType, MediaType<MultipartformdataSchema.MultipartformdataSchema1, Void> {
        public MultipartformdataMediaType() {
            this(MultipartformdataSchema.MultipartformdataSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationjsonResponseBody, MultipartformdataResponseBody {}
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.ApplicationjsonSchema1Boxed body) implements SealedResponseBody { }
    public record MultipartformdataResponseBody(MultipartformdataSchema.MultipartformdataSchema1Boxed body) implements SealedResponseBody { }

    public static class Code200Response1 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
        public Code200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType()),
                    new AbstractMap.SimpleEntry<>("multipart/form-data", new MultipartformdataMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            SealedMediaType mediaType = content.get(contentType);
            if (mediaType == null) {
                throw new OpenapiDocumentException("Invalid contentType was received back from the server that does not exist in the openapi document");
            }
            if (mediaType instanceof ApplicationjsonMediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new ApplicationjsonResponseBody(deserializedBody);
            } else if (mediaType instanceof MultipartformdataMediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new MultipartformdataResponseBody(deserializedBody);
            }
            throw new OpenapiDocumentException("contentType="+contentType+" returned by the server is unknown and does not exist in the openapi document");
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
