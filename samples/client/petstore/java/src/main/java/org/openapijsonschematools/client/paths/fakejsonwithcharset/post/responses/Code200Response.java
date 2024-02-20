package org.openapijsonschematools.client.paths.fakejsonwithcharset.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.DeserializedApiResponse;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.post.responses.code200response.content.applicationjsoncharsetutf8.Applicationjsoncharsetutf8Schema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Model200 {

    public static class Applicationjsoncharsetutf8MediaType extends MediaType<Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1> {
        public Applicationjsoncharsetutf8MediaType() {
            super(Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1.getInstance());
        }
    }
    public sealed interface SealedResponseBody permits Applicationjsoncharsetutf8ResponseBody {}
    public record Applicationjsoncharsetutf8ResponseBody(Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Model2001 extends ResponseDeserializer<SealedResponseBody, Void> {
        public Model2001() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json; charset=utf-8", new Applicationjsoncharsetutf8MediaType())
                )
            );
        }

        @Override
        public SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            if ("application/json; charset=utf-8".equals(contentType)) {
                // todo implement deserialization
            }
            throw new RuntimeException("contentType="+contentType+" returned by the server is unknown and does not exist in the openapi document");
        }

        @Override
        public Void getHeaders(HttpHeaders headers) {
            return null;
        }
    }
}
