package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;

public class MinContainsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var minContains = data.schema().minContains;
        if (minContains == null) {
            return null;
        }
        if (!(data.arg() instanceof List)) {
            return null;
        }
        if (data.containsPathToSchemas() == null) {
            return null;
        }
        if (data.containsPathToSchemas().size() < minContains) {
            throw new ValidationException(
                "Validation failed for minContains keyword in class="+data.schema().getClass()+
                " at pathToItem="+data.validationMetadata().pathToItem()+". Too few items validated to the contains schema."
            );
        }
        return null;
    }
}