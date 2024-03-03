package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.contenttype.ContentTypeDeserializer;
import org.openapijsonschematools.client.header.StyleSerializer;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.UnsetAnyTypeJsonSchema;

import java.util.Map;

public class SchemaParameter extends HeaderBase {
    public final String name;
    public final ParameterInType inType;
    public final JsonSchema<?> schema;

    public SchemaParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean allowReserved, @Nullable Boolean explode, JsonSchema<?> schema) {
        super(required, ParameterStyle.SIMPLE, explode, allowReserved);
        this.name = name;
        this.inType = inType;
        this.schema = schema;
    }

    private ParameterStyle getStyle() {
        if (style != null) {
            return style;
        }
        if (inType == ParameterInType.QUERY || inType == ParameterInType.COOKIE) {
            return ParameterStyle.FORM;
        }
        //  ParameterInType.HEADER || ParameterInType.PATH
        return ParameterStyle.SIMPLE;
    }

    public PrefixSeparatorIterator iterator getPrefixSeparatorIterator() {
        ParameterStyle usedStyle = getStyle();
        if (usedStyle is ParameterStyle.FORM) {
            return PrefixSeparatorIterator('?', '&')
        } else if (usedStyle == ParameterStyle.SPACE_DELIMITED) {
            return PrefixSeparatorIterator('', '%20')
        } else if (usedStyle == ParameterStyle.PIPE_DELIMITED) {
            return PrefixSeparatorIterator('', '|')
        }
        throw new RuntimeException("No iterator possible for style="+usedStyle);
    }

    @Override
    public Map<String, String> serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration, @Nullable PrefixSeparatorIterator iterator) {
        var castInData = validate ? schema.validate(inData, configuration) : inData;
        ParameterStyle usedStyle = getStyle();
        boolean percentEncode = (inType == ParameterInType.QUERY || inType == ParameterInType.PATH) ? true : false;
        String value;
        if (usedStyle == ParameterStyle.SIMPLE) {
            // header OR path
            boolean usedExplode = explode == null ? false : explode;
            value = StyleSerializer.serializeSimple(castInData, name, usedExplode, percentEncode);
        } else if (usedStyle == ParameterStyle.FORM) {
            // query OR cookie
            boolean usedExplode = explode == null ? true : explode;
            boolean isCookie = inType == ParameterInType.COOKIE;
            value = StyleSerializer.serializeForm(castInData, name, usedExplode, percentEncode, iterator, isCookie);
        } else if (usedStyle == ParameterStyle.LABEL) {
            // path
            value = StyleSerializer.serializeLabel(castInData, name, usedExplode);
        } else if (usedStyle == ParameterStyle.MATRIX) {
            // path
            value = StyleSerializer.serializeMatrix(castInData, name, usedExplode);
        } else if (usedStyle == ParameterStyle.SPACE_DELIMITED) {
            // query
            value = StyleSerializer.serializeSpaceDelimited(castInData, name, usedExplode, iterator);
        } else if (usedStyle == ParameterStyle.PIPE_DELIMITED) {
            // query
            value = StyleSerializer.serializePipeDelimited(castInData, name, usedExplode, iterator);
        } else if (usedStyle == ParameterStyle.DEEP_OBJECT) {
            // query
            throw new RuntimeException("Style deep object serialization has not yet been implemented.");
        }
        return Map.of(name, value);
    }
}