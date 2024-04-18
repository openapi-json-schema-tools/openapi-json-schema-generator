package unit_test_api.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.contenttype.ContentTypeDetector;
import unit_test_api.contenttype.ContentTypeSerializer;
import unit_test_api.exceptions.NotImplementedException;
import unit_test_api.mediatype.MediaType;

import java.util.Map;
import java.util.AbstractMap;

public class ContentParameter extends ParameterBase implements Parameter {
    public final AbstractMap.SimpleEntry<String, MediaType<?, ?>> content;

    public ContentParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved, AbstractMap.SimpleEntry<String, MediaType<?, ?>> content) {
        super(name, inType, required, style, explode, allowReserved);
        this.content = content;
    }

    @Override
    public AbstractMap.SimpleEntry<String, String> serialize(@Nullable Object inData) throws NotImplementedException {
        String contentType = content.getKey();
        if (ContentTypeDetector.contentTypeIsJson(contentType)) {
            var value = ContentTypeSerializer.toJson(inData);
            return new AbstractMap.SimpleEntry<>(name, value);
        } else {
            throw new NotImplementedException("Serialization of "+contentType+" has not yet been implemented");
        }
    }
}