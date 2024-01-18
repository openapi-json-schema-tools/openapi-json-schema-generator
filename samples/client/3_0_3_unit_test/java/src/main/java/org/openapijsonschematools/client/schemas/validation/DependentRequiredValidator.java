package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DependentRequiredValidator implements KeywordValidator {
    public final Map<String, Set<String>> dependentRequired;

    public DependentRequiredValidator(Map<String, Set<String>> dependentRequired) {
        this.dependentRequired = dependentRequired;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas
    ) {
        if (!(arg instanceof Map)) {
            return null;
        }
        for (Map.Entry<String, Set<String>> entry: dependentRequired.entrySet()) {
            if (!((Map<?, ?>) arg).containsKey(entry.getKey())) {
                continue;
            }
            Set<String> missingKeys = new HashSet<>(entry.getValue());
            for (Object objKey: ((Map<?, ?>) arg).keySet()) {
                if (objKey instanceof String key) {
                    missingKeys.remove(key);
                }
            }
            if (missingKeys.isEmpty()) {
                continue;
            }
            throw new ValidationException(
                    "Validation failed for dependentRequired because these_keys="+missingKeys+" are "+
                    "missing at pathToItem="+validationMetadata.pathToItem()+" in class "+schema.getClass()
            );
        }
        return null;
    }
}
