package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PropertiesValidator implements KeywordValidator {
    public final Map<String, Class<? extends JsonSchema>> properties;

    public PropertiesValidator(Map<String, Class<? extends JsonSchema>> properties) {
        this.properties = properties;
    }

    @Override
    public Object getConstraint() {
        return properties;
    }

    @Override
    public @Nullable PathToSchemasMap validate(JsonSchema schema, @Nullable Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof Map)) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        Map<String, Object> castArg = (Map<String, Object>) arg;
        Set<String> presentProperties = new LinkedHashSet<>(castArg.keySet());
        presentProperties.retainAll(properties.keySet());
        for(String propName: presentProperties) {
            Object propValue = castArg.get(propName);
            List<Object> propPathToItem = new ArrayList<>(validationMetadata.pathToItem());
            propPathToItem.add(propName);
            ValidationMetadata propValidationMetadata = new ValidationMetadata(
                    propPathToItem,
                    validationMetadata.configuration(),
                    validationMetadata.validatedPathToSchemas(),
                    validationMetadata.seenClasses()
            );
            Class<? extends JsonSchema> propClass = properties.get(propName);
            JsonSchema propSchema = JsonSchemaFactory.getInstance(propClass);
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

