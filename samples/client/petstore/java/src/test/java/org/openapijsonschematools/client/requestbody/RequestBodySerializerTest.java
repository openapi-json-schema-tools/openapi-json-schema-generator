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

    public static abstract sealed class SealedRequestBody permits ApplicationjsonRequestBody, ApplicationgeojsonRequestBody {}
    public static final class ApplicationjsonRequestBody extends SealedRequestBody implements GenericRequestBody<@Nullable Object> {
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
    public static final class ApplicationgeojsonRequestBody extends SealedRequestBody implements GenericRequestBody<@Nullable Object> {
        private final String contentType;
        private final @Nullable Object body;
        public ApplicationgeojsonRequestBody(@Nullable Object body) {
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

    public static class MyRequestBodySerializer extends RequestBodySerializer<SealedRequestBody> {
        public MyRequestBodySerializer() {
            super(Map.of(), true);
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) {
            if (requestBody instanceof ApplicationjsonRequestBody requestBody0) {
                return serialize(requestBody0.contentType(), requestBody0.body());
            } else {
                ApplicationgeojsonRequestBody requestBody1 = (ApplicationgeojsonRequestBody) requestBody;
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

    private String getJsonBody(MyRequestBodySerializer serializer, SealedRequestBody body) {
        SerializedRequestBody requestBody = serializer.serialize(body);
        Assert.assertEquals(requestBody.contentType, "application/json");

        var bodySubscriber = HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8);
        var flowSubscriber = new StringSubscriber(bodySubscriber);
        requestBody.bodyPublisher.subscribe(flowSubscriber);

        return bodySubscriber.getBody().toCompletableFuture().join();
    }

    @Test
    public void testSerialize() {
        var serializer = new MyRequestBodySerializer();
        String jsonBody;
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(1));
        Assert.assertEquals(jsonBody, "1");
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(3.14));
        Assert.assertEquals(jsonBody, "3.14");
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(null));
        Assert.assertEquals(jsonBody, "null");
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(true));
        Assert.assertEquals(jsonBody, "true");
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(false));
        Assert.assertEquals(jsonBody, "false");
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(List.of()));
        Assert.assertEquals(jsonBody, "[]");
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(Map.of()));
        Assert.assertEquals(jsonBody, "{}");

        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        MapJsonSchema.MapJsonSchema1 mapJsonSchema = MapJsonSchema.MapJsonSchema1.getInstance();
        var frozenMap = mapJsonSchema.validate(Map.of("k1", "v1", "k2", "v2"), configuration);
        jsonBody = getJsonBody(
                serializer,
                new ApplicationgeojsonRequestBody(frozenMap));
        Assert.assertEquals(jsonBody, "{\"k2\":\"v2\",\"k1\":\"v1\"}");
    }
}
