package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

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

    public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateFloat(Int32JsonSchema.class, arg, configuration);
    }
}
