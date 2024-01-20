package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

public class ElseValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        var elseSchema = data.schema().elseSchema;
        if (elseSchema == null) {
            return null;
        }
        var ifPathToSchemas = data.ifPathToSchemas();
        if (ifPathToSchemas == null) {
            // if unset
            return null;
        }
        if (!ifPathToSchemas.isEmpty()) {
            // if validation is true
            return null;
        }
        JsonSchema elseSchemaInstance = JsonSchemaFactory.getInstance(elseSchema);
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        try {
            var elsePathToSchemas = JsonSchema.validate(elseSchemaInstance, data.arg(), data.validationMetadata());
            pathToSchemas.update(elsePathToSchemas);
        } catch (ValidationException | InvalidTypeException ignored) {}
        return pathToSchemas;
    }
}
