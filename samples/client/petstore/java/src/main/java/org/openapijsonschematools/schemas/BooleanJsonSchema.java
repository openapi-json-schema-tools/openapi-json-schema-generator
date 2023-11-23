package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class BooleanJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(Boolean.class)))
    ));

    public static boolean validate(boolean arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(BooleanJsonSchema.class, arg, configuration);
    }
}
