package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class IntJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(Long.class))),
        new KeywordEntry("format", new FormatValidator("int"))
    ));

    public static long validate(int arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, Long.valueOf(arg), configuration);
    }

    public static long validate(float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
    }

    public static long validate(long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, arg, configuration);
    }

    public static long validate(double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(IntJsonSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
    }
}
