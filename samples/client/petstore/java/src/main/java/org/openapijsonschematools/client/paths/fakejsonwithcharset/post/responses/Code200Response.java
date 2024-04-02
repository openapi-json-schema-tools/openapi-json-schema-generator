package org.openapijsonschematools.client.paths.fakejsonwithcharset.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.OpenapiDocumentException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.post.responses.code200response.content.applicationjsoncharsetutf8.Applicationjsoncharsetutf8Schema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class Code200Response {
    public sealed interface SealedMediaType permits Applicationjsoncharsetutf8MediaType {}

    public record Applicationjsoncharsetutf8MediaType(Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1 schema) implements SealedMediaType, MediaType<Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1, Void> {
        public Applicationjsoncharsetutf8MediaType() {
            this(Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits Applicationjsoncharsetutf8ResponseBody {}
    public record Applicationjsoncharsetutf8ResponseBody(Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Code200Response1 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
        public Code200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json; charset=utf-8", new Applicationjsoncharsetutf8MediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) throws OpenapiDocumentException, InvalidTypeException, ValidationException, NotImplementedException {
            SealedMediaType mediaType = content.get(contentType);
            if (mediaType == null) {
                throw new OpenapiDocumentException("Invalid contentType was received back from the server that does not exist in the openapi document");
            }
            if (mediaType instanceof Applicationjsoncharsetutf8MediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new Applicationjsoncharsetutf8ResponseBody(deserializedBody);
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
