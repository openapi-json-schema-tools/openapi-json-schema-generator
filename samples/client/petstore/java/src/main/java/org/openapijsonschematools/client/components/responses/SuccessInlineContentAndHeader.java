package org.openapijsonschematools.client.components.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.SuccessInlineContentAndHeaderHeadersSchema;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.Headers;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class SuccessInlineContentAndHeader {
    public sealed interface SealedMediaType permits ApplicationjsonMediaType {}

    public record ApplicationjsonMediaType(ApplicationjsonSchema.ApplicationjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonSchema.ApplicationjsonSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationjsonResponseBody {}
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.ApplicationjsonSchema1Boxed body) implements SealedResponseBody { }

    public static class SuccessInlineContentAndHeader1 extends ResponseDeserializer<SealedResponseBody, SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap, SealedMediaType> {
        public SuccessInlineContentAndHeader1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, SealedMediaType mediaType, byte[] body, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException, NotImplementedException {
            ApplicationjsonMediaType thisMediaType = (ApplicationjsonMediaType) mediaType;
            var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
            return new ApplicationjsonResponseBody(deserializedBody);
        }

        @Override
        protected SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap getHeaders(HttpHeaders headers, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException, NotImplementedException {
            return new Headers().deserialize(headers, configuration);
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
