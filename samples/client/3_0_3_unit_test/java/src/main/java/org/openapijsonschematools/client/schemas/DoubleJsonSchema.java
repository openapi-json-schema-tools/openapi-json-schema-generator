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

public class DoubleJsonSchema extends JsonSchema<Double, Number, Double> {
    public DoubleJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(Double.class))),
                new KeywordEntry("format", new FormatValidator("double"))
        )));
    }

    @Override
    protected Number castToAllowedTypes(Double arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedNumberTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected Double getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return (Double) arg;
    }

    // todo add float validate input
}