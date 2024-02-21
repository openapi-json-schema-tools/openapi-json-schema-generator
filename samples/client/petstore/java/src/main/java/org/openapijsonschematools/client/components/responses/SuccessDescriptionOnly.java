package org.openapijsonschematools.client.components.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;

import java.util.Map;
import java.net.http.HttpHeaders;

public class SuccessDescriptionOnly {

    public static class SuccessDescriptionOnly1 extends ResponseDeserializer<Void, Void, Void> {
        public SuccessDescriptionOnly1() {
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
