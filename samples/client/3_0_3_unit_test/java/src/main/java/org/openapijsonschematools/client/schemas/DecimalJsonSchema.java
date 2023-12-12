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

public class DecimalJsonSchema extends JsonSchema<String, String, String> {
    public DecimalJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(String.class))),
                new KeywordEntry("format", new FormatValidator("number"))
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
}