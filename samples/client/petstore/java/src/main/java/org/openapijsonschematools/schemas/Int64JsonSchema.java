package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;
import org.openapijsonschematools.schemas.validation.FormatValidator;

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

    public static Long validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int64JsonSchema.class, Long.valueOf(arg), configuration);
    }

    public static Long validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int64JsonSchema.class, Long.parseLong(arg.toString()), configuration);
    }

    public static Long validate(Long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int64JsonSchema.class, arg, configuration);
    }

    public static Long validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(Int64JsonSchema.class, Long.parseLong(arg.toString()), configuration);
    }
}
