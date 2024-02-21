package org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.DeserializedApiResponse;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeuploaddownloadfile.post.responses.code200response.content.applicationoctetstream.ApplicationoctetstreamSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Model200 {
    public sealed interface SealedMediaType permits ApplicationoctetstreamMediaType {}

    public record ApplicationoctetstreamMediaType(ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1 schema) implements SealedMediaType, MediaType<ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1, Void> {
        public ApplicationoctetstreamMediaType() {
            super(ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }
    public sealed interface SealedResponseBody permits ApplicationoctetstreamResponseBody {}
    public record ApplicationoctetstreamResponseBody(ApplicationoctetstreamSchema.StringJsonSchema1Boxed body) implements SealedResponseBody { }

    public static class Model2001 extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {
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
