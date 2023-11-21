package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class NullJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(Void.class)))
    ));

    public static Void validate(Void arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(NullJsonSchema.class, arg, configuration);
    }
}
