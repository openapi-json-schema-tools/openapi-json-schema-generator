/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.petpetid.post;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.petpetid.post.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.AbstractMap;
import java.util.Map;

public class RequestBody {

    public static class ApplicationxwwwformurlencodedMediaType extends MediaType<ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1> {
        public ApplicationxwwwformurlencodedMediaType() {
            super(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1.getInstance());
        }
    }

    public static class RequestBody1 extends RequestBodySerializer<SealedRequestBody> {
        public RequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/x-www-form-urlencoded", new ApplicationxwwwformurlencodedMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            ApplicationxwwwformurlencodedRequestBody requestBody0 = (ApplicationxwwwformurlencodedRequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().data());
        }
    }

    public static abstract sealed class SealedRequestBody permits ApplicationxwwwformurlencodedRequestBody {}
    public static final class ApplicationxwwwformurlencodedRequestBody extends SealedRequestBody implements GenericRequestBody<ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed> {
        private final String contentType;
        private final ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed body;
        public ApplicationxwwwformurlencodedRequestBody(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed body) {
            contentType = "application/x-www-form-urlencoded";
            this.body = body;
        }
        @Override
        public String contentType() {
            return contentType;
        }

        @Override
        public ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed body() {
            return body;
        }
    }
}
