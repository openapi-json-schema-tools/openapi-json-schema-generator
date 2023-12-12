package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class IntJsonSchema extends JsonSchema<Number, Number, Number> {
    public IntJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                        Integer.class,
                        Long.class,
                        Float.class,
                        Double.class
                ))),
                new KeywordEntry("format", new FormatValidator("int"))
        )));
    }

    @Override
    protected Number castToAllowedTypes(Number arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedNumberTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected Number getNewInstance(Number arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public int validate(int arg, SchemaConfiguration configuration) {
        return (int) validate((Number) arg, configuration);
    }

    public long validate(long arg, SchemaConfiguration configuration) {
        return (long) validate((Number) arg, configuration);
    }

    public float validate(float arg, SchemaConfiguration configuration) {
        return (float) validate((Number) arg, configuration);
    }

    public double validate(double arg, SchemaConfiguration configuration) {
        return (double) validate((Number) arg, configuration);
    }
}