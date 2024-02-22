package org.openapijsonschematools.client.paths.petpetid.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.Map;
import java.net.http.HttpHeaders;

public class Code405Response {

    public static class Code405Response1 extends ResponseDeserializer<Void, Void, Void> {
        public Code405Response1() {
            super(
                MapUtils.makeMap(
                )
            );
        }

        @Override
        public Void getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            return null;
        }

        @Override
        public Void getHeaders(HttpHeaders headers) {
            return null;
        }
    }
}
