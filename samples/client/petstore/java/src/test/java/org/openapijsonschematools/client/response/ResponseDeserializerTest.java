package org.openapijsonschematools.client.response;

import com.google.gson.Gson;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

import javax.net.ssl.SSLSession;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;

public class ResponseDeserializerTest {
    public sealed interface SealedResponseBody permits ApplicationjsonBody, TextplainBody { }

    public record ApplicationjsonBody(AnyTypeJsonSchema.AnyTypeJsonSchema1Boxed body) implements SealedResponseBody { }

    public record TextplainBody(StringJsonSchema.StringJsonSchema1Boxed body) implements SealedResponseBody {}

    public static class ApplicationjsonMediatype extends MediaType<AnyTypeJsonSchema.AnyTypeJsonSchema1> {
        public ApplicationjsonMediatype() {
            super(AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class TextplainMediatype extends MediaType<StringJsonSchema.StringJsonSchema1> {
        public TextplainMediatype() {
            super(StringJsonSchema.StringJsonSchema1.getInstance());
        }
    }


    public static class MyResponseDeserializer extends ResponseDeserializer<SealedResponseBody, Void> {

        public MyResponseDeserializer() {
            super(Map.of("application/json", new ApplicationjsonMediatype(), "text/plain", new TextplainMediatype()));
        }

        @Override
        public SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            if (contentTypeIsJson(contentType)) {
                @Nullable Object bodyData = deserializeJson(body);
                if (!(bodyData instanceof Number numberBodyData)) {
                    throw new RuntimeException("invalid type");
                }
                var deserializedBody = AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance().validateAndBox(numberBodyData, configuration);
                return new ApplicationjsonBody(deserializedBody);
            } else {
                String bodyData = deserializeTextPlain(body);
                var deserializedBody = StringJsonSchema.StringJsonSchema1.getInstance().validateAndBox(bodyData, configuration);
                return new TextplainBody(deserializedBody);
            }
        }

        @Override
        public Void getHeaders(HttpHeaders headers) {
            return null;
        }
    }

    public static class BytesHttpResponse implements HttpResponse<byte[]> {
        private final byte[] body;
        private final HttpHeaders headers;
        public BytesHttpResponse(byte[] body, String contentType) {
            this.body = body;
            BiPredicate<String, String> headerFilter = (key, val) -> {
                return true;
            };
            this.headers = HttpHeaders.of(Map.of("Content-Type", List.of(contentType)), headerFilter);
        }

        @Override
        public int statusCode() {
            return 202;
        }

        @Override
        public HttpRequest request() {
            return null;
        }

        @Override
        public Optional<HttpResponse<byte[]>> previousResponse() {
            return Optional.empty();
        }

        @Override
        public HttpHeaders headers() {
            return headers;
        }

        @Override
        public byte[] body() {
            return body;
        }

        @Override
        public Optional<SSLSession> sslSession() {
            return Optional.empty();
        }

        @Override
        public URI uri() {
            return null;
        }

        @Override
        public HttpClient.Version version() {
            return null;
        }
    }

    @Test
    public void testSerializeApplicationJson() {
        Gson gson = new Gson();
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson(1).getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        Assert.assertTrue(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedNumber);
//        ((ApplicationjsonBody) deserializedBody).body
//        Assert.assertEquals("application/json", requestBody.contentType);
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "1");
//
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(3.14));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "3.14");
//
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(null));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "null");
//
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(true));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "true");
//
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(false));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "false");
//
//
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(List.of()));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "[]");
//
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(Map.of()));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "{}");
//
//        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
//        MapJsonSchema.MapJsonSchema1 mapJsonSchema = MapJsonSchema.MapJsonSchema1.getInstance();
//        var frozenMap = mapJsonSchema.validate(Map.of("k1", "v1", "k2", "v2"), configuration);
//        requestBody = serializer.serialize(new RequestBodySerializerTest.ApplicationjsonRequestBody(frozenMap));
//        jsonBody = getJsonBody(requestBody);
//        Assert.assertEquals(jsonBody, "{\"k2\":\"v2\",\"k1\":\"v1\"}");
    }
}