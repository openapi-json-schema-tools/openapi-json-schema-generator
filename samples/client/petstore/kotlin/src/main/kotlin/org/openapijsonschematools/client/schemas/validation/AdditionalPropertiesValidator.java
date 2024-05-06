package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdditionalPropertiesValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        var additionalProperties = data.schema().additionalProperties;
        if (additionalProperties == null) {
            return null;
        }
        Set<String> presentAdditionalProperties = new LinkedHashSet<>();
        for (Object key: mapArg.keySet()) {
            if (key instanceof String) {
                presentAdditionalProperties.add((String) key);
            }
        }
        var properties = data.schema().properties;
        if (properties != null) {
            presentAdditionalProperties.removeAll(properties.keySet());
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        for(String addPropName: presentAdditionalProperties) {
            @Nullable Object propValue = mapArg.get(addPropName);
            List<Object> propPathToItem = new ArrayList<>(data.validationMetadata().pathToItem());
            propPathToItem.add(addPropName);
            if (data.patternPropertiesPathToSchemas() != null && data.patternPropertiesPathToSchemas().containsKey(propPathToItem)) {
                continue;
            }
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    data.validationMetadata().configuration(),
                    data.validationMetadata().validatedPathToSchemas(),
                    data.validationMetadata().seenClasses()
            );
            JsonSchema<?> addPropsSchema = JsonSchemaFactory.getInstance(additionalProperties);
            if (propValidationMetadata.validationRanEarlier(addPropsSchema)) {
                // todo add_deeper_validated_schemas
                continue;
            }
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(addPropsSchema, propValue, propValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
