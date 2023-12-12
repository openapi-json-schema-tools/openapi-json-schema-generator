package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FloatJsonSchema extends JsonSchema<Float, Number, Float> {
    public FloatJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(Float.class))),
                new KeywordEntry("format", new FormatValidator("float"))
        )));
    }

    @Override
    protected Number castToAllowedTypes(Float arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedNumberTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected Float getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return (Float) arg;
    }
}
