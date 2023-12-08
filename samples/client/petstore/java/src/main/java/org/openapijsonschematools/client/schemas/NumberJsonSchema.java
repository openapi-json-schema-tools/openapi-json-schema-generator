package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public class NumberJsonSchema extends JsonSchema {
    public NumberJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                        Integer.class,
                        Long.class,
                        Float.class,
                        Double.class
                )))
        )));
    }

    public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return validateInt(arg, configuration);
    }

    public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
        return validateLong(arg, configuration);
    }

    public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return validateFloat(arg, configuration);
    }

    public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return validateDouble(arg, configuration);
    }
}
