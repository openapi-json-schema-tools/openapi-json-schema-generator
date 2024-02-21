package org.openapijsonschematools.client.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
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
    private static final Gson gson = new GsonBuilder()
            .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .setNumberToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .create();
    public sealed interface SealedResponseBody permits ApplicationjsonBody, TextplainBody { }

    public record ApplicationjsonBody(AnyTypeJsonSchema.AnyTypeJsonSchema1Boxed body) implements SealedResponseBody { }

    public record TextplainBody(StringJsonSchema.StringJsonSchema1Boxed body) implements SealedResponseBody {}

    public sealed interface SealedMediaType permits ApplicationjsonMediatype, TextplainMediatype { }

    public record ApplicationjsonMediatype(AnyTypeJsonSchema.AnyTypeJsonSchema1 schema) implements SealedMediaType, MediaType<AnyTypeJsonSchema.AnyTypeJsonSchema1, Void> {
        public ApplicationjsonMediatype() {
            this(AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
        public Class<AnyTypeJsonSchema.AnyTypeJsonSchema1Boxed> sealedType() {
            return AnyTypeJsonSchema.AnyTypeJsonSchema1Boxed.class;
        }

        @Override
        public Void encoding() {
            return null;
        }
    }

    public record TextplainMediatype(StringJsonSchema.StringJsonSchema1 schema) implements SealedMediaType, MediaType<StringJsonSchema.StringJsonSchema1, Void> {
        public TextplainMediatype() {
            this(StringJsonSchema.StringJsonSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class MyResponseDeserializer extends ResponseDeserializer<SealedResponseBody, Void, SealedMediaType> {

        public MyResponseDeserializer() {
            super(Map.of("application/json", new ApplicationjsonMediatype(), "text/plain", new TextplainMediatype()));
        }

        @Override
        public SealedResponseBody getBody(String contentType, byte[] body, SchemaConfiguration configuration) {
            SealedMediaType mediaType = content.get(contentType);
            if (mediaType == null) {
                throw new RuntimeException("Invalid contentType was received back from the server that does not exist in the openapi document");
            }
            if (mediaType instanceof ApplicationjsonMediatype thisMediaType) {
                /*
                var deserializedBody = deserializeBody(String contentType, JsonSchema<T> schema);
                if contentType is json
                    @Nullable Object bodyData = deserializeJson(body);
                    return schema.validateAndBox(bodyData, configuration)
                 */
                @Nullable Object bodyData = deserializeJson(body);
                var deserializedBody = thisMediaType.schema.validateAndBox(bodyData, configuration);
                return new ApplicationjsonBody(deserializedBody);
            } else {
                TextplainMediatype thisMediaType = (TextplainMediatype) mediaType;
                String bodyData = deserializeTextPlain(body);
                var deserializedBody = thisMediaType.schema.validateAndBox(bodyData, configuration);
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
            BiPredicate<String, String> headerFilter = (key, val) -> true;
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
    public void testDeserializeApplicationJsonNull() {
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson(null).getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        if (!(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedVoid boxedVoid)) {
            throw new RuntimeException("body must be type AnyTypeJsonSchema1BoxedVoid");
        }
        Assert.assertNull(boxedVoid.data());
    }

    @Test
    public void testDeserializeApplicationJsonTrue() {
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson(true).getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        if (!(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedBoolean boxedBoolean)) {
            throw new RuntimeException("body must be type AnyTypeJsonSchema1BoxedBoolean");
        }
        Assert.assertTrue(boxedBoolean.data());
    }

    @Test
    public void testDeserializeApplicationJsonFalse() {
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson(false).getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        if (!(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedBoolean boxedBoolean)) {
            throw new RuntimeException("body must be type AnyTypeJsonSchema1BoxedBoolean");
        }
        Assert.assertFalse(boxedBoolean.data());
    }

    @Test
    public void testDeserializeApplicationJsonInt() {
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson(1).getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        if (!(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedNumber boxedNumber)) {
            throw new RuntimeException("body must be type AnyTypeJsonSchema1BoxedNumber");
        }
        Assert.assertEquals(boxedNumber.data(), 1L);
    }

    @Test
    public void testDeserializeApplicationJsonFloat() {
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson(3.14).getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        if (!(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedNumber boxedNumber)) {
            throw new RuntimeException("body must be type AnyTypeJsonSchema1BoxedNumber");
        }
        Assert.assertEquals(boxedNumber.data(), 3.14);
    }

    @Test
    public void testDeserializeApplicationJsonString() {
        var deserializer = new MyResponseDeserializer();
        byte[] bodyBytes = gson.toJson("a").getBytes(StandardCharsets.UTF_8);
        BytesHttpResponse response = new BytesHttpResponse(bodyBytes, "application/json");
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        ApiResponse<SealedResponseBody, Void> apiResponse = deserializer.deserialize(response, configuration);
        Assert.assertEquals(response, apiResponse.response());
        if (!(apiResponse.body() instanceof ApplicationjsonBody jsonBody)) {
            throw new RuntimeException("body must be type ApplicationjsonBody");
        }
        if (!(jsonBody.body() instanceof AnyTypeJsonSchema.AnyTypeJsonSchema1BoxedString boxedString)) {
            throw new RuntimeException("body must be type AnyTypeJsonSchema1BoxedString");
        }
        Assert.assertEquals(boxedString.data(), "a");
    }
}