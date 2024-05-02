package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class NotValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var not = data.schema().not;
        if (not == null) {
            return null;
        }
        PathToSchemasMap pathToSchemas;
        try {
            JsonSchema<?> notSchema = JsonSchemaFactory.getInstance(not);
            pathToSchemas = JsonSchema.validate(notSchema, data.arg(), data.validationMetadata());
        } catch (ValidationException e) {
            return null;
        }
        if (!pathToSchemas.isEmpty()) {
            throw new ValidationException(
                    "Invalid value "+data.arg()+" was passed in to "+data.schema().getClass()+". "+
                            "Value is invalid because it is disallowed by not "+not
            );
        }
        return null;
    }
}
