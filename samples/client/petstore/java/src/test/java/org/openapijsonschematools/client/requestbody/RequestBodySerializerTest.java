package org.openapijsonschematools.client.requestbody;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Flow;

public final class RequestBodySerializerTest {
    public sealed interface SealedMediaType permits ApplicationjsonMediaType, TextplainMediaType {}
    public record ApplicationjsonMediaType(AnyTypeJsonSchema.AnyTypeJsonSchema1 schema) implements SealedMediaType {}
    public record TextplainMediaType(StringJsonSchema.StringJsonSchema1 schema) implements SealedMediaType {}

    public sealed interface SealedRequestBody permits ApplicationjsonRequestBody, TextplainRequestBody {}
    public record ApplicationjsonRequestBody(AnyTypeJsonSchema.AnyTypeJsonSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<@Nullable Object> {
        @Override
        public String contentType() {
            return "application/json";
        }
    }
    public record TextplainRequestBody(StringJsonSchema.StringJsonSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<@Nullable Object> {
        @Override
        public String contentType() {
            return "text/plain";
        }
    }

    public static class MyRequestBodySerializer extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public MyRequestBodySerializer() {
            super(
                    Map.ofEntries(
                            new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType(AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance())),
                            new AbstractMap.SimpleEntry<>("application/json", new TextplainMediaType(StringJsonSchema.StringJsonSchema1.getInstance()))
                    ),
                    true);
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            if (requestBody instanceof ApplicationjsonRequestBody requestBody0) {
                return serialize(requestBody0.contentType(), requestBody0.body().getData());
            } else {
                TextplainRequestBody requestBody1 = (TextplainRequestBody) requestBody;
                return serialize(requestBody1.contentType(), requestBody1.body().getData());
            }
        }
    }

    @Test
    public void testContentTypeIsJson() {
        Assert.assertTrue(RequestBodySerializer.contentTypeIsJson("application/json"));
        Assert.assertTrue(RequestBodySerializer.contentTypeIsJson("application/json; charset=UTF-8"));
        Assert.assertTrue(RequestBodySerializer.contentTypeIsJson("application/json-patch+json"));
        Assert.assertTrue(RequestBodySerializer.contentTypeIsJson("application/geo+json"));

        Assert.assertFalse(RequestBodySerializer.contentTypeIsJson("application/octet-stream"));
        Assert.assertFalse(RequestBodySerializer.contentTypeIsJson("text/plain"));
    }

    static final class StringSubscriber implements Flow.Subscriber<ByteBuffer> {
        final HttpResponse.BodySubscriber<String> wrapped;
        StringSubscriber(HttpResponse.BodySubscriber<String> wrapped) {
            this.wrapped = wrapped;
        }
        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            wrapped.onSubscribe(subscription);
        }
        @Override
        public void onNext(ByteBuffer item) { wrapped.onNext(List.of(item)); }
        @Override
        public void onError(Throwable throwable) { wrapped.onError(throwable); }
        @Override
        public void onComplete() { wrapped.onComplete(); }
    }

    private String getJsonBody(SerializedRequestBody requestBody) {
        var bodySubscriber = HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8);
        var flowSubscriber = new StringSubscriber(bodySubscriber);
        requestBody.bodyPublisher.subscribe(flowSubscriber);
        return bodySubscriber.getBody().toCompletableFuture().join();
    }

    @Test
    public void testSerializeApplicationJson() {
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        var serializer = new MyRequestBodySerializer();
        String jsonBody;
        SerializedRequestBody requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(1, configuration)
            )
        );
        Assert.assertEquals("application/json", requestBody.contentType);
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "1");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(3.14, configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "3.14");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox((Void) null, configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "null");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(true, configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "true");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(false, configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "false");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(List.of(), configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "[]");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(Map.of(), configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "{}");

        requestBody = serializer.serialize(
            new ApplicationjsonRequestBody(
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(Map.of("k1", "v1", "k2", "v2"), configuration)
            )
        );
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "{\"k2\":\"v2\",\"k1\":\"v1\"}");
    }

    @Test
    public void testSerializeTextPlain() {
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        var serializer = new MyRequestBodySerializer();
        SerializedRequestBody requestBody = serializer.serialize(
            new TextplainRequestBody(
                StringJsonSchema.StringJsonSchema1.getInstance().validateAndBox("a", configuration)
            )
        );
        Assert.assertEquals("text/plain", requestBody.contentType);
        String textBody = getJsonBody(requestBody);
        Assert.assertEquals(textBody, "a");
    }
}