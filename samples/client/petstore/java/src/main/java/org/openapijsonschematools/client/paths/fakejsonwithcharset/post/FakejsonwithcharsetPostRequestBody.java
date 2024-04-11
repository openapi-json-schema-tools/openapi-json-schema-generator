package org.openapijsonschematools.client.paths.fakejsonwithcharset.post;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakejsonwithcharset.post.requestbody.content.applicationjsoncharsetutf8.Applicationjsoncharsetutf8Schema;

import java.util.AbstractMap;
import java.util.Map;

public class FakejsonwithcharsetPostRequestBody {
    public sealed interface SealedMediaType permits Applicationjsoncharsetutf8MediaType {}

    public record Applicationjsoncharsetutf8MediaType(Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1 schema) implements SealedMediaType, MediaType<Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1, Void> {
        public Applicationjsoncharsetutf8MediaType() {
            this(Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class FakejsonwithcharsetPostRequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public FakejsonwithcharsetPostRequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json; charset=utf-8", new Applicationjsoncharsetutf8MediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) throws NotImplementedException  {
            Applicationjsoncharsetutf8RequestBody requestBody0 = (Applicationjsoncharsetutf8RequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().getData());
        }
    }

    public sealed interface SealedRequestBody permits Applicationjsoncharsetutf8RequestBody {}
    public record Applicationjsoncharsetutf8RequestBody(Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed> {
        @Override
        public String contentType() {
            return "application/json; charset=utf-8";
        }
    }
}
