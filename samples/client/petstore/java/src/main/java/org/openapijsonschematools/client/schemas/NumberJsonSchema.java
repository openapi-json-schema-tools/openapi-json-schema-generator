package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;


public class NumberJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        )))
    ));

    public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateInt(NumberJsonSchema.class, arg, configuration);
    }

    public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateLong(NumberJsonSchema.class, arg, configuration);
    }

    public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateFloat(NumberJsonSchema.class, arg, configuration);
    }

    public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validateDouble(NumberJsonSchema.class, arg, configuration);
    }
}