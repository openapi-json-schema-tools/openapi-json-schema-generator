package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class IfValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var ifSchema = data.schema().ifSchema;
        if (ifSchema == null) {
            return null;
        }
        if (data.ifPathToSchemas() == null) {
            throw new ValidationException("Invalid type for ifPathToSchemas");
        }
        /*
        if is false use case
        ifPathToSchemas == {}
        no need to add any data to pathToSchemas

        if true, then true -> true for whole schema
        so validate_then will add ifPathToSchemas data to pathToSchemas
        */
        return null;
    }
}
