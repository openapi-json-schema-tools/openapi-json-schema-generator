package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DependentRequiredValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        if (!(data.arg() instanceof Map<?, ?> mapArg)) {
            return null;
        }
        var dependentRequired = data.schema().dependentRequired;
        if (dependentRequired == null) {
            return null;
        }
        for (Map.Entry<String, Set<String>> entry: dependentRequired.entrySet()) {
            if (!mapArg.containsKey(entry.getKey())) {
                continue;
            }
            Set<String> missingKeys = new HashSet<>(entry.getValue());
            for (Object objKey: mapArg.keySet()) {
                if (objKey instanceof String key) {
                    missingKeys.remove(key);
                }
            }
            if (missingKeys.isEmpty()) {
                continue;
            }
            throw new ValidationException(
                    "Validation failed for dependentRequired because these_keys="+missingKeys+" are "+
                    "missing at pathToItem="+data.validationMetadata().pathToItem()+" in class "+data.schema().getClass()
            );
        }
        return null;
    }
}
