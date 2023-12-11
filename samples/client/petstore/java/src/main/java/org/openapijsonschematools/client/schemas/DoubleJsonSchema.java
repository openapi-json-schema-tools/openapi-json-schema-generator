package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.NonCollectionJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DoubleJsonSchema extends NonCollectionJsonSchema {
    public DoubleJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(Double.class))),
                new KeywordEntry("format", new FormatValidator("double"))
        )));
    }

    public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return validateDouble(arg, configuration);
    }
}