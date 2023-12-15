package org.openapijsonschematools.client.schemas.validation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdditionalPropertiesValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> additionalProperties;

    public AdditionalPropertiesValidator(Class<? extends JsonSchema> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public Object getConstraint() {
        return additionalProperties;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof Map)) {
            return null;
        }
        Map<String, Object> castArg = (Map<String, Object>) arg;
        Set<String> presentAdditionalProperties = new LinkedHashSet<>(castArg.keySet());
        if (schema.keywordToValidator != null) {
            KeywordValidator propertiesValidator = schema.keywordToValidator.get("properties");
            if (propertiesValidator instanceof PropertiesValidator) {
                presentAdditionalProperties.removeAll(((PropertiesValidator) propertiesValidator).properties.keySet());
            }
        }
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
            JsonSchema addPropsSchema = JsonSchemaFactory.getInstance(additionalProperties);
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
