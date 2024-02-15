/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakerefsnumber.post;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakerefsnumber.post.requestbody.content.applicationjson.ApplicationjsonSchema;
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
            return switch (requestBody) {
                case ApplicationjsonRequestBody applicationJsonRequestBody -> serialize(applicationJsonRequestBody.contentType(), applicationJsonRequestBody.body());
            }
        }
    }

    public static abstract sealed class SealedRequestBody permits ApplicationjsonRequestBody {}
    public static final class ApplicationjsonRequestBody extends SealedRequestBody implements GenericRequestBody<ApplicationjsonSchema.NumberWithValidations1Boxed> {
        private final String contentType;
        private final ApplicationjsonSchema.NumberWithValidations1Boxed body;
        public ApplicationjsonRequestBody(ApplicationjsonSchema.NumberWithValidations1Boxed body) {
            contentType = "application/json";
            this.body = body;
        }
        @Override
        public String contentType() {
            return contentType;
        }

        @Override
        public ApplicationjsonSchema.NumberWithValidations1Boxed body() {
            return body;
        }
    }
}
