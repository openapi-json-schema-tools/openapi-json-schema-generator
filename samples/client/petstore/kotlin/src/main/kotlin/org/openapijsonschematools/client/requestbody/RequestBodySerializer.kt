package org.openapijsonschematools.client.requestbody;

import java.net.http.HttpRequest;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.contenttype.ContentTypeDetector;
import org.openapijsonschematools.client.contenttype.ContentTypeSerializer;
import org.openapijsonschematools.client.exceptions.NotImplementedException;

import java.util.Map;

public abstract class RequestBodySerializer<T, U> {
    /*
    * Describes a single request body
    * content: contentType to MediaType schema info
    */
    public final Map<String, U> content;
    public final boolean required;

    public RequestBodySerializer(Map<String, U> content, boolean required) {
        this.content = content;
        this.required = required;
    }

    private SerializedRequestBody serializeJson(String contentType, @Nullable Object body) {
        String jsonText = ContentTypeSerializer.toJson(body);
        return new SerializedRequestBody(contentType, HttpRequest.BodyPublishers.ofString(jsonText));
    }

    private SerializedRequestBody serializeTextPlain(String contentType, @Nullable Object body) {
        if (body instanceof String stringBody) {
            return new SerializedRequestBody(contentType, HttpRequest.BodyPublishers.ofString(stringBody));
        }
        throw new RuntimeException("Invalid non-string data type of "+JsonSchema.getClass(body)+" for text/plain body serialization");
    }

    protected SerializedRequestBody serialize(String contentType, @Nullable Object body) throws NotImplementedException {
        if (ContentTypeDetector.contentTypeIsJson(contentType)) {
            return serializeJson(contentType, body);
        } else if (ContentTypeDetector.contentTypeIsTextPlain(contentType)) {
            return serializeTextPlain(contentType, body);
        }
        throw new NotImplementedException("Serialization has not yet been implemented for contentType="+contentType+". If you need it please file a PR");
    }

    public abstract SerializedRequestBody serialize(T requestBody) throws NotImplementedException;
}