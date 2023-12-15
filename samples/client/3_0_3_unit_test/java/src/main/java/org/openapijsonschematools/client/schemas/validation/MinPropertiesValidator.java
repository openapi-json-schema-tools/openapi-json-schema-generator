package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.Map;

public class MinPropertiesValidator implements KeywordValidator {
    public final int minProperties;

    public MinPropertiesValidator(int minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public Object getConstraint() {
        return minProperties;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof Map)) {
            return null;
        }
        if (((Map) arg).size() < minProperties) {
            throw new ValidationException("Value " + arg + " is invalid because has < the minProperties of " + minProperties);
        }
        return null;
    }
}
