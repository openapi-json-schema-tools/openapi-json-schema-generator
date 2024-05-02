package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;

public class ContainsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        if (!(data.arg() instanceof List)) {
            return null;
        }
        var containsPathToSchemas = data.containsPathToSchemas();
        if (containsPathToSchemas == null || containsPathToSchemas.isEmpty()) {
            throw new ValidationException(
                "Validation failed for contains keyword in class="+data.schema().getClass()
                + " at pathToItem="+data.validationMetadata().pathToItem()+". No "
                + "items validated to the contains schema."
            );
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for (PathToSchemasMap otherPathToSchema: containsPathToSchemas) {
            pathToSchemas.update(otherPathToSchema);
        }
        return pathToSchemas;
    }
}