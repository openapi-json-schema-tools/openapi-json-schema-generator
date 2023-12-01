package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.Map;

public class MaxPropertiesValidator implements KeywordValidator {
    public final int maxProperties;

    public MaxPropertiesValidator(int maxProperties) {
        this.maxProperties = maxProperties;
    }

    @Override
    public Object getConstraint() {
        return maxProperties;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Map)) {
            return null;
        }
        if (((Map) arg).size() > maxProperties) {
            throw new ValidationException("Value " + arg + " is invalid because has > the maxProperties of " + maxProperties);
        }
        return null;
    }
}
