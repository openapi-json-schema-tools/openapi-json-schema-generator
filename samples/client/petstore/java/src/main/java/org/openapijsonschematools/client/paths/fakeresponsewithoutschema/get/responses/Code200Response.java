package org.openapijsonschematools.client.paths.fakeresponsewithoutschema.get.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.schemas.validation.MapUtils;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Code200Response {

    public static class Code200Response1 extends ResponseDeserializer<Void, Void, Void> {
        public Code200Response1() {
            super(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Void>("application/json", null),
                    new AbstractMap.SimpleEntry<String, Void>("application/xml", null)
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
}
