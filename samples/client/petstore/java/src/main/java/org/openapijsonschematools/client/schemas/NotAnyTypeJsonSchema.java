package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.NotValidator;

import java.util.LinkedHashMap;
import java.util.Map;

public class NotAnyTypeJsonSchema extends JsonSchema {
    public NotAnyTypeJsonSchema() {
        keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("not", new NotValidator(AnyTypeJsonSchema.class))
        ));
    }

    public Object validate(Object arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg, configuration);
    }
}
