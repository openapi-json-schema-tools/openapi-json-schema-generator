package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropertyNamesValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        var propertyNames = data.schema().propertyNames;
        if (propertyNames == null) {
            return null;
        }
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        JsonSchema propertyNamesSchema = JsonSchemaFactory.getInstance(propertyNames);
        for (Object objKey: mapArg.keySet()) {
            if (objKey instanceof String key) {
                List<Object> propPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
                propPathToItem.add(key);
                ValidationMetadata keyValidationMetadata = new ValidationMetadata(
                        propPathToItem,
                        data.validationMetadata().configuration(),
                        data.validationMetadata().validatedPathToSchemas(),
                        data.validationMetadata().seenClasses()
                );
                JsonSchema.validate(propertyNamesSchema, key, keyValidationMetadata);
            }
        }
        return null;
    }
}
