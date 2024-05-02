package org.openapijsonschematools.client.components.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.SuccessWithJsonApiResponseHeadersSchema;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.Headers;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class SuccessWithJsonApiResponse {
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
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.ApiResponseSchema1Boxed body) implements SealedResponseBody { }

    public static class SuccessWithJsonApiResponse1 extends ResponseDeserializer<SealedResponseBody, SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap, SealedMediaType> {
        public SuccessWithJsonApiResponse1() {
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
        protected SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap getHeaders(HttpHeaders headers, SchemaConfiguration configuration) throws ValidationException, NotImplementedException {
            return new Headers().deserialize(headers, configuration);
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
