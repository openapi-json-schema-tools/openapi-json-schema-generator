/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakerefsboolean.post;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakerefsboolean.post.requestbody.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.AbstractMap;
import java.util.Map;

public class RequestBody {

    public static class ApplicationjsonMediaType extends MediaType<ApplicationjsonSchema.ApplicationjsonSchema1> {
        public ApplicationjsonMediaType() {
            super(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
    }

    public static class RequestBody1 extends RequestBodySerializer<SealedRequestBody> {
        public RequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            ApplicationjsonRequestBody requestBody0 = (ApplicationjsonRequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().getData());
        }
    }

    public sealed interface SealedRequestBody permits ApplicationjsonRequestBody {}
    public record ApplicationjsonRequestBody(ApplicationjsonSchema.BooleanJsonSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationjsonSchema.BooleanJsonSchema1Boxed> {
        @Override
        public String contentType() {
            return "application/json";
        }
    }
}
