/*
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
*/

package org.openapijsonschematools.client.paths.fakejsonformdata.get;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;

import java.util.AbstractMap;
import java.util.Map;

public class FakejsonformdataGetRequestBody {
    public sealed interface SealedMediaType permits ApplicationxwwwformurlencodedMediaType {}

    public record ApplicationxwwwformurlencodedMediaType(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1 schema) implements SealedMediaType, MediaType<ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1, Void> {
        public ApplicationxwwwformurlencodedMediaType() {
            this(ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class FakejsonformdataGetRequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public FakejsonformdataGetRequestBody1() {
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
