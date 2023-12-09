package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;

public class ListJsonSchema extends JsonSchema<Object, FrozenMap<String, Object>, Object, FrozenList<Object>> {
    public ListJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class)))
        )));
    }

    public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
        return validateList(arg, configuration);
    }
}
