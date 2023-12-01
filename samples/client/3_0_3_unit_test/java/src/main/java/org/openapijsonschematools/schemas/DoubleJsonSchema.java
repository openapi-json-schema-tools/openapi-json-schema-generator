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


public class DoubleJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(Double.class))),
        new KeywordEntry("format", new FormatValidator("double"))
    ));

    public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateDouble(DoubleJsonSchema.class, arg, configuration);
    }
}
