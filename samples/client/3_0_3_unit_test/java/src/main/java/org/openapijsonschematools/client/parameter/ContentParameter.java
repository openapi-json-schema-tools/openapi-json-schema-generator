package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.contenttype.ContentTypeDetector;
import org.openapijsonschematools.client.contenttype.ContentTypeSerializer;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.OpenapiDocumentException;
import org.openapijsonschematools.client.mediatype.MediaType;

import java.util.Map;
import java.util.AbstractMap;

public class ContentParameter extends ParameterBase implements Parameter {
    public final Map<String, MediaType<?, ?>> content;

    public ContentParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved, Map<String, MediaType<?, ?>> content) {
        super(name, inType, required, style, explode, allowReserved);
        this.content = content;
    }

    @Override
    public AbstractMap.SimpleEntry<String, String> serialize(@Nullable Object inData) throws NotImplementedException, OpenapiDocumentException {
        for (Map.Entry<String, MediaType<?, ?>> entry: content.entrySet()) {
            String contentType = entry.getKey();
            if (ContentTypeDetector.contentTypeIsJson(contentType)) {
                var value = ContentTypeSerializer.toJson(inData);
                return new AbstractMap.SimpleEntry<>(name, value);
            } else {
                throw new NotImplementedException("Serialization of "+contentType+" has not yet been implemented");
            }
        }
        throw new OpenapiDocumentException("Invalid value for content, it was empty and must have 1 key value pair");
    }
}