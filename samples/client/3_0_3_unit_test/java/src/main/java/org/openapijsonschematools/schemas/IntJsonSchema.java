package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class IntJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ))),
        new KeywordEntry("format", new FormatValidator("int"))
    ));

    public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateInt(IntJsonSchema.class, arg, configuration);
    }

    public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateFloat(IntJsonSchema.class, arg, configuration);
    }

    public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateLong(IntJsonSchema.class, arg, configuration);
    }

    public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateDouble(IntJsonSchema.class, arg, configuration);
    }
}
