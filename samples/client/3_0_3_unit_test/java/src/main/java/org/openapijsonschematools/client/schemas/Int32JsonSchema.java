package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Int32JsonSchema extends JsonSchema<Number, Number, Number> {
    public Int32JsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                        Integer.class,
                        Float.class
                ))),
                new KeywordEntry("format", new FormatValidator("int32"))
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

    public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return (float) validate((Number) arg, configuration);
    }
}