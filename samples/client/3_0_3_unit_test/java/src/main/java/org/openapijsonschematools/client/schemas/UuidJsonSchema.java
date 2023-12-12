package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class UuidJsonSchema extends JsonSchema<String, String, String> {
    public UuidJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(String.class))),
                new KeywordEntry("format", new FormatValidator("uuid"))
        )));
    }

    @Override
    protected String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedStringTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }

    public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg.toString(), configuration);
    }
}