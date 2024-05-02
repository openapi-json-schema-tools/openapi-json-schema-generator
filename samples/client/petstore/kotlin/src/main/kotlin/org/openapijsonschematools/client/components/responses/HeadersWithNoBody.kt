package org.openapijsonschematools.client.components.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.components.responses.headerswithnobody.HeadersWithNoBodyHeadersSchema;
import org.openapijsonschematools.client.components.responses.headerswithnobody.Headers;

import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class HeadersWithNoBody {

    public static class HeadersWithNoBody1 extends ResponseDeserializer<Nothing?, HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMap, Nothing?> {
        public HeadersWithNoBody1() {
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
        protected HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMap getHeaders(HttpHeaders headers, SchemaConfiguration configuration) throws ValidationException, NotImplementedException {
            return new Headers().deserialize(headers, configuration);
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
