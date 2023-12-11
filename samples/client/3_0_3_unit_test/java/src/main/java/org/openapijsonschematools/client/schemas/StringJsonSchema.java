package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.UUID;

public class StringJsonSchema extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
    public StringJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(String.class)))
        )));
    }

    public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
        return validateString(arg, configuration);
    }

    public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
        return validateZonedDateTime(arg, configuration);
    }

    public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
        return validateLocalDate(arg, configuration);
    }

    public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
        return validateUUID(arg, configuration);
    }
}