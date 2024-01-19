package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DependentSchemasValidator implements KeywordValidator {
    public final Map<String, Class<? extends JsonSchema>> dependentSchemas;

    public DependentSchemasValidator(Map<String, Class<? extends JsonSchema>> dependentSchemas) {
        this.dependentSchemas = dependentSchemas;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas,
        @Nullable PathToSchemasMap ifPathToSchemas
    ) {
        if (!(arg instanceof Map<?, ?> mapArg)) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        Set<String> presentProperties = new LinkedHashSet<>();
        for (Object key: mapArg.keySet()) {
            if (key instanceof String) {
                presentProperties.add((String) key);
            }
        }
        for(Map.Entry<String, Class<? extends JsonSchema>> entry: dependentSchemas.entrySet()) {
            String propName = entry.getKey();
            if (!presentProperties.contains(propName)) {
                continue;
            }
            Class<? extends JsonSchema> dependentSchemaClass = entry.getValue();
            JsonSchema dependentSchema = JsonSchemaFactory.getInstance(dependentSchemaClass);
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(dependentSchema, arg, validationMetadata);
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}

