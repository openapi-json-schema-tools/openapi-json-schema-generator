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

public class Int32JsonSchema extends NonCollectionJsonSchema {
    public Int32JsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                        Integer.class,
                        Float.class
                ))),
                new KeywordEntry("format", new FormatValidator("int32"))
        )));
    }

    public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return validateInt(arg, configuration);
    }

    public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return validateFloat(arg, configuration);
    }
}