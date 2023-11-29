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


public class Int64JsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ))),
        new KeywordEntry("format", new FormatValidator("int64"))
    ));

    public static long validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(Int64JsonSchema.class, Long.valueOf(arg), configuration);
    }

    public static long validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(Int64JsonSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
    }

    public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(Int64JsonSchema.class, arg, configuration);
    }

    public static long validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return JsonSchema.validate(Int64JsonSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
    }
}
