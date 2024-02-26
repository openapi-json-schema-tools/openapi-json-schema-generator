package org.openapijsonschematools.client.components.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.Map;
import java.net.http.HttpHeaders;

public class HeadersWithNoBody {

    public static class HeadersWithNoBody1 extends ResponseDeserializer<Void, Void, Void> {
        public HeadersWithNoBody1() {
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
