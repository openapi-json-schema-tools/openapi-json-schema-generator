package org.openapijsonschematools.client.paths.storeorderorderid.delete.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.DeserializedApiResponse;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.mediatype.MediaType;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Model404 {

    public static class Model4041 extends ResponseDeserializer<Void, Void> {
        public Model4041() {
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
