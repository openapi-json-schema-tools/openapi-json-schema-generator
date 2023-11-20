package org.openapijsonschematools.schemas.validation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PropertiesValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, Object constraint, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Map)) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        Map<String, Object> castArg = (Map<String, Object>) arg;
        Map<String, Class<JsonSchema>> properties = (Map<String, Class<JsonSchema>>) constraint;
        Set<String> presentProperties = new LinkedHashSet<>(castArg.keySet());
        presentProperties.retainAll(properties.keySet());
        for(String propName: presentProperties) {
            Object propValue = castArg.get(propName);
            List<Object> propPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            propPathToItem.add(propName);
            Class<JsonSchema> propSchema = properties.get(propName);
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
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
