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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.OpenapiDocumentException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.header.Header;

public abstract class ResponseDeserializer<SealedBodyClass, HeaderClass, SealedMediaTypeClass> {
    public final Map<String, SealedMediaTypeClass> content;
    public final @Nullable Map<String, Header> headers;

    public ResponseDeserializer(Map<String, SealedMediaTypeClass> content) {
        this.content = content;
        this.headers = null;
    }

    protected abstract SealedBodyClass getBody(String contentType, byte[] body, SchemaConfiguration configuration) throws OpenapiDocumentException, InvalidTypeException, ValidationException, NotImplementedException;
    protected abstract HeaderClass getHeaders(HttpHeaders headers, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException, NotImplementedException;

    protected @Nullable Object deserializeJson(byte[] body) {
        String bodyStr = new String(body, StandardCharsets.UTF_8);
        return ContentTypeDeserializer.fromJson(bodyStr);
	}

    protected String deserializeTextPlain(byte[] body) {
        return new String(body, StandardCharsets.UTF_8);
    }

    protected <T> T deserializeBody(String contentType, byte[] body, JsonSchema<T> schema, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException, NotImplementedException {
        if (ContentTypeDetector.contentTypeIsJson(contentType)) {
            @Nullable Object bodyData = deserializeJson(body);
            return schema.validateAndBox(bodyData, configuration);
        } else if (ContentTypeDetector.contentTypeIsTextPlain(contentType)) {
            String bodyData = deserializeTextPlain(body);
            return schema.validateAndBox(bodyData, configuration);
        }
        throw new NotImplementedException("Deserialization for contentType="+contentType+" has not yet been implemented.");
    }

	public DeserializedHttpResponse<SealedBodyClass, HeaderClass> deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) throws OpenapiDocumentException, InvalidTypeException, ValidationException, NotImplementedException {
        Optional<String> contentTypeInfo = response.headers().firstValue("Content-Type");
        if (contentTypeInfo.isEmpty()) {
            throw new OpenapiDocumentException("Invalid response returned, Content-Type header is missing and it must be included");
        }
        String contentType = contentTypeInfo.get();
        if (content != null && !content.containsKey(contentType)) {
            throw new OpenapiDocumentException(
                    "Invalid contentType returned. contentType="+contentType+" was returned "+
                    "when only "+content.keySet()+" are defined for statusCode="+response.statusCode()
            );
        }
        byte[] bodyBytes = response.body();
        SealedBodyClass body = getBody(contentType, bodyBytes, configuration);
        HeaderClass headers = getHeaders(response.headers(), configuration);
        return new DeserializedHttpResponse<>(body, headers);
	}
}