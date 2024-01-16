package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropertyNamesValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> propertyNames;

    public PropertyNamesValidator(Class<? extends JsonSchema> propertyNames) {
        this.propertyNames = propertyNames;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas
    ) {
        if (!(arg instanceof Map)) {
            return null;
        }
        JsonSchema propertyNamesSchema = JsonSchemaFactory.getInstance(propertyNames);
        for (Object objKey: ((Map<?, ?>) arg).keySet()) {
            if (objKey instanceof String key) {
                List<Object> propPathToItem = new ArrayList<>(validationMetadata.pathToItem());
                propPathToItem.add(key);
                ValidationMetadata keyValidationMetadata = new ValidationMetadata(
                        propPathToItem,
                        validationMetadata.configuration(),
                        validationMetadata.validatedPathToSchemas(),
                        validationMetadata.seenClasses()
                );
                JsonSchema.validate(propertyNamesSchema, key, keyValidationMetadata);
            }
        }
        return null;
    }
}
