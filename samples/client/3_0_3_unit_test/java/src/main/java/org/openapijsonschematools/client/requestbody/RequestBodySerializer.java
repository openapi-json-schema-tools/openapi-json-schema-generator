package org.openapijsonschematools.client.requestbody;

import java.net.http.HttpRequest;
import org.checkerframework.checker.nullness.qual.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;

import java.util.Map;
import java.util.regex.Pattern;

public abstract class RequestBodySerializer<T, U> {
    /*
    * Describes a single request body
    * content: contentType to MediaType schema info
    */
    public final Map<String, U> content;
    public final boolean required;
    private static final Pattern jsonContentTypePattern = Pattern.compile(
            "application/[^+]*[+]?(json);?.*"
    );
    private static final Gson gson = new GsonBuilder()
            .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .setNumberToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .create();
    private static final String textPlainContentType = "text/plain";

    public RequestBodySerializer(Map<String, U> content, boolean required) {
        this.content = content;
        this.required = required;
    }

    protected static boolean contentTypeIsJson(String contentType) {
        return jsonContentTypePattern.matcher(contentType).find();
    }

    @SuppressWarnings("nullness")
    private String toJson(@Nullable Object body) {
        return gson.toJson(body);
    }

    private SerializedRequestBody serializeJson(String contentType, @Nullable Object body) {
        String jsonText = toJson(body);
        return new SerializedRequestBody(contentType, HttpRequest.BodyPublishers.ofString(jsonText));
    }

    private SerializedRequestBody serializeTextPlain(String contentType, @Nullable Object body) {
        if (body instanceof String stringBody) {
            return new SerializedRequestBody(contentType, HttpRequest.BodyPublishers.ofString(stringBody));
        }
        throw new RuntimeException("Invalid non-string data type of "+JsonSchema.getClass(body)+" for text/plain body serialization");
    }

    protected SerializedRequestBody serialize(String contentType, @Nullable Object body) {
        if (contentTypeIsJson(contentType)) {
            return serializeJson(contentType, body);
        } else if (contentType.equals(textPlainContentType)) {
            return serializeTextPlain(contentType, body);
        }
        throw new RuntimeException("Serialization has not yet been implemented for contentType="+contentType+". If you need it please file a PR");
    }

    public abstract SerializedRequestBody serialize(T requestBody);
}