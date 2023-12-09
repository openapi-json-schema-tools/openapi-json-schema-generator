package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.NotValidator;

import java.util.LinkedHashMap;
import java.util.Map;

public class NotAnyTypeJsonSchema extends JsonSchema<Object, FrozenMap<String, Object>, Object, FrozenList<Object>> {
    public NotAnyTypeJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("not", new NotValidator(AnyTypeJsonSchema.class))
        )));
    }

    public Object validate(Object arg, SchemaConfiguration configuration) throws ValidationException {
        return validate(arg, configuration);
    }
}
