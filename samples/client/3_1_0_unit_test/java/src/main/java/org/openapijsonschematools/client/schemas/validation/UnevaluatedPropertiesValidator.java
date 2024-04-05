package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnevaluatedPropertiesValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var unevaluatedProperties = data.schema().unevaluatedProperties;
        if (unevaluatedProperties == null) {
            return null;
        }
        var knownPathToSchemas = data.knownPathToSchemas();
        if (knownPathToSchemas == null) {
            return null;
        }
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        JsonSchema<?> unevaluatedPropertiesSchema = JsonSchemaFactory.getInstance(unevaluatedProperties);
        for(Map.Entry<?, ?> entry: mapArg.entrySet()) {
            if (!(entry.getKey() instanceof String propName)) {
                throw new ValidationException("Map keys must be strings");
            }
            List<Object> propPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
            propPathToItem.add(propName);
            if (knownPathToSchemas.containsKey(propPathToItem)) {
                continue;
            }
            @Nullable Object propValue = mapArg.get(propName);
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    data.validationMetadata().configuration(),
                    data.validationMetadata().validatedPathToSchemas(),
                    data.validationMetadata().seenClasses()
            );
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(unevaluatedPropertiesSchema, propValue, propValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}