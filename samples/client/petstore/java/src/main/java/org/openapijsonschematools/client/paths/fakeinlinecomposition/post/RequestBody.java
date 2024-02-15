/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakeinlinecomposition.post;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.requestbody.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.requestbody.content.multipartformdata.MultipartformdataSchema;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.AbstractMap;
import java.util.Map;

public class RequestBody {

    public static class ApplicationjsonMediaType extends MediaType<ApplicationjsonSchema.ApplicationjsonSchema1> {
        public ApplicationjsonMediaType() {
            super(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
    }

    public static class MultipartformdataMediaType extends MediaType<MultipartformdataSchema.MultipartformdataSchema1> {
        public MultipartformdataMediaType() {
            super(MultipartformdataSchema.MultipartformdataSchema1.getInstance());
        }
    }

    public static class RequestBody1 extends RequestBodySerializer<SealedRequestBody> {
       public RequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType()),
                    new AbstractMap.SimpleEntry<>("multipart/form-data", new MultipartformdataMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            return switch (requestBody) {
                case ApplicationjsonRequestBody applicationJsonRequestBody -> serialize(applicationJsonRequestBody.contentType(), applicationJsonRequestBody.body());
                case MultipartformdataRequestBody multipartFormDataRequestBody -> serialize(multipartFormDataRequestBody.contentType(), multipartFormDataRequestBody.body());
            }
        }
    }

    public static abstract sealed class SealedRequestBody permits ApplicationjsonRequestBody, MultipartformdataRequestBody {}
    public static final class ApplicationjsonRequestBody extends SealedRequestBody implements GenericRequestBody<ApplicationjsonSchema.ApplicationjsonSchema1Boxed> {
        private final String contentType;
        private final ApplicationjsonSchema.ApplicationjsonSchema1Boxed body;
        public ApplicationjsonRequestBody(ApplicationjsonSchema.ApplicationjsonSchema1Boxed body) {
            contentType = "application/json";
            this.body = body;
        }
        @Override
        public String contentType() {
            return contentType;
        }

        @Override
        public ApplicationjsonSchema.ApplicationjsonSchema1Boxed body() {
            return body;
        }
    }
    public static final class MultipartformdataRequestBody extends SealedRequestBody implements GenericRequestBody<MultipartformdataSchema.MultipartformdataSchema1Boxed> {
        private final String contentType;
        private final MultipartformdataSchema.MultipartformdataSchema1Boxed body;
        public MultipartformdataRequestBody(MultipartformdataSchema.MultipartformdataSchema1Boxed body) {
            contentType = "multipart/form-data";
            this.body = body;
        }
        @Override
        public String contentType() {
            return contentType;
        }

        @Override
        public MultipartformdataSchema.MultipartformdataSchema1Boxed body() {
            return body;
        }
    }
}
