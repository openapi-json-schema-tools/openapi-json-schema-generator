package org.openapijsonschematools.client.components.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.responses.successfulxmlandjsonarrayofpet.content.applicationxml.ApplicationxmlSchema;
import org.openapijsonschematools.client.components.responses.successfulxmlandjsonarrayofpet.content.applicationjson.ApplicationjsonSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class SuccessfulXmlAndJsonArrayOfPet {
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
    public record ApplicationxmlResponseBody(ApplicationxmlSchema.ApplicationxmlSchema1Boxed body) implements SealedResponseBody { }
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.ApplicationjsonSchema1Boxed body) implements SealedResponseBody { }

    public static class SuccessfulXmlAndJsonArrayOfPet1 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
        public SuccessfulXmlAndJsonArrayOfPet1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/xml", new ApplicationxmlMediaType()),
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, SealedMediaType mediaType, byte[] body, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException, NotImplementedException {
            if (mediaType instanceof ApplicationxmlMediaType thisMediaType) {
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new ApplicationxmlResponseBody(deserializedBody);
            } else {
                ApplicationjsonMediaType thisMediaType = (ApplicationjsonMediaType) mediaType;
                var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
                return new ApplicationjsonResponseBody(deserializedBody);
            }
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
