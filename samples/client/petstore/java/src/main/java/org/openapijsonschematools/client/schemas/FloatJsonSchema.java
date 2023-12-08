package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FloatJsonSchema extends JsonSchema {
    public FloatJsonSchema() {
        keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(Float.class))),
                new KeywordEntry("format", new FormatValidator("float"))
        ));
    }

    public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return validateFloat(arg, configuration);
    }
}
