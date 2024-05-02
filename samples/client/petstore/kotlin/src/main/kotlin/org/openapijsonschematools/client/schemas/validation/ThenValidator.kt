package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

public class ThenValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var then = data.schema().then;
        if (then == null) {
            return null;
        }
        var ifPathToSchemas = data.ifPathToSchemas();
        if (ifPathToSchemas == null) {
            // if unset
            return null;
        }
        if (ifPathToSchemas.isEmpty()) {
            // if validation is false
            return null;
        }
        JsonSchema<?> thenSchema = JsonSchemaFactory.getInstance(then);
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        var thenPathToSchemas = JsonSchema.validate(thenSchema, data.arg(), data.validationMetadata());
        // todo capture validation error and describe it as an then error?
        pathToSchemas.update(ifPathToSchemas);
        pathToSchemas.update(thenPathToSchemas);
        return pathToSchemas;
    }
}
