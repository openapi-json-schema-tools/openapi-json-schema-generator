package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.NotValidator;

import java.util.LinkedHashMap;
import java.util.Map;

public class NotAnyTypeJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("not", new NotValidator(AnyTypeJsonSchema.class))
    ));

    public static Object validate(Object arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(NotAnyTypeJsonSchema.class, arg, configuration);
    }
}
