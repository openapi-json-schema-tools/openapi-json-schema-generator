/*
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakeuploadfiles.post;

import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeuploadfiles.post.requestbody.content.multipartformdata.MultipartformdataSchema;

import java.util.AbstractMap;
import java.util.Map;

public class RequestBody {

    public static class MultipartformdataMediaType extends MediaType<MultipartformdataSchema.MultipartformdataSchema1> {
        public MultipartformdataMediaType() {
            super(MultipartformdataSchema.MultipartformdataSchema1.getInstance());
        }
    }

    public static class RequestBody1 extends RequestBodySerializer<SealedRequestBody> {
        public RequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("multipart/form-data", new MultipartformdataMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            MultipartformdataRequestBody requestBody0 = (MultipartformdataRequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().getData());
        }
    }

    public sealed interface SealedRequestBody permits MultipartformdataRequestBody {}
    public record MultipartformdataRequestBody(MultipartformdataSchema.MultipartformdataSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<MultipartformdataSchema.MultipartformdataSchema1Boxed> {
        @Override
        public String contentType() {
            return "multipart/form-data";
        }
    }
}
