package org.openapijsonschematools.schemas;

import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;


public class ListJsonSchema extends JsonSchema {
    public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
        new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)))
    ));

    public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
        return JsonSchema.validate(ListJsonSchema.class, arg, configuration);
    }
}
