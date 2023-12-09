package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class UuidJsonSchema extends JsonSchema<Object, FrozenMap<String, Object>, Object, FrozenList<Object>> {
    public UuidJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(String.class))),
                new KeywordEntry("format", new FormatValidator("uuid"))
        )));
    }

    public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
        return validateString(arg, configuration);
    }

    public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
        return validateUUID(arg, configuration);
    }
}
