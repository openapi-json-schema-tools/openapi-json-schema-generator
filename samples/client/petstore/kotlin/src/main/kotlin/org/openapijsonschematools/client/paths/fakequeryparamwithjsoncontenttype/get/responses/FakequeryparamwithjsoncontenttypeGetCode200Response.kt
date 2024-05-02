package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.responses.code200response.content.applicationjson.ApplicationjsonSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class FakequeryparamwithjsoncontenttypeGetCode200Response {
    public sealed interface SealedMediaType permits ApplicationjsonMediaType {}

    public record ApplicationjsonMediaType(ApplicationjsonSchema.ApplicationjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonSchema.ApplicationjsonSchema1, Nothing?> {
        public ApplicationjsonMediaType() {
            this(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
        @Override
        public Nothing? encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationjsonResponseBody {}
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.AnyTypeJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class FakequeryparamwithjsoncontenttypeGetCode200Response1 extends ResponseDeserializer<SealedResponseBody, Nothing?, SealedMediaType> {
        public FakequeryparamwithjsoncontenttypeGetCode200Response1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }

        @Override
        protected SealedResponseBody getBody(String contentType, SealedMediaType mediaType, byte[] body, SchemaConfiguration configuration) throws ValidationException, NotImplementedException {
            ApplicationjsonMediaType thisMediaType = (ApplicationjsonMediaType) mediaType;
            var deserializedBody = deserializeBody(contentType, body, thisMediaType.schema(), configuration);
            return new ApplicationjsonResponseBody(deserializedBody);
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
