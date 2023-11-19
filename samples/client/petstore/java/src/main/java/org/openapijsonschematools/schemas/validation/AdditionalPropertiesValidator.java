package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.schemas.JsonSchema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdditionalPropertiesValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Class<? extends SchemaValidator> cls, Object arg, Object constraint, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Map)) {
            return null;
        }
        Map<String, Object> castArg = (Map<String, Object>) arg;
        Class<JsonSchema> addPropSchema = (Class<JsonSchema>) constraint;
        Map<String, Class<JsonSchema>> properties = (Map<String, Class<JsonSchema>>) extra;
        if (properties == null) {
            properties = new LinkedHashMap<>();
        }
        Set<String> presentAdditionalProperties = new LinkedHashSet<>(castArg.keySet());
        presentAdditionalProperties.removeAll(properties.keySet());
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        // todo add handling for validatedPatternProperties
        for(String addPropName: presentAdditionalProperties) {
            Object propValue = castArg.get(addPropName);
            List<Object> propPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            propPathToItem.add(addPropName);
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
            if (propValidationMetadata.validationRanEarlier(addPropSchema)) {
                // todo add_deeper_validated_schemas
                continue;
            }
            PathToSchemasMap otherPathToSchemas = SchemaValidator.validate(addPropSchema, propValue, propValidationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
