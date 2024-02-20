package org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.responses;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.response.ApiResponse;
import org.openapijsonschematools.client.response.DeserializedApiResponse;
import org.openapijsonschematools.client.response.ResponseDeserializer;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.responses.code200response.content.applicationjson.ApplicationjsonSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.net.http.HttpHeaders;

public class Model200 {

    public static class ApplicationjsonMediaType extends MediaType<ApplicationjsonSchema.ApplicationjsonSchema1> {
        public ApplicationjsonMediaType() {
            super(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
    }
    public sealed interface SealedResponseBody permits ApplicationjsonResponseBody {}
    public record ApplicationjsonResponseBody(ApplicationjsonSchema.ApiResponseSchema1Boxed body) implements SealedResponseBody { }

    public static class Model2001 extends ResponseDeserializer<SealedResponseBody, Void> {
        public Model2001() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }

        @Override
        public SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            if ("application/json".equals(contentType)) {
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
