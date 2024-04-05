package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.contenttype.ContentTypeDeserializer;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.parameter.ParameterStyle;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.UnsetAnyTypeJsonSchema;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;

public class SchemaHeader extends HeaderBase implements Header {
    public final JsonSchema<?> schema;

    public SchemaHeader(boolean required, @Nullable Boolean allowReserved, @Nullable Boolean explode, JsonSchema<?> schema) {
        super(required, ParameterStyle.SIMPLE, explode, allowReserved);
        this.schema = schema;
    }

    private static HttpHeaders toHeaders(String name, String value) {
        Map<String, List<String>> map = Map.of(name, List.of(value));
        BiPredicate<String, String> headerFilter = (key, val) -> true;
        return HttpHeaders.of(map, headerFilter);
    }

    @Override
    public HttpHeaders serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) throws NotImplementedException, ValidationException {
        var castInData = validate ? schema.validate(inData, configuration) : inData;
        boolean usedExplode = explode != null && explode;
        var value = StyleSerializer.serializeSimple(castInData, name, usedExplode, false);
        return toHeaders(name, value);
    }

    private static final Set<Class<?>> VOID_TYPES = Set.of(Void.class);
    private static final Set<Class<?>> BOOLEAN_TYPES = Set.of(Boolean.class);
    private static final Set<Class<?>> NUMERIC_TYPES = Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
    );
    private static final Set<Class<?>> STRING_TYPES = Set.of(String.class);
    private static final Set<Class<?>> LIST_TYPES = Set.of(List.class);
    private static final Set<Class<?>> MAP_TYPES = Set.of(Map.class);

    private List<@Nullable Object> getList(JsonSchema<?> schema, List<String> inData) throws NotImplementedException {
        Class<? extends JsonSchema<?>> itemsSchemaCls = schema.items == null ? UnsetAnyTypeJsonSchema.UnsetAnyTypeJsonSchema1.class : schema.items;
        JsonSchema<?> itemSchema = JsonSchemaFactory.getInstance(itemsSchemaCls);
        List<@Nullable Object> castList = new ArrayList<>();
        for (String inDataItem: inData) {
            @Nullable Object castInDataItem = getCastInData(itemSchema, List.of(inDataItem));
            castList.add(castInDataItem);
        }
        return castList;
    }

    private @Nullable Object getCastInData(JsonSchema<?> schema, List<String> inData) throws NotImplementedException {
        if (schema.type == null) {
            if (inData.size() == 1) {
                return inData.get(0);
            }
            return getList(schema, inData);
        } else if (schema.type.size() == 1) {
            if (schema.type.equals(BOOLEAN_TYPES)) {
                throw new NotImplementedException("Boolean serialization is not defined in Rfc6570, there is no agreed upon way to sent a boolean, send a string enum instead");
            } else if (schema.type.equals(VOID_TYPES) && inData.size() == 1 && inData.get(0).isEmpty()) {
                return null;
            } else if (schema.type.equals(STRING_TYPES) && inData.size() == 1) {
                return inData.get(0);
            } else if (schema.type.equals(LIST_TYPES)) {
                return getList(schema, inData);
            } else if (schema.type.equals(MAP_TYPES)) {
                throw new NotImplementedException("Header map deserialization has not yet been implemented");
            }
        } else if (schema.type.size() == 4 && schema.type.equals(NUMERIC_TYPES) && inData.size() == 1) {
            return ContentTypeDeserializer.fromJson(inData.get(0));
        }
        throw new NotImplementedException("Header deserialization for schemas with multiple types has not yet been implemented");
    }

    @Override
    public @Nullable Object deserialize(List<String> inData, boolean validate, SchemaConfiguration configuration) throws NotImplementedException, ValidationException {
        @Nullable Object castInData = getCastInData(schema, inData);
        if (validate) {
            return schema.validate(castInData, configuration);
        }
        return castInData;
    }
}