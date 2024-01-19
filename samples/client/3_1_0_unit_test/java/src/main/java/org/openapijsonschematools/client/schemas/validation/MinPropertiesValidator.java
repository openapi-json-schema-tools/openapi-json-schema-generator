package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

public class MinPropertiesValidator implements KeywordValidator {
    public final int minProperties;

    public MinPropertiesValidator(int minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        if (mapArg.size() < minProperties) {
            throw new ValidationException("Value " + mapArg + " is invalid because has < the minProperties of " + minProperties);
        }
        return null;
    }
}
