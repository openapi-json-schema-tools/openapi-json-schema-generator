package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.exceptions.ValidationException;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class DateTimeJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(String.class))),
        new KeywordEntry("format", new FormatValidator("date-time"))
    ));

    public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateString(DateTimeJsonSchema.class, arg, configuration);
    }

    public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateZonedDateTime(DateTimeJsonSchema.class, arg, configuration);
    }
}
