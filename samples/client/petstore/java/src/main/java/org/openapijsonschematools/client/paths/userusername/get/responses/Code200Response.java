package org.openapijsonschematools.client.paths.userusername.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.userusername.get.responses.code200response.content.applicationxml.ApplicationxmlSchema;
import org.openapijsonschematools.client.paths.userusername.get.responses.code200response.content.applicationjson.ApplicationjsonSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class Code200Response {
    public sealed interface SealedMediaType permits ApplicationxmlMediaType, ApplicationjsonMediaType {}

    public record ApplicationxmlMediaType(ApplicationxmlSchema.ApplicationxmlSchema1 schema) implements SealedMediaType, MediaType<ApplicationxmlSchema.ApplicationxmlSchema1, Void> {
        public ApplicationxmlMediaType() {
            this(ApplicationxmlSchema.ApplicationxmlSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public record ApplicationjsonMediaType(ApplicationjsonSchema.ApplicationjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonSchema.ApplicationjsonSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationxmlResponseBody, ApplicationjsonResponseBody {}
    public record ApplicationxmlResponseBody(ApplicationxmlSchema.User1Boxed body) implements SealedResponseBody { }
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.User1Boxed body) implements SealedResponseBody { }

    public static class Code200Response1 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
        public Code200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/xml", new ApplicationxmlMediaType()),
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            SealedMediaType mediaType = content.get(contentType);
            if (mediaType == null) {
                throw new RuntimeException("Invalid contentType was received back from the server that does not exist in the openapi document");
            }
            if (mediaType instanceof ApplicationxmlMediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new ApplicationxmlResponseBody(deserializedBody);
            } else if (mediaType instanceof ApplicationjsonMediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new ApplicationjsonResponseBody(deserializedBody);
            }
            throw new RuntimeException("contentType="+contentType+" returned by the server is unknown and does not exist in the openapi document");
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
