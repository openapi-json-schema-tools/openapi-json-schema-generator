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


public class Int32JsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(
            Integer.class,
            Float.class
        ))),
        new KeywordEntry("format", new FormatValidator("int32"))
    ));

    public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateInt(Int32JsonSchema.class, arg, configuration);
    }

    public static int validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateFloat(Int32JsonSchema.class, Integer.parseInt(String.valueOf(arg)), configuration);
    }
}
