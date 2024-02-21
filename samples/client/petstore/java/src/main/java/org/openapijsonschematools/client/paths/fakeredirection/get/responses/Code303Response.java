package org.openapijsonschematools.client.paths.fakeredirection.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;

import java.util.Map;
import java.net.http.HttpHeaders;

public class Code303Response {

    public static class Code303Response1 extends ResponseDeserializer<Void, Void, Void> {
        public Code303Response1() {
            super(
                Map.ofEntries(
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
