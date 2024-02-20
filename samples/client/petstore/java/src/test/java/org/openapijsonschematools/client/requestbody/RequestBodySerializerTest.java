package org.openapijsonschematools.client.requestbody;

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.MapJsonSchema;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;

import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Flow;

public final class RequestBodySerializerTest {

    public sealed interface SealedRequestBody permits ApplicationjsonRequestBody, TextplainRequestBody {}
    public static final class ApplicationjsonRequestBody implements SealedRequestBody, GenericRequestBody<@Nullable Object> {
        private final String contentType;
        private final @Nullable Object body;
        public ApplicationjsonRequestBody(@Nullable Object body) {
            contentType = "application/json";
            this.body = body;
        }
        @Override
        public String contentType() {
            return contentType;
        }

        @Override
        public @Nullable Object body() {
            return body;
        }
    }
    public static final class TextplainRequestBody implements SealedRequestBody, GenericRequestBody<@Nullable Object> {
        private final String contentType;
        private final @Nullable Object body;
        public TextplainRequestBody(@Nullable Object body) {
            contentType = "text/plain";
            this.body = body;
        }
        @Override
        public String contentType() {
            return contentType;
        }

        @Override
        public @Nullable Object body() {
            return body;
        }
    }

    public static class MyRequestBodySerializer extends RequestBodySerializer<SealedRequestBody> {
        public MyRequestBodySerializer() {
            super(Map.of(), true);
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            if (requestBody instanceof ApplicationjsonRequestBody requestBody0) {
                return serialize(requestBody0.contentType(), requestBody0.body());
            } else {
                TextplainRequestBody requestBody1 = (TextplainRequestBody) requestBody;
                return serialize(requestBody1.contentType(), requestBody1.body());
            }
        }
    }

    @Test
    public void testContentTypeIsJson() {
        var serializer = new MyRequestBodySerializer();
        Assert.assertTrue(serializer.contentTypeIsJson("application/json"));
        Assert.assertTrue(serializer.contentTypeIsJson("application/json; charset=UTF-8"));
        Assert.assertTrue(serializer.contentTypeIsJson("application/json-patch+json"));
        Assert.assertTrue(serializer.contentTypeIsJson("application/geo+json"));

        Assert.assertFalse(serializer.contentTypeIsJson("application/octet-stream"));
        Assert.assertFalse(serializer.contentTypeIsJson("text/plain"));
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
        var serializer = new MyRequestBodySerializer();
        String jsonBody;
        SerializedRequestBody requestBody = serializer.serialize(new ApplicationjsonRequestBody(1));
        Assert.assertEquals("application/json", requestBody.contentType);
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "1");

        requestBody = serializer.serialize(new ApplicationjsonRequestBody(3.14));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "3.14");

        requestBody = serializer.serialize(new ApplicationjsonRequestBody(null));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "null");

        requestBody = serializer.serialize(new ApplicationjsonRequestBody(true));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "true");

        requestBody = serializer.serialize(new ApplicationjsonRequestBody(false));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "false");


        requestBody = serializer.serialize(new ApplicationjsonRequestBody(List.of()));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "[]");

        requestBody = serializer.serialize(new ApplicationjsonRequestBody(Map.of()));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "{}");

        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        MapJsonSchema.MapJsonSchema1 mapJsonSchema = MapJsonSchema.MapJsonSchema1.getInstance();
        var frozenMap = mapJsonSchema.validate(Map.of("k1", "v1", "k2", "v2"), configuration);
        requestBody = serializer.serialize(new ApplicationjsonRequestBody(frozenMap));
        jsonBody = getJsonBody(requestBody);
        Assert.assertEquals(jsonBody, "{\"k2\":\"v2\",\"k1\":\"v1\"}");
    }

    @Test
    public void testSerializeTextPlain() {
        var serializer = new MyRequestBodySerializer();
        SerializedRequestBody requestBody = serializer.serialize(new TextplainRequestBody("a"));
        Assert.assertEquals("text/plain", requestBody.contentType);
        String textBody = getJsonBody(requestBody);
        Assert.assertEquals(textBody, "a");

        Assert.assertThrows(
                RuntimeException.class,
                () -> serializer.serialize(new TextplainRequestBody(null))
        );
    }
}