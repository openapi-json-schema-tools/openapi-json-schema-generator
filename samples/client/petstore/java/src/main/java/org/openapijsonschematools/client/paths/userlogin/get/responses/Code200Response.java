package org.openapijsonschematools.client.paths.userlogin.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.content.applicationxml.ApplicationxmlSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.Code200ResponseHeadersSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.Headers;

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
    public record ApplicationxmlResponseBody(ApplicationxmlSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Code200Response1 extends ResponseDeserializer<SealedResponseBody, Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMap, SealedMediaType> {
        public Code200Response1() {
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
        protected Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMap getHeaders(HttpHeaders headers, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException, NotImplementedException {
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
