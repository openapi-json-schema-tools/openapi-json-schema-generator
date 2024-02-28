package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.parameter.ParameterBase;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.parameter.StyleSimpleSerializer;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

public class Header extends ParameterBase {
    public Header(boolean required, @Nullable boolean allowReserved, JsonSchema<?> schema, @Nullable Map<String, MediaType<?, ?>> content) {
        super(ParameterInType.HEADER, required, ParameterStyle.SIMPLE, false, allowReserved, schema, content);
    }

    private static HttpHeaders toHeaders(String name, String value) {
        Map<String, List<String>> map = Map.of(name, List.of(value));
        BiPredicate<String, String> headerFilter = (key, val) -> true;
        return HttpHeaders.of(map, headerFilter);
    }

    public HttpHeaders serialize(@Nullable Object inData, String name, boolean skipValidation, SchemaConfiguration configuration) {
        if (schema != null) {
            var castInData = skipValidation ? inData : schema.validate(inData, configuration);
            var value = StyleSimpleSerializer.serializeSimple(castInData, name, explode, false);
            return toHeaders(name, value);
        } else {
            throw new RuntimeException("Serializing header with content has not yet been implemented");
        }
    }
}