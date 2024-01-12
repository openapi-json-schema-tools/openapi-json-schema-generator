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
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas
    ) {
        if (!(arg instanceof List)) {
            return null;
        }
        if (containsPathToSchemas == null) {
            return null;
        }
        if (containsPathToSchemas.size() > maxContains) {
            throw new ValidationException(
                "Validation failed for maxContains keyword in class="+schema.getClass()+
                " at pathToItem="+validationMetadata.pathToItem()+". Too many items validated to the contains schema."
            );
        }
        return null;
    }
}