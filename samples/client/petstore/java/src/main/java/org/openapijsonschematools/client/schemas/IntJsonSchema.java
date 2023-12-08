package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IntJsonSchema extends JsonSchema {
    public IntJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                        Integer.class,
                        Long.class,
                        Float.class,
                        Double.class
                ))),
                new KeywordEntry("format", new FormatValidator("int"))
        )));
    }

    public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
        return validateInt(arg, configuration);
    }

    public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
        return validateFloat(arg, configuration);
    }

    public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
        return validateLong(arg, configuration);
    }

    public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
        return validateDouble(arg, configuration);
    }
}