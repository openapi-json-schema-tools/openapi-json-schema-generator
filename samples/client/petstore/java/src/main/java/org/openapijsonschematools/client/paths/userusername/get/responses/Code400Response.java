package org.openapijsonschematools.client.paths.userusername.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.ApiResponse;
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
        public ApiResponse<Void, Void> apiResponse;

        public ResponseApiException(String s, HttpResponse<byte[]> response, ApiResponse<Void, Void> apiResponse) {
            super(s, response);
            this.apiResponse = apiResponse;
        }
    }
}
