package org.openapijsonschematools.client.;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.DeserializedApiResponse;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses.response200.content.applicationoctetstream.ApplicationoctetstreamSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Model200 {

    public static class ApplicationoctetstreamMediaType extends MediaType<ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1> {
        public ApplicationoctetstreamMediaType() {
            super(ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1.getInstance());
        }
    }
    public sealed interface SealedResponseBody permits ApplicationoctetstreamResponseBody {}
    public record ApplicationoctetstreamResponseBody(ApplicationoctetstreamSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Model2001 extends ResponseDeserializer<SealedResponseBody, Void> {
        public Model2001() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/octet-stream", new ApplicationoctetstreamMediaType())
                )
            );
        }

        @Override
        public SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            if ("application/octet-stream".equals(contentType)) {
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
