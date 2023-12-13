package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NotValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> not;

    public NotValidator(Class<? extends JsonSchema> not) {
        this.not = not;
    }

    @Override
    public Object getConstraint() {
        return not;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        PathToSchemasMap pathToSchemas;
        try {
            JsonSchema notSchema = JsonSchemaFactory.getInstance(not);
            pathToSchemas = notSchema.validate(notSchema, arg, validationMetadata);
        } catch (ValidationException e) {
            return null;
        }
        if (!pathToSchemas.isEmpty()) {
            throw new ValidationException(
                    "Invalid value "+arg+" was passed in to "+cls+". "+
                            "Value is invalid because it is disallowed by not "+not
            );
        }
        return null;
    }
}
