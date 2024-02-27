package org.openapijsonschematools.client.paths.storeorderorderid.delete.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.DeserializedHttpResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.Map;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

public class Code400Response {

    public static class Code400Response1 extends ResponseDeserializer<Void, Void, Void> {
        public Code400Response1() {
            super(
                MapUtils.makeMap(
                )
            );
        }

        @Override
        protected Void getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            return null;
        }

        @Override
        protected Void getHeaders(HttpHeaders headers) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public static class ResponseApiException extends ApiException {
        public DeserializedHttpResponse<Void, Void> deserializedResponse;

        public ResponseApiException(String s, HttpResponse<byte[]> response, DeserializedHttpResponse<Void, Void> deserializedResponse) {
            super(s, response);
            this.deserializedResponse = deserializedResponse;
        }
    }
}
