package org.openapijsonschematools.client.paths.petfindbystatus.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;

import java.util.Map;
import java.net.http.HttpHeaders;

public class Code400Response {

    public static class Code400Response1 extends ResponseDeserializer<Void, Void, Void> {
        public Code400Response1() {
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
