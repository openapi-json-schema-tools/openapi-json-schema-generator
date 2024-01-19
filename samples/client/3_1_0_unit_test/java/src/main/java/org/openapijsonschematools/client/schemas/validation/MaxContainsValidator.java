package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;

public class MaxContainsValidator implements KeywordValidator {
    public final int maxContains;

    public MaxContainsValidator(int maxContains) {
        this.maxContains = maxContains;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof List)) {
            return null;
        }
        if (data.containsPathToSchemas() == null) {
            return null;
        }
        if (data.containsPathToSchemas().size() > maxContains) {
            throw new ValidationException(
                "Validation failed for maxContains keyword in class="+data.schema().getClass()+
                " at pathToItem="+data.validationMetadata().pathToItem()+". Too many items validated to the contains schema."
            );
        }
        return null;
    }
}