package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.header.StyleSerializer;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;

import java.util.AbstractMap;

public class SchemaParameter extends ParameterBase implements Parameter {
    public final JsonSchema<?> schema;

    public SchemaParameter(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved, JsonSchema<?> schema) {
        super(name, inType, required, style, explode, allowReserved);
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

    @Override
    public AbstractMap.SimpleEntry<String, String> serialize(@Nullable Object inData) throws NotImplementedException {
        ParameterStyle usedStyle = getStyle();
        boolean percentEncode = inType == ParameterInType.QUERY || inType == ParameterInType.PATH;
        String value;
        boolean usedExplode = explode == null ? usedStyle == ParameterStyle.FORM : explode;
        if (usedStyle == ParameterStyle.SIMPLE) {
            // header OR path
            value = StyleSerializer.serializeSimple(inData, name, usedExplode, percentEncode);
        } else if (usedStyle == ParameterStyle.FORM) {
            // query OR cookie
            value = StyleSerializer.serializeForm(inData, name, usedExplode, percentEncode);
        } else if (usedStyle == ParameterStyle.LABEL) {
            // path
            value = StyleSerializer.serializeLabel(inData, name, usedExplode);
        } else if (usedStyle == ParameterStyle.MATRIX) {
            // path
            value = StyleSerializer.serializeMatrix(inData, name, usedExplode);
        } else if (usedStyle == ParameterStyle.SPACE_DELIMITED) {
            // query
            value = StyleSerializer.serializeSpaceDelimited(inData, name, usedExplode);
        } else if (usedStyle == ParameterStyle.PIPE_DELIMITED) {
            // query
            value = StyleSerializer.serializePipeDelimited(inData, name, usedExplode);
        } else {
            // usedStyle == ParameterStyle.DEEP_OBJECT
            // query
            throw new NotImplementedException("Style deep object serialization has not yet been implemented.");
        }
        return new AbstractMap.SimpleEntry<>(name, value);
    }
}