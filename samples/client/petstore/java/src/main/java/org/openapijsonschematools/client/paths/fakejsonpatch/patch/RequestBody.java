/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakejsonpatch.patch;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.requestbody.content.applicationjsonpatchjson.ApplicationjsonpatchjsonSchema;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.AbstractMap;
import java.util.Map;

public class RequestBody {

    public static class ApplicationjsonpatchjsonMediaType extends MediaType<ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1> {
        public ApplicationjsonpatchjsonMediaType() {
            super(ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1.getInstance());
        }
    }

    public static class RequestBody1 extends RequestBodySerializer<SealedRequestBody> {
        public RequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json-patch+json", new ApplicationjsonpatchjsonMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            ApplicationjsonpatchjsonRequestBody requestBody0 = (ApplicationjsonpatchjsonRequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().getData());
        }
    }

    public sealed interface SealedRequestBody permits ApplicationjsonpatchjsonRequestBody {}
    public record ApplicationjsonpatchjsonRequestBody(ApplicationjsonpatchjsonSchema.JSONPatchRequest1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationjsonpatchjsonSchema.JSONPatchRequest1Boxed> {
        @Override
        public String contentType() {
            return "application/json-patch+json";
        }
    }
}
