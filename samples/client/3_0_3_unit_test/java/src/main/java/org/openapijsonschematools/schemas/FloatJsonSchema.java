package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class FloatJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(Float.class))),
        new KeywordEntry("format", new FormatValidator("float"))
    ));

    public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateFloat(FloatJsonSchema.class, arg, configuration);
    }
}
