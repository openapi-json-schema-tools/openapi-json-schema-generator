package org.openapijsonschematools.client.response;

import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Optional;

import org.checkerframework.checker.nullness.qual.Nullable;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.contenttype.ContentTypeDetector;
import org.openapijsonschematools.client.contenttype.ContentTypeDeserializer;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.header.Header;

public abstract class ResponseDeserializer<SealedBodyClass, HeaderClass, SealedMediaTypeClass> {
    public final Map<String, SealedMediaTypeClass> content;
    public final @Nullable Map<String, Header> headers;

    public ResponseDeserializer(Map<String, SealedMediaTypeClass> content) {
        this.content = content;
        this.headers = null;
    }

    protected abstract SealedBodyClass getBody(String contentType, SealedMediaTypeClass mediaType, byte[] body, SchemaConfiguration configuration) throws ValidationException, NotImplementedException;
    protected abstract HeaderClass getHeaders(HttpHeaders headers, SchemaConfiguration configuration) throws ValidationException, NotImplementedException;

    protected @Nullable Object deserializeJson(byte[] body) {
        String bodyStr = new String(body, StandardCharsets.UTF_8);
        return ContentTypeDeserializer.fromJson(bodyStr);
	}

    protected String deserializeTextPlain(byte[] body) {
        return new String(body, StandardCharsets.UTF_8);
    }

    protected <T> T deserializeBody(String contentType, byte[] body, JsonSchema<T> schema, SchemaConfiguration configuration) throws ValidationException, NotImplementedException {
        if (ContentTypeDetector.contentTypeIsJson(contentType)) {
            @Nullable Object bodyData = deserializeJson(body);
            return schema.validateAndBox(bodyData, configuration);
        } else if (ContentTypeDetector.contentTypeIsTextPlain(contentType)) {
            String bodyData = deserializeTextPlain(body);
            return schema.validateAndBox(bodyData, configuration);
        }
        throw new NotImplementedException("Deserialization for contentType="+contentType+" has not yet been implemented.");
    }

	public DeserializedHttpResponse<SealedBodyClass, HeaderClass> deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws ValidationException, NotImplementedException, ApiException {
        Optional<String> contentTypeInfo = response.headers().firstValue("Content-Type");
        if (contentTypeInfo.isEmpty()) {
            throw new ApiException(
                "Invalid response returned, Content-Type header is missing and it must be included",
                response
            );
        }
        String contentType = contentTypeInfo.get();
        @Nullable SealedMediaTypeClass mediaType = content.get(contentType);
        if (mediaType == null) {
            throw new ApiException(
                "Invalid contentType returned. contentType="+contentType+" was returned "+
                "when only "+content.keySet()+" are defined for statusCode="+response.statusCode(),
                response
            );
        }
        byte[] bodyBytes = response.body();
        SealedBodyClass body = getBody(contentType, mediaType, bodyBytes, configuration);
        HeaderClass headers = getHeaders(response.headers(), configuration);
        return new DeserializedHttpResponse<>(body, headers);
	}
}