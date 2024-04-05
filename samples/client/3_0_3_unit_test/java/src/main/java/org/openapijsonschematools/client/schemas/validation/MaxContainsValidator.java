package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;

public class MaxContainsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var maxContains = data.schema().maxContains;
        if (maxContains == null) {
            return null;
        }
        if (!(data.arg() instanceof List)) {
            return null;
        }
        var containsPathToSchemas = data.containsPathToSchemas();
        if (containsPathToSchemas == null) {
            return null;
        }
        if (containsPathToSchemas.size() > maxContains) {
            throw new ValidationException(
                "Validation failed for maxContains keyword in class="+data.schema().getClass()+
                " at pathToItem="+data.validationMetadata().pathToItem()+". Too many items validated to the contains schema."
            );
        }
        return null;
    }
}