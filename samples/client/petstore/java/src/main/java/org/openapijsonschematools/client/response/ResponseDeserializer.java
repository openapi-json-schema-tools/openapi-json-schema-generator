package org.openapijsonschematools.client.response;

import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

import org.checkerframework.checker.nullness.qual.Nullable;
import com.google.gson.Gson;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.mediatype.MediaType;

public abstract class ResponseDeserializer<SealedBodyClass, HeaderClass> {
    public final @Nullable Map<String, MediaType<?>> content;
    public final @Nullable Map<String, String> headers; // todo change the value to header
    private static final Pattern jsonContentTypePattern = Pattern.compile(
            "application/[^+]*[+]?(json);?.*"
    );
    private static final Gson gson = new Gson();
    private static final String textPlainContentType = "text/plain";

    public ResponseDeserializer(@Nullable Map<String, MediaType<?>> content) {
        this.content = content;
        this.headers = null;
    }

    public abstract SealedBodyClass getBody(String contentType, @Nullable Object body);
    public abstract HeaderClass getHeaders(HttpHeaders headers);

    protected @Nullable Object deserializeJson(byte[] body) {
        String bodyStr = new String(body, StandardCharsets.UTF_8);
        return gson.fromJson(bodyStr, Object.class);
	}

    protected String deserializeTextPlain(byte[] body) {
        return new String(body, StandardCharsets.UTF_8);
    }

    protected static boolean contentTypeIsJson(String contentType) {
        return jsonContentTypePattern.matcher(contentType).find();
    }

	public ApiResponse<SealedBodyClass, HeaderClass> deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration) {
        Optional<String> contentTypeInfo = response.headers().firstValue("Content-Type");
        if (contentTypeInfo.isEmpty()) {
            throw new RuntimeException("Invalid response returned, Content-Type header is missing and it must be included");
        }
        String contentType = contentTypeInfo.get();
        if (content != null && !content.containsKey(contentType)) {
            throw new RuntimeException(
                    "Invalid contentType returned. contentType="+contentType+" was returned "+
                    "when only "+content.keySet()+" are defined for statusCode="+response.statusCode()
            );
        }
        byte[] bodyBytes = response.body();
        SealedBodyClass body = getBody(contentType, bodyBytes);
        HeaderClass headers = getHeaders(response.headers());
        return new ApiResponse<>(response, body, headers);
	}
}