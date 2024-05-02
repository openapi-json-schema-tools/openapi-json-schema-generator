package org.openapijsonschematools.client.paths.pet.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class PetPostCode405Response {

    public static class PetPostCode405Response1 extends ResponseDeserializer<Nothing?, Nothing?, Nothing?> {
        public PetPostCode405Response1() {
            super(
                MapUtils.makeMap(
                )
            );
        }

        @Override
        protected Nothing? getBody(String contentType, Nothing? mediaType, byte[] body, SchemaConfiguration configuration) {
            return null;
        }

        @Override
        protected Nothing? getHeaders(HttpHeaders headers, SchemaConfiguration configuration) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public static class ResponseApiException extends ApiException {
        public DeserializedHttpResponse<Nothing?, Nothing?> deserializedResponse;

        public ResponseApiException(String s, HttpResponse<byte[]> response, DeserializedHttpResponse<Nothing?, Nothing?> deserializedResponse) {
            super(s, response);
            this.deserializedResponse = deserializedResponse;
        }
    }
}
