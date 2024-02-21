package org.openapijsonschematools.client.paths.userusername.put.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.DeserializedApiResponse;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.mediatype.MediaType;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Model400 {

    public static class Model4001 extends ResponseDeserializer<Void, Void, Void> {
        public Model4001() {
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
