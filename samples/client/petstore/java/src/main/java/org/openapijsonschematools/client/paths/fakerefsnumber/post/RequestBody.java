/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakerefsnumber.post;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakerefsnumber.post.requestbody.content.applicationjson.ApplicationjsonSchema;

import java.util.AbstractMap;
import java.util.Map;

public class RequestBody {
    public sealed interface SealedMediaType permits ApplicationjsonMediaType {}

    public record ApplicationjsonMediaType(ApplicationjsonSchema.ApplicationjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonSchema.ApplicationjsonSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class RequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
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
    public record ApplicationjsonRequestBody(ApplicationjsonSchema.NumberWithValidations1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationjsonSchema.NumberWithValidations1Boxed> {
        @Override
        public String contentType() {
            return "application/json";
        }
    }
}
