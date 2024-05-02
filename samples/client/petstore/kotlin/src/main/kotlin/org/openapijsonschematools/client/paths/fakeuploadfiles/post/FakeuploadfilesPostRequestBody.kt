package org.openapijsonschematools.client.paths.fakeuploadfiles.post;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakeuploadfiles.post.requestbody.content.multipartformdata.MultipartformdataSchema;

import java.util.AbstractMap;
import java.util.Map;

public class FakeuploadfilesPostRequestBody {
    public sealed interface SealedMediaType permits MultipartformdataMediaType {}

    public record MultipartformdataMediaType(MultipartformdataSchema.MultipartformdataSchema1 schema) implements SealedMediaType, MediaType<MultipartformdataSchema.MultipartformdataSchema1, Nothing?> {
        public MultipartformdataMediaType() {
            this(MultipartformdataSchema.MultipartformdataSchema1.getInstance());
        }
        @Override
        public Nothing? encoding() {
            return null;
        }
    }

    public static class FakeuploadfilesPostRequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public FakeuploadfilesPostRequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("multipart/form-data", new MultipartformdataMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) throws NotImplementedException  {
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
