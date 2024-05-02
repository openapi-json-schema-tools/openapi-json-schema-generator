package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DependentSchemasValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        var dependentSchemas = data.schema().dependentSchemas;
        if (dependentSchemas == null) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        Set<String> presentProperties = new LinkedHashSet<>();
        for (Object key: mapArg.keySet()) {
            if (key instanceof String) {
                presentProperties.add((String) key);
            }
        }
        for(Map.Entry<String, Class<? extends JsonSchema<?>>> entry: dependentSchemas.entrySet()) {
            String propName = entry.getKey();
            if (!presentProperties.contains(propName)) {
                continue;
            }
            Class<? extends JsonSchema<?>> dependentSchemaClass = entry.getValue();
            JsonSchema<?> dependentSchema = JsonSchemaFactory.getInstance(dependentSchemaClass);
            PathToSchemasMap otherPathToSchemas = JsonSchema.validate(dependentSchema, mapArg, data.validationMetadata());
            pathToSchemas.update(otherPathToSchemas);
        }
        return pathToSchemas;
    }
}
