package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PropertiesValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var properties = data.schema().properties;
        if (properties == null) {
            return null;
        }
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        Set<String> presentProperties = new LinkedHashSet<>();
        for (Object key: mapArg.keySet()) {
            if (key instanceof String) {
                presentProperties.add((String) key);
            }
        }
        for(Map.Entry<String, Class<? extends JsonSchema<?>>> entry: properties.entrySet()) {
            String propName = entry.getKey();
            if (!presentProperties.contains(propName)) {
                continue;
            }
            @Nullable Object propValue = mapArg.get(propName);
            List<Object> propPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
            propPathToItem.add(propName);
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    data.validationMetadata().configuration(),
                    data.validationMetadata().validatedPathToSchemas(),
                    data.validationMetadata().seenClasses()
            );
            Class<? extends JsonSchema<?>> propClass = entry.getValue();
            JsonSchema<?> propSchema = JsonSchemaFactory.getInstance(propClass);
            if (propValidationMetadata.validationRanEarlier(propSchema)) {
                // todo add_deeper_validated_schemas
                continue;
            }
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(propSchema, propValue, propValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
