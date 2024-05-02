package org.openapijsonschematools.client.paths.fake.get;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fake.get.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;

import java.util.AbstractMap;
import java.util.Map;

public class FakeGetRequestBody {
    public sealed interface SealedMediaType permits ApplicationxwwwformurlencodedMediaType {}

    public record ApplicationxwwwformurlencodedMediaType(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1 schema) implements SealedMediaType, MediaType<ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1, Nothing?> {
        public ApplicationxwwwformurlencodedMediaType() {
            this(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1.getInstance());
        }
        @Override
        public Nothing? encoding() {
            return null;
        }
    }

    public static class FakeGetRequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public FakeGetRequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/x-www-form-urlencoded", new ApplicationxwwwformurlencodedMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) throws NotImplementedException  {
            ApplicationxwwwformurlencodedRequestBody requestBody0 = (ApplicationxwwwformurlencodedRequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().getData());
        }
    }

    public sealed interface SealedRequestBody permits ApplicationxwwwformurlencodedRequestBody {}
    public record ApplicationxwwwformurlencodedRequestBody(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed> {
        @Override
        public String contentType() {
            return "application/x-www-form-urlencoded";
        }
    }
}
