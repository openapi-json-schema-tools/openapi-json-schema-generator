package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

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

    public static Number validate(Integer arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }

    public static Number validate(Long arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }

    public static Number validate(Float arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }

    public static Number validate(Double arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NumberJsonSchema.class, arg, configuration);
    }
}
