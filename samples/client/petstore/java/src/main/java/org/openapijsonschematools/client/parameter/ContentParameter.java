package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.contenttype.ContentTypeDetector;
import org.openapijsonschematools.client.contenttype.ContentTypeSerializer;
import org.openapijsonschematools.client.mediatype.MediaType;

import java.util.Map;

public class ContentParameter extends ParameterBase {
    public final Map<String, MediaType<?, ?>> content;

    public ContentParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved, Map<String, MediaType<?, ?>> content) {
        super(name, inType, required, style, explode, allowReserved);
        this.content = content;
    }

    protected Map<String, String> serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration) {
        for (Map.Entry<String, MediaType<?, ?>> entry: content.entrySet()) {
            var castInData = validate ? entry.getValue().schema().validate(inData, configuration) : inData ;
            String contentType = entry.getKey();
            if (ContentTypeDetector.contentTypeIsJson(contentType)) {
                var value = ContentTypeSerializer.toJson(castInData);
                return Map.of(name, value);
            } else {
                throw new RuntimeException("Serialization of "+contentType+" has not yet been implemented");
            }
        }
        throw new RuntimeException("Invalid value for content, it was empty and must have 1 key value pair");
    }
}