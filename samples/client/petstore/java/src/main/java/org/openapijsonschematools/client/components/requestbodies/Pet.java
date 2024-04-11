package org.openapijsonschematools.client.components.requestbodies;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.components.requestbodies.pet.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.components.requestbodies.pet.content.applicationxml.ApplicationxmlSchema;

import java.util.AbstractMap;
import java.util.Map;

public class Pet {
    public sealed interface SealedMediaType permits ApplicationjsonMediaType, ApplicationxmlMediaType {}

    public record ApplicationjsonMediaType(ApplicationjsonSchema.ApplicationjsonSchema1 schema) implements SealedMediaType, MediaType<ApplicationjsonSchema.ApplicationjsonSchema1, Void> {
        public ApplicationjsonMediaType() {
            this(ApplicationjsonSchema.ApplicationjsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public record ApplicationxmlMediaType(ApplicationxmlSchema.ApplicationxmlSchema1 schema) implements SealedMediaType, MediaType<ApplicationxmlSchema.ApplicationxmlSchema1, Void> {
        public ApplicationxmlMediaType() {
            this(ApplicationxmlSchema.ApplicationxmlSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class Pet1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public Pet1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType()),
                    new AbstractMap.SimpleEntry<>("application/xml", new ApplicationxmlMediaType())
                ),
                true
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) throws NotImplementedException  {
            if (requestBody instanceof ApplicationjsonRequestBody requestBody0) {
                return serialize(requestBody0.contentType(), requestBody0.body().getData());
            } else  {
                ApplicationxmlRequestBody requestBody1 = (ApplicationxmlRequestBody) requestBody;
                return serialize(requestBody1.contentType(), requestBody1.body().getData());
            }
        }
    }

    public sealed interface SealedRequestBody permits ApplicationjsonRequestBody, ApplicationxmlRequestBody {}
    public record ApplicationjsonRequestBody(ApplicationjsonSchema.Pet1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationjsonSchema.Pet1Boxed> {
        @Override
        public String contentType() {
            return "application/json";
        }
    }
    public record ApplicationxmlRequestBody(ApplicationxmlSchema.Pet1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationxmlSchema.Pet1Boxed> {
        @Override
        public String contentType() {
            return "application/xml";
        }
    }
}
