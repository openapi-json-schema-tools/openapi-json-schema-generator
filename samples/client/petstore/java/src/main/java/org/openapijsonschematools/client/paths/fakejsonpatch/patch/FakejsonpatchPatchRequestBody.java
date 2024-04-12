package org.openapijsonschematools.client.paths.fakejsonpatch.patch;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.requestbody.content.applicationjsonpatchjson.ApplicationjsonpatchjsonSchema;

import java.util.AbstractMap;
import java.util.Map;

public class FakejsonpatchPatchRequestBody {
    public sealed interface SealedMediaType permits ApplicationjsonpatchjsonMediaType {}

    public record ApplicationjsonpatchjsonMediaType(ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1, Void> {
        public ApplicationjsonpatchjsonMediaType() {
            this(ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class FakejsonpatchPatchRequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public FakejsonpatchPatchRequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json-patch+json", new ApplicationjsonpatchjsonMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) throws NotImplementedException  {
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
