package org.openapijsonschematools.client.requestbody;

import org.openapijsonschematools.client.mediatype.MediaType;

import java.net.http.HttpRequest;
import org.checkerframework.checker.nullness.qual.Nullable;
import com.google.gson.Gson;

import java.util.Map;
import java.util.regex.Pattern;

public abstract class RequestBodySerializer<T> {
    /*
    * Describes a single request body
    * content: contentType to MediaType schema info
    */
    public final Map<String, MediaType<?>> content;
    public final boolean required;
    private final Pattern jsonContentTypePattern = Pattern.compile(
            "application/[^+]*[+]?(json);?.*"
    );
    private final Gson gson = new Gson();

    public RequestBodySerializer(Map<String, MediaType<?>> content, boolean required) {
        this.content = content;
        this.required = required;
    }

    protected boolean contentTypeIsJson(String contentType) {
        return jsonContentTypePattern.matcher(contentType).find();
    }

    private SerializedRequestBody serializeJson(String contentType, @Nullable Object body) {
        String jsonText = gson.toJson(body);
        return new SerializedRequestBody(contentType, HttpRequest.BodyPublishers.ofString(jsonText));
    }

    protected SerializedRequestBody serialize(String contentType, @Nullable Object body) {
        if (contentTypeIsJson(contentType)) {
            return serializeJson(contentType, body);
        }
        return new SerializedRequestBody(
            contentType,
            HttpRequest.BodyPublishers.ofString("blah")
        );
    }

    public abstract SerializedRequestBody serialize(T requestBody);
}