package org.openapijsonschematools.client.paths.storeorderorderid.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.Map;
import java.net.http.HttpHeaders;

public class Code404Response {

    public static class Code404Response1 extends ResponseDeserializer<Void, Void, Void> {
        public Code404Response1() {
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
    public class ResponseApiException extends ApiException {
        public HttpResponse<byte[]> response;
        public ApiResponse<Void, Void> apiResponse;

        public ValidationException(String s, HttpResponse<byte[]> response, ApiResponse<Void, Void> apiResponse) {
            super(s, response);
            this.response = response;
            this.apiResponse = apiResponse;
        }
    }
}
